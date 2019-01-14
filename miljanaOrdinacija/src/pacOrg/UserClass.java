package pacOrg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserClass {

	private int id;   // broj kartona
	private String ime;
	private String prezime;
	private String alergije;
	private String hronicnaOboljenja;
	private String godiste;
	private String jmbg;
	private int telefon;
	private String adresa;
	private LocalDate datum;
	
	
	public UserClass() {
		
	}
	
	public UserClass(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	
	

	public UserClass(int id, String ime, String prezime) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}

	public UserClass(String ime, String prezime, String alergije, String hronicnaOboljenja, String godiste) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.alergije = alergije;
		this.hronicnaOboljenja = hronicnaOboljenja;
		this.godiste = godiste;
	}

	public UserClass(int id, String ime, String prezime, String alergije, String hronicnaOboljenja, String godiste,
			String jmbg, int telefon, String adresa) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.alergije = alergije;
		this.hronicnaOboljenja = hronicnaOboljenja;
		this.godiste = godiste;
		this.jmbg = jmbg;
		this.telefon = telefon;
		this.adresa = adresa;
	}
	
	

	public UserClass(int id, String ime, String prezime, String alergije, String hronicnaOboljenja, String godiste,
			String jmbg, int telefon, String adresa, LocalDate datum) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.alergije = alergije;
		this.hronicnaOboljenja = hronicnaOboljenja;
		this.godiste = godiste;
		this.jmbg = jmbg;
		this.telefon = telefon;
		this.adresa = adresa;
		this.datum = datum;
	}
	

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAlergije() {
		return alergije;
	}

	public void setAlergije(String alergije) {
		this.alergije = alergije;
	}

	public String getHronicnaOboljenja() {
		return hronicnaOboljenja;
	}

	public void setHronicnaOboljenja(String hronicnaOboljenja) {
		this.hronicnaOboljenja = hronicnaOboljenja;
	}

	public String getGodiste() {
		return godiste;
	}

	public void setGodiste(String godiste) {
		this.godiste = godiste;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%15s %15s %15s %25s %25s %10s %14s %12s %30s %10s", id,
				ime, prezime, alergije, hronicnaOboljenja, godiste, jmbg, telefon, adresa, dtf.format(datum));
	}
	
	
	
	
	/*
	 * private int id;   // broj kartona
	private String ime;
	private String prezime;
	private String alergije;
	private String hronicnaOboljenja;
	private String godiste;
	private int jmbg;
	private int telefon;
	private String adresa;
	 */
	
	
	
	
	
	
	
	
}
