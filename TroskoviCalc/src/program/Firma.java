package program;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Firma {



	private ArrayList<Troskovi> listaTroskova;

	public Firma () {
		this.listaTroskova = new ArrayList<Troskovi>();
	}

	public ArrayList<Troskovi> getListaTroskova() {
		return listaTroskova;
	}

	public void setListaTroskova(ArrayList<Troskovi> listaTroskova) {
		this.listaTroskova = listaTroskova;
	}

	@Override
	public String toString() {
		return "Firma [listaTroskova=" + listaTroskova + "]";
	}




	//

	public void lstTroskova () {

		//%18s %12.2f %12.2f %12.2f %10s %15s
		System.out.printf("%18s %12s %12s %12s %10s %12s %15s \n", "Naziv Troska", "Dug", "Placeno", "Tsr Stanje", "Kamata ", "Bez Kamate" , "Datum Evidencije");

		for (int i = 0; i < listaTroskova.size(); i++) {

			Troskovi troskovi = listaTroskova.get(i);
			System.out.println(troskovi);

		}

	}



	/*public boolean dodavanjeInventara (Inventar inventar) {
		for (int i = 0; i < this.listaInventara.size(); i++) {
			Inventar inventarLista = this.listaInventara.get(i);
			int broInvLista = inventarLista.getId();
			int prosledjenibroj = inventar.getId();
			if (broInvLista == prosledjenibroj) {
				return false;
			}
		}
		Inventar noviInventar = new Inventar(inventar.getId(), inventar.getIme(), inventar.getPrezime(),
				inventar.getImeIprezime(), inventar.getProcenjenaVrednost(), inventar.getGodProizvodnje(), inventar.getDatum());
		boolean daLiJeDodat = this.listaInventara.add(noviInventar);
		return daLiJeDodat;
	}*/



	public boolean dodaanjeTroska (Troskovi troskovi) {

		for (int i = 0; i < listaTroskova.size(); i++) {

			Troskovi troskovi2 = this.listaTroskova.get(i);
			String imeLista = troskovi2.getImeTroska();
			if (imeLista.equalsIgnoreCase(troskovi.getImeTroska())) {
				return false;
			}
		}

		Troskovi troskovi2 = new Troskovi(troskovi.getImeTroska(), troskovi.getTrosak(), troskovi.getPlaceno(), troskovi.getTrenutnoStanje(),
				troskovi.getKamata(),troskovi.getTrenutnoStanjeBezKamate() , troskovi.getDatumUnosa());

		boolean daLiJeDodat = this.listaTroskova.add(troskovi2);
		return daLiJeDodat;


	}

	public void save (String path) {

		ArrayList<String> lines = new ArrayList<String>();
		for(int i = 0; i < this.listaTroskova.size(); i++) {

			Troskovi troskovi = this.listaTroskova.get(i);
			String imeTroska = troskovi.getImeTroska();
			double trosak = troskovi.getTrosak();
			double placeno = troskovi.getPlaceno();
			double trenutnoStanje = troskovi.getTrenutnoStanje();
			double kamata = troskovi.getKamata();
			double trenutnoStanje2 = troskovi.getTrenutnoStanjeBezKamate();
			LocalDate datumUnosa = troskovi.getDatumUnosa();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			String formiraniDatum = dtf.format(datumUnosa);

			String line = imeTroska +";"+ trosak +";"+ placeno +";"+ trenutnoStanje +";"+ kamata +";"+ trenutnoStanje2 +";"+ formiraniDatum;
			lines.add(line);	
		}

		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}

	}

	/*
	 * private String imeTroska;
	private double trosak;
	private double placeno;
	private double trenutnoStanje;
	private double kamata;
	private double TrenutnoStanjeBezKamate;
	private LocalDate datumUnosa;

	 */

	public void load(String path) {

		this.listaTroskova = new ArrayList<Troskovi>();

		List<String> lines;

		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String []attributes = line.split(";");
				String imeTroska = attributes[0];
				Double trosak = Double.parseDouble(attributes[1]);
				Double placeno = Double.parseDouble(attributes[2]);
				Double TrenutnoStanje = Double.parseDouble(attributes[3]);
				Double kamata = Double.parseDouble(attributes[4]);
				Double TrenutnoStanje2 = Double.parseDouble(attributes[5]);
				String datum = attributes[6];
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				LocalDate datumZaCuvanje = LocalDate.parse(datum, dtf);
				Troskovi troskovi = new Troskovi(imeTroska, trosak, placeno, TrenutnoStanje, kamata, TrenutnoStanje2, datumZaCuvanje);
				this.listaTroskova.add(troskovi);
			}
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		} catch (Exception e) {
			System.out.println("Desila se greška pri parsiranju datuma.");
		}

	}



}
