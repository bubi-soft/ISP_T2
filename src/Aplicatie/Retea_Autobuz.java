package Aplicatie;

import java.util.ArrayList;

public class Retea_Autobuz {
	
	private ArrayList<Linie> linii;
	private ArrayList<Statie> statii;
	
	public Retea_Autobuz() {
		this.linii = new ArrayList<Linie>();
		this.statii = new ArrayList<Statie>();
	}
	
	public Retea_Autobuz(ArrayList<Statie> statii) {
		this.linii = new ArrayList<Linie>();
		this.statii = statii;
	}
	
	public void setStatii(ArrayList<Statie> statii) {
		this.statii = statii;
	}
	
	public Statie getStatie(String nume) {
		int index = 0;
		for(;index < this.statii.size(); index++) {
			if(this.statii.get(index).getNume().matches(nume))
				break;
		}
		return this.statii.get(index);
	}
	
	public ArrayList<Statie> getStatii() {
		return this.statii;
	}
	
	public void addStatie(Statie statie) {
		this.statii.add(statie);
	}
	
	public void addStatie(String nume) {
		this.statii.add(new Statie(nume));
	}
	
	public void modStatie(String nume, String newNume) {
		int index = 0;
		for(;index < this.statii.size(); index++) {
			if(this.statii.get(index).getNume().matches(nume))
				break;
		}
		this.statii.get(index).setNume(newNume);
		System.out.println("Statie modificata. Noul nume: " + this.statii.get(index).getNume());
	}
	
	public void delStatie(String nume) {
		int index = 0;
		for(;index < this.statii.size(); index++) {
			if(this.statii.get(index).getNume().matches(nume))
				break;
		}
		this.statii.remove(index);
	}
	
	public void addLinie(int id, ArrayList<Statie> opriri) {
		this.linii.add(new Linie(id, opriri));
	}
	
	public void addLinie(int id) {
		this.linii.add(new Linie(id));
	}

	public Linie getLinie(int id) {
		int index = 0;
		for(;index < this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		return this.linii.get(index);
	}
	
	public void modLinie(int id, int newId) {
		int index = 0;
		for(;index < this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		this.linii.get(index).setId(newId);
		System.out.println("Linia a fost modificata. Noul ID: " + this.linii.get(index).getId());
	}
	
	public void delLinie(int id) {
		int index = 0;
		for(;index < this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		this.linii.remove(index);
	}
	
	public void solicitaRuta(Statie locatie, Statie destiantie) {
		//TODO implement route search
	}
}
