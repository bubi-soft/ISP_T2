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
	
	public boolean solicitaRuta(Statie locatie, Statie destinatie) {
		//cautare existenta statii
		int index_locatie = -1;
		int index_destinatie = -1;
		for(int i = 1; i < this.statii.size(); i++) {
			if(this.statii.get(i).getNume().matches(locatie.getNume()))
				index_locatie = i;
			if(this.statii.get(i).getNume().matches(destinatie.getNume()))
				index_locatie = i;
			if(index_locatie >= 0 && index_destinatie >=0)
				break;
		}
		
		if(index_locatie == -1) {
			System.out.println("Statia de locatie nu exista");
			return false;
		}
		
		if(index_destinatie == -1) {
			System.out.println("Statia de destinatie nu exista");
			return false;
		}
		
		//calculare ruta
		ArrayList<Integer> ruta= new ArrayList<Integer>();
		ArrayList<Statie> start= new ArrayList<Statie>();
		ArrayList<Statie> stop= new ArrayList<Statie>();
		
		//cautare linie de plecare
		for(int i = 1; i < this.linii.size(); i++) {
			for(int j = 1; j < this.statii.size(); j++) {
				if(this.statii.get(j).getNume().matches(locatie.getNume())) {
					ruta.add(i);
					start.add(this.statii.get(j));
					break;
				}
			}
		}
		
		//verificare existenta destinatie pe linia curenta
		for(int j = 1; j < this.linii.get(ruta.get(1)).getOpriri().size(); j++) {
			if(this.linii.get(ruta.get(1)).getOpriri().get(j).getNume().matches(destinatie.getNume())) {
				stop.add(this.linii.get(ruta.get(1)).getOpriri().get(j));
				break;
			}
		}
		
		if(stop.size() > 0) {
			//asda
			return true;
		}
		
		return true;
	}
}
