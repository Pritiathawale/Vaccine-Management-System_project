package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Dimension;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.util.regex.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel nlab;
	private final JButton btnNewButton = new JButton("Register");

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 900);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(32767, 42777));
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 680, 120);
		panel.setBackground(Color.RED);
		contentPane.add(panel);
		
		JLabel Title = new JLabel("Registration Page");
		Title.setBackground(Color.ORANGE);
		Title.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(Title);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PATTERN ="^[a-zA-Z] {5,30}$";
				Pattern patt=Pattern.compile(PATTERN);
				Matcher match=patt.matcher(textField.getText());
				if(!match.matches()) {
					nlab.setText("Invalid Name");
				}
				else {
					nlab.setText(null);
				}
					
			}
		});
		textField.setBounds(292, 157, 160, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(292, 206, 160, 38);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(292, 255, 160, 38);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(292, 304, 160, 38);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(292, 353, 160, 38);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
	
		JRadioButton Text = new JRadioButton("Male");
		Text.setBounds(300, 561, 111, 45);
		Text.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(Text);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(430, 561, 111, 45);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(rdbtnFemale);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(334, 627, 301, 106);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(162, 166, 92, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setBounds(153, 215, 117, 14);
		lblMiddleName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(156, 267, 92, 14);
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblLastName);
		
		JLabel lblName = new JLabel("Phone No:");
		lblName.setBounds(162, 316, 86, 14);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email Id:");
		lblEmailId.setBounds(162, 365, 86, 14);
		lblEmailId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblEmailId);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setBounds(162, 414, 86, 14);
		lblDob.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(168, 575, 86, 14);
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(168, 668, 86, 14);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblAddress);
		btnNewButton.setBounds(184, 766, 179, 41);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Reset");
		btnNext.setBounds(442, 766, 179, 41);
		btnNext.setBackground(new Color(255, 0, 0));
		btnNext.setBorderPainted(false);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnNext);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(292, 401, 205, 153);
		contentPane.add(calendar_1);
		
		JLabel nlab = new JLabel("");
		nlab.setBackground(Color.BLACK);
		nlab.setFont(new Font("Tahoma", Font.BOLD, 14));
		nlab.setBounds(490, 169, 131, 14);
		contentPane.add(nlab);
		setUndecorated(true);
	}
}
