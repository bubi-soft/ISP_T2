package Aplicatie;

import java.util.ArrayList;

public class Linie {
	
	private int id;
	private ArrayList<Statie> opriri;
	
	public Linie(int id, ArrayList<Statie> opriri) {
		this.id = id;
		this.opriri = opriri;
	}
	
	public Linie(int id) {
		this.id = id;
		this.opriri = new ArrayList<Statie>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	public void setOpriri(ArrayList<Statie> opriri) {
		this.opriri = opriri;
	}
	
	public ArrayList<Statie> getOpriri() {
		return this.opriri;
	}
	
	public void addStatie(Statie oprire) {
		this.opriri.add(oprire);
	}
	
	public void delStatie(Statie oprire) {
		int index = 0;
		for(;index < this.opriri.size(); index++) {
			if(this.opriri.get(index).getNume().matches(nume))
				break;
		}
		this.opriri.remove(index);
	}
}
