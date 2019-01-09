package Agencija;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transakcija {
	
	private int id;
	private String nazivKlienta;
	private LocalDate datumTransakcije;
	private String tipTransakcije;
	private double iznosTransakcije;
	
	public Transakcija() {
		
	}

	public Transakcija(int id, String nazivKlienta, LocalDate datumTransakcije, String tipTransakcije,
			double iznosTransakcije) {
		super();
		this.id = id;
		this.nazivKlienta = nazivKlienta;
		this.datumTransakcije = datumTransakcije;
		this.tipTransakcije = tipTransakcije;
		this.iznosTransakcije = iznosTransakcije;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazivKlienta() {
		return nazivKlienta;
	}

	public void setNazivKlienta(String nazivKlienta) {
		this.nazivKlienta = nazivKlienta;
	}

	public LocalDate getDatumTransakcije() {
		return datumTransakcije;
	}

	public void setDatumTransakcije(LocalDate datumTransakcije) {
		this.datumTransakcije = datumTransakcije;
	}

	public String getTipTransakcije() {
		return tipTransakcije;
	}

	public void setTipTransakcije(String tipTransakcije) {
		this.tipTransakcije = tipTransakcije;
	}

	public double getIznosTransakcije() {
		return iznosTransakcije;
	}

	public void setIznosTransakcije(double iznosTransakcije) {
		this.iznosTransakcije = iznosTransakcije;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%15s %15s %15s %15s %15.2f", id, nazivKlienta,
				dtf.format(datumTransakcije), tipTransakcije, iznosTransakcije);
	}
	
	
	/*
	 * private int id;
	private String nazivKlienta;
	private LocalDate datumTransakcije;
	private String tipTransakcije;
	private double iznosTransakcije;
	 */
	

}
