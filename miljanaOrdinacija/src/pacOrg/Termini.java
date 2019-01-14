package pacOrg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import pacOrg.FrameX.Console;

import java.awt.Panel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;

public class Termini extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4953548899717473045L;
	private JPanel contentPane;
	private JTextField textField_0int;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3int;
	private JTextField textField_4int;
	private JTextField textField_5;
	
	public Firma firma = new Firma();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Termini frame = new Termini();
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
	public Termini() {
		setTitle("Zakazivanje termina");
		setBounds(100, 100, 474, 228);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(10, 10, 182, 169);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("Unos podataka");
		btnNewButton.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firma.loadTermini("termini.txt");
				
				String id = textField_0int.getText().trim();
				
				if (Mwain.isNumber(id)== true) {
					
					int idX = Integer.parseInt(id);
					
					String vremePocetno = textField_3int.getText().trim();
					if (Mwain.isNumber(vremePocetno)== true) {
						
						int vremePocetnoX = Integer.parseInt(vremePocetno);
						
						String vremeKrajnje = textField_4int.getText().trim();
						if (Mwain.isNumber(vremeKrajnje)== true) {
							
							int vremekranjeX = Integer.parseInt(vremeKrajnje);
							
							String ime = textField_1.getText().trim();
							String prezime = textField_2.getText().trim();
							String datum = textField_5.getText().trim();
							
							TerminiOrd ord = new TerminiOrd(idX, ime, prezime, vremePocetnoX, vremekranjeX, datum);
							
							boolean provera = firma.dodavanjeTermina(ord);
							if (provera) {
								//JOptionPane.showMessageDialog(null, "Pacijent je uspesno unet u listu.");
								JOptionPane.showMessageDialog(null, "Pacijent je uspesno unet u listu.", "Operacija uspesno izvrsena. !", 1);
								
							}else {
								JOptionPane.showMessageDialog(null, "Pacijent nije uspesno unet u listu.", "Operacija neuspesno izvrsena. !", 1);
								//JOptionPane.showMessageDialog(null, "Pacijent nije uspesno unet u listu.");
								
							}
							
						} else {
							JOptionPane.showMessageDialog(null, "Ovde mozete uneti samo broj !", "Greska pri unosu !", 1);

						}
						
						
					} else {
						JOptionPane.showMessageDialog(null, "Ovde mozete uneti samo broj !", "Greska pri unosu !", 1);
					}
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Ovde mozete uneti samo broj !", "Greska pri unosu !", 1);
				}
				
				
			}
		});
		btnNewButton.setToolTipText("Unos svih podataka iz tabele.");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lista Svih P");
		btnNewButton_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Console console = new Console();
				//console.init();
				//firma.loadTermini("termini.txt");
				ConsoleX consoleX = new ConsoleX();
				consoleX.init();
				firma.lstTermina();
			}
		});
		btnNewButton_1.setToolTipText("lista svih unetih podataka iz liste termina.");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lista Ime&Prez");
		btnNewButton_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();
				ConsoleX consoleX = new ConsoleX();
				consoleX.init();
				firma.lstImePrezimeTermini(ime, prezime);
				
				
			}
		});
		btnNewButton_2.setToolTipText("lista svih unetih podataka iz liste termina sa ovim imenom i prezimenom.");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Brisanje po ID");
		btnNewButton_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_3.setToolTipText("Brisanje jedne instance podataka po ID");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firma.loadTermini("termini.txt");

				String idX = null;
				idX = textField_0int.getText().trim();


				if (Mwain.isNumber(idX)) {
					int id = Integer.parseInt(idX);
					TerminiOrd provera = firma.TerminBrisanjeID(id);
					if (provera == null) {
						JOptionPane.showMessageDialog(null, "Zadati broj ne postoji u listi", "GRESKA PRI UNOSU !", 1);
					}else {
						JOptionPane.showMessageDialog(null, "Brisanje preko ID je uspesno uradjeno", "Ok operacija izvrsena.", 1);
					}

				}else {
					JOptionPane.showMessageDialog(null, "Morate uneti validan broj.", "GRESKA PRI UNOSU !", 1);
				}

				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Brisanje Ime&prez");
		btnNewButton_4.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		btnNewButton_4.setToolTipText("Brisanje jedne instance podataka po imenu i prezimenu.");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ime = textField_1.getText().trim();
				String prezime = textField_2.getText().trim();
				
				firma.TerminBrisanjeImePrezime(ime, prezime);
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 4;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(198, 10, 257, 169);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Broj redosleda");
		lblNewLabel.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_0int = new JTextField();
		textField_0int.setToolTipText("Polje ocekuje int broj");
		GridBagConstraints gbc_textField_0int = new GridBagConstraints();
		gbc_textField_0int.insets = new Insets(0, 0, 5, 0);
		gbc_textField_0int.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_0int.gridx = 3;
		gbc_textField_0int.gridy = 0;
		panel_1.add(textField_0int, gbc_textField_0int);
		textField_0int.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ime");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("polje ocekuje String bilo sta");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prezime");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("polje ocekuje String bilo sta");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Vreme Pocetno");
		lblNewLabel_3.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3int = new JTextField();
		textField_3int.setToolTipText("Polje ocekuje int broj");
		GridBagConstraints gbc_textField_3int = new GridBagConstraints();
		gbc_textField_3int.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3int.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3int.gridx = 3;
		gbc_textField_3int.gridy = 3;
		panel_1.add(textField_3int, gbc_textField_3int);
		textField_3int.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vreme Kranje");
		lblNewLabel_4.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4int = new JTextField();
		textField_4int.setToolTipText("Polje ocekuje int broj");
		GridBagConstraints gbc_textField_4int = new GridBagConstraints();
		gbc_textField_4int.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4int.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4int.gridx = 3;
		gbc_textField_4int.gridy = 4;
		panel_1.add(textField_4int, gbc_textField_4int);
		textField_4int.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Datum");
		lblNewLabel_5.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_5.gridwidth = 3;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Polje ocekuje int broj");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 5;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
	}
	
	
	class ConsoleX {

		final JFrame frame = new JFrame();
		public ConsoleX() {
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
			frame.setSize(840, 400);
			frame.setVisible(true);
		}
		public JFrame geJframe() {
			return frame;
		}

	}

	

}
