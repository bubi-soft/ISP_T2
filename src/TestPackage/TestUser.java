package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Aplicatie.User;

public class TestUser {

	@Test
	public void testModUser() {
		User u1 = new User (1,"Test",true);
		User u2 = new User (2,"Test3",true);
		
		int id = 2;
		String nume = "Test2";
		boolean admin = false;
		
		u2.modUser(u1, id, nume, admin);
		
		assertEquals(u1.getId(), id);
		assertEquals(u1.getNume(), nume);
		assertEquals(u1.isAdmin(), admin);
		
	}


}
