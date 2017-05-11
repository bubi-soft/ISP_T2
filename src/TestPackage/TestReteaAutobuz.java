package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Aplicatie.Linie;
import Aplicatie.Retea_Autobuz;
import Aplicatie.Statie;

public class TestReteaAutobuz {
	
	@Test
	public void testModStatie() {
		Retea_Autobuz ra = new Retea_Autobuz();
		ra.addStatie("Statie_test_1");
		ra.modStatie("Statie_test_1", "Statie_test_modificata");
		Statie st = new Statie("Statie_test_modificata");
		assertEquals(ra.getStatie("Statie_test_modificata").getNume(), st.getNume());
	}
	
	@Test
	public void testModLinie() {
		Retea_Autobuz ra = new Retea_Autobuz();
		ra.addStatie("Statie_test_1");
		Statie st = new Statie("Statie_test_2");
		ra.addStatie(st);
		
		ra.addLinie(1, ra.getStatii());
		ra.modLinie(1, 23);
		
		Linie ln = new Linie(23,ra.getStatii());
		
		assertEquals(ra.getLinie(23).getOpriri(), ln.getOpriri());
	}
	
	
}
