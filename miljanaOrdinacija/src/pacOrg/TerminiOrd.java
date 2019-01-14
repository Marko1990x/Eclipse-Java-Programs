package pacOrg;

public class TerminiOrd {
	
	private int ID;
	private String ime;
	private String prezime;
	private int vremePocetno;
	private int vremeKrajnje;
	private String datum;;
	
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getVremePocetno() {
		return vremePocetno;
	}
	public void setVremePocetno(int vremePocetno) {
		this.vremePocetno = vremePocetno;
	}
	public int getVremeKrajnje() {
		return vremeKrajnje;
	}
	public void setVremeKrajnje(int vremeKrajnje) {
		this.vremeKrajnje = vremeKrajnje;
	}
	
	
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public TerminiOrd() {
		
	}
	
	
	
	
	
	public TerminiOrd(int iD, String ime, String prezime, int vremePocetno, int vremeKrajnje, String datum) {
		super();
		ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.vremePocetno = vremePocetno;
		this.vremeKrajnje = vremeKrajnje;
		this.datum = datum;
	}
	@Override
	public String toString() {
		return String.format("%15s %15s %15s %15s %15s %15s", ID, ime, prezime,
				vremePocetno, vremeKrajnje,datum);
	}
	
	
	/*
	 * 
	private String ID;
	private String ime;
	private String prezime;
	private int vremePocetno;
	private int vremeKrajnje;
	private LocalDate datum;
	 */

}
