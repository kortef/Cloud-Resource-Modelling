package de.ugoe.cs.oco.occi.configmanagement.connector.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

import de.ugoe.cs.oco.occi.configmanagement.connector.AnsibleHelper;

public class AnsibleHelperTest {
	@Test
	public void testCreateInventory() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createInventory("192.168.35.23", Paths.get("testdata/inventory"));
			
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreatePlaybook() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();
			roles.add("testrole");
			helper.createPlaybook("192.168.35.23", roles, 
					"testuser", Paths.get("testdata/playbook.yml"));
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testCreateConfiguration() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			helper.createConfiguration(Paths.get("ansible.cfg"), null);
		} catch(IOException e) {
			fail("Should not throw exception.");
		}
	}
	
	@Test
	public void testExecutePlaybook() {
		AnsibleHelper helper = new AnsibleHelper();
		try {
			ArrayList<String> roles = new ArrayList<String>();
			roles.add("testrole");
			
			helper.createConfiguration(Paths.get("ansible.cfg"), null);
			
			Path playbook = helper.createPlaybook("192.168.35.23", roles, 
					"ubuntu", Paths.get("testdata/playbook.yml"));
			
			Path inventory = helper.createInventory("192.168.35.23", 
					Paths.get("testdata/inventory"));
			
			helper.executePlaybook(playbook, inventory);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not throw exception.");
		}
	}



}
