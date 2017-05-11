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
		for(;index <= this.statii.size(); index++) {
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
		for(;index <= this.statii.size(); index++) {
			if(this.statii.get(index).getNume().matches(nume))
				break;
		}
		this.statii.get(index).setNume(newNume);
		System.out.println("Statie modificata. Noul nume: " + this.statii.get(index).getNume());
	}
	
	public void delStatie(String nume) {
		int index = 0;
		for(;index <= this.statii.size(); index++) {
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
		for(;index <= this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		return this.linii.get(index);
	}
	
	public void modLinie(int id, int newId) {
		int index = 0;
		for(;index <= this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		this.linii.get(index).setId(newId);
		System.out.println("Linia a fost modificata. Noul ID: " + this.linii.get(index).getId());
	}
	
	public void delLinie(int id) {
		int index = 0;
		for(;index <= this.linii.size(); index++) {
			if(this.linii.get(index).getId() == id)
				break;
		}
		this.linii.remove(index);
	}
	
	public boolean solicitaRuta(Statie locatie, Statie destinatie) {
		//cautare existenta statii
		int index_locatie = -1;
		int index_destinatie = -1;
		for(int i = 1; i <= this.statii.size(); i++) {
			if(this.statii.get(i).getNume().matches(locatie.getNume()))
				index_locatie = i;
			if(this.statii.get(i).getNume().matches(destinatie.getNume()))
				index_destinatie = i;
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
		ArrayList<Integer> ruta = new ArrayList<Integer>();
		ArrayList<Statie> start = new ArrayList<Statie>();
		ArrayList<Statie> stop = new ArrayList<Statie>();
		ArrayList<Integer> curent = new ArrayList<Integer>();// linia ce trebuie verificata pentru legatura
		
		ruta.add(index_locatie);
		start.add(locatie);
		curent.add(1);
		
		boolean complet = false;
		int i = 1;
		
		while(!complet) { //parcurgere linii din ruta
			
			//linia curenta
			Linie ln_curenta = this.linii.get(ruta.get(i));
			
			//verificare existenta destinatie pe linia curenta
			if(ln_curenta.getId() == this.linii.get(index_destinatie).getId()) {
				stop.add(destinatie);
				complet = true;
				break;
			}
			
			Statie st_curenta = start.get(i);
			int index_st_curent = 1;
			for(; index_st_curent <= ln_curenta.getOpriri().size(); index_st_curent++) {
				Statie st_verificat = ln_curenta.getOpriri().get(index_st_curent);
				if(st_verificat.getNume().matches(st_curenta.getNume()))
					break;
			}
			
			for(;index_st_curent <= ln_curenta.getOpriri().size(); index_st_curent++) {
				//parcurgerea statiilor liniie din ruta pentru a gasi o legatura
				st_curenta = ln_curenta.getOpriri().get(index_st_curent);
				boolean legatura = false;
				//parcurgerea liniilor pentru a gasi statia de legatura daca aceasta exista
				for(; curent.get(i) <= this.linii.size(); curent.set(i, curent.get(i)+1)) {
					
					int j = curent.get(i);
					Linie ln_verificare = this.linii.get(j);
					
					if(ln_curenta.getId() != ln_verificare.getId()) {
						
						//cautam o statie de legatura in linia ce se verifica
						for(int l = 1; l <= ln_verificare.getOpriri().size(); l++) {
							Statie st_verificat = ln_verificare.getOpriri().get(l);
							if(st_verificat.getNume().matches(st_curenta.getNume())) {
								legatura = true;
								break;
							}
						}
						
						if(legatura) {
							stop.add(st_curenta);
							i++;
							ruta.add(curent.get(i));
							start.add(st_curenta);
							break;
						}
					}
				}
				
				//verificare daca sa gasit legatura
				if(legatura) {
					break;
				}
			}
		}
		
		this.afisareRuta(ruta, start, stop);
		return true;
	}
	
	private void afisareRuta(ArrayList<Integer> ruta, ArrayList<Statie> start, ArrayList<Statie> stop) {
		
		for(int i = 1; i <= ruta.size(); i++) {
			System.out.println("Linia: " + this.linii.get(ruta.get(i)).getId());
			
			//afisare statiile prin care se trece
			boolean ok = false;
			for(int j = 1; j <= this.linii.get(ruta.get(i)).getOpriri().size(); j++) {
				if(this.linii.get(ruta.get(i)).getOpriri().get(j).getNume().matches(start.get(i).getNume()))
					ok = true;
				
				if(ok)
					System.out.println("\t\t" + this.linii.get(ruta.get(i)).getOpriri().get(j).getNume());
				
				if(this.linii.get(ruta.get(i)).getOpriri().get(j).getNume().matches(stop.get(i).getNume()))
					break;
			}
		}
	}
}
