package de.ugoe.cs.oco.occi.configmanagement.connector;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class AnsibleHelper {
	
	public Path createInventory(String ipaddress, Path path) throws IOException {
		FileUtils.writeStringToFile(path.toFile(), ipaddress, (Charset) null);
		return path;
	}
	
	public Path createPlaybook(String ipaddress, List<String> roles, String user, 
			Path path) throws IOException {
		String lb = System.getProperty("line.separator");
		String offset = "  ";
		StringBuilder sb = new StringBuilder("---");
		sb.append(lb);
		sb.append("- hosts: ").append(ipaddress).append(lb);
		sb.append(offset).append("remote_user: ").append(user).append(lb);
		sb.append(offset).append("become: yes").append(lb);
		sb.append(offset).append("roles:").append(lb);
		
		for (String role: roles) {
			sb.append(offset).append(offset).append("- ").append(role).append(lb);
		}
		
		FileUtils.writeStringToFile(path.toFile(), sb.toString(), (Charset) null);
		return path;
	}
	
	public Path createConfiguration(Path configuration, Path keyPapth) throws IOException{
		String lb = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("[defaults]").append(lb);
		sb.append("roles_path = /opt/ansibleconnector/roles").append(lb);
		sb.append("private_key_file = /home/fglaser/.ssh/mongoscale-key.pem");
		
		FileUtils.writeStringToFile(configuration.toFile(), sb.toString(), (Charset) null);
		return configuration;
	}
	
	public int executePlaybook(Path playbook, Path inventory) throws IOException, 
		InterruptedException {
		String command = "/usr/local/bin/ansible-playbook";
		Process process = new ProcessBuilder(command, "--inventory", inventory.toString(), 
				playbook.toString())
				.inheritIO().start();
		process.waitFor();
		return process.exitValue();
	}
}
