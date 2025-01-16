package com.Anass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField tx1;
	private JTextField tx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome App\r\n");
		lblNewLabel.setBounds(160, 10, 235, 72);
		lblNewLabel.setFont(new Font("Simplified Arabic", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Frist Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(35, 188, 120, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(35, 254, 120, 72);
		contentPane.add(lblNewLabel_2);
		
		tx1 = new JTextField();
		tx1.setBounds(175, 200, 220, 30);
		contentPane.add(tx1);
		tx1.setColumns(10);
		
		tx2 = new JTextField();
		tx2.setBounds(175, 279, 220, 30);
		contentPane.add(tx2);
		tx2.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Lname = tx1.getText();
				String Sname = tx2.getText();
				if(Lname.equals("Anass")  && Sname.equals("Cheab")) {
					JOptionPane.showMessageDialog(null , "Welcome User");
				}else {
					JOptionPane.showMessageDialog(null , "Sorry try agin");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(293, 378, 109, 30);
		contentPane.add(btnNewButton);
	}
}
