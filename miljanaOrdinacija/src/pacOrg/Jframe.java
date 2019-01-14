package pacOrg;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Jframe extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7727598134207089557L;

	public Firma firma = new Firma();
	public Mwain mwain = new Mwain();
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
	
	

	public Firma getFirma() {
		return firma;
	}

	public void setFirma(Firma firma) {
		this.firma = firma;
	}

	public Mwain getMwain() {
		return mwain;
	}

	public void setMwain(Mwain mwain) {
		this.mwain = mwain;
	}

	public static void main(String[] args) {
		Console console = new Console();
		console.init();
		Jframe launcher = new Jframe();
		launcher.setVisible(true);
		console.getFrame().setLocation(
				launcher.getX() + launcher.getWidth() + launcher.getInsets().right,
				launcher.getY());
	}

	private Jframe() {
		super();
		setSize(600, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firma.lstStolica();

			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		getContentPane().add(btnNewButton);
	}
}

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
		frame.add(textArea);
		frame.add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
	            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
	}
	public void init() {
		frame.pack();
		frame.setSize(1300, 400);
		frame.setVisible(true);
	}
	public JFrame getFrame() {
		return frame;
	}
}