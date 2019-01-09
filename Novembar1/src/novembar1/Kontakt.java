package novembar1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kontakt {
	
	private int id;
	private String ime;
	private String prezime;
	private String radnoMesto;
	private String brojProstorije;
	private int brojLokala;
	private LocalDate datumUnosaKontakta;
	
	public Kontakt() {
		
	}

	public Kontakt(int id, String ime, String prezime, String radnoMesto, String brojProstorije, int brojLokala,
			LocalDate datumUnosaKontakta) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.radnoMesto = radnoMesto;
		this.brojProstorije = brojProstorije;
		this.brojLokala = brojLokala;
		this.datumUnosaKontakta = datumUnosaKontakta;
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

	public String getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public String getBrojProstorije() {
		return brojProstorije;
	}

	public void setBrojProstorije(String brojProstorije) {
		this.brojProstorije = brojProstorije;
	}

	public int getBrojLokala() {
		return brojLokala;
	}

	public void setBrojLokala(int brojLokala) {
		this.brojLokala = brojLokala;
	}

	public LocalDate getDatumUnosaKontakta() {
		return datumUnosaKontakta;
	}

	public void setDatumUnosaKontakta(LocalDate datumUnosaKontakta) {
		this.datumUnosaKontakta = datumUnosaKontakta;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%15s %15s %15s %15s %15s %15s %15s", id, ime, prezime,
				radnoMesto, brojProstorije, brojLokala, dtf.format(datumUnosaKontakta));
	}
	
	
	
	/*
	 * 	private int id;
	private String ime;
	private String prezime;
	private String radnoMesto;
	private String brojProstorije;
	private int brojLokala;
	private LocalDate datumUnosaKontakta;
	 */
	

}
