package ispitniZadatak;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Firma {

	// dekalracija konstrukto getter i setter i to string. 


	private String naziv;
	private String WebAdressa;
	private String telefon;
	private ArrayList<Objekat> listaObjekata;

	public Firma() {
		this.listaObjekata = new ArrayList<Objekat>();
	}

	public Firma(String naziv, String webAdressa, String telefon, ArrayList<Objekat> listaObjekata) {
		super();
		this.naziv = naziv;
		WebAdressa = webAdressa;
		this.telefon = telefon;
		this.listaObjekata = new ArrayList<Objekat>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getWebAdressa() {
		return WebAdressa;
	}

	public void setWebAdressa(String webAdressa) {
		WebAdressa = webAdressa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public ArrayList<Objekat> getListaObjekata() {
		return listaObjekata;
	}

	public void setListaObjekata(ArrayList<Objekat> listaObjekata) {
		this.listaObjekata = listaObjekata;
	}

	@Override
	public String toString() {
		return "Firma [naziv=" + naziv + ", WebAdressa=" + WebAdressa + ", telefon=" + telefon + "]";
	}






	// provere i liste 


	// zadatak 2 

	/*	public boolean dodavanjeTransakcije(Transakcija transakcija) {

		for (int i = 0; i < this.listaTransakcija.size(); i++) {
			Transakcija transakcijaIzListe = this.listaTransakcija.get(i);
			if(transakcija.getId() == transakcijaIzListe.getId()) {
				return false;
			}
		}
		this.listaTransakcija.add(transakcija);
		return true;
	}
	 */  // provera za dodavanje opreme

	public boolean dodavanjeOpreme (Objekat objekat) {
		for (int i = 0;  i < this.listaObjekata.size(); i++) {
			Objekat objekatlista = this.listaObjekata.get(i);
			if (objekatlista.getId() == objekat.getId()) {
				return false;
			}
		}
		this.listaObjekata.add(objekat);
		return true;
	}



	public void save (String path) {

		ArrayList<String>lines = new ArrayList<String>();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

		for (int i = 0; i < this.listaObjekata.size(); i++) {
			Objekat objekat = this.listaObjekata.get(i);
			int id = objekat.getId();
			double cena = objekat.getCena();
			LocalDate datum = objekat.getDatumNabavke();
			String tip = objekat.getTip();
			String opis = objekat.getOpis();
			int kolicina = objekat.getKolicina();
			String formiraniDatum = dtf.format(datum);

			String line = id +";"+ cena +";"+ formiraniDatum +";"+ tip +";"+ opis +";"+ kolicina;
			lines.add(line);

		}

		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}


	}

	/*
	 * private int id;
private double cena;
private LocalDate datumNabavke;
private String tip;
private String opis;
private int kolicina;
	 */


	public void load(String path) {

		this.listaObjekata = new ArrayList<Objekat>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split(";");

				int id = Integer.parseInt(attributes[0]);
				double cena = Double.parseDouble(attributes[1]);
				String datum = attributes[2];
				String tip = attributes[3];
				String opis = attributes[4];
				int kolicina = Integer.parseInt(attributes[5]);

				LocalDate datumZaCuvanje = null;
				try {
					datumZaCuvanje = LocalDate.parse(datum, dtf);
				} catch (Exception e) {
					e.printStackTrace();
				}

				Objekat objekat = new Objekat(id, cena, datumZaCuvanje, tip, opis, kolicina);
				this.listaObjekata.add(objekat);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}




	public void lstPodatakaOpreme() {
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "cena", "datumNabavke", "tip", "opis", "kolicina");
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			Objekat transakcija = this.listaObjekata.get(i);
			System.out.println(transakcija);
		}
	}





	// izmena po identifikatoriu.

	public Objekat izmenaTrans(Objekat objekatIzmena) {
		for(int i = 0; i < this.listaObjekata.size(); i++) {
			Objekat transakcija = this.listaObjekata.get(i);
			int id = transakcija.getId();
			if (id == objekatIzmena.getId()) {
				Objekat kojaSeMenja = this.listaObjekata.set(i, objekatIzmena);
				return kojaSeMenja;
			}
		}
		return null;
	}



	public Objekat brisanjeT(int id) {
		int index = -1;
		for (int i = 0; i < this.listaObjekata.size();i++) {
			if (this.listaObjekata.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			Objekat objekatZabrisanje = this.listaObjekata.remove(index);
			System.out.println("Brisanje je uspesno zavrseno");
			return objekatZabrisanje;
		}
		return null;
	}

	// pretraga po Stringu tip u ovom slucaju.

	public ArrayList<Objekat> prosledjenoIme (String tipProsledjen) {
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "cena", "datumNabavke", "tip", "opis", "kolicina");
		ArrayList<Objekat> listaresultata = new ArrayList<>();
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			Objekat transakcija = this.listaObjekata.get(i);
			String imeLista = transakcija.getTip();
			if (imeLista.equalsIgnoreCase(tipProsledjen)) {
				Objekat transakcija2 = this.listaObjekata.get(i);
				listaresultata.add(transakcija2);
				System.out.println(transakcija2);
			}
		}
		return listaresultata;
	}


	// zadati String min i max velicina

	public void lstPoVrednosti(String tip, double min, double max) {
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "cena", "datumNabavke", "tip", "opis", "kolicina");
		for (int i = 0; i < this.listaObjekata.size(); i++) {

			Objekat objekat = this.listaObjekata.get(i);
			String imeX = objekat.getTip(); // naziv inventara pogresno sam nazvao promenjivu
			double procenjenaVr = objekat.getCena();
			if (imeX.equalsIgnoreCase(tip)&&
					procenjenaVr >= min &&
					procenjenaVr <= max) {

				Objekat objekat2 = this.listaObjekata.get(i);
				System.out.println(objekat2);

			}
		}
	}



	// prosecna cena orpeme koja je nabavljena posle zadatog datuma

	public void lstaPoUslovima (LocalDate datumProsledjeni) {
		ArrayList<Objekat> invProsecnaVrednost = new ArrayList<>();
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			if (this.listaObjekata.get(i).getDatumNabavke().compareTo(datumProsledjeni) > 0) {
				invProsecnaVrednost.add(this.listaObjekata.get(i));

			}

		}

		double suma = 0;
		if (invProsecnaVrednost.size() > 0) {
			for (int i = 0; i < invProsecnaVrednost.size(); i++) {
				suma += invProsecnaVrednost.get(i).getCena();

			}

			double prosecnaVr = suma / invProsecnaVrednost.size();
			System.out.println("Prosecna vrednost opreme koja je kupjlena posle zadatog datuma je: " +prosecnaVr);

		}else {
			System.out.println("Prosecna vrednost se ne moze izracunati jer nema podataka koji zadovoljavaju uneti datum.");
		}

	}



	// pretraga po granicama datuma 

	public void lstProstorijaGraniceDatuma(LocalDate min, LocalDate max) {
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "cena", "datumNabavke", "tip", "opis", "kolicina");
		ArrayList<Objekat> najvecaVrednost = new ArrayList<>();
		for (int i = 0; i < this.listaObjekata.size(); i++) {
			if (this.listaObjekata.get(i).getDatumNabavke().compareTo(min) >= 0 &&
					this.listaObjekata.get(i).getDatumNabavke().compareTo(max) <= 0) {
				Objekat objekatX = this.getListaObjekata().get(i);
				najvecaVrednost.add(objekatX);
				System.out.println(objekatX);

			}
		}
	}


	/*
	 * && this.listaTransakcija.get(i).getDatumTransakcije().compareTo(min) >= 0
					&& this.listaTransakcija.get(i).getDatumTransakcije().compareTo(max) <= 0)


				System.out.println(inventar2);
	 */




}
