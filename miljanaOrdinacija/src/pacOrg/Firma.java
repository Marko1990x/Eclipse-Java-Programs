package pacOrg;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Firma {


	private ArrayList<UserClass> listaKorisnika;
	private ArrayList<RadnaStolica> listaStolica;
	private ArrayList<Cena> listaCena;
	private ArrayList<Historiat> listaIstorije;
	private ArrayList<TerminiOrd> listaTermina;



	public Firma() {
		this.listaKorisnika = new ArrayList<UserClass>();
		this.listaStolica = new ArrayList<RadnaStolica>();
		this.listaCena = new ArrayList<Cena>();
		this.listaIstorije = new ArrayList<Historiat>();
		this.listaTermina = new ArrayList<TerminiOrd>();
	}
	
	


	public ArrayList<TerminiOrd> getListaTermina() {
		return listaTermina;
	}




	public void setListaTermina(ArrayList<TerminiOrd> listaTermina) {
		this.listaTermina = listaTermina;
	}




	public Firma(ArrayList<UserClass> listaKorisnika, ArrayList<RadnaStolica> radnaStolica) {
		super();
		this.listaKorisnika = listaKorisnika;
		this.listaStolica = radnaStolica;
	}



	public Firma(ArrayList<UserClass> listaKorisnika, ArrayList<RadnaStolica> radnaStolica, ArrayList<Cena> listaCena) {
		super();
		this.listaKorisnika = listaKorisnika;
		this.listaStolica = radnaStolica;
		this.listaCena = listaCena;
	}



	public Firma(ArrayList<UserClass> listaKorisnika, ArrayList<RadnaStolica> listaStolica, ArrayList<Cena> listaCena,
			ArrayList<Historiat> listaIstorije) {
		super();
		this.listaKorisnika = listaKorisnika;
		this.listaStolica = listaStolica;
		this.listaCena = listaCena;
		this.listaIstorije = listaIstorije;
	}
	
	


	public Firma(ArrayList<UserClass> listaKorisnika, ArrayList<RadnaStolica> listaStolica, ArrayList<Cena> listaCena,
			ArrayList<Historiat> listaIstorije, ArrayList<TerminiOrd> listaTermina) {
		super();
		this.listaKorisnika = listaKorisnika;
		this.listaStolica = listaStolica;
		this.listaCena = listaCena;
		this.listaIstorije = listaIstorije;
		this.listaTermina = listaTermina;
	}




	public ArrayList<RadnaStolica> getListaStolica() {
		return listaStolica;
	}


	public void setListaStolica(ArrayList<RadnaStolica> listaStolica) {
		this.listaStolica = listaStolica;
	}


	public ArrayList<Historiat> getListaIstorije() {
		return listaIstorije;
	}


	public void setListaIstorije(ArrayList<Historiat> listaIstorije) {
		this.listaIstorije = listaIstorije;
	}


	public ArrayList<Cena> getListaCena() {
		return listaCena;
	}


	public void setListaCena(ArrayList<Cena> listaCena) {
		this.listaCena = listaCena;
	}


	public ArrayList<UserClass> getListaKorisnika() {
		return listaKorisnika;
	}

	public void setListaKorisnika(ArrayList<UserClass> listaKorisnika) {
		this.listaKorisnika = listaKorisnika;
	}

	public ArrayList<RadnaStolica> getRadnaStolica() {
		return listaStolica;
	}

	public void setRadnaStolica(ArrayList<RadnaStolica> radnaStolica) {
		this.listaStolica = radnaStolica;
	}

	

	@Override
	public String toString() {
		return "Firma [listaKorisnika=" + listaKorisnika + ", listaStolica=" + listaStolica + ", listaCena=" + listaCena
				+ ", listaIstorije=" + listaIstorije + ", listaTermina=" + listaTermina + "]";
	}




	public boolean dodavanjePacijenta (UserClass userClass) {

		for (int i = 0; i < listaKorisnika.size(); i++) {
			UserClass korisnikLista = this.listaKorisnika.get(i);
			if (korisnikLista.getId() == userClass.getId()) {
				return false;
			}
		}

		this.listaKorisnika.add(userClass);
		save("pacijenti.txt");
		return true;

	}
	
	
	public boolean dodavanjeTermina (TerminiOrd termin) {

		for (int i = 0; i < listaTermina.size(); i++) {
			TerminiOrd korisnikLista = this.listaTermina.get(i);
			if (korisnikLista.getID() == termin.getID()) {
				return false;
			}
		}

		this.listaTermina.add(termin);
		saveTermini("termini.txt");
		return true;

	}
	
	
	public void lstTermina() {
		
		loadTermini("termini.txt");
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "ID", "ime", "prezime",
				"Vreme Pocetno", "Vreme Krajnje","Datum");
		
		for (int i = 0; i < this.listaTermina.size(); i++) {
			TerminiOrd ord = this.listaTermina.get(i);
			System.out.println(ord);
		}
		
	}
	
	public void lstImePrezimeTermini(String ime, String prezime) {
		
		loadTermini("termini.txt");
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "ID", "ime", "prezime",
				"Vreme Pocetno", "Vreme Krajnje","Datum");
		
		for (int i = 0; i < this.listaTermina.size(); i++) {
			if (this.listaTermina.get(i).getIme().equalsIgnoreCase(ime)&&
					this.listaTermina.get(i).getPrezime().equalsIgnoreCase(prezime)) {
				
				TerminiOrd ord = this.listaTermina.get(i);
				System.out.println(ord);
				
			}
		}
	}
	

	public boolean unosCene (Cena cena) {

		for (int i = 0; i < listaCena.size(); i++) {
			Cena cenaLista = this.listaCena.get(i);
			if (cenaLista.getId() == cena.getId()) {
				return false;
			}
		}

		this.listaCena.add(cena);
		saveCena("cene.txt");
		return true;

	}


	// save i load metoda historiata

	public void saveHistoriat(String path) {

		ArrayList<String> lines = new ArrayList<String>();

		for (int i = 0; i < this.listaIstorije.size(); i++) {

			Historiat podatakLista = this.listaIstorije.get(i);

			int id = podatakLista.getID();
			String imePacijenta = podatakLista.getImePacijenta();
			String GornjiLeviZubi = podatakLista.getGornjiLeviZubi();
			String GornjiDesniZubi = podatakLista.getGornjiDesniZubi();
			String DonjiLeviZubi = podatakLista.getDonjiLeviZubi();
			String DonjiDesniZubi = podatakLista.getDonjiDesniZubi();
			String Datum = podatakLista.getDatum();

			String line = id +"/"+ imePacijenta +"/"+ GornjiLeviZubi +"/"+ GornjiDesniZubi +"/"+ DonjiLeviZubi +"/"+ DonjiDesniZubi +"/"+ Datum;

			lines.add(line);	
		}

		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}
	}


	public void loadHistoriat(String path) {


		this.listaIstorije = new ArrayList<Historiat>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");

				int id = Integer.parseInt(attributes[0]);
				String imePacijenta = attributes[1];
				String gornjiLeviZubi = attributes[2];
				String gornjiDesniZubi = attributes[3];
				String donjiLeviZubi = attributes[4];
				String donjiDesniZubi = attributes[5];
				String datum = attributes[6];

				Historiat historiat = new Historiat(id, imePacijenta, gornjiLeviZubi, gornjiDesniZubi,
						donjiLeviZubi, donjiDesniZubi, datum);
				this.listaIstorije.add(historiat);
			}

		}  catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}
	}






	// save i load metode

	public void save (String path) {		
		ArrayList<String> lines = new ArrayList<String>();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			UserClass userClass = this.listaKorisnika.get(i);

			int id = userClass.getId();
			String ime = userClass.getIme();
			String prezime = userClass.getPrezime();
			String alergije = userClass.getAlergije();
			String oboljenja = userClass.getHronicnaOboljenja();
			String godiste = userClass.getGodiste();
			String jmbg = userClass.getJmbg();
			int telefon = userClass.getTelefon();
			String adresa = userClass.getAdresa();
			LocalDate datum = userClass.getDatum();
			String formiraniDatum = dtf.format(datum);

			String line = id +"/"+ ime +"/"+ prezime +"/"+ alergije 
					+"/"+ oboljenja +"/"+ godiste +"/"+ jmbg +"/"+ telefon 
					+"/"+ adresa +"/"+ formiraniDatum;
			lines.add(line);
		}

		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}
	}

	/*
	 * private int id;   // broj kartona
	private String ime;
	private String prezime;
	private String alergije;
	private String hronicnaOboljenja;
	private String godiste;
	private int jmbg;
	private int telefon;
	private String adresa;
	private LocalDate datum;
	private double trenutnoStanje;
	private double dug;
	private double placeno;
	 */

	public void load (String path) {

		this.listaKorisnika = new ArrayList<UserClass>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		List<String> lines;

		try {

			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for(String line: lines) {
				String[] attributes = line.split("/");

				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prezime = attributes[2];
				String alergije = attributes[3];
				String hronicna = attributes[4];
				String godiste = attributes[5];
				String jmbg = attributes[6];
				int telefon = Integer.parseInt(attributes[7]);
				String adresa = attributes[8];
				String datum = attributes[9];
				LocalDate datumZaCuvanje = null;

				try {
					datumZaCuvanje = LocalDate.parse(datum, dtf);
				} catch (Exception e) {
					e.printStackTrace();
				}


				UserClass userClass = new UserClass(id, ime, prezime, alergije,
						hronicna, godiste, jmbg, telefon, adresa, datumZaCuvanje);
				this.listaKorisnika.add(userClass);

			}

		}  catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}

	}


	/*
	 * private int id;   // broj kartona
	private String ime;
	private String prezime;
	private String alergije;
	private String hronicnaOboljenja;
	private String godiste;
	private int jmbg;
	private int telefon;
	private String adresa;
	private LocalDate datum;
	private double trenutnoStanje;
	private double dug;
	private double placeno
	 */



	// metoda za listanje korisnika

	public void lstCena() {
		loadCena("cene.txt");
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime", "dug", "placeno", "trenutnoStanje");
		for (int i = 0; i < this.listaCena.size(); i++) {
			Cena cena = this.listaCena.get(i);
			System.out.println(cena);
		}

	}

	public void lstKorisnikaID(int id) {

		load("pacijenti.txt");
		System.out.printf("%15s %15s %15s %25s %25s %10s %14s %12s %30s %10s \n", "ID", "Ime", "Prezime",
				"Alergije", "Oboljenja", "Godiste", "JMBG", "Telefon", "Adresa", "Datum");

		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			if (this.listaKorisnika.get(i).getId() == id) {
				UserClass userClass = this.listaKorisnika.get(i);
				System.out.println(userClass);
			}	
		}
	}

	public void lstKorisnikaImePrezime(String ime, String prezime) {

		load("pacijenti.txt");
		System.out.printf("%15s %15s %15s %25s %25s %10s %14s %12s %30s %10s \n", "ID", "Ime", "Prezime",
				"Alergije", "Oboljenja", "Godiste", "JMBG", "Telefon", "Adresa", "Datum");

		for (int i = 0; i < this.listaKorisnika.size(); i++) {

			if (this.listaKorisnika.get(i).getIme().equalsIgnoreCase(ime) &&
					this.listaKorisnika.get(i).getPrezime().equalsIgnoreCase(prezime)) {
				UserClass userClass = this.listaKorisnika.get(i);
				System.out.println(userClass);
			}
		}
	}

	public void lstKorisnika() {


		load("pacijenti.txt");
		System.out.printf("%15s %15s %15s %25s %25s %10s %14s %12s %30s %10s \n", "ID", "Ime", "Prezime",
				"Alergije", "Oboljenja", "Godiste", "JMBG", "Telefon", "Adresa", "Datum");

		for (int i = 0; i < this.listaKorisnika.size(); i++) {

			UserClass userClass = this.listaKorisnika.get(i);
			System.out.println(userClass);

		}

	}

	public void lstCenaI(int id) {

		loadCena("cene.txt");
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime", "dug", "placeno", "trenutnoStanje");
		for (int i = 0; i <this.listaCena.size(); i++){
			if (this.listaCena.get(i).getId() == id) {
				Cena cena = this.listaCena.get(i);
				System.out.println(cena);
			}
		}

	}

	public void lstCenaImePrezime(String ime, String prezime) {

		loadCena("cene.txt");
		System.out.printf("%15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime", "dug", "placeno", "trenutnoStanje");
		for (int i = 0; i < this.listaCena.size(); i++) {

			if (this.listaCena.get(i).getIme().equalsIgnoreCase(ime)&&
					this.listaCena.get(i).getPrezime().equalsIgnoreCase(prezime)) {

				Cena cena = this.listaCena.get(i);
				System.out.println(cena);

			}
		}	
	}


	public UserClass izmenaKorisnika(UserClass userClass) {
		for(int i = 0; i < this.listaKorisnika.size(); i++) {
			UserClass userLista = this.listaKorisnika.get(i);
			int id = userLista.getId();
			if (id == userClass.getId()) {
				UserClass pacKojiSeMenja = this.listaKorisnika.set(i, userClass);
				save("pacijenti.txt");
				return pacKojiSeMenja;
			}
		}
		return null;
	}
	
	
/*
 * 
0	private String ID;
1	private String ime;
2	private String prezime;
3	private int vremePocetno;
4	private int vremeKrajnje;
5	private LocalDate datum;
 */
	
	
	public void saveTermini(String path) {
		
		ArrayList<String>lines = new ArrayList<String>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		
		for(int i = 0; i < this.listaTermina.size(); i++) {
			
			TerminiOrd ord = this.listaTermina.get(i);
			
			int id = ord.getID();
			String ime = ord.getIme();
			String prezime = ord.getPrezime();
			int VremePocetno = ord.getVremePocetno();
			int VremeKrajnje = ord.getVremeKrajnje();
			String datum = ord.getDatum();
			
			String line = id +"/"+ ime +"/"+ prezime +"/"+ VremePocetno +"/"+ VremeKrajnje
					+"/"+ datum;
			lines.add(line);
		}
		
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}
	}
	
	/*
	 * 
	0	private int ID;
	1	private String ime;
	2	private String prezime;
	3	private int vremePocetno;
	4	private int vremeKrajnje;
	5	private LocalDate datum;
	 */
	
	public void loadTermini(String path) {
		
		this.listaTermina = new ArrayList<TerminiOrd>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");
				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prezime = attributes[2];
				int vremePocetno = Integer.parseInt(attributes[3]);
				int vremeKranje = Integer.parseInt(attributes[4]);
				String datum = attributes[5];
				
				TerminiOrd ord = new TerminiOrd(id, ime, prezime, vremePocetno,
						vremeKranje, datum);
				this.listaTermina.add(ord);
			}
			
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public UserClass izmenaKorisnika2 (UserClass userClass) {
		for(int i = 0 ; i < this.listaKorisnika.size(); i++) {
			UserClass korisnikLista = this.listaKorisnika.get(i);
			String ime = korisnikLista.getIme();
			String prezime = korisnikLista.getPrezime();
			if (ime.equalsIgnoreCase(userClass.getIme())
					&& prezime.equalsIgnoreCase(userClass.getPrezime())) {

				UserClass pacKojiSeMenja = this.listaKorisnika.set(i, userClass);
				save("pacijenti.txt");
				return pacKojiSeMenja;

			}

		}
		return null;
	}



	// save i load metode za cenu.


	public void saveCena (String path) {

		ArrayList<String>lines = new ArrayList<String>();

		for (int i = 0; i < this.listaCena.size(); i++) {

			Cena cena = this.listaCena.get(i);
			int id = cena.getId();
			String ime = cena.getIme();
			String prezime = cena.getPrezime();
			double dug = cena.getDug();
			double placeno = cena.getPlaceno();
			double trenutnoStanje = cena.getTrenutnoStanje();

			String line = id+"/"+ime+"/"+prezime+"/"+dug+"/"+placeno+"/"+trenutnoStanje;
			lines.add(line);

		}

		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}

	}



	/*
	 * private int id;
	private String ime;
	private String prezime;
	private double dug;
	private double placeno;
	private double trenutnoStanje;
	 */


	public void loadCena (String path) {

		this.listaCena = new ArrayList<Cena>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");

				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prezime = attributes[2];
				double dug = Double.parseDouble(attributes[3]);
				double placeno = Double.parseDouble(attributes[4]);
				double trenutnoStanje = Double.parseDouble(attributes[5]);

				Cena cena = new Cena(id, ime , prezime, dug, placeno, trenutnoStanje);
				this.listaCena.add(cena);

			}
		} catch (Exception e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}


	}


	public Cena izmenaCenaID (Cena cena) {

		for(int i = 0; i < this.listaCena.size(); i++) {

			Cena cenaLista = this.listaCena.get(i);

			int id = cenaLista.getId();
			double dugLista = cenaLista.getDug();
			double placenoLista = cenaLista.getPlaceno();
			String ime = cenaLista.getIme();
			String prezime = cenaLista.getPrezime();

			if (id == cena.getId()) {

				double dugProsledjeno = cena.getDug();
				double placenoProsledjeno = cena.getPlaceno();

				double dugModified = (dugLista + dugProsledjeno);
				double placenoModified = (placenoLista+ placenoProsledjeno);

				double TrenutnoStanjeM = (dugModified-placenoModified);

				Cena cenaX = new Cena(id, ime, prezime, dugModified, placenoModified, TrenutnoStanjeM);
				this.listaCena.set(i, cenaX);
				saveCena("cene.txt");
				return cenaX;
			}


		}
		return null;

	}

	/* private int id;
		private String ime;
		private String prezime;
		private double dug;
		private double placeno;
		private double trenutnoStanje;
	 */

	public Cena izmenaCenaImePrezime (Cena cena) {

		for(int i = 0; i < this.listaCena.size(); i++) {

			Cena cenaLista = this.listaCena.get(i);

			int id = cenaLista.getId();
			double dugLista = cenaLista.getDug();
			double placenoLista = cenaLista.getPlaceno();
			String ime = cenaLista.getIme();
			String prezime = cenaLista.getPrezime();

			if (ime.equalsIgnoreCase(cena.getIme())&&
					prezime.equalsIgnoreCase(cena.getPrezime())) {

				double dugProsledjeno = cena.getDug();
				double placenoProsledjeno = cena.getPlaceno();

				double dugModified = (dugLista + dugProsledjeno);
				double placenoModified = (placenoLista+ placenoProsledjeno);

				double TrenutnoStanjeM = (dugModified-placenoModified);

				Cena cenaX = new Cena(id, ime, prezime, dugModified, placenoModified, TrenutnoStanjeM);
				this.listaCena.set(i, cenaX);
				saveCena("cene.txt");
				return cenaX;
			}


		}
		return null;

	}


	public Cena nuliranjeCeneID(Cena cenaProsledjena) {

		for (int i = 0; i < this.listaCena.size(); i++) {
			Cena cenaLista = this.listaCena.get(i);
			String ime = cenaLista.getIme();
			String prezime = cenaLista.getPrezime();
			int id = cenaLista.getId();
			if (id == cenaProsledjena.getId()) {

				Cena cenaNew = new Cena(id, ime, prezime, cenaProsledjena.getDug(),
						cenaProsledjena.getPlaceno(), cenaProsledjena.getTrenutnoStanje());
				this.listaCena.set(i, cenaNew);
				saveCena("cene.txt");
				return cenaNew;

			}

		}
		return null;
	}



	// radne stolice 

	// provera id stolica

	public void dodavanjeHistoriata (Historiat historiat) {
		loadHistoriat("Historiat.txt");
		this.listaIstorije.add(historiat);
		saveHistoriat("Historiat.txt");
	}

	public boolean dodavanjeStolice (RadnaStolica radnaStolica) {

		for (int i = 0; i < this.listaStolica.size(); i++) {
			RadnaStolica stolicaLista = this.listaStolica.get(i);
			if (stolicaLista.getBrojstolice() == radnaStolica.getBrojstolice()) {
				return false;
			}
		}

		this.listaStolica.add(radnaStolica);
		saveStolica("radnaStolica.txt");
		return true;

	}

	public boolean dodavanjeStolice2 (RadnaStolica radnaStolica) {

		for (int i = 0; i < this.listaStolica.size(); i++) {
			RadnaStolica stolicaLista = this.listaStolica.get(i);
			if (stolicaLista.getBrojstolice() == radnaStolica.getBrojstolice()) {
				return false;
			}
		}

		this.listaStolica.add(radnaStolica);
		saveStolica("radnaStolica2.txt");
		return true;

	}

	public boolean dodavanjeStolice3 (RadnaStolica radnaStolica) {

		for (int i = 0; i < this.listaStolica.size(); i++) {
			RadnaStolica stolicaLista = this.listaStolica.get(i);
			if (stolicaLista.getBrojstolice() == radnaStolica.getBrojstolice()) {
				return false;
			}
		}

		this.listaStolica.add(radnaStolica);
		saveStolica("radnaStolica3.txt");
		return true;

	}


	public void lstStolica() {


		loadStolica("radnaStolica.txt");
		System.out.printf("%5s %15s %15s %15s %25s %25s %25s %25s \n", "Br",
				"Ime Pacijenta", "vreme Pocetno", "vreme Krajno", "gornji Levi", "gornji Desni",
				"donji Levi", "donji Desni");

		for(int i = 0; i < this.listaStolica.size(); i++) {

			RadnaStolica radnaStolica = this.listaStolica.get(i);
			System.out.println(radnaStolica);

		}

	}

	public void lstStolica2() {


		loadStolica("radnaStolica2.txt");
		System.out.printf("%5s %15s %15s %15s %25s %25s %25s %25s \n", "Br",
				"Ime Pacijenta", "vreme Pocetno", "vreme Krajno", "gornji Levi", "gornji Desni",
				"donji Levi", "donji Desni");

		for(int i = 0; i < this.listaStolica.size(); i++) {

			RadnaStolica radnaStolica = this.listaStolica.get(i);
			System.out.println(radnaStolica);

		}

	}
	public void lstStolica3() {


		loadStolica("radnaStolica3.txt");
		System.out.printf("%5s %15s %15s %15s %25s %25s %25s %25s \n", "Br",
				"Ime Pacijenta", "vreme Pocetno", "vreme Krajno", "gornji Levi", "gornji Desni",
				"donji Levi", "donji Desni");

		for(int i = 0; i < this.listaStolica.size(); i++) {

			RadnaStolica radnaStolica = this.listaStolica.get(i);
			System.out.println(radnaStolica);

		}

	}



	public void saveStolica (String path) {		
		ArrayList<String> lines = new ArrayList<String>();

		for (int i = 0; i < this.listaStolica.size(); i++) {
			RadnaStolica stolicaLista = this.listaStolica.get(i);


			int brojStolice = stolicaLista.getBrojstolice();
			String imeDoktora = stolicaLista.getImedoktora();
			String vremePocetno = stolicaLista.getVremePocetno();
			String vremeKrajnje = stolicaLista.getVremeKrajno();
			String gornjiLevi = stolicaLista.getGornjiLevi();
			String gornjiDesni = stolicaLista.getGornjiDesni();
			String donjiLevi = stolicaLista.getDonjiLevi();
			String donjiDesni = stolicaLista.getDonjiDesni();

			String line = brojStolice +"/"+ imeDoktora +"/"+ vremePocetno +"/"+ vremeKrajnje
					+"/"+ gornjiLevi +"/"+ gornjiDesni +"/"+ donjiLevi +"/"+ donjiDesni;

			lines.add(line);
		}
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronajena.");
		}

	}


	/*
	 * 	private int brojstolice;
	private String imedoktora;
	private String vremePocetno;
	private String vremeKrajno;
	private String gornjiLevi;
	private String gornjiDesni;
	private String donjiLevi;
	private String donjiDesni;
	 */

	public void loadStolica(String path) {

		this.listaStolica = new ArrayList<RadnaStolica>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");

				int brojStolice = Integer.parseInt(attributes[0]);
				String imeDoktora = attributes[1];
				String vremePocetno = attributes[2];
				String vremeKrajnje = attributes[3];
				String gornjiLevi = attributes[4];
				String gornjiDesni = attributes[5];
				String donjiLevi = attributes[6];
				String donjiDesni = attributes[7];

				RadnaStolica radnaStolica = new RadnaStolica(brojStolice, imeDoktora,
						vremePocetno, vremeKrajnje, gornjiLevi, gornjiDesni, donjiLevi, donjiDesni);

				this.listaStolica.add(radnaStolica);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronajena.");
		}

	}


	public void  brisanjeSvihP() {

		this.listaStolica.clear();
		saveStolica("radnaStolica.txt");

	}

	public void  brisanjeSvihP2() {

		this.listaStolica.clear();
		saveStolica("radnaStolica2.txt");

	}

	public void  brisanjeSvihP3() {

		this.listaStolica.clear();
		saveStolica("radnaStolica3.txt");

	}


	// zanimljiva metoda

	public RadnaStolica stolicaBrisanjeID(int id) {

		int index = -1;
		for (int i = 0; i < this.listaStolica.size(); i++) {
			if (this.listaStolica.get(i).getBrojstolice() == id) {
				index = i;
			}
		}
		if (index != -1) {
			RadnaStolica radnaStolica = this.listaStolica.remove(index);
			System.out.println("Brisanje po broju je uspesnu uradjeno");
			saveStolica("radnaStolica.txt");
			return radnaStolica;
		}
		return null;
	}

	public RadnaStolica stolicaBrisanjeID2(int id) {

		int index = -1;
		for (int i = 0; i < this.listaStolica.size(); i++) {
			if (this.listaStolica.get(i).getBrojstolice() == id) {
				index = i;
			}
		}
		if (index != -1) {
			RadnaStolica radnaStolica = this.listaStolica.remove(index);
			System.out.println("Brisanje po broju je uspesnu uradjeno");
			saveStolica("radnaStolica2.txt");
			return radnaStolica;
		}
		return null;
	}

	public RadnaStolica stolicaBrisanjeID3(int id) {

		int index = -1;
		for (int i = 0; i < this.listaStolica.size(); i++) {
			if (this.listaStolica.get(i).getBrojstolice() == id) {
				index = i;
			}
		}
		if (index != -1) {
			RadnaStolica radnaStolica = this.listaStolica.remove(index);
			System.out.println("Brisanje po broju je uspesnu uradjeno");
			saveStolica("radnaStolica3.txt");
			return radnaStolica;
		}
		return null;
	}

	public UserClass korisnikBrisanjeID(int id) {

		int index = -1;
		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			if (this.listaKorisnika.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			UserClass radnaStolica = this.listaKorisnika.remove(index);
			save("pacijenti.txt");
			System.out.println("Brisanje po broju je uspesnu uradjeno");
			return radnaStolica;
		}
		return null;
	}
	
	
	
	public TerminiOrd TerminBrisanjeID(int id) {

		int index = -1;
		for (int i = 0; i < this.listaTermina.size(); i++) {
			if (this.listaTermina.get(i).getID() == id) {
				index = i;
			}
		}
		if (index != -1) {
			TerminiOrd radnaStolica = this.listaTermina.remove(index);
			saveTermini("termini.txt");
			JOptionPane.showMessageDialog(null, "Brisanje po broju je uspesno uradjeno !", "Brisanje ok", 1);
			//System.out.println("Brisanje po broju je uspesnu uradjeno");
			return radnaStolica;
		}
		return null;
	}
	
	public TerminiOrd TerminBrisanjeImePrezime(String ime, String prezime) {

		int index = -1;
		for (int i = 0; i < this.listaTermina.size(); i++) {
			if (this.listaTermina.get(i).getIme().equalsIgnoreCase(ime)&&
					this.listaTermina.get(i).getPrezime().equalsIgnoreCase(prezime)) {
				index = i;
			}
		}
		if (index != -1) {
			TerminiOrd radnaStolica = this.listaTermina.remove(index);
			saveTermini("termini.txt");
			JOptionPane.showMessageDialog(null, "Brisanje po imenu i prezimenu je uspesno uradjeno !", "Brisanje ok", 1);
			//System.out.println("Brisanje po imenu i prezimenu je uspesno uradjeno !");
			return radnaStolica;
		}
		return null;
	}
	
	

	public Cena cenaBrisanjeID(int id) {

		loadCena("cene.txt");
		int index = -1;
		for (int i = 0; i < this.listaCena.size(); i++) {
			if (this.listaCena.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1) {
			Cena radnaStolica = this.listaCena.remove(index);
			saveCena("cene.txt");
			System.out.println("Brisanje po broju je uspesnu uradjeno");
			return radnaStolica;
		}
		return null;
	}

	public void lstIstoriat() {

		loadHistoriat("Historiat.txt");

		System.out.printf("%10s %25s %25s %25s %25s %25s %10s \n",
				"ID", "ime Pacijenta", "Gornji Levi Zubi", "Gornji Desni Zubi", "Donji Levi Zubi", "Donji Desni Zubi", "Datum");

		for(int i = 0; i < this.listaIstorije.size(); i++) {

			Historiat historiat = this.listaIstorije.get(i);

			System.out.println(historiat);

		}


	}

	public void lstIstoriatImePrez1String(String ime) {

		loadHistoriat("Historiat.txt");

		System.out.printf("%10s %25s %25s %25s %25s %25s %10s \n",
				"ID", "ime Pacijenta", "Gornji Levi Zubi", "Gornji Desni Zubi", "Donji Levi Zubi", "Donji Desni Zubi", "Datum");

		for (int i = 0; i < this.listaIstorije.size(); i++) {

			if (this.listaIstorije.get(i).getImePacijenta().equalsIgnoreCase(ime)) {

				Historiat historiat = this.listaIstorije.get(i);
				System.out.println(historiat);

			} 
		}
	}

	public void lstIstoriatIDString(int ID) {

		loadHistoriat("Historiat.txt");

		System.out.printf("%10s %25s %25s %25s %25s %25s %10s \n",
				"ID", "ime Pacijenta", "Gornji Levi Zubi", "Gornji Desni Zubi", "Donji Levi Zubi", "Donji Desni Zubi", "Datum");

		for (int i = 0; i < this.listaIstorije.size(); i++) {

			if (this.listaIstorije.get(i).getID()== ID) {

				Historiat historiat = this.listaIstorije.get(i);
				System.out.println(historiat);

			} 
		}
	}

	public Historiat brisanjeIstoriatIDString(int ID) {

		loadHistoriat("Historiat.txt");
		int index = -1;
		System.out.printf("%10s %25s %25s %25s %25s %25s %10s \n",
				"ID", "ime Pacijenta", "Gornji Levi Zubi", "Gornji Desni Zubi", "Donji Levi Zubi", "Donji Desni Zubi", "Datum");

		for (int i = 0; i < this.listaIstorije.size(); i++) {
			if (this.listaIstorije.get(i).getID()== ID) {
				index = i;
			} 
		}
		if (index != -1) {
			this.listaIstorije.remove(index);
			saveHistoriat("Historiat.txt");
			JOptionPane.showMessageDialog(null, "Brisanje po Id je uspesno uradjeno !", "The Help Me BUTTON :)", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Brisanje po Id je neuspesno uradjeno !", "The Help Me BUTTON :)", 1);
		}
		return null;

	}
	
	public Historiat brisanjeIstoriatIDString2(int ID) {

		loadHistoriat("Historiat.txt");
		int index = -1;
		System.out.printf("%10s %25s %25s %25s %25s %25s %10s \n",
				"ID", "ime Pacijenta", "Gornji Levi Zubi", "Gornji Desni Zubi", "Donji Levi Zubi", "Donji Desni Zubi", "Datum");

		for (int i = 0; i < this.listaIstorije.size(); i++) {
			if (this.listaIstorije.get(i).getID()== ID) {
				index = i;
			} 
		}
		if (index != -1) {
			this.listaIstorije.remove(index);
			saveHistoriat("Historiat.txt");
			JOptionPane.showMessageDialog(null, "Brisanje po Id je uspesno uradjeno !", "The Help Me BUTTON :)", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Brisanje po Id je neuspesno uradjeno !", "The Help Me BUTTON :)", 1);
		}
		return null;

	}

	




}
