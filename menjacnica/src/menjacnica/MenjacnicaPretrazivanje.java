package menjacnica;

import java.util.LinkedList;

import menjacnica.sistemskeoperacije.SOUcitajIzFajla;

/**
 * Klasa koja pruza osnovne funkcionalnosti klase Menjacnica
 * @author Monika Milenkovic
 * @version 1.0.
 */

public class MenjacnicaPretrazivanje implements MenjacnicaInterfacePretrazivanje {
	
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	
	@Override
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		if (prodaja)
				return iznos*valuta.getProdajni();
			else
				return iznos*valuta.getKupovni();
		}
	

	@Override
	public void ucitajIzFajla(String putanja) {
		kursnaLista=SOUcitajIzFajla.izvrsi(putanja);
		
	}
 
	
	
}
