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
	
	public ArrayList<Statie> getOpriri() {
		return this.opriri;
	}
}
