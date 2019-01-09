package javaprog;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Console {

	final JFrame frame = new JFrame();

	public Console() {
		JTextArea textArea = new JTextArea(24, 80);
		textArea.setBackground(Color.white);
		textArea.setForeground(Color.black);
		textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		textArea.setOpaque(true);
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
		frame.setSize(1600, 600);
		frame.setVisible(true);
		frame.setResizable(true);
	}

	public JFrame geJframe() {
		return frame;
	}

}
