package TestPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	@Test
	public void modificareUser()
	{
		User u1 = new User (1,"Test1",true);
		User u2 = new User (2,"Test2",true);
		User u3 = new User (3,"Test3",true);
		User u4 = new User (4,"Test4",true);
		
		ArrayList<User> useri = new ArrayList<User>();
		
		useri.add(u1);
		useri.add(u2);
		useri.add(u3);
		useri.add(u4);
		
		u1.modificareUser(2, useri, 5, "Ion", false);
		
		assertEquals(u2.getId(),5);
		assertEquals(u2.getNume(),"Ion");
		assertEquals(u2.isAdmin(),false);
		
		
		
	}


}
