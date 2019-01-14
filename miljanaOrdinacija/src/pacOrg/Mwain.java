package pacOrg;


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


	public static void unosKorisnik (Firma firma) {

		String id = null;
		do {
			System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);

		System.out.println("Ime pacijenta: ");
		String ime = scanner.nextLine();
		System.out.println("Prezime pacijenta: ");
		String prezime = scanner.nextLine();
		System.out.println("Alergije pacijenta: ");
		String alergije = scanner.nextLine();
		System.out.println("Hronicna oboljenja: ");
		String oboljenja = scanner.nextLine();
		System.out.println("Godiste pacijenta: ");
		String godiste = scanner.nextLine();

		String telefon = null;

		do {
			System.out.println("Unesite telefon pacijenta: ");
			telefon = scanner.nextLine();
		} while (!isNumber(telefon));

		int telefonC = Integer.parseInt(telefon);

		System.out.println("Adresa pacijenta: ");
		String adresa = scanner.nextLine();

		String datum = null;

		do {
			System.out.println("Unesite datum u formatu dd.MM.yyyy.");
			datum = scanner.nextLine();
		} while (!isDate(datum));

		LocalDate datumC = LocalDate.parse(datum, dtf);


		String jmbg = null;

		do {
			System.out.println("Jmbg korisnika: ");
			jmbg = scanner.nextLine();
		} while (!isIDValid(jmbg));

		String jmbgC = jmbg;

		UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
				godiste, jmbgC, telefonC, adresa, datumC);

		boolean provera = firma.dodavanjePacijenta(userClass);
		if (provera) {
			System.out.println("Pacijent je uspesno unet u listu.");
		}else {
			System.out.println("Pacijent nije uspesno unet u listu proverite podatke.");
		}

	}

	/*
	 * 	private int id;   // broj kartona
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


	// metoda za listu

	public static void lstPacijenata (Firma firma) {
		firma.lstKorisnika();
	}


	// metoda za promenu


	public static void promenaKorisnik (Firma firma) {

		String id = null;
		do {
			System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);

		System.out.println("Ime pacijenta: ");
		String ime = scanner.nextLine();
		System.out.println("Prezime pacijenta: ");
		String prezime = scanner.nextLine();
		System.out.println("Alergije pacijenta: ");
		String alergije = scanner.nextLine();
		System.out.println("Hronicna oboljenja: ");
		String oboljenja = scanner.nextLine();
		System.out.println("Godiste pacijenta: ");
		String godiste = scanner.nextLine();

		String telefon = null;

		do {
			System.out.println("Unesite telefon pacijenta: ");
			telefon = scanner.nextLine();
		} while (!isNumber(telefon));

		int telefonC = Integer.parseInt(telefon);

		System.out.println("Adresa pacijenta: ");
		String adresa = scanner.nextLine();

		String datum = null;

		do {
			System.out.println("Unesite datum u formatu dd.MM.yyyy.");
			datum = scanner.nextLine();
		} while (!isDate(datum));

		LocalDate datumC = LocalDate.parse(datum, dtf);


		String jmbg = null;

		do {
			System.out.println("Jmbg korisnika: ");
			jmbg = scanner.nextLine();
		} while (!isIDValid(jmbg));

		String jmbgC = jmbg;


		UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
				godiste, jmbgC, telefonC, adresa, datumC);

		UserClass userClass2 = firma.izmenaKorisnika(userClass);

		if (userClass2 != null) {
			System.out.println("Izmena pacijenta je uspesno izvrsena.");
		}else {
			System.out.println("Izmena pacijenta je neuspesno izvrsena.");
		}


	}

	public static void lstCena (Firma firma) {
		firma.lstCena();
	}


	public static void promenaKorisnikImePrezime (Firma firma) {

		String id = null;
		do {
			System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);

		System.out.println("Ime pacijenta: ");
		String ime = scanner.nextLine();
		System.out.println("Prezime pacijenta: ");
		String prezime = scanner.nextLine();
		System.out.println("Alergije pacijenta: ");
		String alergije = scanner.nextLine();
		System.out.println("Hronicna oboljenja: ");
		String oboljenja = scanner.nextLine();
		System.out.println("Godiste pacijenta: ");
		String godiste = scanner.nextLine();

		String telefon = null;

		do {
			System.out.println("Unesite telefon pacijenta: ");
			telefon = scanner.nextLine();
		} while (!isNumber(telefon));

		int telefonC = Integer.parseInt(telefon);

		System.out.println("Adresa pacijenta: ");
		String adresa = scanner.nextLine();

		String datum = null;

		do {
			System.out.println("Unesite datum u formatu dd.MM.yyyy.");
			datum = scanner.nextLine();
		} while (!isDate(datum));

		LocalDate datumC = LocalDate.parse(datum, dtf);


		String jmbg = null;

		do {
			System.out.println("Jmbg korisnika: ");
			jmbg = scanner.nextLine();
		} while (!isIDValid(jmbg));

		String jmbgC = jmbg;


		UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
				godiste, jmbgC, telefonC, adresa, datumC);

		UserClass userClass2 = firma.izmenaKorisnika2(userClass);

		if (userClass2 != null) {
			System.out.println("Izmena pacijenta je uspesno izvrsena.");
		}else {
			System.out.println("Izmena pacijenta je neuspesno izvrsena.");
		}


	}


	public static void unosCene(Firma firma) {

		String id = null;
		String dug = null;
		String placeno = null;

		do {
			System.out.println("Unesite Id pacijenta: ");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idLista = Integer.parseInt(id);

		System.out.println("Unesite ime pacijenta: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime pacijenta: ");
		String prezime = scanner.nextLine();

		do {
			System.out.println("Unesite dug: ");
			dug = scanner.nextLine();
		} while (!isDecimalNumber(dug));
		double dugLista = Double.parseDouble(dug);

		do {
			System.out.println("Unesite uplacenu kolicinu: ");
			placeno = scanner.nextLine();
		} while (!isDecimalNumber(placeno));
		double placenoX = Double.parseDouble(placeno);

		double trenutnoStanje = dugLista- placenoX;

		Cena cena = new Cena(idLista, ime, prezime, dugLista, placenoX, trenutnoStanje);
		boolean provera = firma.unosCene(cena);
		if (provera) {
			System.out.println("unos cene je uspesno uradjen.");
		}else {
			System.out.println("unos cene je neuspesno izrsen.");
		}

	}



	// ok

	public static void IzmenaCeneID (Firma firma) {

		String id = null;
		do {
			System.out.println("Unesite broj kartona za pretragu.");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);

		String dug = null;
		String placeno = null;

		do {
			System.out.println("Unesite dug pacijenta.");
			dug = scanner.nextLine();
		} while (!isDecimalNumber(dug));
		double dugC = Double.parseDouble(dug);

		do {
			System.out.println("Unsite placenu kolicinu.");
			placeno = scanner.nextLine();
		} while (!isDecimalNumber(placeno));
		double placenoC = Double.parseDouble(placeno);

		Cena cena = new Cena(idC, dugC, placenoC);
		Cena cena2 = firma.izmenaCenaID(cena);
		if (cena2 != null) {
			System.out.println("Izmena je uspesno uradjena.");
		}else {
			System.out.println("Izmena je neuspesno uradjena.");
		}

	}

	public static void IzmenaCeneImePrezime (Firma firma) {

		System.out.println("Unesite ime: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime: ");
		String prezime = scanner.nextLine();

		String dug = null;
		String placeno = null;

		do {
			System.out.println("Unesite dug pacijenta.");
			dug = scanner.nextLine();
		} while (!isDecimalNumber(dug));
		double dugC = Double.parseDouble(dug);

		do {
			System.out.println("Unesite placenu kolicinu.");
			placeno = scanner.nextLine();
		} while (!isDecimalNumber(placeno));
		double placenoC = Double.parseDouble(placeno);

		Cena cena = new Cena(ime, prezime, dugC, placenoC);
		Cena cena2 = firma.izmenaCenaImePrezime(cena);
		if (cena2 != null) {
			System.out.println("Izmena je uspesno uradjena.");
		}else {
			System.out.println("Izmena je neuspesno uradjena.");
		}

	}


	public static void nuliranjeCene (Firma firma) {

		String id = null;
		do {
			System.out.println("Unesite broj kartona za pretragu.");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);

		double dug = 0.0;
		double placeno = 0.0;
		double trenutnoStanje = 0.0;
		
		Cena cena = new Cena(idC, dug, placeno, trenutnoStanje);
		Cena cena2 = firma.nuliranjeCeneID(cena);
		if (cena2 != null) {
			System.out.println("Izmena je uspesno uradjena.");
		}else {
			System.out.println("Izmena je nespesno uradjena.");
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

	public static void unosPodatakaStolice(Firma firma) {
		
		String id = null;
		do {
			System.out.println("broj redosleda operacije npr (1, 2 ,3 etc ): ");
			id = scanner.nextLine();
		} while (!isNumber(id));
		int idC = Integer.parseInt(id);
		System.out.println("Unesite ime doktora koji radi: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite pocetno vreme rada: ");
		String vremePocetno = scanner.nextLine();
		System.out.println("Unesite krajnje vreme sesije:");
		String krajnjeVreme = scanner.nextLine();
		System.out.println("Unesite sta je radjeno na gornjim levim zubima: ");
		String gornjiLevi = scanner.nextLine();
		System.out.println("Unesite sta je radjeno na gornjim desnim zubima: ");
		String gornjiDesni = scanner.nextLine();
		System.out.println("Unesite sta je radjeno na donjim levim zubima: ");
		String donjiLevi = scanner.nextLine();
		System.out.println("Unesite sta je radjeno na donjim desnim zubima: ");
		String donjiDesni = scanner.nextLine();
		
		RadnaStolica radnaStolica = new RadnaStolica(idC, ime, vremePocetno, krajnjeVreme,
				gornjiLevi, gornjiDesni, donjiLevi, donjiDesni);
		
		boolean provera = firma.dodavanjeStolice(radnaStolica);
		if (provera) {
			System.out.println("Unos podataje je uspesno uradjen.");
		}else {
			System.out.println("Unos podataka je nesupesno uradjen.");
		}
		
		
		
		
	}
	
	
	public static void lstStolica(Firma firma) {
		firma.lstStolica();
	}
	
	public static void brisanjeSvihPodatakaStolica(Firma firma) {
		firma.brisanjeSvihP();
		System.out.println("svi podaci su izbrisani.");
	}
	
	public static void brisanjePoBroju(Firma firma) {
		String idX = null;
		do {
			System.out.println("unesite identifikator za brisanje.");
			idX = scanner. nextLine();
		} while (!isNumber(idX));
		int id = Integer.parseInt(idX);
		RadnaStolica provera = firma.stolicaBrisanjeID(id);
		if (provera == null) {
			System.out.println("Zadati broj ne postoji u listi.");
		}
	}
	
	public static void brisanjePoBrojuKorisnik(Firma firma) {
		String idX = null;
		do {
			System.out.println("unesite identifikator za brisanje.");
			idX = scanner. nextLine();
		} while (!isNumber(idX));
		int id = Integer.parseInt(idX);
		UserClass provera = firma.korisnikBrisanjeID(id);
		if (provera == null) {
			System.out.println("Zadati broj ne postoji u listi.");
		}
	}
	
	public static void brisanjePoBrojuCena(Firma firma) {
		String idX = null;
		do {
			System.out.println("unesite identifikator za brisanje.");
			idX = scanner. nextLine();
		} while (!isNumber(idX));
		int id = Integer.parseInt(idX);
		Cena provera = firma.cenaBrisanjeID(id);
		if (provera == null) {
			System.out.println("Zadati broj ne postoji u listi.)");
		}
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firma firma = new Firma();

		firma.load("pacijenti.txt");
		firma.loadCena("cene.txt");
		firma.loadStolica("radnaStolica.txt");

		String answer = null;

		do {


			System.out.println("------------------------------Menu--------------------------");
			System.out.println("Opcija -1-  Unos podataka korisnika: - ok - window ok");
			System.out.println("Opcija -2-  Lista svih pacijenata: - ok -window ok");
			System.out.println("Opcija -3-  Izmena pacijenta po identifikacionom kartonu: -ok - window ok");
			System.out.println("Opcija -4-  Izmena pacijenta po imenu i prezimenu: -ok - window ok");
			System.out.println("Opcija -5-  Unos podataka o novcu. -ok");
			System.out.println("Opcija -6-  Lista svih cena korisnika -ok");
			System.out.println("Opcija -7-  Izmena cene na osnovu id -ok");
			System.out.println("Opcija -8-  Izmena cene na osnovu imena i prezimena -ok");
			System.out.println("Opcija -9-  Stavljanje vrednosti cene na 0 preko ID -ok");
			System.out.println("Opcija -10- Unos podataka stolice za dan. -ok");
			System.out.println("Opcija -11- Lista unetih podataka stolice. -ok");
			System.out.println("Opcija -12- brisanje svih podataka radne stolice. -ok");
			System.out.println("Opcija -13- brisanje jednog podatka radne stolice preko broja.");
			System.out.println("Opcija -14- brisaje pacijenta preko identifikacionog broja.");
			System.out.println("Opcija -15- brisanje instance novca preko id broja.");
			System.out.println("----------------------------------------------------------\n");

			answer = scanner.nextLine();

			switch (answer) {
			case "1":

				unosKorisnik(firma);
				firma.save("pacijenti.txt");

				break;
			case "2":

				lstPacijenata(firma);

				break;
			case "3":

				promenaKorisnik(firma);
				firma.save("pacijenti.txt");

				break;
			case "4":

				promenaKorisnikImePrezime(firma);
				firma.save("pacijenti.txt");

				break;
			case "5":

				unosCene(firma);
				firma.saveCena("cene.txt");

				break;
			case "6":

				lstCena(firma);

				break;
			case "7":

				IzmenaCeneID(firma);
				firma.saveCena("cene.txt");
				firma.loadCena("cene.txt");

				break;
			case "8":

				IzmenaCeneImePrezime(firma);
				firma.saveCena("cene.txt");
				firma.loadCena("cene.txt");

				break;

			case "9":
				
				nuliranjeCene(firma);
				firma.saveCena("cene.txt");
				firma.loadCena("cene.txt");

				break;

			case "10":
				
				unosPodatakaStolice(firma);
				firma.saveStolica("radnaStolica.txt");

				break;
			case "11":
				
				lstStolica(firma);

				break;
				
			case "12":
				
				brisanjeSvihPodatakaStolica(firma);
				firma.saveStolica("radnaStolica.txt");
			
				break;
				
			case "13":
				
				brisanjePoBroju(firma);
				firma.saveStolica("radnaStolica.txt");
				
				break;
				
			case "14":
				
				brisanjePoBrojuKorisnik(firma);
				firma.save("pacijenti.txt");
				
				break;
				
			case "15":
				
				brisanjePoBrojuCena(firma);
				firma.saveCena("cene.txt");
				
				break;
				
			case "16":
				
				TerminiOrd ord = new TerminiOrd();
			//	UserClass ord = new UserClass();
				System.out.println(ord);
			
				break;
		
			case "x":
				break;

			default:
				break;
			}


		} while (!answer.equals("x"));

		scanner.close();
		firma.save("pacijenti.txt");
		firma.saveCena("cene.txt");
		firma.saveStolica("radnaStolica.txt");
		

	}

}
