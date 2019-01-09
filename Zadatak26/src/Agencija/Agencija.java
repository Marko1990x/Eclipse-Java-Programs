package Agencija;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Agencija {
	
	private String naziv;
	private String webAdresa;
	private String telefon;
	private ArrayList<Transakcija> listaTransakcija;
	
	public Agencija() {
		this.listaTransakcija = new ArrayList<Transakcija>();
	}

	public Agencija(String naziv, String webAdresa, String telefon, ArrayList<Transakcija> listaTransakcija) {
		super();
		this.naziv = naziv;
		this.webAdresa = webAdresa;
		this.telefon = telefon;
		this.listaTransakcija = new ArrayList<Transakcija>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getWebAdresa() {
		return webAdresa;
	}

	public void setWebAdresa(String webAdresa) {
		this.webAdresa = webAdresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public ArrayList<Transakcija> getListaTransakcija() {
		return listaTransakcija;
	}

	public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) {
		this.listaTransakcija = listaTransakcija;
	}

	@Override
	public String toString() {
		return "Agencija [naziv=" + naziv + ", webAdresa=" + webAdresa + ", telefon=" + telefon + "]";
	}
	
	
	
	
	// metode transakcija ispis 
	
	public void lstTransakcija() {
		System.out.printf("%15s %15s %15s %15s %15s \n", "id", "nazivKlienta","datumTransakcije", "tipTransakcije",
				"iznosTransakcije");
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcija = this.listaTransakcija.get(i);
			System.out.println(transakcija);
		}
	}
	
	

	
	public boolean dodavanjeTransakcije(Transakcija transakcija) {

		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcijaIzListe = this.listaTransakcija.get(i);
			if(transakcija.getId() == transakcijaIzListe.getId()) {
				return false;
			}
		}
		this.listaTransakcija.add(transakcija);
		return true;
	}

	public Transakcija izmenaTrans(Transakcija transakcijaIzmena) {
		for(int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcija = this.listaTransakcija.get(i);
			int id = transakcija.getId();
			if (id == transakcijaIzmena.getId()) {
				Transakcija kojaSeMenja = this.listaTransakcija.set(i, transakcijaIzmena);
				return kojaSeMenja;
			}
		}
		return null;
	}
	
	public void save (String path) {
		
		ArrayList<String>lines = new ArrayList<String>();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcija = this.listaTransakcija.get(i);
			int id = transakcija.getId();
			String naziv = transakcija.getNazivKlienta();
			LocalDate datum = transakcija.getDatumTransakcije();
			String tipTransakcije = transakcija.getTipTransakcije();
			double iznos = transakcija.getIznosTransakcije();
			String formiraniDatum = dtf.format(datum);
			String line = id +";"+ naziv +";"+ formiraniDatum +";"+ tipTransakcije +";"+
			iznos;
			lines.add(line);
			
		}
		
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}
		
		
	}
	
	
	public void load(String path) {

		this.listaTransakcija = new ArrayList<Transakcija>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split(";");

				int id = Integer.parseInt(attributes[0]); 
				String nazivKlijenta = attributes[1];
				String datumString = attributes[2];  
				String tipTransakcije = attributes[3];
				double iznosTransakcije = Double.parseDouble(attributes[4]); 
				LocalDate datumZaCuvanje = null;
				try {
					datumZaCuvanje = LocalDate.parse(datumString, dtf);
				} catch (Exception e) {
					e.printStackTrace();
				}

				Transakcija transakcija = new Transakcija(id, nazivKlijenta, datumZaCuvanje, tipTransakcije, iznosTransakcije);
				this.listaTransakcija.add(transakcija);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}
	/*
	 *  * private int id;
	private String nazivKlienta;
	private LocalDate datumTransakcije;
	private String tipTransakcije;
	private double iznosTransakcije;
	 */
	
	public Transakcija brisanjeT(int id) {
		int index = -1;
		for (int i = 0; i < this.listaTransakcija.size();i++) {
			if (this.listaTransakcija.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			Transakcija transakcijaBrisanje = this.listaTransakcija.remove(index);
			System.out.println("Brisanje je uspesno zavrseno");
			return transakcijaBrisanje;
		}
		return null;
	}
	
	public ArrayList<Transakcija> prosledjenoIme (String ime) {
		System.out.printf("%15s %15s %15s %15s %15s \n", "id", "nazivKlienta","datumTransakcije", "tipTransakcije",
				"iznosTransakcije");
		ArrayList<Transakcija> listaresultata = new ArrayList<>();
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcija = this.listaTransakcija.get(i);
			String imeLista = transakcija.getNazivKlienta();
			if (imeLista.equalsIgnoreCase(ime)) {
				Transakcija transakcija2 = this.listaTransakcija.get(i);
				listaresultata.add(transakcija2);
				System.out.println(transakcija2);
			}
		}
		return listaresultata;
	}
	
	
	public ArrayList<Transakcija> ispisUlataKlienta (String nazivKlienta){
		System.out.printf("%15s %15s %15s %15s %15s \n", "id", "nazivKlienta","datumTransakcije", "tipTransakcije",
				"iznosTransakcije");
		ArrayList<Transakcija> listaresultata = new ArrayList<>();
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			if (this.listaTransakcija.get(i).getNazivKlienta().equalsIgnoreCase(nazivKlienta)&&
					this.listaTransakcija.get(i).getTipTransakcije().equalsIgnoreCase("uplata")) {
				Transakcija transakcija = this.listaTransakcija.get(i);
				listaresultata.add(transakcija);
				System.out.println(transakcija);
				
			}
		}
		return listaresultata;
	}
	
	
	public double prosecnaIsplataKlienta(String nazivKlienta) {
		
		ArrayList<Transakcija> listaResultata = new ArrayList<>();
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			if (this.listaTransakcija.get(i).getNazivKlienta().equalsIgnoreCase(nazivKlienta)&&
					this.listaTransakcija.get(i).getTipTransakcije().equalsIgnoreCase("isplata")) {
					listaResultata.add(this.listaTransakcija.get(i));
			}
		}
		
		
		double prosek = 0.0;
		double suma = 0.0;
		for (int i = 0; i < listaResultata.size(); i++) {
			suma += listaResultata.get(i).getIznosTransakcije();
		}
		
		if (suma > 0.0) {
			prosek = suma / listaResultata.size();
		}
		
		System.out.println("Prosecna transakcija klient: " + nazivKlienta + "za isplatu je:" + prosek);
		return prosek;
		
	}
	
	
	
	public Transakcija findTopUplata(String nazivKlienta, LocalDate min, LocalDate max) {
		
		ArrayList<Transakcija> listaRezultata = new ArrayList<>();
		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			if(this.listaTransakcija.get(i).getNazivKlienta().equalsIgnoreCase(nazivKlienta)
					&& this.listaTransakcija.get(i).getTipTransakcije().equals("uplata")
					&& this.listaTransakcija.get(i).getDatumTransakcije().compareTo(min) >= 0
					&& this.listaTransakcija.get(i).getDatumTransakcije().compareTo(max) <= 0) {
				listaRezultata.add(this.listaTransakcija.get(i));
			}
		}
		
		Transakcija najveca = null;
		if (listaRezultata.size() > 0) {
			najveca = listaRezultata.get(0);
			for (int i = 0; i < listaRezultata.size(); i++) {
				if (najveca.getIznosTransakcije() < listaRezultata.get(i).getIznosTransakcije()) {
					najveca = listaRezultata.get(i);
				
					
				}
			}
			
		}
		if (najveca != null) {
			System.out.println("Najveca transakcija klienta: " + nazivKlienta + "za uplatu je " + najveca.getIznosTransakcije());
		}else {
			System.out.println("Ne postoji informacija za zadate uslove.");
		}
		return najveca;
		
	}
	
	
	
	
	
	
	
	

}
