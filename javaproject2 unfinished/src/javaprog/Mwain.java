package javaprog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Mwain {

	public static Scanner scanner = new Scanner(System.in);

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

	// metode provere

	public static boolean proveriDatum(String datum) {

		try {
			LocalDate.parse(datum, dtf);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean daLiJeVeciDatum(LocalDate datumPocetni, String datum) {

		LocalDate datumKrajnji = null;
		try {
			datumKrajnji = LocalDate.parse(datum, dtf);
			if (datumKrajnji.compareTo(datumPocetni) > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * Metoda proverava da li je uneti string sa tastature ceo broj.
	 */
	public static boolean isNumber(String string) {

		try {
			Long.parseLong(string);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static boolean isDecimalNumber(String string) {
		try {
			Double.parseDouble(string);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static boolean jmbg(int broj) {

		if (broj > 0 && broj <= 13) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isIDValid(String jmbg) {
		if (jmbg.equals("")) {
			//JOptionPane.showMessageDialog(null, "JMBG ne moze biti prazan.", "Greska pri unosu", 2);
			return false;
		}

		boolean containsDigitsOnly = true;
		for (int i = 0; i < jmbg.length(); i++) {
			if (!Character.isDigit(jmbg.charAt(i))) {
				containsDigitsOnly = false;
				break;
			}
		}
		
		return jmbg.length() == 13 && containsDigitsOnly;
	}

	// ostale metode

	public static void lstKorisnika2(Firma firma) {
		firma.lstKorisnika();
	}

	public static void unosKorisnika(Firma firma) {

		String ime = null;
		String prezime = null;
		String datumUnos = null;
		LocalDate datum = null;
		String zanimanjePoSkoli = null;
		String gdeRadi = null;
		String bolesti = null;
		String alergije = null;

		System.out.println("Unesite ime Korisnika");
		ime = scanner.nextLine();
		System.out.println("Unesite prezime Korisnika");
		prezime = scanner.nextLine();

		do {
			System.out.println("Unesite godinu rodjenja u formatu dd.MM.yyyy.");
			datumUnos = scanner.nextLine();

		} while (!proveriDatum(datumUnos));
		try {
			datum = LocalDate.parse(datumUnos, dtf);
		} catch (Exception e) {
			System.out.println("an error has occured: - " + e.getMessage());
		}

		String jmbg = null;

		do {
			System.out.println("Jmbg korisnika: ");
			jmbg = scanner.nextLine();
		} while (!isIDValid(jmbg));

		String jmbgC = jmbg;

		System.out.println("Unesite zanimanje korisnika: ");
		zanimanjePoSkoli = scanner.nextLine();
		System.out.println("Unesite Gde radi Korisnik: ");
		gdeRadi = scanner.nextLine();
		System.out.println("Unesite Bolesti korisnika: ");
		bolesti = scanner.nextLine();
		System.out.println("Unesite Alergije Korisnika: ");
		alergije = scanner.nextLine();

		User user = new User(ime, prezime, datum, jmbgC, zanimanjePoSkoli, gdeRadi, bolesti, alergije);

		boolean provera = firma.dodavanjeKorisnika(user);
		if (provera) {
			System.out.println("Korisnik je uspesno dodat u listu korisnika.");
		} else {
			System.out.println("Korisnik nije uspesno dodat: proverite ime i prezime.");
		}

	}

	/*
	 * /* private String ime; private String prezime; private LocalDate
	 * datumRodjenja; private int jmbg; private String zanimanjePoSkoli; private
	 * String gdeRadi; private String Bolesti; private String Alergije;
	 */

	public static void izmenaKorisnika(Firma firma) {
		
		String ime = null;
		String prezime = null;
		String datumUnos = null;
		LocalDate datum = null;
		String zanimanjePoSkoli = null;
		String gdeRadi = null;
		String bolesti = null;
		String alergije = null;

		System.out.println("Unesite ime Korisnika");
		ime = scanner.nextLine();
		System.out.println("Unesite prezime Korisnika");
		prezime = scanner.nextLine();

		do {
			System.out.println("Unesite godinu rodjenja u formatu dd.MM.yyyy.");
			datumUnos = scanner.nextLine();

		} while (!proveriDatum(datumUnos));
		try {
			datum = LocalDate.parse(datumUnos, dtf);
		} catch (Exception e) {
			System.out.println("an error has occured: - " + e.getMessage());
		}

		String jmbg = null;

		do {
			System.out.println("Jmbg korisnika: ");
			jmbg = scanner.nextLine();
		} while (!isIDValid(jmbg));

		String jmbgC = jmbg;

		System.out.println("Unesite zanimanje korisnika: ");
		zanimanjePoSkoli = scanner.nextLine();
		System.out.println("Unesite Gde radi Korisnik: ");
		gdeRadi = scanner.nextLine();
		System.out.println("Unesite Bolesti korisnika: ");
		bolesti = scanner.nextLine();
		System.out.println("Unesite Alergije Korisnika: ");
		alergije = scanner.nextLine();

		User user = new User(ime, prezime, datum, jmbgC, zanimanjePoSkoli, gdeRadi, bolesti, alergije);

		User provera = firma.izmenaKorisnika(user);
		if (provera != null) {
			System.out.println("Izmena korisnika je uspesno izvrsena. ");
		}else {
			System.out.println("Izmena korisnika je neuspesno uzvrsena. ");
		}
	}
	
	
	public static void brisanjeKorisnika(Firma firma) {
		System.out.println("Unesite ime korisnika za brisanje: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime korisnika za brisanje: ");
		String prezime = scanner.nextLine();
		
		User provera = firma.brisanjeUser(ime, prezime);
		if (provera == null) {
			System.out.println("Korisnik sa unetim imenom i prezimenom ne postoji");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firma firma = new Firma();

		firma.userLoad("users.txt");

		String answer = null;

		do {

			System.out.println("----------------------Menu--------------------");
			System.out.println("1. Opcija 1 ---------lst Korisnika");
			System.out.println("2. Opcija 2 ---------Unos Korisnika");
			System.out.println("3. Opcija 3 ---------Izmena Korisnika");
			System.out.println("4. Opcija 4 ---------Brisanje Korisnika");
			System.out.println("X. Opcija x -------- kraj pograma");
			System.out.println("----------------------Kraj--------------------");

			answer = scanner.nextLine();

			switch (answer) {
			case "1":

				lstKorisnika2(firma);

				break;

			case "2":

				unosKorisnika(firma); // objekat 1 radi ok
				firma.userSave("users.txt");

				break;
				
			case "3":
				izmenaKorisnika(firma);
				firma.userSave("users.txt");
				break;
				
			case "4":
				brisanjeKorisnika(firma);
				firma.userSave("users.txt");
				break;
			case "x":
				break;

			default:
				break;
			}

		} while (!answer.equalsIgnoreCase("x"));
		scanner.close();

	}

}
