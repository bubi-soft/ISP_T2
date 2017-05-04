package Aplicatie;

public class User {
	
	private int id;
	private String nume;
	private boolean admin;
	
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
