package pacOrg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class CenaFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Mwain mwain = new Mwain();
	public Firma firma = new Firma();
	public FrameX frameX = new FrameX();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CenaFrame frame = new CenaFrame();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CenaFrame() {
		setFont(new Font("MS Gothic", Font.ITALIC, 14));
		setTitle("Window Cena");
		setBounds(100, 100, 820, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 10, 390, 155);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Broj kartona");
		lblNewLabel.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel.setToolTipText("Identifikacioni broj korisnika ID.");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textField_0 = new JTextField();
		textField_0.setToolTipText("Uneti broj kartona (Samo Cifre bez razmaka, i bez decimala).");
		GridBagConstraints gbc_textField_0 = new GridBagConstraints();
		gbc_textField_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_0.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_0.gridx = 4;
		gbc_textField_0.gridy = 0;
		panel.add(textField_0, gbc_textField_0);
		textField_0.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ime pacijenta");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_1.setToolTipText("Ime korisnika koje se treba uneti.");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setToolTipText("Ime String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Prezime pacijenta");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_2.setToolTipText("Prezime korisnika koje se treba uneti.");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setToolTipText("Prezime String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Dug");
		lblNewLabel_3.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_3.setToolTipText("Uneti trosak posle operacije.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setToolTipText("double unos moze biti samo broj ! sa ili bez decimala.");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Placeno");
		lblNewLabel_4.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_4.setToolTipText("Unesti kolicinu novca koja je placena.");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		textField_4 = new JTextField();
		textField_4.setToolTipText("double Unos more biti samo broj sa ili bez decimala.");
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 4;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 171, 192, 135);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JButton btnNewButton = new JButton("Unos podataka cena");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.loadCena("cene.txt");

				String id = textField_0.getText().trim();
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();
				String dug = textField_3.getText().trim();
				String placeno = textField_4.getText().trim();

				if (Mwain.isNumber(id)== true) {

					if (Mwain.isDecimalNumber(dug)== true) {

						if (Mwain.isDecimalNumber(placeno)== true) {

							int idX = Integer.parseInt(id);
							double dugX = Double.parseDouble(dug);
							double placenoX = Double.parseDouble(placeno);
							double trenutnoStanje = dugX- placenoX;

							Cena cena = new Cena(idX, ime, prezime, dugX, placenoX, trenutnoStanje);
							boolean provera = firma.unosCene(cena);
							if (provera) {
								JOptionPane.showMessageDialog(null, "unos cene je uspesno uradjen.", "Unos uspesno uradjen", 1);
								//System.out.println("unos cene je uspesno uradjen.");
							}else {
								JOptionPane.showMessageDialog(null, "unos cene je neuspesno uradjen.", "Unos neuspesno uradjen", 1);
								//System.out.println("unos cene je neuspesno izrsen.");
							}


						}else {

							JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
						}


					}else {
						JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
					}

				}else {
					JOptionPane.showMessageDialog(null, "Unos mora biti samo broj, bez razmaka, bez decimala !","GRESKA PRI UNOSU !", 1);
				}




			}
		});
		btnNewButton.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton.setToolTipText("Unos u listu podataka gornje unetih informacija.");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Izmena lista ID");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.loadCena("cene.txt");

				String id = textField_0.getText().trim();
				String dug = textField_3.getText().trim();
				String placeno = textField_4.getText().trim();

				if (Mwain.isNumber(id)== true) {

					if (Mwain.isDecimalNumber(dug)== true) {

						if (Mwain.isDecimalNumber(placeno)== true) {

							int idX = Integer.parseInt(id);
							double dugX = Double.parseDouble(dug);
							double placenoX = Double.parseDouble(placeno);							
							Cena cena = new Cena(idX, dugX, placenoX);
							Cena cena2 = firma.izmenaCenaID(cena);
							if (cena2 != null) {
								JOptionPane.showMessageDialog(null, "Izmena cene je uspesno uradjen.", "izmena uspesno uradjen", 1);
								//System.out.println("Izmena je uspesno uradjena.");
							}else {
								JOptionPane.showMessageDialog(null, "Izmena cene je neuspesno uradjen.", "izmena neuspesno uradjen", 1);
								System.out.println("Izmena je neuspesno uradjena.");
							}

						}else {

							JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
						}


					}else {
						JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
					}

				}else {
					JOptionPane.showMessageDialog(null, "Unos mora biti samo broj, bez razmaka, bez decimala !","GRESKA PRI UNOSU !", 1);
				}

			}
		});
		btnNewButton_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_1.setToolTipText("Izmena jedne instance grupe podataka na osnovu identifikatora (broj kartona).");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Izmena lista Ime + Prezime");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.loadCena("cene.txt");


				String dug = textField_3.getText().trim();
				String placeno = textField_4.getText().trim();
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();

				if (Mwain.isDecimalNumber(dug)== true) {

					if (Mwain.isDecimalNumber(placeno)== true) {

						
						double dugX = Double.parseDouble(dug);
						double placenoX = Double.parseDouble(placeno);							


						Cena cena = new Cena(ime, prezime, dugX, placenoX);
						Cena cena2 = firma.izmenaCenaImePrezime(cena);
						if (cena2 != null) {
							JOptionPane.showMessageDialog(null, "Izmena cene je uspesno uradjen.", "izmena uspesno uradjen", 1);
							//System.out.println("Izmena je uspesno uradjena.");
						}else {
							JOptionPane.showMessageDialog(null, "Izmena cene je neuspesno uradjen.", "izmena neuspesno uradjen", 1);
							//System.out.println("Izmena je neuspesno uradjena.");
						}

					}else {

						JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
					}


				}else {
					JOptionPane.showMessageDialog(null, "Unos mora biti samo broj", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
		btnNewButton_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_2.setToolTipText("Izmena jedne instance liste podataka na osnovu proslednjenog imena i prezimena.");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Nulliranje");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firma.loadCena("cene.txt");
				
				String id = textField_0.getText().trim();
				
				if (Mwain.isNumber(id)== true) {
					
					int IdX = Integer.parseInt(id);
					double dug = 0.0;
					double placeno = 0.0;
					double trenutnoStanje = 0.0;
					
					Cena cena = new Cena(IdX, dug, placeno, trenutnoStanje);
					Cena cena2 = firma.nuliranjeCeneID(cena);
					if (cena2 != null) {
						JOptionPane.showMessageDialog(null, "Nuliranje je uspesno uradjeno !", "Operacija ok.", 1);
						System.out.println("Izmena je uspesno uradjena.");
					}else {
						JOptionPane.showMessageDialog(null, "Nuliranje je neuspesno uradjeno proverite ID !", "Greska pri unosu.", 1);
						System.out.println("Izmena je nespesno uradjena.");
					}
					
				} else {
					
					JOptionPane.showMessageDialog(null, "ID moze biti samo broj ! bez decimala !", "Greska pri unosu.", 1);

				}
				
				
			}
		});
		btnNewButton_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_3.setToolTipText("Stavljanje vrednosti na 0 na osnovu identifikacionog broja ID ( broj kartona).");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(208, 171, 192, 135);
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnListaSvihCena = new JButton("Lista svih cena");
		btnListaSvihCena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Console console = new Console();
				console.init();
				firma.lstCena();
				
			}
		});
		btnListaSvihCena.setToolTipText("Lista svih podataka iz klase cene.");
		btnListaSvihCena.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnListaSvihCena = new GridBagConstraints();
		gbc_btnListaSvihCena.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListaSvihCena.insets = new Insets(0, 0, 5, 0);
		gbc_btnListaSvihCena.gridx = 0;
		gbc_btnListaSvihCena.gridy = 0;
		panel_2.add(btnListaSvihCena, gbc_btnListaSvihCena);
		
		JButton btnListaCenaId = new JButton("Lista cena ID");
		btnListaCenaId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = textField_0.getText().trim();
				if (Mwain.isNumber(id)== true) {
					
					int idX = Integer.parseInt(id);
					Console console = new Console();
					console.init();
					firma.lstCenaI(idX);
					
				} else {
					
					JOptionPane.showMessageDialog(null, "ID moze biti samo broj", "GRESKA PRI PARSIRANJU !", 1);
					
				}
				
			}
		});
		btnListaCenaId.setToolTipText("Lista cena po Identifikatoru - preporuceno");
		btnListaCenaId.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnListaCenaId = new GridBagConstraints();
		gbc_btnListaCenaId.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListaCenaId.insets = new Insets(0, 0, 5, 0);
		gbc_btnListaCenaId.gridx = 0;
		gbc_btnListaCenaId.gridy = 1;
		panel_2.add(btnListaCenaId, gbc_btnListaCenaId);
		
		JButton btnListaIme = new JButton("Lista Ime & Prezime");
		btnListaIme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();
				
				Console console = new Console();
				console.init();
				firma.lstCenaImePrezime(ime, prezime);
				
			}
		});
		btnListaIme.setToolTipText("Lista cena po imenu i prezimenu");
		btnListaIme.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnListaIme = new GridBagConstraints();
		gbc_btnListaIme.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListaIme.insets = new Insets(0, 0, 5, 0);
		gbc_btnListaIme.gridx = 0;
		gbc_btnListaIme.gridy = 2;
		panel_2.add(btnListaIme, gbc_btnListaIme);
		
		JButton btnBrisanjeI = new JButton("Brisanje ID");
		btnBrisanjeI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = textField_0.getText().trim();
				
				if (Mwain.isNumber(id)== true) {
					
					int idC = Integer.parseInt(id);
					
					Console console = new Console();
					console.init();
					Cena provera = firma.cenaBrisanjeID(idC);
					if (provera == null) {
						JOptionPane.showMessageDialog(null, "ID ne postoji u listi podataka", "GRESKA PRI UNOSU !", 1);
						System.out.println("Zadati broj ne postoji u listi.");
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "ID moze biti samo broj", "GRESKA PRI UNOSU !", 1);
				}
			}
		});
		btnBrisanjeI.setToolTipText("Brisanje jedne instance podataka po identifikatoru");
		btnBrisanjeI.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		GridBagConstraints gbc_btnBrisanjeI = new GridBagConstraints();
		gbc_btnBrisanjeI.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBrisanjeI.insets = new Insets(0, 0, 5, 0);
		gbc_btnBrisanjeI.gridx = 0;
		gbc_btnBrisanjeI.gridy = 3;
		panel_2.add(btnBrisanjeI, gbc_btnBrisanjeI);
		
		JLabel labelMoney = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/money3.png")).getImage();     // this code is usefull copy it latter
		labelMoney.setIcon(new ImageIcon(img1));
		labelMoney.setBounds(406, 10, 386, 296);
		contentPane.add(labelMoney);
	}
}
