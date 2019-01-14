package test;


public class Vozac {     // parametri koji definisu tipove podataka koji vozac koji je objekat koji je klasa ima.
	
	private String imeVozaca;
	private String prezimeVozaca;
	private int godineIskustvaVozenja;
	private String tipKolaKojeBozi;
	private int brojMobilnog;
	private boolean daLiGaJeVatalaPolicija;
	
	public Vozac() {      // prazan konstruktor koji pravi objekat 
		
	}

	public Vozac(String imeVozaca, String prezimeVozaca, int godineIskustvaVozenja) {   // konstruktori sa pra i svim parametrima zbog proslejivanja podatak.
		super();
		this.imeVozaca = imeVozaca;
		this.prezimeVozaca = prezimeVozaca;
		this.godineIskustvaVozenja = godineIskustvaVozenja;
	}

	public Vozac(String imeVozaca, String prezimeVozaca, int godineIskustvaVozenja, String tipKolaKojeBozi,
			int brojMobilnog, boolean daLiGaJeVatalaPolicija) {
		super();
		this.imeVozaca = imeVozaca;
		this.prezimeVozaca = prezimeVozaca;
		this.godineIskustvaVozenja = godineIskustvaVozenja;
		this.tipKolaKojeBozi = tipKolaKojeBozi;
		this.brojMobilnog = brojMobilnog;
		this.daLiGaJeVatalaPolicija = daLiGaJeVatalaPolicija;
	}

	public String getImeVozaca() {    // getteri i setteri zato sto su po pravilima podaci private u klasama i gadjaju se sa getterima i setterima.
		return imeVozaca;
	}

	public void setImeVozaca(String imeVozaca) {
		this.imeVozaca = imeVozaca;
	}

	public String getPrezimeVozaca() {
		return prezimeVozaca;
	}

	public void setPrezimeVozaca(String prezimeVozaca) {
		this.prezimeVozaca = prezimeVozaca;
	}

	public int getGodineIskustvaVozenja() {
		return godineIskustvaVozenja;
	}

	public void setGodineIskustvaVozenja(int godineIskustvaVozenja) {
		this.godineIskustvaVozenja = godineIskustvaVozenja;
	}

	public String getTipKolaKojeBozi() {
		return tipKolaKojeBozi;
	}

	public void setTipKolaKojeBozi(String tipKolaKojeBozi) {
		this.tipKolaKojeBozi = tipKolaKojeBozi;
	}

	public int getBrojMobilnog() {
		return brojMobilnog;
	}

	public void setBrojMobilnog(int brojMobilnog) {
		this.brojMobilnog = brojMobilnog;
	}

	public boolean isDaLiGaJeVatalaPolicija() {
		return daLiGaJeVatalaPolicija;
	}

	public void setDaLiGaJeVatalaPolicija(boolean daLiGaJeVatalaPolicija) {
		this.daLiGaJeVatalaPolicija = daLiGaJeVatalaPolicija;
	}

	@Override    // obicna sysoutprint metoa za ispis inicijalnih vrenosti tipova podataka.
	public String toString() {
		return "Vozac [imeVozaca=" + imeVozaca + ", prezimeVozaca=" + prezimeVozaca + ", godineIskustvaVozenja="
				+ godineIskustvaVozenja + ", tipKolaKojeBozi=" + tipKolaKojeBozi + ", brojMobilnog=" + brojMobilnog
				+ ", daLiGaJeVatalaPolicija=" + daLiGaJeVatalaPolicija + "]";
	}
	
	
	
	
	

}
