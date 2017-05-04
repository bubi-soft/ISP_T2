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
	
	public void modUser(User clienti) {
		if(this.isAdmin()){
			System.out.println("Id client: " + clienti.getId());
			System.out.println("Nume: " + clienti.getNume());
			System.out.print("Admin: ");
			System.out.println(clienti.isAdmin() ? "Da":"Nu");
			
			//TODO afisare date curente client si intrabare ce se vrea modificat
		}
	}
}
