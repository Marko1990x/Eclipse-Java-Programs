package com.ftninformatika;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

	public static Scanner scanner = new Scanner(System.in);

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

	
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
			if(datumKrajnji.compareTo(datumPocetni) > 0) {
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

	/*
	 * Metoda proverava da li je uneti string sa tastature decimalni broj.
	 */
	public static boolean isDecimalNumber(String string) {
		try {
			Double.parseDouble(string);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	
	public static void ispisInventara(Firma firma) {
		firma.listaInentara();
	}
	
	
	public static void unosInventara(Firma firma) {
		
		int id = 0;
		String ime = null;
		String prostorija = null;
		String imeIPrezime = null;
		double procenjenaVr = 0.0;
		int godinaProizvodnje = 0;
		String idInventara = null;
		String datumUnos = null;
		LocalDate datum = null;
		
		do {
			System.out.println("Unesite id inventara: ");
			idInventara = scanner.nextLine();
		} while (!isNumber(idInventara));
		id = Integer.parseInt(idInventara);
		
		System.out.println("Ime inventara: ");
		ime = scanner.nextLine();
		
		System.out.println("prostorija u kojoj se cuva inventar: ");
		prostorija = scanner.nextLine();
		
		System.out.println("ime i prezime osobe zaduzene za inventar: ");
		imeIPrezime = scanner.nextLine();
		
		String procenjenaVrX = null;
		do {
			System.out.println("Unesite procenjenu vrednost: ");
			procenjenaVrX = scanner.nextLine();
		} while (!isDecimalNumber(procenjenaVrX));
		procenjenaVr = Double.parseDouble(procenjenaVrX);
		
		String godProizvodnjeX = null;
		do {
			System.out.println("Unesite godinu proizvodnje: ");
			godProizvodnjeX = scanner.nextLine();
		} while (!isNumber(godProizvodnjeX));
		godinaProizvodnje = Integer.parseInt(godProizvodnjeX);
		
		do {
			System.out.println("Unesite datum u formatu dd.MM.yyyy. :");
			datumUnos = scanner.nextLine();
		} while (!proveriDatum(datumUnos));
		try {
				datum = LocalDate.parse(datumUnos, dtf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Inventar inventar = new Inventar(id, ime, prostorija, imeIPrezime,
				procenjenaVr, godinaProizvodnje, datum);
		
		boolean provera = firma.dodavanjeInventara(inventar);
		if (provera) {
			System.out.println("Inventar je uspesno Dodat.");
		}else {
			System.out.println("Inventar je neuspesno Dodat.");
		}
		
	}
	
	public static void brisanjeInventara(Firma firma) {
		
		int id = 0;
		String idInventara = null;
		do {
			System.out.println("Unesite id inventara: ");
			idInventara = scanner.nextLine();
		} while (!isNumber(idInventara));
		id = Integer.parseInt(idInventara);
		Inventar provera = firma.brisanjeInventara(id);
		if (provera == null) {
			System.out.println("inventar sa zadatim brojem ne postoji");
		}
		
	}
	
	public static void lstIstaProstorija(Firma firma) {
		System.out.println("Unesite naziv prostorije: ");
		String prostorija = scanner.nextLine();
		firma.lstIstaProstorija(prostorija);
	}
	
	
	public static void lstIstiNaziv (Firma firma) {
		System.out.println("unesite ime inentara: ");
		String ime = scanner.nextLine();
		firma.lstaIstiNaziv(ime);
	}
	
	
	public static void lstViseParametara (Firma firma) {
		System.out.println("unesite prostoriju: ");
		String prostorija = scanner.nextLine();
		System.out.println("Unesite ime: ");
		String ime = scanner.nextLine();
		String godina;
		do {
			System.out.println("Unesite godinu.");
			godina = scanner.nextLine();
		} while (!isNumber(godina));
		int god = Integer.parseInt(godina);
		
		firma.lstaViseParametara(prostorija, ime, god);
		
		
	}
	
	public static void lstImeMinMAx(Firma firma) {
		
		System.out.println("Unesite ime: ");
		String ime = scanner.nextLine();
		String min = null;
		String max = null;
		do {
			System.out.println("Unesite minimalnu vrednost: ");
			min = scanner.nextLine();
		} while (!isNumber(min));
		double minX = Double.parseDouble(min);
		
		do {
			System.out.println("Unesite maximalnu vrednost");
			max = scanner.nextLine();
		} while (!isNumber(max));
		double maxX = Double.parseDouble(max);
		
		firma.lstPoVrednosti(ime, minX, maxX);
		
		
	}
	
	public static void IzmenaInventara(Firma firma) {
		
		String idInventara = null;
		
		do {
			System.out.println("Unesite id inventara: ");
			idInventara = scanner.nextLine();
		} while (!isNumber(idInventara));
		
		int idX = Integer.parseInt(idInventara);
		
		String ime = null;
		String prostorija = null;
		String imePrezime = null;
		double procenjenaVr = 0.0;
		int godinaProizvodnj = 0;
		System.out.println("unesite ime: ");
		ime = scanner.nextLine();
		System.out.println("Unesite prostoriju: ");
		prostorija = scanner.nextLine();
		System.out.println("Unesite ime i prezime: ");
		imePrezime = scanner.nextLine();
		String procenjena = null;
		do {
			System.out.println("Unesite procnjenu vrednost: ");
			procenjena = scanner.nextLine();
		} while (!isDecimalNumber(procenjena));
		procenjenaVr = Double.parseDouble(procenjena);
		
		String god = null;
		
		do {
			System.out.println("Unesite godinu proizvodnje. ");
			god = scanner.nextLine();
		} while (!isNumber(god));
		godinaProizvodnj = Integer.parseInt(god);
	
		String datumUnos = null;
		LocalDate datum = null;
		
		do {
			System.out.println("Unesite datum: ");
			datumUnos = scanner.nextLine();
		} while (!proveriDatum(datumUnos));
		try {
			datum = LocalDate.parse(datumUnos, dtf);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Inventar inventar = new Inventar(idX, ime, prostorija, imePrezime, procenjenaVr, godinaProizvodnj, datum);
		Inventar provera = firma.izmenaInventara(inventar);
		if (provera != null) {
			System.out.println("Izmena je uspesno izvrsena. ");
		}else {
			System.out.println("Izmena je neuspesno uzvrsena. ");
		}
		
		
		
		
	}
	
	// ime imeiprezime i datum
	
	public static void lstPoIMenuIDatumu(Firma firma) {
		// prostorija osoba datum
		System.out.println("unesite prostoriju: ");
		String prostorija = scanner.nextLine();
		System.out.println("Unesite ime i prezime osobe: ");
		String osoba = scanner.nextLine();
		String datumUnos = null;
		LocalDate datum = null;
		do {
			System.out.println("Unesite datum:");
			datumUnos = scanner.nextLine();
		} while (!proveriDatum(datumUnos));
		try {
			datum = LocalDate.parse(datumUnos, dtf);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		firma.lstProstorijaGraniceDatuma(prostorija, osoba, datum);
		
	}
	
	public static void prosecnaVrednostPoUslovu (Firma firma) {
		System.out.println("unesite osobu zaduzenu za inventar: ");
		String osoba = scanner.nextLine();
		String minGodina = null;
		do {
			System.out.println("Unesite godinu: ");
			minGodina = scanner.nextLine();
		} while (!isNumber(minGodina));
		int godina = Integer.parseInt(minGodina);
		firma.lstaPoUslovima(osoba, godina);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firma firma = new Firma();
		
		firma.load("database.txt");

		String answer = null;

		do {

			System.out.println("--------------Menu--------------");
			System.out.println("Opcija - 1 - Unesi inventar");
			System.out.println("Opcija - 2 Ispis svih inventara");
			System.out.println("Opcija - 3 Brisanje inentara");
			System.out.println("Opcija - 4 Ispis inventara u ustoj prostoriji");
			System.out.println("Opcija - 5 Ispis inventara po istom nazivu");
			System.out.println("Opcija - 6 Ispis inventara po prostoriji, osobi koja ih duzi i godina koja je veca od zadate");
			System.out.println("Opcija - 7 ispis inventara po zadatom nazivu i zadatim granicama vrednosti");
			System.out.println("Opcija - 8 izmena inventara");
			System.out.println("Opcija - 9 ispis inventara po zadatoj prostoriji i zadatim granicama datuma");
			System.out.println("Opcija - 10. Ispis prosecne vrednosti inventara za zadate uslove");
			System.out.println("Opcija - 11 izlaz pritisnite x ");

			answer = scanner.nextLine();
			
			switch (answer) {
			case "1":
				
				unosInventara(firma);
				firma.save("database.txt");
				
				break;
				
			case "2":
				
				ispisInventara(firma);
				
				break;
				
			case "3":
				brisanjeInventara(firma);
				firma.save("database.txt");
				
				break;
				
			case "4":
				
				lstIstaProstorija(firma);
				
				break;
				
			case "5":
				
				lstIstiNaziv(firma);
				
				break;
				
			case "6":
				
				lstViseParametara(firma);
				
				break;
				
			case "7":
				
				lstImeMinMAx(firma);
				
				break;
			
			case "8":
				
				IzmenaInventara(firma);   // po identifikatoru
				firma.save("database.txt");
				
				break;
				
			case "9":
				
				lstPoIMenuIDatumu(firma);
				
				break;
				
			case "10":
				
				prosecnaVrednostPoUslovu(firma);
				
				break;
				
			case "x":
				
				break;

			default:
				break;
			}

		} while (!answer.equals("x"));
		
		scanner.close();
		
		firma.save("database.txt");


	}

}
