import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;

public class Users extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users frame = new Users();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Users() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 719, 37);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Book Store Mangement Software");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 35, 455);
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(704, 0, 35, 455);
		panel_1_1.setBackground(Color.GRAY);
		contentPane.add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 418, 719, 37);
		panel_2.setBackground(Color.GRAY);
		contentPane.add(panel_2);
		
		JLabel users = new JLabel("Users");
		users.setBounds(251, 48, 64, 23);
		users.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		contentPane.add(users);
		
		JLabel books = new JLabel("Books");
		books.setBounds(399, 48, 64, 23);
		books.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		contentPane.add(books);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(251, 70, 64, 10);
		panel_3.setBackground(Color.GRAY);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(399, 70, 64, 10);
		panel_3_1.setBackground(Color.GRAY);
		contentPane.add(panel_3_1);
		
		JButton btnNewButton = new JButton("Manage Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddBook b= new AddBook();
			    b.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(45, 152, 313, 123);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print Bill");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill window = new Bill();
				window.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(381, 152, 313, 123);
		contentPane.add(btnNewButton_1);
		
		JButton btnBookRecord = new JButton("BOOK RECORD");
		btnBookRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Output O = null;
				try {
					O = new Output();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					O.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBookRecord.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 18));
		btnBookRecord.setBounds(227, 284, 313, 123);
		contentPane.add(btnBookRecord);
	}
}
