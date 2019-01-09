package novembar1;

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
	
	public static void lstaSvihPodataka (Imenik imenik) {
		imenik.lst();
	}
	
	

	
	public static void unosPodataka(Imenik imenik) {
		
		String idUnos = null;
		do {
			System.out.println("Unesite identifikator kontakta: ");
			idUnos = scanner.nextLine();
		} while (!isNumber(idUnos));
		int idLista = Integer.parseInt(idUnos);
		System.out.println("Unesite ime kontakta: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime kontakta: ");
		String prezime = scanner.nextLine();
		System.out.println("Unesite radno mesto: ");
		String radnoMesto = scanner.nextLine();
		System.out.println("Unesite broj prostorije: ");
		String brojProstorije = scanner.nextLine();
		String brojLokalaUnos = null;
		LocalDate datum = null;
		do {
			System.out.println("Unesite broj lokala: ");
			brojLokalaUnos = scanner.nextLine();
		} while (!isNumber(brojLokalaUnos));
		int brojLokalaLista = Integer.parseInt(brojLokalaUnos);
		
		String datumUnos = null;
		do {
			System.out.println("Unesite Datum: ");
			datumUnos = scanner.nextLine();
		} while (!proveriDatum(datumUnos));
		try {
			 datum = LocalDate.parse(datumUnos, dtf);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Kontakt kontakt = new Kontakt(idLista, ime, prezime,radnoMesto , brojProstorije,
				brojLokalaLista, datum);
		
		boolean provera = imenik.unosKontakta(kontakt);
		if (provera) {
			System.out.println("Unos je uspesno uradjen.");
		}else {
			System.out.println("Unos je neuspesno uradjen.");
		}
		
	}
	
	
	public static void brisanjeKontakta(Imenik imenik) {

		int id = 0;
		String idKontakta = null;
		do {
			System.out.println("Identifikacioni broj kontakta za brisanje: ");
			idKontakta = scanner.nextLine();
		} while(!isNumber(idKontakta));
		id = Integer.valueOf(idKontakta);
		Kontakt provera = imenik.brisanjeKontakta(id);
		if(provera == null) {
			System.out.println("Kontakt sa zadatim brojem ne postoji.");
		}
	}
	
	public static void lstIstiLokal(Imenik imenik) {
		int brLokala = 0;
		String brLokalaUnos = null;
		do {
			System.out.println("Unesite broj lokala za ispis");
			brLokalaUnos = scanner.nextLine();
		} while (!isNumber(brLokalaUnos));
		brLokala = Integer.parseInt(brLokalaUnos);
		imenik.lstIstiLokal(brLokala);
		
		
	}
	
	public static void lstIstoRadnoMesto(Imenik imenik) {
		String radnoMesto = null;
		System.out.println("Unesite radno mesto za pretragu.");
		radnoMesto = scanner.nextLine();
		imenik.lstIstoRadnoMesto(radnoMesto);
	}
	
	public static void lstIstoImeKontakta (Imenik imenik) {
		String imeKontakta = null;
		System.out.println("Unesite ime kontakta: ");
		imeKontakta = scanner.nextLine();
		imenik.lstIstoImeKontaka(imeKontakta);
	}
	
	public static void lstIstoImePezimeStartsWithRadnoMesto(Imenik imenik) {
		
		System.out.println("unesite ime: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime: ");
		String prezime = scanner.nextLine();
		System.out.println("Unesite radno mest:");
		String radnoMesto = scanner.nextLine();
		imenik.lstIstoImePrezimeIRadnoMestoStartsWith(ime, prezime, radnoMesto);
		
	}
	
	public static void lstDatumi (Imenik imenik) {
		LocalDate pocetakDatuma = null;
		LocalDate krajDatuma = null;
		String pocetakDatumUser = null;
		do {
			System.out.println("Unesite Datum: ");
			pocetakDatumUser = scanner.nextLine();
		} while (!proveriDatum(pocetakDatumUser));
		pocetakDatuma = LocalDate.parse(pocetakDatumUser, dtf);
		
		String KajDatumaUser = null;
		do {
			System.out.println("Unesite krajnji datum: ");
			KajDatumaUser = scanner.nextLine();
		} while (!proveriDatum(KajDatumaUser));
		krajDatuma = LocalDate.parse(KajDatumaUser, dtf);
		imenik.lstDatum(pocetakDatuma, krajDatuma);
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
	
	
	public static void izmenaKontakta (Imenik imenik) {
		int id = 0;
		String ime = null;
		String prezime = null;
		String radnoMEsto = null;
		String brojProstorije = null;
		int brojLokala = 0;
		LocalDate Datum = null;
		String datumZaKorisnika = null;
		
		String idX = null;
		do {
			System.out.println("Unesite id kontakta: ");
			idX = scanner.nextLine();
		} while (!isNumber(idX));
		id = Integer.parseInt(idX);
		
		System.out.println("Unesite ime :");
		ime = scanner.nextLine();
		System.out.println("Unesite prezime: ");
		prezime = scanner.nextLine();
		System.out.println("Unesite radno Mesto: ");
		radnoMEsto = scanner.nextLine();
		System.out.println("Unesite broj prostorije: ");
		brojProstorije = scanner.nextLine();
		
		String lokalX = null;
		do {
			System.out.println("Unesite broj lokala: ");
			lokalX = scanner.nextLine();
		} while (!isNumber(lokalX));
		brojLokala = Integer.parseInt(lokalX);
		
		do {
			System.out.println("Unesite datim: ");
			datumZaKorisnika = scanner.nextLine();
		} while (!proveriDatum(datumZaKorisnika));
		try {
			Datum = LocalDate.parse(datumZaKorisnika, dtf);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Kontakt kontakt = new Kontakt(id, ime , prezime, radnoMEsto, brojProstorije,brojLokala, Datum);
		Kontakt provera = imenik.izmenaKontakta(kontakt);
		if (provera != null) {
			System.out.println("izmena je uspesno izvrsena.");
		}else {
			System.out.println("izmena je neuspesno izvrsena.");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Imenik imenik = new Imenik();
		System.out.println(imenik);
		
		imenik.load("database.txt");
		
		String answer = null;
		
		do {
			
			System.out.println("--------------menu---------------");
			System.out.println("Opcija - 1 Unos podataka ");
			System.out.println("Opcija - 2 lista podataka: ");
			System.out.println("Opcija - 3 Brisanje kontakta: ");
			System.out.println("Opcija - 4 Ispis kontakata u istom lokalu");
			System.out.println("Opcija - 5 Ispis kontakata sa istim radnim mestom");
			System.out.println("Opcija - 6 Ispis kontakta sa istim imenom.");
			System.out.println("Opcija - 7 Ispis kontakta sa istim imenom prezimenom i nazivom radnog mesta koji pocinje sa prosledjenim.");
			System.out.println("Opcija - 8 Ispis kontakata kreiranih u zadatom intervalu datuma");
			System.out.println("Opcija - 9 Izmena kontakta.");
			System.out.println("Opcija - x - izlaz");
			
			answer = scanner.nextLine();
			
			switch (answer) {
			case "1":
				
				unosPodataka(imenik);
				imenik.save("database.txt");
				
				break;
				
			case "2":
				
				lstaSvihPodataka(imenik);
				
				break;
				
			case "3":
				
				brisanjeKontakta(imenik);
				
				break;
				
			case "4":
				
				lstIstiLokal(imenik);
				
				break;
				
			case "5":
				
				lstIstoRadnoMesto(imenik);
				
				break;
				
			case "6":
				
				lstIstoImeKontakta(imenik);
				
				break;
				
			case "7":
				
				lstIstoImePezimeStartsWithRadnoMesto(imenik);
				
				break;
				
			case "8":
				
				lstDatumi(imenik);
				
				break;
				
			case "9":
				
				izmenaKontakta(imenik);
				
				break;
				
			case "x":
				
				break;

			default:
				break;
			}
			
		} while (!answer.equals("x"));
		
		scanner.close();
		imenik.save("database.txt");

	}

}
