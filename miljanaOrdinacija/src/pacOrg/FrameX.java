package pacOrg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Button;

public class FrameX {

	public Firma firma = new Firma();
	public Mwain mwain = new Mwain();

	private JFrame frmZubarskaOrdinacijaCandir;
	private JTextField textField_1;
	private JTextField textField_0;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblLABELKRANJA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameX window = new FrameX();
					window.frmZubarskaOrdinacijaCandir.setVisible(true);
					window.frmZubarskaOrdinacijaCandir.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// veoma bitan kod + pogledaj u konstruktoru.
	class Console {

		final JFrame frame = new JFrame();
		public Console() {
			JTextArea textArea = new JTextArea(24, 80);
			textArea.setBackground(Color.BLACK);
			textArea.setForeground(Color.LIGHT_GRAY);
			textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
			System.setOut(new PrintStream(new OutputStream() {

				@Override
				public void write(int b) throws IOException {
					textArea.append(String.valueOf((char) b));

				}
			}));
			frame.getContentPane().add(textArea);
			frame.getContentPane().add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		}
		public void init() {
			frame.pack();
			frame.setSize(1500, 400);
			frame.setVisible(true);
		}
		public JFrame geJframe() {
			return frame;
		}

	}

	/**
	 * Create the application.
	 */
	public FrameX() {
		initialize();
		//Console console = new Console();
		//	console.init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZubarskaOrdinacijaCandir = new JFrame();
		frmZubarskaOrdinacijaCandir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZubarskaOrdinacijaCandir.setTitle("Zubarska ordinacija Candir");
		frmZubarskaOrdinacijaCandir.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 12));
		frmZubarskaOrdinacijaCandir.getContentPane().setBackground(new Color(211, 211, 211));
		frmZubarskaOrdinacijaCandir.setBounds(100, 100, 895, 484);
		frmZubarskaOrdinacijaCandir.getContentPane().setLayout(null);
		frmZubarskaOrdinacijaCandir.setResizable(false);

		Panel panel = new Panel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(10, 10, 531, 245);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Broj Kartona");
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("Unesite samo broj");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textField_0 = new JTextField();
		lblNewLabel.setLabelFor(textField_0);
		GridBagConstraints gbc_textField_0 = new GridBagConstraints();
		gbc_textField_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_0.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_0.gridx = 4;
		gbc_textField_0.gridy = 0;
		panel.add(textField_0, gbc_textField_0);
		textField_0.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ime");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setToolTipText("Unesite ime pacijenta");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_1 = new JTextField();
		lblNewLabel_1.setLabelFor(textField_1);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Prezime");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setToolTipText("Unesite prezime pacijenta");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		lblNewLabel_2.setLabelFor(textField_2);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Alergije");
		lblNewLabel_3.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setToolTipText("Unesite alergije pacijenta");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_3 = new JTextField();
		lblNewLabel_3.setLabelFor(textField_3);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Hronicna Oboljenja");
		lblNewLabel_4.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setToolTipText("Unesite hronicna oboljenja pacijenta");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		textField_4 = new JTextField();
		lblNewLabel_4.setLabelFor(textField_4);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 4;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Godiste");
		lblNewLabel_5.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setToolTipText("Unesite godinu rodjenja pacijenta");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 4;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		textField_5 = new JTextField();
		lblNewLabel_5.setLabelFor(textField_5);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 5;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("JMBG");
		lblNewLabel_6.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_6.setToolTipText("Unesite jmbg pacijenta");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 4;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		textField_6 = new JTextField();
		lblNewLabel_6.setLabelFor(textField_6);
		textField_6.setToolTipText("Samo brojevi tacno 13 cifara.");
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 6;
		panel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Telefon");
		lblNewLabel_7.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_7.setToolTipText("Unesite telefon korisnika");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridwidth = 4;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		textField_7 = new JTextField();
		lblNewLabel_7.setLabelFor(textField_7);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 7;
		panel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Adresa");
		lblNewLabel_8.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_8.setToolTipText("Unesite adresu korisnika");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.gridwidth = 4;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);

		textField_8 = new JTextField();
		lblNewLabel_8.setLabelFor(textField_8);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 4;
		gbc_textField_8.gridy = 8;
		panel.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Datum");
		lblNewLabel_9.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_9.setToolTipText("Datum u formatu \"dd.MM.yyyy.\"");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.gridwidth = 4;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);

		textField_9 = new JTextField();
		lblNewLabel_9.setLabelFor(textField_9);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 9;
		panel.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);

		lblLABELKRANJA = new JLabel("  The Answer");
		lblLABELKRANJA.setIcon(new ImageIcon(FrameX.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		lblLABELKRANJA.setToolTipText("prikazuje razlicite poruke iz koda na osnovu kliknute operacije");
		lblLABELKRANJA.setHorizontalAlignment(SwingConstants.LEFT);
		lblLABELKRANJA.setBounds(10, 398, 531, 46);
		frmZubarskaOrdinacijaCandir.getContentPane().add(lblLABELKRANJA);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(10, 261, 174, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JButton btnUnosPodataka = new JButton("Unos podataka pacijenta");
		btnUnosPodataka.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnUnosPodataka = new GridBagConstraints();
		gbc_btnUnosPodataka.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnUnosPodataka.insets = new Insets(0, 0, 5, 0);
		gbc_btnUnosPodataka.gridx = 0;
		gbc_btnUnosPodataka.gridy = 0;
		panel_1.add(btnUnosPodataka, gbc_btnUnosPodataka);
		btnUnosPodataka.setToolTipText("Unos podataka novog pacijenta u listu iz gornje tabele.");

		JButton btnNewButton = new JButton("Izmena pacijenta ID");
		btnNewButton.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton.setToolTipText("Izmena podataka pacijenta na osnovu Identifikacionig kartona, ako se ID ne nalazi u listi podataka izmena se nemoze uraditi.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				firma.load("pacijenti.txt");

				String id = null;

				System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
				id = textField_0.getText();

				if (Mwain.isNumber(id) == true) {

					int idC = Integer.parseInt(id);

					System.out.println("Ime pacijenta: ");
					String ime = textField_1.getText();
					System.out.println("Prezime pacijenta: ");
					String prezime = textField_2.getText();
					System.out.println("Alergije pacijenta: ");
					String alergije = textField_3.getText();
					System.out.println("Hronicna oboljenja: ");
					String oboljenja = textField_4.getText();
					System.out.println("Godiste pacijenta: ");
					String godiste = textField_5.getText();

					String telefon = null;
					telefon = textField_7.getText();
					System.out.println("Unesite telefon pacijenta: ");

					if (Mwain.isNumber(telefon)== true) {



						int telefonC = Integer.parseInt(telefon);

						System.out.println("Adresa pacijenta: ");
						String adresa = textField_8.getText();

						String datum = null;

						System.out.println("Unesite datum u formatu dd.MM.yyyy.");
						datum = textField_9.getText();

						if (Mwain.isDate(datum)==true) {


							LocalDate datumC = LocalDate.parse(datum, Mwain.dtf);


							String jmbg = null;

							System.out.println("Jmbg korisnika: ");
							jmbg = textField_6.getText();;
							String jmbgC = jmbg;


							if (Mwain.isIDValid(jmbg) == true) {

								UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
										godiste, jmbgC, telefonC, adresa, datumC);

								UserClass userClass2 = firma.izmenaKorisnika(userClass);

								if (userClass2 != null) {
									JOptionPane.showMessageDialog(null, "Pacijent je uspesno izmenjen u listi.", "Operacija uspesno izvrsena. !", 1);
									lblLABELKRANJA.setText("Uspesan unos podataka.");
								}else {
									JOptionPane.showMessageDialog(null, "Pacijent nije uspesno izmenjen u listi proverite identifikacioni broj.", "GRESKA PRI UNOSU !", 1);
									lblLABELKRANJA.setText("Ne uspesan unos podataka proverite vrednosti.");
								}

							}else {
								JOptionPane.showMessageDialog(null, "JMBG mora biti samo broj i tacno 13 cifara, pokusajte ponovo.", "GRESKA PRI UNOSU !", 1);
							}


						}else {
							JOptionPane.showMessageDialog(null, "Ovaj podatak mora biti datum u formatu dd.MM.yyyy. npr (04.04.2000.) .", "GRESKA PRI UNOSU !", 1);
						}

					}else {
						JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj.", "GRESKA PRI UNOSU !", 1);
					}


				}else {
					JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj, i mora prethodno postojati pri izmeni.", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);

		JButton btnIzmenaPIme = new JButton("Izmena p Ime & Prezime");
		btnIzmenaPIme.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnIzmenaPIme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.load("pacijenti.txt");

				String id = null;

				System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
				id = textField_0.getText();

				if (Mwain.isNumber(id) == true) {

					int idC = Integer.parseInt(id);

					System.out.println("Ime pacijenta: ");
					String ime = textField_1.getText().trim();
					System.out.println("Prezime pacijenta: ");
					String prezime = textField_2.getText().trim();
					System.out.println("Alergije pacijenta: ");
					String alergije = textField_3.getText();
					System.out.println("Hronicna oboljenja: ");
					String oboljenja = textField_4.getText();
					System.out.println("Godiste pacijenta: ");
					String godiste = textField_5.getText();

					String telefon = null;
					telefon = textField_7.getText();
					System.out.println("Unesite telefon pacijenta: ");

					if (Mwain.isNumber(telefon)== true) {



						int telefonC = Integer.parseInt(telefon);

						System.out.println("Adresa pacijenta: ");
						String adresa = textField_8.getText();

						String datum = null;

						System.out.println("Unesite datum u formatu dd.MM.yyyy.");
						datum = textField_9.getText();

						if (Mwain.isDate(datum)==true) {


							LocalDate datumC = LocalDate.parse(datum, Mwain.dtf);


							String jmbg = null;

							System.out.println("Jmbg korisnika: ");
							jmbg = textField_6.getText();;
							String jmbgC = jmbg;


							if (Mwain.isIDValid(jmbg) == true) {

								UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
										godiste, jmbgC, telefonC, adresa, datumC);

								UserClass userClass2 = firma.izmenaKorisnika2(userClass);

								if (userClass2 != null) {
									JOptionPane.showMessageDialog(null, "Pacijent je uspesno izmenjen u listi.", "Operacija uspesno izvrsena. !", 1);
									lblLABELKRANJA.setText("Uspesan unos podataka.");
								}else {
									JOptionPane.showMessageDialog(null, "Pacijent nije uspesno izmenjen u listi proverite ime i prezime.", "GRESKA PRI UNOSU !", 1);
									lblLABELKRANJA.setText("Ne uspesan unos podataka proverite vrednosti.");
								}

							}else {
								JOptionPane.showMessageDialog(null, "JMBG mora biti samo broj i tacno 13 cifara, pokusajte ponovo.", "GRESKA PRI UNOSU !", 1);
							}


						}else {
							JOptionPane.showMessageDialog(null, "Ovaj podatak mora biti datum u formatu dd.MM.yyyy. npr (04.04.2000.) .", "GRESKA PRI UNOSU !", 1);
						}

					}else {
						JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj.", "GRESKA PRI UNOSU !", 1);
					}


				}else {
					JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj, i mora prethodno postojati pri izmeni.", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
		btnIzmenaPIme.setToolTipText("Izmena pacijenta na osnovu njegovog imena i prezimena, ako je ime i prezime isto kao ono sto se nalazi u listi korisnik ce se izmeniti, razmak i mala i velika slova nisu bitna program to sam resava.");
		GridBagConstraints gbc_btnIzmenaPIme = new GridBagConstraints();
		gbc_btnIzmenaPIme.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIzmenaPIme.insets = new Insets(0, 0, 5, 0);
		gbc_btnIzmenaPIme.gridx = 0;
		gbc_btnIzmenaPIme.gridy = 2;
		panel_1.add(btnIzmenaPIme, gbc_btnIzmenaPIme);

		JButton btnBrisanjePacijentaId = new JButton("Brisanje pacijenta ID");
		btnBrisanjePacijentaId.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnBrisanjePacijentaId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.load("pacijenti.txt");

				String idX = null;
				idX = textField_0.getText();


				if (Mwain.isNumber(idX)) {
					int id = Integer.parseInt(idX);
					UserClass provera = firma.korisnikBrisanjeID(id);
					if (provera == null) {
						JOptionPane.showMessageDialog(null, "Zadati broj ne postoji u listi", "GRESKA PRI UNOSU !", 1);
						lblLABELKRANJA.setText("Neuspesna Operacija.");
					}else {
						JOptionPane.showMessageDialog(null, "Brisanje preko ID je uspesno uradjeno", "Ok operacija izvrsena.", 1);
						lblLABELKRANJA.setText("Uspesno uradjena operacija. ");
					}

				}else {
					JOptionPane.showMessageDialog(null, "Morate uneti validan broj.", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
		btnBrisanjePacijentaId.setToolTipText("Brisanje jedne instance pacijenta preko identifikatora (Broj kartona) koji mu se poklapa.");
		GridBagConstraints gbc_btnBrisanjePacijentaId = new GridBagConstraints();
		gbc_btnBrisanjePacijentaId.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBrisanjePacijentaId.gridx = 0;
		gbc_btnBrisanjePacijentaId.gridy = 3;
		panel_1.add(btnBrisanjePacijentaId, gbc_btnBrisanjePacijentaId);

		JButton btnInfoButton = new JButton("info");
		btnInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Contact Marko 0642706010 if issues arise, or if you want additional functions.", "Made by Marko Dunovic.", 1);
			}
		});
		btnInfoButton.setToolTipText("Who to contact about issues with the program, or upgrades :)");
		btnInfoButton.setBounds(817, 419, 64, 25);
		frmZubarskaOrdinacijaCandir.getContentPane().add(btnInfoButton);

		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(239, 261, 252, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);

		JButton btnNewButton_1 = new JButton("Lista Svih");
		btnNewButton_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_1.setToolTipText("Lista svih unetih korisnika.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Console console = new Console();
				console.init();
				firma.lstKorisnika();
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Lista ID");
		btnNewButton_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Id = textField_0.getText().trim();

				if (Mwain.isNumber(Id)== true) {

					Console console = new Console();
					console.init();
					int idX = Integer.parseInt(Id);
					firma.lstKorisnikaID(idX);

				} else {
					JOptionPane.showMessageDialog(null, "Ovo mora biti broj, bez decimala !", "GRESKA PRI UNOSU !", 1);
				}


			}
		});

		JButton btnNullFrame = new JButton("Null Frame");
		btnNullFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Ovo dugme neradi nista ostavljeno je zbog poravnavanja tabela.", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});
		btnNullFrame.setToolTipText("Extra frame ostavljen zbog poravnanja tabela neradi nista.");
		btnNullFrame.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnNullFrame = new GridBagConstraints();
		gbc_btnNullFrame.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNullFrame.insets = new Insets(0, 0, 5, 0);
		gbc_btnNullFrame.gridx = 1;
		gbc_btnNullFrame.gridy = 0;
		panel_2.add(btnNullFrame, gbc_btnNullFrame);
		btnNewButton_2.setToolTipText("Prikaz jedne instance podataka na osnovu identifikatora ID(broja kartona).");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		panel_2.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_7 = new JButton("Rs Frame 3");
		btnNewButton_7.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RadnaStolicaFrame3 rsFrame = new RadnaStolicaFrame3();
				rsFrame.setVisible(true);
				rsFrame.setResizable(false);

			}
		});
		btnNewButton_7.setToolTipText("Radna Stolica 3 prozor ce se otvoriti kada se pritisne dugme.");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 1;
		gbc_btnNewButton_7.gridy = 1;
		panel_2.add(btnNewButton_7, gbc_btnNewButton_7);

		JButton btnNewButton_3 = new JButton("Lista Ime&Prezime");
		btnNewButton_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Console console = new Console();
				console.init();
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();

				firma.lstKorisnikaImePrezime(ime, prezime);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel_2.add(btnNewButton_3, gbc_btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Cene Frame");
		btnNewButton_4.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_4.setToolTipText("Prozor za unos i listanje cena ce se otvoriti kada se dugme pritisne.");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//frmZubarskaOrdinacijaCandir.dispose();
				CenaFrame cenaFrame = new CenaFrame();
				cenaFrame.setVisible(true);

			}
		});

		JButton btnNewButton_6 = new JButton("Rs Frame 2");
		btnNewButton_6.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RadnaStolicaFrame2 rsFrame = new RadnaStolicaFrame2();
				rsFrame.setVisible(true);
				rsFrame.setResizable(false);

			}
		});
		btnNewButton_6.setToolTipText("Radna Stolica 2 prozor ce se otvoriti kada se pritisne dugme.");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 1;
		gbc_btnNewButton_6.gridy = 2;
		panel_2.add(btnNewButton_6, gbc_btnNewButton_6);
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 3;
		panel_2.add(btnNewButton_4, gbc_btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Rs Frame 1");
		btnNewButton_5.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_5.setToolTipText("Radna Stolica 1 prozor ce se otvoriti kada se pritisne dugme.");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//frmZubarskaOrdinacijaCandir.dispose();
				RadnaStolicaFrame rsFrame = new RadnaStolicaFrame();
				rsFrame.setVisible(true);
				rsFrame.setResizable(false);

			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 3;
		panel_2.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnTermini = new JButton("Termini");
		btnTermini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Termini termini = new Termini();
				termini.setVisible(true);
				termini.setResizable(false);
				
			}
		});
		btnTermini.setToolTipText("Unos termina pacijenata");
		btnTermini.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnTermini = new GridBagConstraints();
		gbc_btnTermini.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTermini.gridx = 1;
		gbc_btnTermini.gridy = 4;
		panel_2.add(btnTermini, gbc_btnTermini);
		JLabel lblNewLabel_10 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/dentistX.gif")).getImage();     // this code is usefull copy it latter
		lblNewLabel_10.setIcon(new ImageIcon(img2));
		lblNewLabel_10.setBounds(547, 10, 334, 245);
		frmZubarskaOrdinacijaCandir.getContentPane().add(lblNewLabel_10);
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(60, 179, 113));
		panel_3.setBounds(190, 261, 43, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);

		JButton btnNewButton_9 = new JButton("?");
		btnNewButton_9.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcija 1 - Unos podataka pacijenta ocekuje sve podatke da su uneti u tabelu iznad !", "The Help Me BUTTON :)", 1);
				JOptionPane.showMessageDialog(null, "Opcija 2 - Lista svih podataka sa desne strane ne ocekuje nista da je uneto !", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 0;
		gbc_btnNewButton_9.gridy = 0;
		panel_3.add(btnNewButton_9, gbc_btnNewButton_9);

		JButton btnNewButton_10 = new JButton("?");
		btnNewButton_10.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Opcija 1 - Izmena podataka pacijenta preko ID ocekuje sve podatke da su uneti u tabelu iznad !", "The Help Me BUTTON :)", 1);
				JOptionPane.showMessageDialog(null, "Opcija 2 - Pretraga liste preko ID zahteva unos ID u polje tabele iznad (Identifikacioni karton) samo broj bez decimala!", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");

			}
		});
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_10.gridx = 0;
		gbc_btnNewButton_10.gridy = 1;
		panel_3.add(btnNewButton_10, gbc_btnNewButton_10);

		JButton btnNewButton_11 = new JButton("?");
		btnNewButton_11.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Opcija 1 - Izmena podataka pacijenta preko imena i prezimena ocekuje sve podatke da su uneti u tabelu iznad !", "The Help Me BUTTON :)", 1);
				JOptionPane.showMessageDialog(null, "Opcija 2 - Pretraga liste preko imena i prezimena ocekuje ime i prezime u tabeli program je caseInsensitive mala i velika slova su nebitna !", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");

			}
		});
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_11.gridx = 0;
		gbc_btnNewButton_11.gridy = 2;
		panel_3.add(btnNewButton_11, gbc_btnNewButton_11);

		JButton btnNewButton_12 = new JButton("?");
		btnNewButton_12.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Opcija 1 - Ocekuje ID u tabeli iznad preko koga ce traziti i brisati jednu instancu podataka koja se poklapa !", "The Help Me BUTTON :)", 1);
				JOptionPane.showMessageDialog(null, "Opcija 2 - Otvara prozor koji radi sa cenama, ne ocekuje nista.", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");

			}
		});
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_12.gridx = 0;
		gbc_btnNewButton_12.gridy = 3;
		panel_3.add(btnNewButton_12, gbc_btnNewButton_12);

		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(60, 179, 113));
		panel_4.setBounds(498, 261, 43, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);

		JButton button_1 = new JButton("?");
		button_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Otvara prozor za radnu stolicu 3 u koju se mogu unosti podaci i listati pacijenti !", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});

		JButton button = new JButton("?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Levo polje je extra neradi nista.", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});
		button.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel_4.add(button, gbc_button);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		panel_4.add(button_1, gbc_button_1);

		JButton button_2 = new JButton("?");
		button_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Otvara prozor za radnu stolicu 2 u koju se mogu unosti podaci i listati pacijenti !", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 2;
		panel_4.add(button_2, gbc_button_2);

		JButton button_3 = new JButton("?");
		button_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Otvara prozor za radnu stolicu 1 u koju se mogu unosti podaci i listati pacijenti !", "The Help Me BUTTON :)", 1);
				lblLABELKRANJA.setText("You have been helped.");
			}
		});
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 3;
		panel_4.add(button_3, gbc_button_3);

		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(60, 179, 113));
		panel_5.setBounds(547, 261, 166, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);

		JLabel lblHistorial = new JLabel("Istoriat");
		lblHistorial.setToolTipText("Specijalna lista podataka koja se automatski generise kada se unose podaci u Rs Frame 1 2 3.");
		lblHistorial.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistorial.setFont(new Font("MS Gothic", Font.BOLD, 17));
		GridBagConstraints gbc_lblHistorial = new GridBagConstraints();
		gbc_lblHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial.gridx = 0;
		gbc_lblHistorial.gridy = 0;
		panel_5.add(lblHistorial, gbc_lblHistorial);

		JButton btnNewButton_13 = new JButton("Lista");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Console console = new Console();
				console.init();
				firma.lstIstoriat();
			}
		});
		btnNewButton_13.setToolTipText("Lista svih unetih podataka.");
		btnNewButton_13.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 0;
		gbc_btnNewButton_13.gridy = 1;
		panel_5.add(btnNewButton_13, gbc_btnNewButton_13);

		JButton btnNewButton_15 = new JButton("Pretraga Ime & Prez");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ime = textField_1.getText().trim();

				Console console = new Console();
				console.init();

				firma.lstIstoriatImePrez1String(ime);


			}
		});
		btnNewButton_15.setToolTipText("Dugme ocekuje ime i prezime u polju za ime npr \"marko markovic\" u polju ime ignorisite prezime.");
		btnNewButton_15.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 0;
		gbc_btnNewButton_15.gridy = 2;
		panel_5.add(btnNewButton_15, gbc_btnNewButton_15);

		JButton btnNewButton_17 = new JButton("Pretraga ID");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = textField_0.getText().trim();

				if (Mwain.isNumber(id)== true) {

					int IdX = Integer.parseInt(id);
					Console console = new Console();
					console.init();

					firma.lstIstoriatIDString(IdX);

				} else {

					JOptionPane.showMessageDialog(null, "Morate uneti broj u polje Broj Kartona !", "The Help Me BUTTON :)", 1);
					lblLABELKRANJA.setText("You have been helped.");
				}


			}
		});
		btnNewButton_17.setToolTipText("Dugme identifikator broj operacije. Unesite u Broj kartona polje.");
		btnNewButton_17.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 0;
		gbc_btnNewButton_17.gridy = 3;
		panel_5.add(btnNewButton_17, gbc_btnNewButton_17);

		JButton btnBrisanjeId = new JButton("Brisanje ID");
		btnBrisanjeId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = textField_0.getText().trim();
				if (Mwain.isNumber(id)== true) {

					int IdX = Integer.parseInt(id);
					//Console console = new Console();
					//console.init();
					
					firma.brisanjeIstoriatIDString(IdX);
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Morate uneti broj u polje Broj Kartona !", "The Help Me BUTTON :)", 1);
					lblLABELKRANJA.setText("You have been helped.");

				}

			}
		});
		btnBrisanjeId.setToolTipText("Dugme ocekuje identifikator za pretragu i brisanje.");
		btnBrisanjeId.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnBrisanjeId = new GridBagConstraints();
		gbc_btnBrisanjeId.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBrisanjeId.insets = new Insets(0, 0, 0, 5);
		gbc_btnBrisanjeId.gridx = 0;
		gbc_btnBrisanjeId.gridy = 4;
		panel_5.add(btnBrisanjeId, gbc_btnBrisanjeId);
		
		JLabel lblNewLabel_11 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/CogsX.gif")).getImage();     // this code is usefull copy it latter
		lblNewLabel_11.setIcon(new ImageIcon(img4));
		lblNewLabel_11.setBounds(719, 261, 162, 141);
		frmZubarskaOrdinacijaCandir.getContentPane().add(lblNewLabel_11);
		btnUnosPodataka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				firma.load("pacijenti.txt");

				String id = null;

				System.out.println("Unesite broj kartona pacijenta. (samo cifre)");
				id = textField_0.getText();

				if (Mwain.isNumber(id) == true) {

					int idC = Integer.parseInt(id);

					System.out.println("Ime pacijenta: ");
					String ime = textField_1.getText();
					System.out.println("Prezime pacijenta: ");
					String prezime = textField_2.getText();
					System.out.println("Alergije pacijenta: ");
					String alergije = textField_3.getText();
					System.out.println("Hronicna oboljenja: ");
					String oboljenja = textField_4.getText();
					System.out.println("Godiste pacijenta: ");
					String godiste = textField_5.getText();

					String telefon = null;
					telefon = textField_7.getText();
					System.out.println("Unesite telefon pacijenta: ");

					if (Mwain.isNumber(telefon)== true) {



						int telefonC = Integer.parseInt(telefon);

						System.out.println("Adresa pacijenta: ");
						String adresa = textField_8.getText();

						String datum = null;

						System.out.println("Unesite datum u formatu dd.MM.yyyy.");
						datum = textField_9.getText();

						if (Mwain.isDate(datum)==true) {


							LocalDate datumC = LocalDate.parse(datum, Mwain.dtf);


							String jmbg = null;

							System.out.println("Jmbg korisnika: ");
							jmbg = textField_6.getText();;
							String jmbgC = jmbg;


							if (Mwain.isIDValid(jmbg) == true) {

								UserClass userClass = new UserClass(idC, ime, prezime, alergije, oboljenja,
										godiste, jmbgC, telefonC, adresa, datumC);

								boolean provera = firma.dodavanjePacijenta(userClass);
								if (provera) {
									//JOptionPane.showMessageDialog(null, "Pacijent je uspesno unet u listu.");
									JOptionPane.showMessageDialog(null, "Pacijent je uspesno unet u listu.", "Operacija uspesno izvrsena. !", 1);
									lblLABELKRANJA.setText("Uspesan unos podataka.");
								}else {
									JOptionPane.showMessageDialog(null, "Pacijent nije uspesno unet u listu.", "Operacija neuspesno izvrsena. !", 1);
									//JOptionPane.showMessageDialog(null, "Pacijent nije uspesno unet u listu.");
									lblLABELKRANJA.setText("Ne uspesan unos podataka proverite vrednosti.");
								}

							}else {
								JOptionPane.showMessageDialog(null, "JMBG mora biti samo broj i tacno 13 cifara, pokusajte ponovo.", "GRESKA PRI UNOSU !", 1);
							}


						}else {
							JOptionPane.showMessageDialog(null, "Ovaj podatak mora biti datum u formatu dd.MM.yyyy. npr (04.04.2000.) .", "GRESKA PRI UNOSU !", 1);
						}

					}else {
						JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj.", "GRESKA PRI UNOSU !", 1);
					}


				}else {
					JOptionPane.showMessageDialog(null, "Ovaj podatak moze biti samo broj, i mora prethodno postojati pri izmeni.", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
	}
}
