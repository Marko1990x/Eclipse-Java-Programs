package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Mwain {
	
	public static Scanner scanner = new Scanner(System.in);
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

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

	public static boolean jmbg (int broj) {

		if (broj > 0 && broj <= 13) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isIDValid(String jmbg) {
		if (jmbg.equals("")) {
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
	

	public static void lst(Firma firma) {
		firma.lstTroskova();
	}
	
	public static void unosTroska(Firma firma) {
		
		
		System.out.println("Unesite naziv Troska");
		String Ime = scanner.nextLine();
		String dug;
		do {
			System.out.println("Unesite dug");
			dug = scanner.nextLine();
		} while (!isDecimalNumber(dug));
		
		Double Dug = Double.parseDouble(dug);
		
		
		String placeno;
		do {
			System.out.println("Unesite kolicinu placenu");
			placeno = scanner.nextLine();
		} while (!isDecimalNumber(placeno));
		Double Placeno = Double.parseDouble(placeno);
		
		String kamata;
		
		do {
			System.out.println("unesite stopu kamate samo broj: ");
			kamata = scanner.nextLine();
		} while (!isDecimalNumber(kamata));
		Double Kamata = Double.parseDouble(kamata);
		
		double trenutnoStanje = (Dug - Placeno) + ((Dug - Placeno)*Kamata);
		double trenutnoStanjeBezkamata = (Dug - Placeno);
		
		
		
		LocalDate datum = LocalDate.now();
		
		Troskovi troskovi = new Troskovi(Ime, Dug, Placeno, trenutnoStanje, Kamata, trenutnoStanjeBezkamata, datum);
		
		boolean provera = firma.dodaanjeTroska(troskovi);
		
		if (provera) {
			System.out.println("Podaci su uspesno uneti.");
		} else {
			System.out.println("Podaci nisu uspesno uneti");
		}
		
		
	}
	
	/*
	 * 	private String imeTroska;+
	private double trosak; +
	private double placeno; 
	private double trenutnoStanje;
	private int kamata;
	private LocalDate datumUnosa;
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firma firma = new Firma();
		System.out.println(firma);
		
		firma.load("data.txt");
		
		String answer = null;
		
		
		do {
			System.out.println("--------------------- \n");
			System.out.println("Meni");
			System.out.println("Opcija 1 lista");
			System.out.println("Opcija 2 unosPodataka");
			System.out.println("--------------------- \n");
			
			answer = scanner.nextLine();
			
			switch (answer) {
			case "1":
				
				lst(firma);	
				break;
				
			case "2":
				
				unosTroska(firma);
				firma.save("data.txt");
				
				break;

			default:
				break;
			}
			
			
			
		} while (!answer.equals("x"));
		
		scanner.close();
		
		firma.save("data.txt");
		firma.save("dataBackup.txt");

	}

}
