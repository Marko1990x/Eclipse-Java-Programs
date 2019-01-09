package Agencija;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

	public static Scanner scanner = new Scanner(System.in);
	
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
	
	public static void listaTransakcija(Agencija agencija) {
		agencija.lstTransakcija();
	}
	
	public static void unesiAgenciju(Agencija agencija) {
		System.out.println("Unesite naziv agencije: ");
		String naziv = scanner.nextLine();
		agencija.setNaziv(naziv);
		System.out.println("Unesite web adresu agencije: ");
		String webAdress = scanner.nextLine();
		agencija.setWebAdresa(webAdress);
		System.out.println("Unesite broj telefona agencije: ");
		String telefonAgencije = scanner.nextLine();
		agencija.setTelefon(telefonAgencije);
		System.out.println("Podaci o agenciji su uspesno dodati.");
	}
	
	public static boolean isDate(String datum) {
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
	
	public static void unosTransakcije(Agencija agencija) {
		
		String unosInt = null;
		do {
			System.out.println("Unesite id transakcije: ");
			unosInt = scanner.nextLine();
		} while (!isNumber(unosInt));
		int id = Integer.parseInt(unosInt);
		System.out.println("unesite naziv klienta: ");
		String naziv = scanner.nextLine();
		String DatumUnos = null;
		do {
			System.out.println("Unesite datum transakcije: ");
			DatumUnos = scanner.nextLine();
		} while (!isDate(DatumUnos));
		LocalDate datum = LocalDate.parse(DatumUnos, dtf);
		System.out.println("Unesite tip transakcije: ");
		String tip = scanner.nextLine();
		String iznosDouble = null;
		do {
			System.out.println("Unesite iznos transakcije: ");
			iznosDouble = scanner.nextLine();
		} while (!isDecimalNumber(iznosDouble));
		double iznos = Double.parseDouble(iznosDouble);
		
		Transakcija transakcija = new Transakcija(id, naziv, datum, tip, iznos);
		boolean provera = agencija.dodavanjeTransakcije(transakcija);
		if (provera) {
			System.out.println("Transakcija je uspesno izvrsena. ");
		}else {
			System.out.println("Transakcija je neuspesno izvrsena. ");
		}
		
	}
	
public static void izmenaTransakcije(Agencija agencija) {
		
		String unosInt = null;
		do {
			System.out.println("Unesite id transakcije: ");
			unosInt = scanner.nextLine();
		} while (!isNumber(unosInt));
		int id = Integer.parseInt(unosInt);
		System.out.println("unesite naziv klienta: ");
		String naziv = scanner.nextLine();
		String DatumUnos = null;
		do {
			System.out.println("Unesite datum transakcije: ");
			DatumUnos = scanner.nextLine();
		} while (!isDate(DatumUnos));
		LocalDate datum = LocalDate.parse(DatumUnos, dtf);
		System.out.println("Unesite tip transakcije: ");
		String tip = scanner.nextLine();
		String iznosDouble = null;
		do {
			System.out.println("Unesite iznos transakcije: ");
			iznosDouble = scanner.nextLine();
		} while (!isDecimalNumber(iznosDouble));
		double iznos = Double.parseDouble(iznosDouble);
		
		Transakcija transakcija = new Transakcija(id, naziv, datum, tip, iznos);
		Transakcija provera = agencija.izmenaTrans(transakcija);
		if (provera != null) {
			System.out.println("Transakcija je uspesno izmenjena. ");
		}else {
			System.out.println("Transakcija je neuspesno izmenjena. ");
		}
		
	}
	

	public static void brisanjeIdentifikator (Agencija agencija) {
		String idX = null;
		do {
			System.out.println("unesite identifikator za brisanje.");
			idX = scanner. nextLine();
		} while (!isNumber(idX));
		int id = Integer.parseInt(idX);
		Transakcija provera = agencija.brisanjeT(id);
		if (provera == null) {
			System.out.println("Transakcija sa zadatim brojem ne postoji!");
		}
	}
		
	
	public static void pretragaPoKlientu (Agencija agencija) {
		System.out.println("Unesite nazi klienta: ");
		String nazivKlienta = scanner.nextLine();
		agencija.prosledjenoIme(nazivKlienta);
	}
	
	
	
	public static void pretragaImeUplata (Agencija agencija) {
		System.out.println("Unesite naziv klienta: ");
		String ime = scanner.nextLine();
		agencija.ispisUlataKlienta(ime);
	}
	
	
	public static void pretragaImeIsplata (Agencija agencija) {
		System.out.println("Unesite ime klienta: ");
		String ime = scanner.nextLine();
		agencija.prosecnaIsplataKlienta(ime);
	}
	
	
	public static void ispisNajveceTransakcije (Agencija agencija) {
		System.out.println("Unesite naziv klienta: ");
		String ime = scanner.nextLine();
		String datumMin = null;
		LocalDate datimMinX = null;
		do {
			System.out.println("Unesite min datum: ");
			datumMin = scanner.nextLine();
		} while (!isDate(datumMin));
		try {
			datimMinX = LocalDate.parse(datumMin, dtf);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String datumMax = null;
		LocalDate datimMaxX = null;
		do {
			System.out.println("Unesite max datum: ");
			datumMax = scanner.nextLine();
		} while (!daLiJeVeciDatum(datimMinX, datumMax));
		try {
			datimMaxX= LocalDate.parse(datumMax, dtf);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		agencija.findTopUplata(ime, datimMinX, datimMaxX);
		
		
		
	}
	
	
	public static void lstAgencija (Agencija agencija) {
		System.out.println(agencija);
	}
	
	
	/*
	 *  * private int id;
	private String nazivKlienta;
	private LocalDate datumTransakcije;
	private String tipTransakcije;
	private double iznosTransakcije;
	 */
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agencija agencija = new Agencija();
		
		agencija.load("database.txt");
		
		String answer = null;
		
		do {
			
			System.out.println("-------------------Menu------------------");
			System.out.println("Opcija 1 - Unos Agencije");
			System.out.println("Opcija 2 - Unos Transakcije");
			System.out.println("Opcija 3 - Ispis svih transakcija");
			System.out.println("Opcija 4 - Izmena transakcije po identifikatoru.");
			System.out.println("Opcija 5 - Brisanej po identifikatoru.");
			System.out.println("Opcija 6 - Pretraga transakcije po prosledjenom imenu.");
			System.out.println("Opcija 7 - Pretraga po imenu i stringu uplata (tip)");
			System.out.println("Opcija 8 -  Prikaz prosecne transakcije isplate za prosledjenog klijenta.");
			System.out.println("9. Ispis najvece transakcije uplate(uslov dodatan) za prosledjenog klijenta i opseg datuma");
			System.out.println("10. - ispis podataka o agenciji.");
			
			answer = scanner.nextLine();
			
			switch (answer) {
			case "1":
				
				unesiAgenciju(agencija);
				
				
				break;
				
			case "2":
				
				unosTransakcije(agencija);
				agencija.save("database.txt");
				
				break;
				
			case "3":
				
				listaTransakcija(agencija);
				
				break;
				
			case "4":
				
				izmenaTransakcije(agencija);
				agencija.save("database.txt");
				
				break;
				
			case "5":
				
				brisanjeIdentifikator(agencija);
				
				break;
				
			case "6":
				
				pretragaPoKlientu(agencija);
				
				break;
				
			case "7":
				
				pretragaImeUplata(agencija);
				
				break;
				
			case "8":
				
				pretragaImeIsplata(agencija);
				
				break;
				
			case "9":
				
				ispisNajveceTransakcije(agencija);
				
				break;
				
			case "10":
				
				lstAgencija(agencija);
				
				break;

			default:
				break;
			}
			
			
		} while (!answer.equals("x"));
		
		scanner.close();
		agencija.save("database.txt");
		

	}

}
