package ispitniZadatak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Objekat {


	private int id;
	private double cena;
	private LocalDate datumNabavke;
	private String tip;
	private String opis;
	private int kolicina;
	
	
	public Objekat() {
		
	}


	public Objekat(int id, double cena, LocalDate datumNabavke, String tip, String opis, int kolicina) {
		super();
		this.id = id;
		this.cena = cena;
		this.datumNabavke = datumNabavke;
		this.tip = tip;
		this.opis = opis;
		this.kolicina = kolicina;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public LocalDate getDatumNabavke() {
		return datumNabavke;
	}


	public void setDatumNabavke(LocalDate datumNabavke) {
		this.datumNabavke = datumNabavke;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}


	public int getKolicina() {
		return kolicina;
	}


	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}


	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%15s %15s %15s %15s %15s %15s", id, cena, dtf.format(datumNabavke), tip, opis, kolicina);
	}
	
	
	/*
	 * private int id;
	private double cena;
	private LocalDate datumNabavke;
	private String tip;
	private String opis;
	private int kolicina;
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
