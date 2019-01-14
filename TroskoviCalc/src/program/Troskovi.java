package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Troskovi {
	
	private String imeTroska;
	private double trosak;
	private double placeno;
	private double trenutnoStanje;
	private double kamata;
	private double TrenutnoStanjeBezKamate;
	private LocalDate datumUnosa;
	
	
	
	public double getTrenutnoStanjeBezKamate() {
		return TrenutnoStanjeBezKamate;
	}
	public void setTrenutnoStanjeBezKamate(double trenutnoStanjeBezKamate) {
		TrenutnoStanjeBezKamate = trenutnoStanjeBezKamate;
	}
	public String getImeTroska() {
		return imeTroska;
	}
	public void setImeTroska(String imeTroska) {
		this.imeTroska = imeTroska;
	}
	public double getTrosak() {
		return trosak;
	}
	public void setTrosak(double trosak) {
		this.trosak = trosak;
	}
	public double getPlaceno() {
		return placeno;
	}
	public void setPlaceno(double placeno) {
		this.placeno = placeno;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	public void setTrenutnoStanje(double trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}
	public double getKamata() {
		return kamata;
	}
	public void setKamata(double kamata) {
		this.kamata = kamata;
	}
	public LocalDate getDatumUnosa() {
		return datumUnosa;
	}
	public void setDatumUnosa(LocalDate datumUnosa) {
		this.datumUnosa = datumUnosa;
	}
	
	
	public Troskovi() {
	
	}
	public Troskovi(String imeTroska, double trosak, double placeno, double trenutnoStanje, double kamata,
			LocalDate datumUnosa) {
		super();
		this.imeTroska = imeTroska;
		this.trosak = trosak;
		this.placeno = placeno;
		this.trenutnoStanje = trenutnoStanje;
		this.kamata = kamata;
		this.datumUnosa = datumUnosa;
	}
	
	
	
	public Troskovi(String imeTroska, double trosak, double placeno, double trenutnoStanje, double kamata,
			double trenutnoStanjeBezKamate, LocalDate datumUnosa) {
		super();
		this.imeTroska = imeTroska;
		this.trosak = trosak;
		this.placeno = placeno;
		this.trenutnoStanje = trenutnoStanje;
		this.kamata = kamata;
		TrenutnoStanjeBezKamate = trenutnoStanjeBezKamate;
		this.datumUnosa = datumUnosa;
	}
	/*@Override
	public String toString() {
		return "Troskovi [imeTroska=" + imeTroska + ", trosak=" + trosak + ", placeno=" + placeno + ", trenutnoStanje="
				+ trenutnoStanje + ", kamata=" + kamata + ", datumUnosa=" + datumUnosa + "]";
	}
	*/
	

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return String.format("%18s %12.2f %12.2f %12.2f %10.2f %12.2f %15s", imeTroska, trosak, placeno, trenutnoStanje, kamata, TrenutnoStanjeBezKamate, dtf.format(datumUnosa));
	}
	
	
	
	
	
	
	

}
