package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmKalkulatorTroskova;
	private JTextField textDug;
	private JTextField textPlaćeno;
	private JTextField txtNaziv;
	private JTextField textKamata;
	private JLabel lblNewLabel_1;
	private JLabel lblloadIndicator;
	private Panel panel_1;
	private Panel panel_2;
	private JButton btnNewButton;
	private JButton btnIzmenaPodataka;
	private JButton btnBrisanje;
	private JButton btnBrisanjesvih;
	private Panel panel_3;
	private JButton btnListaSvihP;
	private JButton btnListaNazi;
	private JButton btnListaDatum;
	private JButton btnAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmKalkulatorTroskova.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKalkulatorTroskova = new JFrame();
		frmKalkulatorTroskova.setResizable(false);
		frmKalkulatorTroskova.setBackground(Color.LIGHT_GRAY);
		frmKalkulatorTroskova.setFont(new Font("MS Gothic", Font.ITALIC, 13));
		frmKalkulatorTroskova.setForeground(Color.LIGHT_GRAY);
		frmKalkulatorTroskova.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		frmKalkulatorTroskova.setTitle("Kalkulator Tro\u0161kova");
		frmKalkulatorTroskova.setBounds(100, 100, 467, 208);
		frmKalkulatorTroskova.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulatorTroskova.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setFont(new Font("Bahnschrift", Font.ITALIC, 12));
		panel.setBounds(0, 0, 213, 133);
		frmKalkulatorTroskova.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Naziv Tro\u0161ka");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 6, 73, 16);
		panel.add(lblNewLabel);
		
		JLabel lblDug = new JLabel("Dug");
		lblDug.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblDug.setBounds(10, 39, 73, 16);
		panel.add(lblDug);
		
		JLabel lblPlaceno = new JLabel("Pla\u0107eno");
		lblPlaceno.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblPlaceno.setBounds(10, 72, 73, 16);
		panel.add(lblPlaceno);
		
		JLabel lblKamata = new JLabel("Kamata");
		lblKamata.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblKamata.setBounds(10, 105, 73, 16);
		panel.add(lblKamata);
		
		textDug = new JTextField();
		textDug.setToolTipText("Očekuje broj ili decimalni broj");
		textDug.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblDug.setLabelFor(textDug);
		textDug.setBounds(111, 33, 96, 28);
		panel.add(textDug);
		textDug.setColumns(10);
		
		textPlaćeno = new JTextField();
		textPlaćeno.setToolTipText("Očekuje broj ili decimalni broj");
		textPlaćeno.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblPlaceno.setLabelFor(textPlaćeno);
		textPlaćeno.setColumns(10);
		textPlaćeno.setBounds(111, 66, 96, 28);
		panel.add(textPlaćeno);
		
		txtNaziv = new JTextField();
		txtNaziv.setToolTipText("Očekuje slova bez znakova ili brojeva");
		txtNaziv.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblNewLabel.setLabelFor(txtNaziv);
		txtNaziv.setColumns(10);
		txtNaziv.setBounds(111, 0, 96, 28);
		panel.add(txtNaziv);
		
		textKamata = new JTextField();
		textKamata.setToolTipText("Očekuje broj ili decimalni broj");
		textKamata.setFont(new Font("MS Gothic", Font.ITALIC, 12));
		lblKamata.setLabelFor(textKamata);
		textKamata.setColumns(10);
		textKamata.setBounds(111, 99, 96, 28);
		panel.add(textKamata);
		
		panel_1 = new Panel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 139, 213, 42);
		frmKalkulatorTroskova.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Load Indicator");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1.setBounds(6, 6, 94, 29);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		
		lblloadIndicator = new JLabel("");
		lblloadIndicator.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblloadIndicator.setBounds(106, 6, 101, 29);
		panel_1.add(lblloadIndicator);
		
		panel_2 = new Panel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(219, 0, 118, 133);
		frmKalkulatorTroskova.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton = new JButton("Unos Podataka");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnNewButton.setToolTipText("Očekuje sva četiri polja uneta");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton.setBounds(0, 0, 118, 28);
		panel_2.add(btnNewButton);
		
		btnIzmenaPodataka = new JButton("Izmena");
		btnIzmenaPodataka.setToolTipText("Očekuje sva četiri polja uneta");
		btnIzmenaPodataka.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnIzmenaPodataka.setBounds(0, 33, 118, 28);
		panel_2.add(btnIzmenaPodataka);
		
		btnBrisanje = new JButton("Brisanje");
		btnBrisanje.setToolTipText("Očekuje nazi troska za pretragu i brisanje");
		btnBrisanje.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnBrisanje.setBounds(0, 66, 118, 28);
		panel_2.add(btnBrisanje);
		
		btnBrisanjesvih = new JButton("BrisanjeSvih");
		btnBrisanjesvih.setToolTipText("Ne očekuje nista opasno dugme ne pritisni ako nisi sigurna da  ovo hoces");
		btnBrisanjesvih.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnBrisanjesvih.setBounds(0, 99, 118, 28);
		panel_2.add(btnBrisanjesvih);
		
		panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(343, 0, 118, 133);
		frmKalkulatorTroskova.getContentPane().add(panel_3);
		
		btnListaSvihP = new JButton("Lista Svih P");
		btnListaSvihP.setToolTipText("Ne očekuje ništa");
		btnListaSvihP.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnListaSvihP.setBounds(0, 0, 118, 28);
		panel_3.add(btnListaSvihP);
		
		btnListaNazi = new JButton("Lista Naziv");
		btnListaNazi.setToolTipText("Očekuje naziv troska");
		btnListaNazi.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnListaNazi.setBounds(0, 33, 118, 28);
		panel_3.add(btnListaNazi);
		
		btnListaDatum = new JButton("Lista Datum");
		btnListaDatum.setToolTipText("Ocekuje datum u formatu \"dd.MM.yyyy.\" u text polju naziv troska");
		btnListaDatum.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnListaDatum.setBounds(0, 66, 118, 28);
		panel_3.add(btnListaDatum);
		
		btnAbout = new JButton("About");
		btnAbout.setToolTipText("Čisto informativno dugme :)");
		btnAbout.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Made by Marko Dunovic", "About button", 1);
			}
		});
		btnAbout.setBounds(0, 99, 118, 28);
		panel_3.add(btnAbout);
	}
}
