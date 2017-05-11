package TestPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Aplicatie.Retea_Metrou;
import Aplicatie.Statie;

public class TestReteaMetrou {

	@Test
	public void testModificareLinie() {
		Retea_Metrou rm = new Retea_Metrou();
		rm.addLinie(101);
		rm.addStatie("Statie1");
		rm.addStatie("Statie2");
		rm.getLinie(101).addStatie(rm.getStatie("Statie1"));
		rm.getLinie(101).addStatie(rm.getStatie("Statie2"));
		
		ArrayList<Statie> statiiNoi = new ArrayList<Statie>();
		statiiNoi.add(rm.getStatie("Statie2"));
		statiiNoi.add(rm.getStatie("Statie2"));
		
		
		rm.modificareLinie(101, 201, statiiNoi);
		
		assertEquals(rm.getLinie(201).getId(), 201);
	}

}
