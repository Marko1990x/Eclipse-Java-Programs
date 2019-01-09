package com.ftninformatika;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Inventar {
	
	
	private int id;
	private String ime;
	private String prostorija;
	private String imeIprezime;
	private double procenjenaVrednost;
	private int godProizvodnje;
	private LocalDate datum;
	
	public Inventar() {
		
	}

	public Inventar(int id, String ime, String prezime, String imeIprezime, double procenjenaVrednost,
			int godProizvodnje, LocalDate datum) {
		super();
		this.id = id;
		this.ime = ime;
		this.prostorija = prezime;
		this.imeIprezime = imeIprezime;
		this.procenjenaVrednost = procenjenaVrednost;
		this.godProizvodnje = godProizvodnje;
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
		return prostorija;
	}

	public void setPrezime(String prezime) {
		this.prostorija = prezime;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public double getProcenjenaVrednost() {
		return procenjenaVrednost;
	}

	public void setProcenjenaVrednost(double procenjenaVrednost) {
		this.procenjenaVrednost = procenjenaVrednost;
	}

	public int getGodProizvodnje() {
		return godProizvodnje;
	}

	public void setGodProizvodnje(int godProizvodnje) {
		this.godProizvodnje = godProizvodnje;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%10s %10s %10s %10s %10.2f %10s %10s", id,
				ime, prostorija, imeIprezime, procenjenaVrednost, godProizvodnje, dtf.format(datum));
	}
	
	
	/*
	 * private int id;
	private String ime;
	private String prezime;
	private String imeIprezime;
	private double procenjenaVrednost;
	private int godProizvodnje;
	private LocalDate datum;
	
	 */
	

}
