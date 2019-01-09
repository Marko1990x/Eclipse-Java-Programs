package javaprog;

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

	private ArrayList<User> listaKorisnika;
	// ubaci objekte zube u firmu .....
	private ArrayList<ZubiGornjiLeviKvadrant> listaZubiGornjiLEvi;
	private ArrayList<ZubiGornjiDesniKvadrant> listaZubiGornjiDesni;
	private ArrayList<ZubiDonjiLeviKvadrant> listaZubiDonjiLevi;
	private ArrayList<ZubiDonjiDesniKvadrant> listaZubiDonjiDesni;

	public Firma() {
		this.listaKorisnika = new ArrayList<User>();
		this.listaZubiGornjiLEvi = new ArrayList<ZubiGornjiLeviKvadrant>();
		this.listaZubiGornjiDesni = new ArrayList<ZubiGornjiDesniKvadrant>();
		this.listaZubiDonjiLevi = new ArrayList<ZubiDonjiLeviKvadrant>();
		this.listaZubiDonjiDesni = new ArrayList<ZubiDonjiDesniKvadrant>();
	}

	public ArrayList<User> getListaKorisnika() {
		return listaKorisnika;
	}

	public void setListaKorisnika(ArrayList<User> listaKorisnika) {
		this.listaKorisnika = listaKorisnika;
	}

	@Override
	public String toString() {
		return "Firma [listaKorisnika=" + listaKorisnika + "]";
	}

	// metode provere

	// objekat korisnik - sve metode

	public void lstKorisnika() {
		System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s \n", "Ime", "Prezime", "Datum Rodjenja", "Jmbg",
				"Zanimanje Skola", "Gde Radi", "Bolesti", "Alergije");
		for (int i = 0; i < listaKorisnika.size(); i++) {
			User userLista = this.listaKorisnika.get(i);
			System.out.println(userLista);
		}
	}

	public boolean dodavanjeKorisnika(User user) {
		userLoad("users.txt");
		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			User userLista = this.listaKorisnika.get(i);
			String imeLista = userLista.getIme();
			String prezimeLista = userLista.getPrezime();
			if (imeLista.equalsIgnoreCase(user.getIme()) && prezimeLista.equalsIgnoreCase(user.getPrezime())) {
				return false;
			}
		}

		User user2 = new User(user.getIme(), user.getPrezime(), user.getDatumRodjenja(), user.getJmbg(),
				user.getZanimanjePoSkoli(), user.getGdeRadi(), user.getBolesti(), user.getAlergije());
		boolean daLiJeDodat = this.listaKorisnika.add(user2);
		return daLiJeDodat;
	}

	public User izmenaKorisnika(User korisnikProsledjen) { // provera za izmenu korisnika

		userLoad("users.txt");

		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			User korisnikLista = this.listaKorisnika.get(i);
			String imeLista = korisnikLista.getIme();
			String prezimeLista = korisnikLista.getPrezime();
			if (imeLista.equalsIgnoreCase(korisnikProsledjen.getIme())
					&& prezimeLista.equalsIgnoreCase(korisnikProsledjen.getPrezime())) {
				User user2 = this.listaKorisnika.set(i, korisnikProsledjen);
				return user2;
			}
		}
		return null;
	}

	public User brisanjeUser(String ime, String prezime) {
		userLoad("users.txt");
		int indeks = -1;
		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			User lista = this.listaKorisnika.get(i);
			String imelista = lista.getIme();
			String prezimeLista = lista.getPrezime();
			if (imelista.equalsIgnoreCase(ime) && prezimeLista.equalsIgnoreCase(prezime)) {
				indeks = i;
				break;
			}
		}

		if (indeks != -1) {
			User kojiSeBrise = this.listaKorisnika.remove(indeks);
			System.out.println("Brisanje po korisnika je uspesno uradjeno.");
			userSave("users.txt");
			JOptionPane.showMessageDialog(null, "Brisanje korisnika je uspesno uradjeno", "Brisanje ok", 1);
			return kojiSeBrise;
		}

		JOptionPane.showMessageDialog(null, "Brisanje korisnika nije uspesno uradjeno", "Brisanje nije uspelo", 2);
		return null;

	}

	public void toothSave1(String path) {
		ArrayList<String> lines = new ArrayList<String>();
		for (int i = 0; i < this.listaZubiGornjiLEvi.size(); i++) {
			ZubiGornjiLeviKvadrant toothUpperLeft = this.listaZubiGornjiLEvi.get(i);
			String ime = toothUpperLeft.getIme();
			String prezime = toothUpperLeft.getPrezime();
			String tooth11 = toothUpperLeft.getZub11();
			String tooth12 = toothUpperLeft.getZub12();
			String tooth13 = toothUpperLeft.getZub13();
			String tooth14 = toothUpperLeft.getZub14();
			String tooth15 = toothUpperLeft.getZub15();
			String tooth16 = toothUpperLeft.getZub16();
			String tooth17 = toothUpperLeft.getZub17();
			String tooth18 = toothUpperLeft.getZub18();

			String line = ime + ";" + prezime + ";" + tooth11 + ";" + tooth12 + ";" + tooth13 + ";" + tooth14 + ";"
					+ tooth15 + ";" + tooth16 + ";" + tooth17 + ";" + tooth18;

			lines.add(line);

		}
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}

	public void toothLoad1(String path) {

		this.listaZubiGornjiLEvi = new ArrayList<ZubiGornjiLeviKvadrant>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line : lines) {
				String[] attributes = line.split(";");

				String ime = attributes[0];
				String prezime = attributes[1];
				String tooth11 = attributes[2];
				String tooth12 = attributes[3];
				String tooth13 = attributes[4];
				String tooth14 = attributes[5];
				String tooth15 = attributes[6];
				String tooth16 = attributes[7];
				String tooth17 = attributes[8];
				String tooth18 = attributes[9];
				
				ZubiGornjiLeviKvadrant tooth1 = new ZubiGornjiLeviKvadrant(ime, prezime,
						tooth11, tooth12, tooth13, tooth14, tooth15, tooth16, tooth17, tooth18);
				
				this.listaZubiGornjiLEvi.add(tooth1);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}
	
	
	public void toothLoad2(String path) {

		this.listaZubiGornjiDesni = new ArrayList<ZubiGornjiDesniKvadrant>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line : lines) {
				String[] attributes = line.split(";");

				String ime = attributes[0];
				String prezime = attributes[1];
				String tooth21 = attributes[2];
				String tooth22 = attributes[3];
				String tooth23 = attributes[4];
				String tooth24 = attributes[5];
				String tooth25 = attributes[6];
				String tooth26 = attributes[7];
				String tooth27 = attributes[8];
				String tooth28 = attributes[9];
				
				ZubiGornjiLeviKvadrant tooth1 = new ZubiGornjiLeviKvadrant(ime, prezime,
						tooth21, tooth22, tooth23, tooth24, tooth25, tooth26, tooth27, tooth28);
				
				this.listaZubiGornjiLEvi.add(tooth1);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}
	
	
	public void toothLoad4(String path) {

		this.listaZubiDonjiLevi = new ArrayList<ZubiDonjiLeviKvadrant>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line : lines) {
				String[] attributes = line.split(";");

				String ime = attributes[0];
				String prezime = attributes[1];
				String tooth41 = attributes[2];
				String tooth42 = attributes[3];
				String tooth43 = attributes[4];
				String tooth44 = attributes[5];
				String tooth45 = attributes[6];
				String tooth46 = attributes[7];
				String tooth47 = attributes[8];
				String tooth48 = attributes[9];
				
				ZubiGornjiLeviKvadrant tooth1 = new ZubiGornjiLeviKvadrant(ime, prezime,
						tooth41, tooth42, tooth43, tooth44, tooth45, tooth46, tooth47, tooth48);
				
				this.listaZubiGornjiLEvi.add(tooth1);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}

	public void userSave(String path) {

		ArrayList<String> lines = new ArrayList<String>();

		for (int i = 0; i < this.listaKorisnika.size(); i++) {
			User korisnik = this.listaKorisnika.get(i);
			String ime = korisnik.getIme();
			String prezime = korisnik.getPrezime();
			LocalDate datum = korisnik.getDatumRodjenja();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			String formiraniDatum = dtf.format(datum);
			String jmbg = korisnik.getJmbg();
			String zanimanjePoSk = korisnik.getZanimanjePoSkoli();
			String gdeRadi = korisnik.getGdeRadi();
			String bolesti = korisnik.getBolesti();
			String alergije = korisnik.getAlergije();
			String line = ime + ";" + prezime + ";" + formiraniDatum + ";" + jmbg + ";" + zanimanjePoSk + ";" + gdeRadi
					+ ";" + bolesti + ";" + alergije;

			lines.add(line);
		}
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}

	public void userLoad(String path) {

		this.listaKorisnika = new ArrayList<User>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line : lines) {
				String[] attributes = line.split(";");

				/*
				 * String line = ime +";"+ prezime +";"+ formiraniDatum +";"+ jmbg +";"+
				 * zanimanjePoSk +";"+ gdeRadi +";"+ bolesti +";"+ alergije;
				 */

				String ime = attributes[0];
				String prezime = attributes[1];
				String datum = attributes[2];
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				LocalDate datumZaCuvanje = LocalDate.parse(datum, dtf);
				String jmbg = attributes[3];
				String zanimanjePoSkoli = attributes[4];
				String gdeRadi = attributes[5];
				String bolesti = attributes[6];
				String Alergije = attributes[7];

				User user = new User(ime, prezime, datumZaCuvanje, jmbg, zanimanjePoSkoli, gdeRadi, bolesti, Alergije);

				this.listaKorisnika.add(user);

			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}

}
