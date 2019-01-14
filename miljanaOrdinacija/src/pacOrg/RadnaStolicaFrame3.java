package pacOrg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class RadnaStolicaFrame3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3244858851595117191L;
	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtGornjiLevi;
	private JTextField txtGornjiDesni;
	private JTextField txtBellowLEft;
	private JTextField txtBellowRight;


	public Firma firma = new Firma();
	public Mwain mwain = new Mwain();
	private JTextField textFieldDatum;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadnaStolicaFrame3 frame = new RadnaStolicaFrame3();
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
	public RadnaStolicaFrame3() {
		setTitle("Frame Radna Stolica 3");
		setBounds(100, 100, 689, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 304, 229);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Broj Operacije");
		lblNewLabel.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel.setToolTipText("Broj redosleda operacije koja se izvrsava.");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textField_0 = new JTextField();
		textField_0.setToolTipText("int = unos moze biti samo broj ! bez decimala !");
		GridBagConstraints gbc_textField_0 = new GridBagConstraints();
		gbc_textField_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_0.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_0.gridx = 4;
		gbc_textField_0.gridy = 0;
		panel.add(textField_0, gbc_textField_0);
		textField_0.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ime i Prezime");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_1.setToolTipText("Ime i prezime pacijenta na kome se radi sve u istom polju.");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Pocetno vreme");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_2.setToolTipText("Vreme pocetka operacije.");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Krajnje vreme");
		lblNewLabel_3.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_3.setToolTipText("Krajnje vreme operacije koja se izvrsava.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Gornji Levi Zubi");
		lblNewLabel_4.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_4.setToolTipText("Unos onoga sto se radilo na njima.");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		txtGornjiLevi = new JTextField();
		txtGornjiLevi.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_txtGornjiLevi = new GridBagConstraints();
		gbc_txtGornjiLevi.insets = new Insets(0, 0, 5, 0);
		gbc_txtGornjiLevi.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGornjiLevi.gridx = 4;
		gbc_txtGornjiLevi.gridy = 4;
		panel.add(txtGornjiLevi, gbc_txtGornjiLevi);
		txtGornjiLevi.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Gornji Desni Zubi");
		lblNewLabel_5.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_5.setToolTipText("Unos onoga sto se radilo na njima.");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 4;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		txtGornjiDesni = new JTextField();
		txtGornjiDesni.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_txtGornjiDesni = new GridBagConstraints();
		gbc_txtGornjiDesni.insets = new Insets(0, 0, 5, 0);
		gbc_txtGornjiDesni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGornjiDesni.gridx = 4;
		gbc_txtGornjiDesni.gridy = 5;
		panel.add(txtGornjiDesni, gbc_txtGornjiDesni);
		txtGornjiDesni.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Donji Levi Zubi");
		lblNewLabel_6.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_6.setToolTipText("Unos onoga sto se radilo na njima.");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 4;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		txtBellowLEft = new JTextField();
		txtBellowLEft.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_txtBellowLEft = new GridBagConstraints();
		gbc_txtBellowLEft.insets = new Insets(0, 0, 5, 0);
		gbc_txtBellowLEft.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBellowLEft.gridx = 4;
		gbc_txtBellowLEft.gridy = 6;
		panel.add(txtBellowLEft, gbc_txtBellowLEft);
		txtBellowLEft.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Donji Desni Zubi");
		lblNewLabel_7.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		lblNewLabel_7.setToolTipText("Unos onoga Sto se radilo na njima.");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridwidth = 4;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		txtBellowRight = new JTextField();
		txtBellowRight.setToolTipText("String = Unos moze biti bilo sta.");
		GridBagConstraints gbc_txtBellowRight = new GridBagConstraints();
		gbc_txtBellowRight.insets = new Insets(0, 0, 5, 0);
		gbc_txtBellowRight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBellowRight.gridx = 4;
		gbc_txtBellowRight.gridy = 7;
		panel.add(txtBellowRight, gbc_txtBellowRight);
		txtBellowRight.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Datum operacije");
		lblNewLabel_8.setFont(new Font("MS Gothic", Font.ITALIC, 14));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.gridwidth = 4;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textFieldDatum = new JTextField();
		GridBagConstraints gbc_textFieldDatum = new GridBagConstraints();
		gbc_textFieldDatum.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDatum.gridx = 4;
		gbc_textFieldDatum.gridy = 8;
		panel.add(textFieldDatum, gbc_textFieldDatum);
		textFieldDatum.setColumns(10);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(10, 245, 205, 108);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JButton btnNewButton = new JButton("Unos podataka");
		btnNewButton.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firma.loadStolica("radnaStolica3.txt");
				firma.loadHistoriat("Historiat.txt");
				
				String imeDoktora = textField_1.getText().trim();
				String vremePocetno = textField_2.getText().trim();
				String vremeKranje = textField_3.getText().trim();
				String gornjiLevi = txtGornjiLevi.getText().trim();
				String gornjiDesni = txtGornjiDesni.getText().trim();
				String DonjiL1 = txtBellowLEft.getText().trim();
				String DonjiL2 = txtBellowRight.getText().trim();
				String Datum = textFieldDatum.getText().trim();

				String id = textField_0.getText().trim();
				if (Mwain.isNumber(id)== true) {

					int idX = Integer.parseInt(id);
					

					RadnaStolica radnaStolica = new RadnaStolica(idX, imeDoktora, vremePocetno, vremeKranje,
							gornjiLevi, gornjiDesni, DonjiL1, DonjiL2);
					
					Historiat historiat = new Historiat(idX, imeDoktora, gornjiLevi, gornjiDesni,
							DonjiL1, DonjiL2, Datum);
					
					
					
					boolean provera = firma.dodavanjeStolice3(radnaStolica);
					if (provera) {
						JOptionPane.showMessageDialog(null, "Unos podataje je uspesno uradjen.", "Unos uspesno izvrsen", 1);
						firma.dodavanjeHistoriata(historiat);
						//System.out.println("Unos podataje je uspesno uradjen.");
					}else {
						JOptionPane.showMessageDialog(null, "Unos podataje je neuspesno uradjen.", "Unos neuspesno izvrsen", 1);
						//System.out.println("Unos podataka je nesupesno uradjen.");
					}
					
					


				}else {

					JOptionPane.showMessageDialog(null, "Id mora biti broj ! bez decimala !", "GRESKA PRI UNOSU !", 1);

				}

			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Brisanje ID - 1 instanca");
		btnNewButton_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				firma.loadStolica("radnaStolica3.txt");

				String id = textField_0.getText().trim();

				if (Mwain.isNumber(id)== true) {

					int idX = Integer.parseInt(id);

					RadnaStolica provera = firma.stolicaBrisanjeID3(idX);
					if (provera == null) {
						JOptionPane.showMessageDialog(null, "Unet ID broj se ne nalazi u listi.", "GRESKA PRI UNOSU !", 1);
						//System.out.println("Zadati broj ne postoji u listi.");
					}else {
						JOptionPane.showMessageDialog(null, "Brisanje jedne instance po ID je uspesno izvrseno.", "Brisanje uspesno uradjeno", 1);
					}

				} else {
					JOptionPane.showMessageDialog(null, "ID mora biti broj ! bez decimala !", "GRESKA PRI UNOSU !", 1);
				}

			}
		});
		btnNewButton_1.setToolTipText("Brisanje jedne grupe podataka preko Identifikatora");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Brisanje SVIH podataka");
		btnNewButton_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firma.brisanjeSvihP3();
				JOptionPane.showMessageDialog(null, "Brisanje svih podataka je uspesno uradjeno", "SVI PODACI LISTE SU OBRISANI !", 1);
				
			}
		});
		btnNewButton_2.setToolTipText("Brise sve podatke iz liste podataka za radnu stolicu  - pritisnuti samo kada zelite ociscenu listu !");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Lista Svih podataka");
		btnNewButton_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Console console = new Console();
				console.init();
				firma.lstStolica3();
				
			}
		});
		btnNewButton_3.setToolTipText("Prikaz svih unetih podataka za dan");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JLabel lblWorkDay = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/workday3.png")).getImage();     // this code is usefull copy it latter
		lblWorkDay.setIcon(new ImageIcon(img1));
		lblWorkDay.setBounds(320, 10, 344, 195);
		contentPane.add(lblWorkDay);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(221, 245, 47, 108);
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnNewButton_4 = new JButton("?");
		btnNewButton_4.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcija 1 - unos korisnika ocekuje sve podatke u tabeli iznad.", "The Help Me BUTTON :)", 1);
			}
		});
		btnNewButton_4.setToolTipText("Its the help me button !");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 0;
		panel_2.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("?");
		btnNewButton_5.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcija 2 - Brisanje jedne instance podataka ocekuje ID u tabeli iznad za pretragu i brisanje", "The Help Me BUTTON :)", 1);
			}
		});
		btnNewButton_5.setToolTipText("Its the help me button !");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 1;
		panel_2.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("?");
		btnNewButton_6.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcija 3 - Ne ocekuje nista opasno dugme brise sve podatke iz liste podataka, pritisnuti na kraju ili pocetku radnog dana kada vam treba prazna lista !", "The Help Me BUTTON :)", 1);
			}
		});
		btnNewButton_6.setToolTipText("Its the help me button !");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 0;
		gbc_btnNewButton_6.gridy = 2;
		panel_2.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("?");
		btnNewButton_7.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcija 4 - Lista svih podataka ne ocekuje nista.", "The Help Me BUTTON :)", 1);
			}
		});
		btnNewButton_7.setToolTipText("Its the help me button !");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 3;
		panel_2.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JLabel label = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/cogs5.gif")).getImage();     // this code is usefull copy it latter
		label.setIcon(new ImageIcon(img2));
		label.setBounds(320, 245, 344, 101);
		contentPane.add(label);
	}
}
