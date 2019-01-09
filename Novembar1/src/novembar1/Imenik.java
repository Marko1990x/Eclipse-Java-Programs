package novembar1;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;





public class Imenik {
	
	private ArrayList<Kontakt> listKontakta;
	
	public Imenik () {
		this.listKontakta = new ArrayList<Kontakt>();
	}

	public ArrayList<Kontakt> getListKontakta() {
		return listKontakta;
	}

	public void setListKontakta(ArrayList<Kontakt> listKontakta) {
		this.listKontakta = listKontakta;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Imenik [listKontakta=" + listKontakta + "]";
	}

	public void lst () {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		for (int i = 0; i < listKontakta.size(); i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			System.out.println(kontakt);
		}
	}
	
	
	public boolean unosKontakta (Kontakt kontakt) {
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt inventarLista = this.listKontakta.get(i);
			int broInvLista = inventarLista.getId();
			int prosledjenibroj = kontakt.getId();
			if (broInvLista == prosledjenibroj) {
				return false;
			}
		}
		Kontakt noviInventar = new Kontakt(kontakt.getId(), kontakt.getIme(), kontakt.getPrezime(),
				kontakt.getRadnoMesto(),kontakt.getBrojProstorije() , kontakt.getBrojLokala(), kontakt.getDatumUnosaKontakta());
		boolean daLiJeDodat = this.listKontakta.add(noviInventar);
		return daLiJeDodat;
	}

	/*
	 * 	private int id;
	private String ime;
	private String prezime;
	private String radnoMesto;
	private String brojProstorije;
	private int brojLokala;
	private LocalDate datumUnosaKontakta;
	 */
	
	
	public void save(String path) {

		ArrayList<String> lines = new ArrayList<String>();

		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt inventar = this.listKontakta.get(i);
			int id = inventar.getId();
			String ime = inventar.getIme();
			String prezime = inventar.getPrezime();
			String radmoMesto = inventar.getRadnoMesto();
			String brojProstorije = inventar.getBrojProstorije();
			int brojLokala = inventar.getBrojLokala();
			LocalDate datum = inventar.getDatumUnosaKontakta();
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			String formiraniDatum = dtf.format(datum);
			String line = id +";"+ ime +";"+ prezime +";"+ radmoMesto +";"+
			brojProstorije +";"+ brojLokala +";"+
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

		this.listKontakta = new ArrayList<Kontakt>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String [] attributes = line.split(";");
				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prezime = attributes[2];
				String radnoMesto = attributes[3];
				String brojProstorije = attributes[4];
				int brojLokala = Integer.parseInt(attributes[5]);
				String datum = attributes[6];
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				LocalDate datumZaCuvanje= LocalDate.parse(datum, dtf);

				Kontakt kontakt = new Kontakt(id,ime,prezime,radnoMesto,
						brojProstorije, brojLokala,datumZaCuvanje);

				this.listKontakta.add(kontakt);
				
				/*
				 * 	private int id; 0
				private String ime; 1
				private String prezime;2
				private String radnoMesto;3
				private String brojProstorije;4
				private int brojLokala;5
				private LocalDate datumUnosaKontakta;6
				 */


			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}
	
	public Kontakt brisanjeKontakta(int id) {
		
		int index = -1;
		for (int i = 0; i < this.listKontakta.size();i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			int brojKontakta = kontakt.getId();
			if (brojKontakta == id) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			Kontakt kontaktBrisi = this.listKontakta.remove(index);
			return kontaktBrisi;
		}
		return null;
	}
	
	
	public void lstIstiLokal (int brlokala) {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			int brojKontakta = kontakt.getBrojLokala();
			if (brojKontakta == brlokala) {
				Kontakt kontaktIspis = this.listKontakta.get(i);
				System.out.println(kontaktIspis);
			}
		}
	}
	
	public void lstIstoRadnoMesto (String brojMestaProsledjeno) {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			String radnoMesto = kontakt.getRadnoMesto();
			if (radnoMesto.equalsIgnoreCase(brojMestaProsledjeno)) {
				Kontakt kontaktX = this.listKontakta.get(i);
				System.out.println(kontaktX);
			}
		}
	}
	
	public void lstIstoImeKontaka (String ime) {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			String imeX = kontakt.getIme();
			if (imeX.equalsIgnoreCase(ime)) {
				Kontakt kontakt2 = this.listKontakta.get(i);
				System.out.println(kontakt2);
			}
		}
	}
	
	public void lstIstoImePrezimeIRadnoMestoStartsWith (String ime, String prezime, String radnoMesto) {
		
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt kontakt = this.listKontakta.get(i);
			String imeLista = kontakt.getIme();
			String prezimeLista = kontakt.getPrezime();
			String radnoMestoL = kontakt.getRadnoMesto();
			if (imeLista.equalsIgnoreCase(ime)&&
					prezimeLista.equalsIgnoreCase(prezime)&&
					radnoMestoL.startsWith(radnoMesto)) {
				
				Kontakt kontaktX = this.listKontakta.get(i);
				System.out.println(kontaktX);
				
			}
			
		}
		
		
	}
	
	
	public void lstDatum (LocalDate datumPocetka, LocalDate datumKraja) {
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", "id", "ime", "prezime",
				"radnoMesto", "brojProstorije", "brojLokala", "datum");
		
		for (int i = 0; i < this.listKontakta.size(); i++) {
			if (this.listKontakta.get(i).getDatumUnosaKontakta().compareTo(datumPocetka) > 0 &&
					this.listKontakta.get(i).getDatumUnosaKontakta().compareTo(datumKraja) < 0) {
				System.out.println(this.listKontakta.get(i));
				
			}
			
		}
	}
	
	public Kontakt izmenaKontakta (Kontakt kontakt) {
		for (int i = 0; i < this.listKontakta.size(); i++) {
			Kontakt kontaktX = this.listKontakta.get(i);
			int broj = kontaktX.getId();
			if (broj == kontakt.getId()) {
				Kontakt kontaktMenjanje = this.listKontakta.set(i, kontakt);
				return kontaktMenjanje;
			}
		}
		return null;
	}
	
	
}
