import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JTextArea;

public class Output {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output window = new Output();
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
	public Output() throws IOException {
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

		JLabel lblNewLabel = new JLabel("Books Record");
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
		lblNewLabel_1_1_2_1.setBounds(-62, 75, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 105, 498, 472);
		frame.getContentPane().add(textArea);

		JLabel lblNewLabel_1_1_2_2 = new JLabel(
				"----------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(-82, 587, 569, 13);
		frame.getContentPane().add(lblNewLabel_1_1_2_2);
		frame.setBounds(100, 100, 538, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String content = new String(Files.readAllBytes(Paths.get("F://java PROJECT/f1.txt")));

		textArea.setText(content);

	}

	public void setVisible(boolean b) throws IOException {
		// TODO Auto-generated method stub
		Output O= new Output();
		O.frame.setVisible(true);
	 
		
	}
}