import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JTextArea;

public class PrintBill {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintBill window = new PrintBill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public PrintBill() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("book store bill");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(90, 26, 204, 69);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1_1_2 = new JLabel(
				"----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(-34, 23, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel(
				"----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(-62, 75, 597, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(26, 105, 455, 472);
		frame.getContentPane().add(textArea);

		JLabel lblNewLabel_1_1_2_2 = new JLabel(
				"----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(-82, 587, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_2);
		frame.setBounds(100, 100, 532, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String content = new String(Files.readAllBytes(Paths.get("F://java PROJECT/f2.txt")));

		textArea.setText(content);

	}

	public void setVisible(boolean b) throws IOException {
		// TODO Auto-generated method stub
		PrintBill window = new PrintBill();
		window.frame.setVisible(true);
		
	}
}