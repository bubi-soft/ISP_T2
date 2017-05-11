package Aplicatie;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String nume;
	private boolean admin;
	
	public User(int id, String nume, boolean admin) {
		this.id = id;
		this.nume = nume;
		this.admin = admin;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public boolean isAdmin() {
		return this.admin;
	}
	
	public void delUser(User user) {
		user = null;
	}
	
	public void modificareUser (int id, ArrayList<User> useri, int newId, String newNume, boolean newAdmin){
		
		if(this.isAdmin()){
			
			int index = 0;
			for(;index < useri.size(); index++) {
				
				if(useri.get(index).getId() == id)
					break;
			}
			
				
			if(index == useri.size()) {
				System.out.println("Clientul nu exista.");
			}
			else {
			
				useri.get(index).setId(newId);
				useri.get(index).setNume(newNume);
				useri.get(index).setAdmin(newAdmin);
			}
		}	
	}
	
	public void modUser(User clienti, int newId, String newNume, boolean newAdmin) {
		if(this.isAdmin()){
			clienti.setId(newId);
			clienti.setNume(newNume);
			clienti.setAdmin(newAdmin);
			
			System.out.println("Date modificate.\nNoile date : ");
			System.out.println("\tId client: " + clienti.getId());
			System.out.println("\tNume: " + clienti.getNume());
			System.out.print("\tAdmin: ");
			System.out.println(clienti.isAdmin() ? "Da":"Nu");
		}
	}
}
