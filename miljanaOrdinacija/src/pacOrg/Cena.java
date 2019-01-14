package pacOrg;

public class Cena {
	
	private int id;
	private String ime;
	private String prezime;
	private double dug;
	private double placeno;
	private double trenutnoStanje;
	
	public Cena() {
		
	}
	
	
	
	public Cena(int id, double dug, double placeno) {
		super();
		this.id = id;
		this.dug = dug;
		this.placeno = placeno;
	}

	


	public Cena(String ime, String prezime, double dug, double placeno) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.dug = dug;
		this.placeno = placeno;
	}
	
	



	public Cena(int id, double dug, double placeno, double trenutnoStanje) {
		super();
		this.id = id;
		this.dug = dug;
		this.placeno = placeno;
		this.trenutnoStanje = trenutnoStanje;
	}



	public Cena(int id, String ime, String prezime, double dug, double placeno, double trenutnoStanje) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.dug = dug;
		this.placeno = placeno;
		this.trenutnoStanje = trenutnoStanje;
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

	public double getDug() {
		return dug;
	}

	public void setDug(double dug) {
		this.dug = dug;
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

	@Override
	public String toString() {
		return String.format("%15s %15s %15s %15s %15s %15s", id, ime, prezime, dug, placeno, trenutnoStanje);
	}
	
	
	
	
	
	
	/*
	 * private int id;
	private String ime;
	private String prezime;
	private double dug;
	private double placeno;
	private double trenutnoStanje;
	 */
	
	

}
