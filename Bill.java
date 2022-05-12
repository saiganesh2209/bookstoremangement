import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Bill {

	private JFrame frame;
	private JTextField one;
	private JTextField two;
	private JTextField three;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill window = new Bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setFont(new Font("Source Code Pro", Font.BOLD, 14));
		lblNewLabel.setBounds(64, 96, 76, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBookPrice = new JLabel("Book Price");
		lblBookPrice.setFont(new Font("Source Code Pro", Font.BOLD, 14));
		lblBookPrice.setBounds(64, 148, 94, 14);
		frame.getContentPane().add(lblBookPrice);
		
		JLabel lblBookType = new JLabel("Book Type");
		lblBookType.setFont(new Font("Source Code Pro", Font.BOLD, 14));
		lblBookType.setBounds(64, 194, 86, 14);
		frame.getContentPane().add(lblBookType);
		
		one = new JTextField();
		//one.setText("NAME");
		one.setBounds(207, 94, 94, 20);
		frame.getContentPane().add(one);
		one.setColumns(10);
		
		two = new JTextField();
		//two.setText("PRICE");
		two.setColumns(10);
		two.setBounds(207, 145, 94, 20);
		frame.getContentPane().add(two);
		
		three = new JTextField();
		//three.setText("TYPE");
		three.setColumns(10);
		three.setBounds(207, 192, 94, 20);
		frame.getContentPane().add(three);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String name = one.getText();
					String price = two.getText();
					String type = three.getText();
					File file = new File("F://java PROJECT/f2.txt");
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Book Name : "); 	bw.write(name); bw.write("\r\n");
					bw.write("Book Price: "); 	bw.write(price); bw.write("\r\n");
					bw.write("Book Type : "); 	bw.write(type); bw.write("\r\n");
					bw.write("Total Cost:");    bw.write(price); bw.write("\r\n");
					bw.write("------------------------------------------------------");
					bw.write("\r\n");
					bw.close();
					fw.close();
				}catch(Exception e1){
				}
				PrintBill p = null;
				try {
					p = new PrintBill();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					p.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(212, 273, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Users frame = new Users();
				frame.setVisible(true);
			}
		});
		btnBack.setBounds(422, 273, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\java PROJECT\\download.png"));
		lblNewLabel_1.setBounds(378, 25, 223, 218);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 675, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
			Bill window = new Bill();
			window.frame.setVisible(true);
		 
		
		
	}
}
