package javaprog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class UserX {

	private JFrame frmZubarskaOrdinacijaCandir;
	private JTextField textIme;
	private JTextField textPrezime;
	private JTextField textDatumRodljenja;
	private JTextField textJMBG;
	private JTextField textZanimanje;
	private JTextField textGdeRadi;
	private JTextField textBolesti;
	private JTextField textAlergije;

	/**
	 * Launch the application.
	 */

	public static Firma firma = new Firma();
	public static Mwain mwain = new Mwain();
	private JTextField textTooth11;
	private JTextField textTooth12;
	private JTextField textTooth13;
	private JTextField textTooth14;
	private JTextField textTooth15;
	private JTextField textTooth16;
	private JTextField textTooth17;
	private JTextField textTooth18;
	private JTextField textTooth21;
	private JTextField textTooth22;
	private JTextField textTooth23;
	private JTextField textTooth24;
	private JTextField textTooth25;
	private JTextField textTooth26;
	private JTextField textTooth27;
	private JTextField textTooth28;
	private JTextField textTooth41;
	private JTextField textTooth42;
	private JTextField textTooth43;
	private JTextField textTooth44;
	private JTextField textTooth45;
	private JTextField textTooth46;
	private JTextField textTooth47;
	private JTextField textTooth48;
	private JTextField textTooth31;
	private JTextField textTooth32;
	private JTextField textTooth33;
	private JTextField textTooth34;
	private JTextField textTooth35;
	private JTextField textTooth36;
	private JTextField textTooth37;
	private JTextField textTooth38;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserX window = new UserX();
					window.frmZubarskaOrdinacijaCandir.setVisible(true);
					firma.userLoad("users.txt");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserX() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZubarskaOrdinacijaCandir = new JFrame();
		frmZubarskaOrdinacijaCandir.getContentPane().setBackground(new Color(152, 251, 152));
		frmZubarskaOrdinacijaCandir.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Unos Korisnika",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBounds(12, 13, 400, 427);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(12, 18, 379, 396);
		panel_1.add(panel);
		panel.setLayout(null);

		JLabel lblIme = new JLabel("Ime");
		lblIme.setBounds(93, 31, 28, 20);
		lblIme.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblIme);

		textIme = new JTextField();
		textIme.setBounds(220, 30, 159, 22);
		panel.add(textIme);
		textIme.setColumns(10);

		JLabel lblprezime = new JLabel("Prezime");
		lblprezime.setBounds(79, 58, 56, 20);
		lblprezime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblprezime);

		textPrezime = new JTextField();
		textPrezime.setBounds(220, 57, 159, 22);
		panel.add(textPrezime);
		textPrezime.setColumns(10);

		JLabel lbldatumRodjenja = new JLabel("Datum rodjenja");
		lbldatumRodjenja.setBounds(52, 85, 111, 20);
		lbldatumRodjenja.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lbldatumRodjenja);

		textDatumRodljenja = new JTextField();
		textDatumRodljenja.setBounds(220, 84, 159, 22);
		panel.add(textDatumRodljenja);
		textDatumRodljenja.setColumns(10);

		JLabel lbljmbg = new JLabel("JMBG");
		lbljmbg.setBounds(88, 112, 39, 20);
		lbljmbg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lbljmbg);

		textJMBG = new JTextField();
		textJMBG.setBounds(220, 111, 159, 22);
		panel.add(textJMBG);
		textJMBG.setColumns(10);

		JLabel lblzanimanjePoSkoli = new JLabel("Po zanimanju");
		lblzanimanjePoSkoli.setBounds(59, 139, 96, 20);
		lblzanimanjePoSkoli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblzanimanjePoSkoli);

		textZanimanje = new JTextField();
		textZanimanje.setBounds(220, 138, 159, 22);
		panel.add(textZanimanje);
		textZanimanje.setColumns(10);

		JLabel lblGdeRadi = new JLabel("Gde Radi");
		lblGdeRadi.setBounds(75, 166, 64, 20);
		lblGdeRadi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblGdeRadi);

		textGdeRadi = new JTextField();
		textGdeRadi.setBounds(220, 165, 159, 22);
		panel.add(textGdeRadi);
		textGdeRadi.setColumns(10);

		JLabel lblBolesti = new JLabel("Bolesti");
		lblBolesti.setBounds(84, 193, 46, 20);
		lblBolesti.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblBolesti);

		textBolesti = new JTextField();
		textBolesti.setBounds(220, 192, 159, 22);
		panel.add(textBolesti);
		textBolesti.setColumns(10);

		JLabel lblAlergije = new JLabel("Alergije");
		lblAlergije.setBounds(80, 220, 55, 20);
		lblAlergije.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblAlergije);

		textAlergije = new JTextField();
		textAlergije.setBounds(220, 219, 159, 22);
		panel.add(textAlergije);
		textAlergije.setColumns(10);

		JButton btnUnosKorisnika = new JButton("Unos Korisnika");
		btnUnosKorisnika.setBackground(new Color(143, 188, 143));
		btnUnosKorisnika.setToolTipText(
				"Unos podataka korisnika u listu korisnika, svi podaci moraju biti popunjeni odgovarajuce.");
		btnUnosKorisnika.setMnemonic('u');
		btnUnosKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// had error had to redo this motherfuckery

				firma.userLoad("users.txt");

				String datumUnos = null;
				datumUnos = textDatumRodljenja.getText().trim();
				String JMBG = null;
				JMBG = textJMBG.getText().trim();

				if (Mwain.proveriDatum(datumUnos) == true) {

					if (Mwain.isIDValid(JMBG) == true) {

						String ime = null;
						String prezime = null;
						LocalDate datum = null;
						String zanimanjePoSkoli = null;
						String gdeRadi = null;
						String Bolesti = null;
						String Alergije = null;

						ime = textIme.getText().trim();
						prezime = textPrezime.getText().trim();
						datum = LocalDate.parse(datumUnos, Mwain.dtf);
						String jmbgx = JMBG;
						zanimanjePoSkoli = textZanimanje.getText().trim();
						gdeRadi = textGdeRadi.getText().trim();
						Bolesti = textBolesti.getText().trim();
						Alergije = textAlergije.getText().trim();

						User userNovi = new User(ime, prezime, datum, jmbgx, zanimanjePoSkoli, gdeRadi, Bolesti,
								Alergije);

						boolean provera = firma.dodavanjeKorisnika(userNovi);

						if (provera) {
							firma.userSave("users.txt");
							JOptionPane.showMessageDialog(null, "Korisnik je uspesno dodat u listu",
									"Korisnik je uspesno dodat u listu podataka", 1);
						} else {
							JOptionPane.showMessageDialog(null, "Korisnik nije uspesno dodat u listu",
									"Korisnik nije uspesno dodat u listu podataka", 1);
						}

					} else {
						JOptionPane.showMessageDialog(null, "JMBG mora imati 13 cifara i moze biti samo broj",
								"Greska pri unosu JMBG", 2);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Datum mora biti unet u formatu dd.MM.yyyy.",
							"Greska pri unosu datuma", 2);
				}

			}
		});
		btnUnosKorisnika
				.setIcon(new ImageIcon(UserX.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		btnUnosKorisnika.setBounds(0, 276, 185, 29);
		btnUnosKorisnika.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnUnosKorisnika);

		JButton btnListaKorisnika = new JButton("Lista Korisnika");
		btnListaKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Console consoleUser = new Console();
				consoleUser.init();
				firma.lstKorisnika();
			}
		});
		btnListaKorisnika.setBackground(new Color(143, 188, 143));
		btnListaKorisnika.setToolTipText("Lista svih trenutnih korisnika u bazi podataka");
		btnListaKorisnika.setMnemonic('l');
		btnListaKorisnika
				.setIcon(new ImageIcon(UserX.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		btnListaKorisnika.setBounds(190, 276, 189, 29);
		btnListaKorisnika.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnListaKorisnika);

		JButton btnIzmenaKorisnika = new JButton("Izmena Korisnika");
		btnIzmenaKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				firma.userLoad("users.txt");

				String datumUnos = null;
				datumUnos = textDatumRodljenja.getText().trim();
				String JMBG = null;
				JMBG = textJMBG.getText().trim();

				if (Mwain.proveriDatum(datumUnos) == true) {

					if (Mwain.isIDValid(JMBG) == true) {

						String ime = null;
						String prezime = null;
						LocalDate datum = null;
						String zanimanjePoSkoli = null;
						String gdeRadi = null;
						String Bolesti = null;
						String Alergije = null;

						ime = textIme.getText().trim();
						prezime = textPrezime.getText().trim();
						datum = LocalDate.parse(datumUnos, Mwain.dtf);
						String jmbgx = JMBG;
						zanimanjePoSkoli = textZanimanje.getText().trim();
						gdeRadi = textGdeRadi.getText().trim();
						Bolesti = textBolesti.getText().trim();
						Alergije = textAlergije.getText().trim();

						User userNovi = new User(ime, prezime, datum, jmbgx, zanimanjePoSkoli, gdeRadi, Bolesti,
								Alergije);

						User provera = firma.izmenaKorisnika(userNovi);
						if (provera != null) {
							JOptionPane.showMessageDialog(null, "Izmena korisnika po imenu i prezimenu uradjena", "Izmena je ok", 1);
							firma.userSave("users.txt");
						}else {
							JOptionPane.showMessageDialog(null, "proverite uneto ime i prezime", "Izmena nije prosla", 2);
						}

						/*
						 * User provera = firma.izmenaKorisnika(user); if (provera != null) {
						 * System.out.println("Izmena korisnika je uspesno izvrsena. "); }else {
						 * System.out.println("Izmena korisnika je neuspesno uzvrsena. "); }
						 */

						

					} else {
						JOptionPane.showMessageDialog(null, "JMBG mora imati 13 cifara i moze biti samo broj",
								"Greska pri unosu JMBG", 2);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Datum mora biti unet u formatu dd.MM.yyyy.",
							"Greska pri unosu datuma", 2);
				}

			}
		});
		btnIzmenaKorisnika.setBackground(new Color(143, 188, 143));
		btnIzmenaKorisnika.setToolTipText("Izmena jednog korisnika preko imena i prezimena, moraju da se poklapaju");
		btnIzmenaKorisnika.setMnemonic('i');
		btnIzmenaKorisnika
				.setIcon(new ImageIcon(UserX.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		btnIzmenaKorisnika.setBounds(0, 340, 185, 29);
		btnIzmenaKorisnika.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnIzmenaKorisnika);

		JButton btnBrisanjeKorisnika = new JButton("Brisanje Korisnika");
		btnBrisanjeKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				firma.userLoad("users.txt");

				String ime = textIme.getText().trim();
				String prezime = textPrezime.getText().trim();

				firma.brisanjeUser(ime, prezime);

			}
		});
		btnBrisanjeKorisnika.setBackground(new Color(143, 188, 143));
		btnBrisanjeKorisnika.setToolTipText(
				"Brisanje korisnika preko imena i prezimena, moraju da se poklapaju, mala i velika slova su nebitna, razmak je nebitan");
		btnBrisanjeKorisnika.setMnemonic('b');
		btnBrisanjeKorisnika
				.setIcon(new ImageIcon(UserX.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		btnBrisanjeKorisnika.setBounds(190, 340, 189, 29);
		btnBrisanjeKorisnika.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(btnBrisanjeKorisnika);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Korisnik Zubi Unos", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
		panel_3.setBounds(430, 8, 745, 672);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 24, 721, 635);
		panel_2.setBackground(new Color(152, 251, 152));
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(47, 79, 79));
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Gornji Levi Kvadrant 11-18", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_5.setBounds(0, 0, 360, 318);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_gornjilevikvadrant = new JPanel();
		panel_gornjilevikvadrant.setBounds(6, 18, 337, 288);
		panel_5.add(panel_gornjilevikvadrant);
		panel_gornjilevikvadrant.setLayout(null);
		
		JLabel lblTooth11 = new JLabel("Tooth 11");
		lblTooth11.setBounds(42, 33, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth11);
		
		textTooth11 = new JTextField();
		textTooth11.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth11.setBounds(140, 30, 196, 22);
		panel_gornjilevikvadrant.add(textTooth11);
		textTooth11.setColumns(10);
		
		JLabel lbltooth12 = new JLabel("Tooth 12");
		lbltooth12.setBounds(42, 60, 51, 16);
		panel_gornjilevikvadrant.add(lbltooth12);
		
		textTooth12 = new JTextField();
		textTooth12.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth12.setBounds(140, 57, 196, 22);
		panel_gornjilevikvadrant.add(textTooth12);
		textTooth12.setColumns(10);
		
		JLabel lblTooth13 = new JLabel("Tooth 13");
		lblTooth13.setBounds(42, 87, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth13);
		
		textTooth13 = new JTextField();
		textTooth13.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth13.setBounds(140, 84, 196, 22);
		panel_gornjilevikvadrant.add(textTooth13);
		textTooth13.setColumns(10);
		
		JLabel lblTooth14 = new JLabel("Tooth 14");
		lblTooth14.setBounds(42, 114, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth14);
		
		textTooth14 = new JTextField();
		textTooth14.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth14.setBounds(140, 111, 196, 22);
		panel_gornjilevikvadrant.add(textTooth14);
		textTooth14.setColumns(10);
		
		JLabel lblTooth15 = new JLabel("Tooth 15");
		lblTooth15.setBounds(42, 141, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth15);
		
		textTooth15 = new JTextField();
		textTooth15.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth15.setBounds(140, 138, 196, 22);
		panel_gornjilevikvadrant.add(textTooth15);
		textTooth15.setColumns(10);
		
		JLabel lblTooth16 = new JLabel("Tooth 16");
		lblTooth16.setBounds(42, 168, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth16);
		
		textTooth16 = new JTextField();
		textTooth16.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth16.setBounds(140, 165, 196, 22);
		panel_gornjilevikvadrant.add(textTooth16);
		textTooth16.setColumns(10);
		
		JLabel lblTooth17 = new JLabel("Tooth 17");
		lblTooth17.setBounds(42, 195, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth17);
		
		textTooth17 = new JTextField();
		textTooth17.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth17.setBounds(140, 192, 196, 22);
		panel_gornjilevikvadrant.add(textTooth17);
		textTooth17.setColumns(10);
		
		JLabel lblTooth18 = new JLabel("Tooth 18");
		lblTooth18.setBounds(42, 222, 51, 16);
		panel_gornjilevikvadrant.add(lblTooth18);
		
		textTooth18 = new JTextField();
		textTooth18.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth18.setBounds(140, 219, 196, 22);
		panel_gornjilevikvadrant.add(textTooth18);
		textTooth18.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Unknown");
		lblNewLabel_8.setBounds(41, 250, 52, 16);
		panel_gornjilevikvadrant.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Click me!!!!");
		btnNewButton.setBounds(140, 246, 196, 25);
		panel_gornjilevikvadrant.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Gornji Desni Kvadrant 21-28", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_6.setBackground(new Color(47, 79, 79));
		panel_6.setBounds(361, 0, 360, 318);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(6, 18, 337, 288);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lbltooth21 = new JLabel("Tooth 21");
		lbltooth21.setBounds(40, 33, 56, 16);
		panel_7.add(lbltooth21);
		
		textTooth21 = new JTextField();
		textTooth21.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth21.setBounds(142, 30, 194, 22);
		panel_7.add(textTooth21);
		textTooth21.setColumns(10);
		
		JLabel lbltooth22 = new JLabel("Tooth 22");
		lbltooth22.setBounds(40, 60, 56, 16);
		panel_7.add(lbltooth22);
		
		textTooth22 = new JTextField();
		textTooth22.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth22.setBounds(142, 57, 194, 22);
		panel_7.add(textTooth22);
		textTooth22.setColumns(10);
		
		JLabel lbltooth23 = new JLabel("Tooth 23");
		lbltooth23.setBounds(40, 87, 56, 16);
		panel_7.add(lbltooth23);
		
		textTooth23 = new JTextField();
		textTooth23.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth23.setBounds(142, 84, 194, 22);
		panel_7.add(textTooth23);
		textTooth23.setColumns(10);
		
		JLabel lbltooth24 = new JLabel("Tooth 24");
		lbltooth24.setBounds(40, 114, 56, 16);
		panel_7.add(lbltooth24);
		
		textTooth24 = new JTextField();
		textTooth24.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth24.setBounds(142, 111, 194, 22);
		panel_7.add(textTooth24);
		textTooth24.setColumns(10);
		
		JLabel lbltooth25 = new JLabel("Tooth 25");
		lbltooth25.setBounds(40, 141, 56, 16);
		panel_7.add(lbltooth25);
		
		textTooth25 = new JTextField();
		textTooth25.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth25.setBounds(142, 138, 194, 22);
		panel_7.add(textTooth25);
		textTooth25.setColumns(10);
		
		JLabel lbltooth26 = new JLabel("Tooth 26");
		lbltooth26.setBounds(40, 168, 56, 16);
		panel_7.add(lbltooth26);
		
		textTooth26 = new JTextField();
		textTooth26.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth26.setBounds(142, 165, 194, 22);
		panel_7.add(textTooth26);
		textTooth26.setColumns(10);
		
		JLabel lbltooth27 = new JLabel("Tooth 27");
		lbltooth27.setBounds(40, 195, 56, 16);
		panel_7.add(lbltooth27);
		
		textTooth27 = new JTextField();
		textTooth27.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth27.setBounds(142, 192, 194, 22);
		panel_7.add(textTooth27);
		textTooth27.setColumns(10);
		
		JLabel lbltooth28 = new JLabel("Tooth 28");
		lbltooth28.setBounds(40, 222, 56, 16);
		panel_7.add(lbltooth28);
		
		textTooth28 = new JTextField();
		textTooth28.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth28.setBounds(142, 219, 194, 22);
		panel_7.add(textTooth28);
		textTooth28.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Unknown2");
		lblNewLabel_9.setBounds(39, 250, 59, 16);
		panel_7.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(142, 246, 194, 25);
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Donji Levi Kvadrant 41-48", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_8.setBackground(new Color(47, 79, 79));
		panel_8.setBounds(0, 317, 360, 318);
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(6, 18, 337, 288);
		panel_8.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lbltooth41 = new JLabel("Tooth 41");
		lbltooth41.setBounds(40, 33, 56, 16);
		panel_9.add(lbltooth41);
		
		textTooth41 = new JTextField();
		textTooth41.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth41.setBounds(141, 30, 196, 22);
		panel_9.add(textTooth41);
		textTooth41.setColumns(10);
		
		JLabel lbltooth42 = new JLabel("Tooth 42");
		lbltooth42.setBounds(40, 60, 56, 16);
		panel_9.add(lbltooth42);
		
		textTooth42 = new JTextField();
		textTooth42.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth42.setBounds(141, 57, 196, 22);
		panel_9.add(textTooth42);
		textTooth42.setColumns(10);
		
		JLabel lbltooth43 = new JLabel("Tooth 43");
		lbltooth43.setBounds(40, 87, 56, 16);
		panel_9.add(lbltooth43);
		
		textTooth43 = new JTextField();
		textTooth43.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth43.setBounds(141, 84, 196, 22);
		panel_9.add(textTooth43);
		textTooth43.setColumns(10);
		
		JLabel lbltooth44 = new JLabel("Tooth 44");
		lbltooth44.setBounds(40, 114, 56, 16);
		panel_9.add(lbltooth44);
		
		textTooth44 = new JTextField();
		textTooth44.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth44.setBounds(141, 111, 196, 22);
		panel_9.add(textTooth44);
		textTooth44.setColumns(10);
		
		JLabel lbltooth45 = new JLabel("Tooth 45");
		lbltooth45.setBounds(40, 141, 56, 16);
		panel_9.add(lbltooth45);
		
		textTooth45 = new JTextField();
		textTooth45.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth45.setBounds(141, 138, 196, 22);
		panel_9.add(textTooth45);
		textTooth45.setColumns(10);
		
		JLabel lbltooth46 = new JLabel("Tooth 46");
		lbltooth46.setBounds(40, 168, 56, 16);
		panel_9.add(lbltooth46);
		
		textTooth46 = new JTextField();
		textTooth46.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth46.setBounds(141, 165, 196, 22);
		panel_9.add(textTooth46);
		textTooth46.setColumns(10);
		
		JLabel lbltooth47 = new JLabel("Tooth 47");
		lbltooth47.setBounds(40, 195, 56, 16);
		panel_9.add(lbltooth47);
		
		textTooth47 = new JTextField();
		textTooth47.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth47.setBounds(141, 192, 196, 22);
		panel_9.add(textTooth47);
		textTooth47.setColumns(10);
		
		JLabel lbltooth48 = new JLabel("Tooth 48");
		lbltooth48.setBounds(40, 222, 56, 16);
		panel_9.add(lbltooth48);
		
		textTooth48 = new JTextField();
		textTooth48.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth48.setBounds(141, 219, 196, 22);
		panel_9.add(textTooth48);
		textTooth48.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setBounds(40, 250, 56, 16);
		panel_9.add(lblNewLabel_18);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(141, 246, 196, 25);
		panel_9.add(btnNewButton_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Donji Desni Kvadrant 31-38", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_10.setBackground(new Color(47, 79, 79));
		panel_10.setBounds(361, 317, 360, 318);
		panel_2.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(6, 18, 337, 288);
		panel_10.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lbltooth31 = new JLabel("Tooth 31");
		lbltooth31.setBounds(40, 33, 56, 16);
		panel_11.add(lbltooth31);
		
		textTooth31 = new JTextField();
		textTooth31.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth31.setBounds(141, 30, 196, 22);
		panel_11.add(textTooth31);
		textTooth31.setColumns(10);
		
		JLabel lbltooth32 = new JLabel("Tooth 32");
		lbltooth32.setBounds(40, 60, 56, 16);
		panel_11.add(lbltooth32);
		
		textTooth32 = new JTextField();
		textTooth32.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth32.setBounds(141, 57, 196, 22);
		panel_11.add(textTooth32);
		textTooth32.setColumns(10);
		
		JLabel lbltooth33 = new JLabel("Tooth 33");
		lbltooth33.setBounds(40, 87, 56, 16);
		panel_11.add(lbltooth33);
		
		textTooth33 = new JTextField();
		textTooth33.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth33.setBounds(141, 84, 196, 22);
		panel_11.add(textTooth33);
		textTooth33.setColumns(10);
		
		JLabel lbltooth34 = new JLabel("Tooth 34");
		lbltooth34.setBounds(40, 114, 56, 16);
		panel_11.add(lbltooth34);
		
		textTooth34 = new JTextField();
		textTooth34.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth34.setBounds(141, 111, 196, 22);
		panel_11.add(textTooth34);
		textTooth34.setColumns(10);
		
		JLabel lbltooth35 = new JLabel("Tooth 35");
		lbltooth35.setBounds(40, 141, 56, 16);
		panel_11.add(lbltooth35);
		
		textTooth35 = new JTextField();
		textTooth35.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth35.setBounds(141, 138, 196, 22);
		panel_11.add(textTooth35);
		textTooth35.setColumns(10);
		
		JLabel lbltooth36 = new JLabel("Tooth 36");
		lbltooth36.setBounds(40, 168, 56, 16);
		panel_11.add(lbltooth36);
		
		textTooth36 = new JTextField();
		textTooth36.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth36.setBounds(141, 165, 196, 22);
		panel_11.add(textTooth36);
		textTooth36.setColumns(10);
		
		JLabel lbltooth37 = new JLabel("Tooth 37");
		lbltooth37.setBounds(40, 195, 56, 16);
		panel_11.add(lbltooth37);
		
		textTooth37 = new JTextField();
		textTooth37.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth37.setBounds(141, 192, 196, 22);
		panel_11.add(textTooth37);
		textTooth37.setColumns(10);
		
		JLabel lbltooth38 = new JLabel("Tooth 38");
		lbltooth38.setBounds(40, 222, 56, 16);
		panel_11.add(lbltooth38);
		
		textTooth38 = new JTextField();
		textTooth38.setToolTipText("Unesite sta je radjeno na zubu, ako nista nije radjeno ostavite polje prazno.");
		textTooth38.setBounds(141, 219, 196, 22);
		panel_11.add(textTooth38);
		textTooth38.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setBounds(40, 250, 56, 16);
		panel_11.add(lblNewLabel_27);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(141, 246, 196, 25);
		panel_11.add(btnNewButton_3);
		frmZubarskaOrdinacijaCandir.setTitle("Zubarska Ordinacija Candir");
		frmZubarskaOrdinacijaCandir.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(UserX.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmZubarskaOrdinacijaCandir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmZubarskaOrdinacijaCandir.setBackground(Color.GRAY);
		frmZubarskaOrdinacijaCandir.setBounds(100, 100, 1200, 730);
		frmZubarskaOrdinacijaCandir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZubarskaOrdinacijaCandir.setResizable(false);
	}
}
