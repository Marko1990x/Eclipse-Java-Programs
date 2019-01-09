package javaprog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
	
	private String ime;
	private String prezime;
	private LocalDate datumRodjenja;
	private String jmbg;
	private String zanimanjePoSkoli;
	private String gdeRadi;
	private String Bolesti;
	private String Alergije;
	
	public User() {
		
	}

	

	public User(String ime, String prezime, LocalDate datumRodjenja, String jmbg, String zanimanjePoSkoli,
			String gdeRadi, String bolesti, String alergije) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.jmbg = jmbg;
		this.zanimanjePoSkoli = zanimanjePoSkoli;
		this.gdeRadi = gdeRadi;
		Bolesti = bolesti;
		Alergije = alergije;
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



	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}



	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}



	public String getJmbg() {
		return jmbg;
	}



	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}



	public String getZanimanjePoSkoli() {
		return zanimanjePoSkoli;
	}



	public void setZanimanjePoSkoli(String zanimanjePoSkoli) {
		this.zanimanjePoSkoli = zanimanjePoSkoli;
	}



	public String getGdeRadi() {
		return gdeRadi;
	}



	public void setGdeRadi(String gdeRadi) {
		this.gdeRadi = gdeRadi;
	}



	public String getBolesti() {
		return Bolesti;
	}



	public void setBolesti(String bolesti) {
		Bolesti = bolesti;
	}



	public String getAlergije() {
		return Alergije;
	}



	public void setAlergije(String alergije) {
		Alergije = alergije;
	}



	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%20s %20s %20s %20s %20s %20s %20s %20s", ime,
				prezime, dtf.format(datumRodjenja), jmbg, zanimanjePoSkoli,
				gdeRadi, Bolesti, Alergije);
	}
	
	/* 
	 * private String ime;
	private String prezime;
	private LocalDate datumRodjenja;
	private int jmbg;
	private String zanimanjePoSkoli;
	private String gdeRadi;
	private String Bolesti;
	private String Alergije;*/
	

}
