package Aplicatie;

import java.util.ArrayList;

public class Retea_Autobuz {
	
	private ArrayList<Linie> linii;
	private ArrayList<Statie> statii;
	
	public Retea_Autobuz() {
		this.linii = new ArrayList<Linie>();
		this.statii = new ArrayList<Statie>();
	}
	
	public void setStatii(ArrayList<Statie> statii) {
		this.statii = statii;
	}
	
	public ArrayList<Statie> getStatii() {
		return this.statii;
	}
	
	public void addStatie(Statie statie) {
		this.statii.add(statie);
	}
	
	public void addStatie(int index, String nume) {
		this.statii.add(index, new Statie(nume));
	}
	
	public void addStatie(String nume) {
		this.statii.add(new Statie(nume));
	}
	
	public void modStatie(String nume) {
		//TODO afisare date curente statie si intrabare ce se vrea modificat
		int index = 0;
		for(;index < statii.size(); index++) {
			if(statii.get(index).getNume().matches(nume))
				break;
		}
		
	}
	
	public void delStatie(String nume) {
		int index = 0;
		for(;index < statii.size(); index++) {
			if(statii.get(index).getNume().matches(nume))
				break;
		}
		this.linii.remove(index);
	}
	
	public void addLinie(int id, ArrayList<Statie> opriri) {
		this.linii.add(new Linie(id, opriri));
	}
	
	public void addLinie(int id) {
		this.linii.add(new Linie(id));
	}
	
	public Linie getLinie(int id) {
		int index = 0;
		for(;index < linii.size(); index++) {
			if(linii.get(index).getId() == id)
				break;
		}
		return this.linii.get(index);
	}
	
	public ArrayList<Linie> getLinii() {
		return this.linii;
	}
	
	public void delLinie(int id) {
		int index = 0;
		for(;index < linii.size(); index++) {
			if(linii.get(index).getId() == id)
				break;
		}
		this.linii.remove(index);
	}
	
	public void modLinie(int id) {
		int index = 0;
		for(;index < linii.size(); index++) {
			if(linii.get(index).getId() == id)
				break;
		}
		//TODO campurile ce trebuie modificate
	}
	
	public void solicitaRuta(Statie locatie, Statie destiantie) {
		//TODO implement route search
	}
}
