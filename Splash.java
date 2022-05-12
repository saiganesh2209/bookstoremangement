import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Font;

public class Splash extends JFrame {

	private JPanel contentPane;
	private javax.swing.JProgressBar progressBar;
	private javax.swing.JLabel percent;
	private javax.swing.JLabel loading;
	private javax.swing.JLabel name;
	private javax.swing.JLabel image;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Splash Mysplash = new Splash();
				Mysplash.setVisible(true);
				try {
					 for(int i=0;i<=100;i++) {
						 Thread.sleep(60000);
						 Mysplash.progressBar.setValue(i);
						 Mysplash.percent.setText(Integer.toString(i )+"%"); 
					 }
				}catch (Exception e) {
					  }
                new Login();
                Mysplash.dispose();
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel image = new JLabel("New label");
		image.setFont(new Font("Tahoma", Font.PLAIN, 15));
		image.setIcon(new ImageIcon("F:\\java PROJECT\\images.jpeg"));
		image.setBounds(253, 134, 226, 144);
		panel.add(image);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setBounds(0, 427, 715, 14);
		panel.add(progressBar);
		
		JLabel name = new JLabel("Book Store Management System");
		name.setFont(new Font("Source Code Pro", Font.BOLD, 18));
		name.setBounds(189, 61, 343, 28);
		panel.add(name);
		
		JLabel loading = new JLabel("Loading ");
		loading.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
		loading.setBounds(10, 402, 56, 28);
		panel.add(loading);
		
		JLabel percent = new JLabel("%");
		percent.setBounds(76, 409, 46, 14);
		panel.add(percent);
	}

	public javax.swing.JLabel getLoading() {
		return loading;
	}

	public void setLoading(javax.swing.JLabel loading) {
		this.loading = loading;
	}
}
