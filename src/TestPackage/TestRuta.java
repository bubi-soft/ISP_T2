package TestPackage;

import org.junit.Test;
import static org.junit.Assert.*;

import Aplicatie.Retea_Autobuz;

public class TestRuta {

	@Test
	public void testSolicitaRuta() {
		Retea_Autobuz ra = new Retea_Autobuz();
		
		ra.addStatie("Dristor1");
		ra.addStatie("Piata_Muncii");
		ra.addStatie("Piata_Iancului");
		ra.addStatie("Obor");
		ra.addStatie("Stefan Cel Mare");
		ra.addStatie("Piata Victoriei");
		ra.addStatie("Gara de Nord");
		ra.addStatie("Basarab");
		ra.addStatie("Crangasi");
		ra.addStatie("Petrache Poenaru");
		ra.addStatie("Grozavesti");
		ra.addStatie("Eroilor");
		ra.addStatie("Izvor");
		ra.addStatie("Piata Unirii");
		ra.addStatie("Timpuri Noi");
		ra.addStatie("Mihai Bravu");
		ra.addStatie("Nicolae Grigorescu");
		ra.addStatie("Dristor2");
		ra.addStatie("Titan");
		ra.addStatie("Costin Georgian");
		ra.addStatie("Republica");
		ra.addStatie("Pantelimon");
		
		ra.addLinie(1,ra.getStatii());
		
		ra.addStatie("Pipera");
		ra.addStatie("Aurel Vlaicu");
		ra.addStatie("Aviatorilor");
		ra.addStatie("Piata Romana");
		ra.addStatie("Universitate");
		ra.addStatie("Tineretului");
		ra.addStatie("Eroii Revolutiei");
		ra.addStatie("Constantin Brancoveanu");
		ra.addStatie("Aparatorii Patriei");
		ra.addStatie("Piata Sudului");
		ra.addStatie("Dimitrie Leonida");
		ra.addStatie("Berceni");


		ra.addStatie("Preciziei");
		ra.addStatie("Pacii");
		ra.addStatie("Gorjului");
		ra.addStatie("Lujerului");
		ra.addStatie("Politehnica");
		ra.addStatie("1 Decembrie 1918");
		ra.addStatie("Nicolae Teclu");
		ra.addStatie("Anghel Saligny");
		
		ra.addLinie(2);
		ra.getLinie(2).addStatie(ra.getStatie("Pipera"));
		ra.getLinie(2).addStatie(ra.getStatie("Aurel Vlaicu"));
		ra.getLinie(2).addStatie(ra.getStatie("Aviatorilor"));
		ra.getLinie(2).addStatie(ra.getStatie("Piata Victoriei"));
		ra.getLinie(2).addStatie(ra.getStatie("Piata Romana"));
		ra.getLinie(2).addStatie(ra.getStatie("Universitate"));
		ra.getLinie(2).addStatie(ra.getStatie("Piata Unirii"));
		ra.getLinie(2).addStatie(ra.getStatie("Tineretului"));
		ra.getLinie(2).addStatie(ra.getStatie("Eroii Revolutiei"));
		ra.getLinie(2).addStatie(ra.getStatie("Constantin Brancoveanu"));
		ra.getLinie(2).addStatie(ra.getStatie("Aparatorii Patriei"));
		ra.getLinie(2).addStatie(ra.getStatie("Piata Sudului"));
		ra.getLinie(2).addStatie(ra.getStatie("Dimitrie Leonida"));
		ra.getLinie(2).addStatie(ra.getStatie("Berceni"));
		
		ra.addLinie(3);
		ra.getLinie(3).addStatie(ra.getStatie("Preciziei"));
		ra.getLinie(3).addStatie(ra.getStatie("Pacii"));
		ra.getLinie(3).addStatie(ra.getStatie("Gorjului"));
		ra.getLinie(3).addStatie(ra.getStatie("Lujerului"));
		ra.getLinie(3).addStatie(ra.getStatie("Politehnica"));
		ra.getLinie(3).addStatie(ra.getStatie("Eroilor"));
		ra.getLinie(3).addStatie(ra.getStatie("Izvor"));
		ra.getLinie(3).addStatie(ra.getStatie("Piata Unirii"));
		ra.getLinie(3).addStatie(ra.getStatie("Timpuri Noi"));
		ra.getLinie(3).addStatie(ra.getStatie("Mihai Bravu"));
		ra.getLinie(3).addStatie(ra.getStatie("Dristor1"));
		ra.getLinie(3).addStatie(ra.getStatie("Nicolae Grigorescu"));
		ra.getLinie(3).addStatie(ra.getStatie("1 Decembrie 1918"));
		ra.getLinie(3).addStatie(ra.getStatie("Nicolae Teclu"));
		ra.getLinie(3).addStatie(ra.getStatie("Anghel Saligny"));
		
		//assertTrue(ra.solicitaRuta(ra.getStatie("Berceni"), ra.getStatie("Pipera")));
		//assertTrue(ra.solicitaRuta(ra.getStatie("Nicolae Teclu"), ra.getStatie("Pacii")));
		//assertTrue(ra.solicitaRuta(ra.getStatie("Piata_Muncii"), ra.getStatie("Eroilor")));
		assertTrue(ra.solicitaRuta(ra.getStatie("Berceni"), ra.getStatie("Politehnica")));
	}

}
