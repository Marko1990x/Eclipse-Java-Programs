package ispitniZadatak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Test {


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

	public static boolean daLiJeIdVeciOdNula (int number) {
		if (number > 0 ) {
			return true;
		}else {
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


	public static void unesiFirmu(Firma firma) {
		System.out.println("Unesite naziv Firme: ");
		String naziv = scanner.nextLine();
		firma.setNaziv(naziv);
		System.out.println("Unesite web adresu Firme: ");
		String webAdress = scanner.nextLine();
		firma.setWebAdressa(webAdress);
		System.out.println("Unesite broj telefona Firme: ");
		String telefonAgencije = scanner.nextLine();
		firma.setTelefon(telefonAgencije);
		System.out.println("Podaci o agenciji su uspesno dodati.");
	}


	public static void lstFirma (Firma firma) {
		System.out.println(firma);
	}





	public static void unosNoveOpreme(Firma firma) {

		String unosInt = null;
		do {
			System.out.println("Unesite id opreme: ");
			unosInt = scanner.nextLine();
		} while (!isNumber(unosInt));
		int id = Integer.parseInt(unosInt);

		if (id == 0) {
			System.out.println("Identifikator ne moze biti nula pokusajte ponovo.");
		} else {

			String doubleString = null;
			do {
				System.out.println("unesite cenu opreme");
				doubleString = scanner.nextLine();
			} while (!isDecimalNumber(doubleString));
			double opremaLista = Double.parseDouble(doubleString);

			if (opremaLista == 0) {
				System.out.println("Cena ne moze biti nula, pokusajte ponovo.");
			} else {

				LocalDate datum = null;
				String datumKorisnik = null;
				do {
					System.out.println("Unesite datum opreme u formatu dd.MM.yyyy.");
					datumKorisnik = scanner.nextLine();
				} while (!isDate(datumKorisnik));
				datum = LocalDate.parse(datumKorisnik, dtf);

				System.out.println("unesite tip opreme: ");
				String tip = scanner.nextLine();
				System.out.println("unesite Opis opreme: ");
				String opis = scanner.nextLine();
				String intBroj = null;
				do {
					System.out.println("Unesite kolicinu opreme");
					intBroj = scanner.nextLine();
				} while (!isNumber(intBroj));
				int Broj = Integer.parseInt(intBroj);

				if (Broj == 0) {
					System.out.println("kolicina ne moze biti nula, pokusajte ponovo.");
				} else {

					Objekat objekat = new Objekat(id, opremaLista, datum, tip, opis, Broj);
					boolean provera = firma.dodavanjeOpreme(objekat);
					if (provera) {
						System.out.println("Oprema je uspesno uneta. ");
					}else {
						System.out.println("Orpema je neuspesno uneta. ");
					}
				}
			}
		}
	}

	/*
	 *  * private int id;
	private double cena;
	private LocalDate datumNabavke;
	private String tip;
	private String opis;
	private int kolicina;
	 */


	public static void ispisPodatakaOpreme (Firma firma) {
		firma.lstPodatakaOpreme();
	}


	public static void IzmenaObjekta(Firma firma) {

		String unosInt = null;
		do {
			System.out.println("Unesite id opreme: ");
			unosInt = scanner.nextLine();
		} while (!isNumber(unosInt));
		int id = Integer.parseInt(unosInt);

		if (id == 0) {
			System.out.println("Identifikator ne moze biti nula pokusajte ponovo.");
		} else {

			String doubleString = null;
			do {
				System.out.println("unesite cenu opreme");
				doubleString = scanner.nextLine();
			} while (!isDecimalNumber(doubleString));
			double opremaLista = Double.parseDouble(doubleString);

			if (opremaLista == 0) {
				System.out.println("Cena ne moze biti nula, pokusajte ponovo.");
			} else {

				LocalDate datum = null;
				String datumKorisnik = null;
				do {
					System.out.println("Unesite datum opreme u formatu dd.MM.yyyy.");
					datumKorisnik = scanner.nextLine();
				} while (!isDate(datumKorisnik));
				datum = LocalDate.parse(datumKorisnik, dtf);

				System.out.println("unesite tip opreme: ");
				String tip = scanner.nextLine();
				System.out.println("unesite Opis opreme: ");
				String opis = scanner.nextLine();
				String intBroj = null;
				do {
					System.out.println("Unesite kolicinu opreme");
					intBroj = scanner.nextLine();
				} while (!isNumber(intBroj));
				int Broj = Integer.parseInt(intBroj);

				if (Broj == 0) {
					System.out.println("kolicina ne moze biti nula, pokusajte ponovo.");
				} else {
					Objekat objekatIzmena = new Objekat(id, opremaLista, datum, tip, opis, Broj);
					Objekat objekat = firma.izmenaTrans(objekatIzmena);
					if (objekat != null) {
						System.out.println("Transakcija je uspesno izmenjena. ");
					}else {
						System.out.println("Transakcija je neuspesno izmenjena. ");
					}
				}

			}
		}

	}



	public static void brisanjeIdentifikator (Firma firma) {
		String idX = null;
		do {
			System.out.println("unesite identifikator za brisanje.");
			idX = scanner. nextLine();
		} while (!isNumber(idX));
		int id = Integer.parseInt(idX);
		Objekat provera = firma.brisanjeT(id);
		if (provera == null) {
			System.out.println("Transakcija sa zadatim brojem ne postoji!");
		}
	}


	public static void pretragaPoTipu (Firma firma) {
		System.out.println("Unesite tip opreme :) : ");
		String nazivtipa = scanner.nextLine();
		firma.prosledjenoIme(nazivtipa);
	}


	public static void lstTipMinMAx(Firma firma) {
		System.out.println("Unesite tip opreme: ");
		String tip = scanner.nextLine();
		String min = null;
		String max = null;
		do {
			System.out.println("Unesite minimalnu vrednost opreme: ");
			min = scanner.nextLine();
		} while (!isNumber(min));
		double minX = Double.parseDouble(min);

		do {
			System.out.println("Unesite maximalnu vrednost opreme");
			max = scanner.nextLine();
		} while (!isNumber(max));
		double maxX = Double.parseDouble(max);

		firma.lstPoVrednosti(tip, minX, maxX);
	}


	public static void prosecnaVrednostPoUslovu (Firma firma) {

		String datumKorisnik = null;
		do {
			System.out.println("Unesite datum za izracunavanje proseka");
			datumKorisnik = scanner.nextLine();
		} while (!isDate(datumKorisnik));
		LocalDate datum = LocalDate.parse(datumKorisnik, dtf);
		firma.lstaPoUslovima(datum);
	}


	public static void lst2Datuma (Firma firma) {

		String datumUnos1 = null;
		do {
			System.out.println("Unesite pocetni datum za pretragu.");
			datumUnos1 = scanner.nextLine();
		} while (!isDate(datumUnos1));
		LocalDate datumX1 = LocalDate.parse(datumUnos1, dtf);

		String datumUnos2 = null;
		do {
			System.out.println("Unesite krajnji datum za pretragu.");
			datumUnos2 = scanner.nextLine();
		} while (!isDate(datumUnos2));
		LocalDate datumX2 = LocalDate.parse(datumUnos2, dtf);

		firma.lstProstorijaGraniceDatuma(datumX1, datumX2);


	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Firma firma = new Firma();

		firma.load("database.txt");

		String answer = null;

		do {

			System.out.println("-----------------------Menu---------------------- \n");
			System.out.println("Opcija 1 - Unesite podatke firme: ");
			System.out.println("Opcija 2 - Unos nove opreme: ");
			System.out.println("Opcija 3 - Ispis podataka Opreme");
			System.out.println("Opcija 4 - Izmena podataka o jednoj opremi na osnovu identifikatora.");
			System.out.println("Opcija 5 - Brisanje opreme po zadatom identifikatoru.");
			System.out.println("Opcija 6 - Pretraga po unetom tipu opreme (String)");
			System.out.println("Opcija 7 - Pretraga opreme po tipu + zadatim min i max vrednostima.");
			System.out.println("Opcija 8 - Izracunavanje i prikaz prosecne cene opreme koja je nabavljena posle zadatog datuma");
			System.out.println("Opcija 9 - Pronalazenje najskuplje stavke u zadatom vremenskom termin min max datum.");
			System.out.println("Opcija 10 - Lista podataka firme: ");
			;
			System.out.println("Opcija - x - izlaz iz programa. ");

			answer = scanner.nextLine();

			switch (answer) {
			case "1":

				unesiFirmu(firma);

				break;

			case "2":

				unosNoveOpreme(firma);
				firma.save("database.txt");

				break;

			case "3":

				ispisPodatakaOpreme(firma);

				break;

			case "4":

				IzmenaObjekta(firma);

				break;

			case "5":

				brisanjeIdentifikator(firma);

				break;

			case "6":

				pretragaPoTipu(firma);

				break;

			case "7":

				lstTipMinMAx(firma);

				break;

			case "8":

				prosecnaVrednostPoUslovu(firma);

				break;

			case "9":

				lst2Datuma(firma);

				break;

			case "10":

				lstFirma(firma);

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
