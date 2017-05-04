package Aplicatie;

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
		return admin;
	}
	
	public void modUser(User clienti, int id, String nume, boolean admin) {
		if(this.isAdmin()){
			
			System.out.println("Date actuale : ");
			System.out.println("Id client: " + clienti.getId());
			System.out.println("Nume: " + clienti.getNume());
			System.out.print("Admin: ");
			System.out.println(clienti.isAdmin() ? "Da":"Nu");
			
			System.out.println(" ");
			
			clienti.setId(id);
			clienti.setNume(nume);
			clienti.setAdmin(admin);
			
			System.out.println("Date modificate. Noile date : ");
			
			System.out.println("Id client: " + clienti.getId());
			System.out.println("Nume: " + clienti.getNume());
			System.out.print("Admin: ");
			System.out.println(clienti.isAdmin() ? "Da":"Nu");
			
		}
	}
}
