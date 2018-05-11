package de.ugoe.cs.oco.occi2deployment.connector;

import com.jcraft.jsch.*;

import de.ugoe.cs.oco.occi2deployment.execution.OCCIExecutor;
import de.ugoe.cs.oco.occi2deployment.provisioner.OOIProvisioner;

import java.awt.*;
import javax.swing.*;

import org.eclipse.cmf.occi.core.Entity;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class ModelRetriever{
	
	public static void retrieveRuntimeModel(String rdirectory, String rfile, String lfile, String host, int port, String username, String pKey) {
		refreshMartRuntimeModel(host, port);
		ChannelSftp sftp = connect(host, username, pKey);
		download(rdirectory, rfile, lfile, sftp);
		sftp.exit();
		try {
			sftp.getSession().disconnect();
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void refreshMartRuntimeModel(String host, int port) {

			URL url;
			try {
				url = new URL("http://"+host +":"+port+"/mart/save/");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
				conn.setRequestProperty("Accept", "application/json");
				System.out.println(conn.getResponseCode());
				if(conn.getResponseCode() != 200) {
					System.out.println("Model could not be updated!");
				}
				conn.disconnect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}


	private static ChannelSftp connect(String host, String username, String privateKey) {  
        ChannelSftp sftp = null;  
        try {  
            JSch jsch = new JSch();  
            jsch.addIdentity(privateKey);
            Session sshSession = jsch.getSession(username, host);  
            System.out.println("Session created. ");
            Properties sshConfig = new Properties();  
            sshConfig.put("StrictHostKeyChecking", "no");  
            sshSession.setConfig(sshConfig);  
            sshSession.connect();  
            System.out.println("Session connected.");  
            System.out.println("Opening Channel.");  
            Channel channel = sshSession.openChannel("sftp");  
            channel.connect();  
            sftp = (ChannelSftp) channel;  
            System.out.println("Connected to " + host + ".");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return sftp;  
    }  
	
	private static void download(String directory, String downloadFile, String saveFile, ChannelSftp sftp) {  
        try {  
            sftp.cd(directory);  
            File file = new File(saveFile);  
            FileOutputStream fileOutputStream =new FileOutputStream(file);  
            sftp.get(downloadFile, fileOutputStream );  
            fileOutputStream.close();  
            fileOutputStream=null;  
            System.out.println(file.getAbsolutePath());
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
}