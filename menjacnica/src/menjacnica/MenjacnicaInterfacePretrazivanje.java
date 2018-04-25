package menjacnica;

public interface MenjacnicaInterfacePretrazivanje {
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos);
	public void ucitajIzFajla(String putanja);
}
