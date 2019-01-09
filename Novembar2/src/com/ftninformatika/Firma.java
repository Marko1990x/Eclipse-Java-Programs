package com.ftninformatika;

import java.util.List;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Firma {

	private ArrayList<Inventar> listaInventara;

	public Firma() {

		this.listaInventara = new ArrayList<Inventar>();

	}

	public ArrayList<Inventar> getListaInventara() {
		return listaInventara;
	}

	public void setListaInventara(ArrayList<Inventar> listaInventara) {
		this.listaInventara = listaInventara;
	}

	@Override
	public String toString() {
		return "Firma [listaInventara=" + listaInventara + "]";
	}



	//

	// lista

	public void listaInentara() {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar inventar = listaInventara.get(i);
			System.out.println(inventar);
		}
	}




	public void save(String path) {

		ArrayList<String> lines = new ArrayList<String>();

		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar inventar = this.listaInventara.get(i);
			int id = inventar.getId();
			String ime = inventar.getIme();
			String prostorija = inventar.getPrezime();
			String imeiPrezime = inventar.getImeIprezime();
			double procenjenaVr = inventar.getProcenjenaVrednost();
			int godProizvodnje = inventar.getGodProizvodnje();
			LocalDate datum = inventar.getDatum();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			String formiraniDatum = dtf.format(datum);
			String line = id +";"+ ime +";"+ prostorija +";"+ imeiPrezime +";"+ procenjenaVr +";"+ godProizvodnje +";"+
					formiraniDatum;

			lines.add(line);
		}
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}

	public void load(String path) {

		this.listaInventara = new ArrayList<Inventar>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String [] attributes = line.split(";");
				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prostorija = attributes[2];
				String imeiPrezime = attributes[3];
				double procVr = Double.parseDouble(attributes[4]);
				int godinaProizvodnje = Integer.parseInt(attributes[5]);
				String datum = attributes[6];
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				LocalDate datumZaCuvanje= LocalDate.parse(datum, dtf);

				Inventar inventar = new Inventar(id,ime,prostorija,imeiPrezime,procVr,
						godinaProizvodnje,datumZaCuvanje);

				this.listaInventara.add(inventar);


			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}


	// provera Za Unos isti id

	public boolean dodavanjeInventara (Inventar inventar) {
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar inventarLista = this.listaInventara.get(i);
			int broInvLista = inventarLista.getId();
			int prosledjenibroj = inventar.getId();
			if (broInvLista == prosledjenibroj) {
				return false;
			}
		}
		Inventar noviInventar = new Inventar(inventar.getId(), inventar.getIme(), inventar.getPrezime(),
				inventar.getImeIprezime(), inventar.getProcenjenaVrednost(), inventar.getGodProizvodnje(), inventar.getDatum());
		boolean daLiJeDodat = this.listaInventara.add(noviInventar);
		return daLiJeDodat;
	}



	// provera za brisanje ako se nalazi u listi po id

	public Inventar brisanjeInventara (int id) {
		int indeks = -1;
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar lista = this.listaInventara.get(i);
			int brokLista = lista.getId();
			if (brokLista == id) {
				indeks = i;
				break;
			}
		}

		if (indeks != -1) {
			Inventar kojiSeBrise = this.listaInventara.remove(indeks);
			System.out.println("Brisanje po sifri je uspesno uradjeno.");
			return kojiSeBrise;
		}

		return null;

	}



	// provera za istu prostoriju

	public void lstIstaProstorija(String prostorija) {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar prostorijaLista = this.listaInventara.get(i);
			String proLista = prostorijaLista.getPrezime();
			if (proLista.equalsIgnoreCase(prostorija)) {
				Inventar kojiOdgovara = this.listaInventara.get(i);
				System.out.println(kojiOdgovara);
			}
		}

	}


	public void lstaIstiNaziv(String ime) {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar imeLista = this.listaInventara.get(i);
			String imeUzeto = imeLista.getIme();
			if (imeUzeto.equalsIgnoreCase(ime)) {
				Inventar pronadjen = this.listaInventara.get(i);
				System.out.println(pronadjen);
			}
		}
	}


	// pretraga po prostoriji imenu i godini vecoj od zadate 

	public void lstaViseParametara(String prostorija, String ime, int zadataGodina) {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar invLista = this.listaInventara.get(i);
			String prostorijaLista = invLista.getPrezime(); // prostorija
			String imeiPrezime = invLista.getImeIprezime(); // osoba
			int godinaLista = invLista.getGodProizvodnje();
			if (prostorijaLista.equalsIgnoreCase(prostorija)&&
					imeiPrezime.equalsIgnoreCase(ime)&&
					godinaLista > zadataGodina) {

				Inventar inventarKojiZadovoljavaSvaTriUslova = this.listaInventara.get(i);
				System.out.println(inventarKojiZadovoljavaSvaTriUslova);

			}
		}	
	}

	// pretraga po imenu i 2 vrednosti


	public void lstPoVrednosti(String ime, double min, double max) {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {

			Inventar inventar = this.listaInventara.get(i);
			String imeX = inventar.getIme(); // naziv inventara pogresno sam nazvao promenjivu
			double procenjenaVr = inventar.getProcenjenaVrednost();
			if (imeX.equalsIgnoreCase(ime)&&
					procenjenaVr >= min &&
					procenjenaVr <= max) {

				Inventar inventar2 = this.listaInventara.get(i);
				System.out.println(inventar2);

			}
		}
	}

	// provera za izmenu inventara

	public Inventar izmenaInventara(Inventar inventar) {

		for ( int i = 0 ; i < this.listaInventara.size(); i++) {
			Inventar invlista = this.listaInventara.get(i);
			int brojInv = invlista.getId();
			if (brojInv == inventar.getId()) {
				Inventar inventar2 = this.listaInventara.set(i, inventar);
				return inventar2;
			}
		}
		return null;
	}


	public void lstProstorijaGraniceDatuma(String prostorija, String osoba, LocalDate datum) {
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n", "id",
				"ime", "prostorija", "imeIprezime", "procenjenaVrednost", "godProizvodnje", "datum");
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar inventar = this.listaInventara.get(i);
			String prostorijaLista = inventar.getPrezime();
			String osobaLista = inventar.getImeIprezime();
			LocalDate datumLista = inventar.getDatum();
			if (prostorijaLista.equalsIgnoreCase(prostorija)&&
					osobaLista.equalsIgnoreCase(osoba)&&
					datumLista.compareTo(datum) < 0) {
				Inventar inventar2 = this.listaInventara.get(i);
				System.out.println(inventar2);

			}
		}
	}


	public void lstaPoUslovima (String osoba, int godinaProizvodnje) {
		ArrayList<Inventar> invProsecnaVrednost = new ArrayList<>();
		for (int i = 0; i < this.listaInventara.size(); i++) {
			if (this.listaInventara.get(i).getImeIprezime().equals(osoba)&&
					this.listaInventara.get(i).getGodProizvodnje() > godinaProizvodnje) {
				invProsecnaVrednost.add(this.listaInventara.get(i));

			}

		}
		
		double suma = 0;
		if (invProsecnaVrednost.size() > 0) {
			for (int i = 0; i < invProsecnaVrednost.size(); i++) {
				suma += invProsecnaVrednost.get(i).getProcenjenaVrednost();
				
			}
			
			double prosecnaVr = suma / invProsecnaVrednost.size();
			System.out.println("Prosecna vrednost inventara koji zadovoljavaju uslove je: " +prosecnaVr);
			
		}else {
			System.out.println("prosecna vrednost se ne moze izracunati jer ne ma podataka koji zadovoljavaju.");
		}
		
	}


	/*
	 *  * private int id;
	private String ime;
	private String prezime;
	private String imeIprezime;
	private double procenjenaVrednost;
	private int godProizvodnje;
	private LocalDate datum;
	 */



}
