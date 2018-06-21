package Library_management;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class forth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblGender;
	private JLabel lblAddress;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forth frame = new forth();
					frame.setTitle("Library Management System");
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
	public forth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No.:");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		comboBox_1.addItem("6");
		comboBox_1.addItem("7");
		comboBox_1.addItem("8");
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		comboBox_1.addItem("12");
		comboBox_1.addItem("13");
		comboBox_1.addItem("14");
		comboBox_1.addItem("15");
		comboBox_1.addItem("16");
		comboBox_1.addItem("17");
		comboBox_1.addItem("18");
		comboBox_1.addItem("19");
		comboBox_1.addItem("20");
		comboBox_1.addItem("21");
		comboBox_1.addItem("22");
		comboBox_1.addItem("23");
		comboBox_1.addItem("24");
		comboBox_1.addItem("25");
		comboBox_1.addItem("26");
		comboBox_1.addItem("27");
		comboBox_1.addItem("28");
		comboBox_1.addItem("29");
		comboBox_1.addItem("30");
		comboBox_1.addItem("31");
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("1");
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		comboBox_2.addItem("5");
		comboBox_2.addItem("6");
		comboBox_2.addItem("7");
		comboBox_2.addItem("8");
		comboBox_2.addItem("9");
		comboBox_2.addItem("10");
		comboBox_2.addItem("11");
		comboBox_2.addItem("12");
		
		
		JComboBox comboBox_3 = new JComboBox();
		
		comboBox_3.addItem("2010");
		comboBox_3.addItem("2011");
		comboBox_3.addItem("2012");
		comboBox_3.addItem("2013");
		comboBox_3.addItem("2014");
		comboBox_3.addItem("2015");
		comboBox_3.addItem("2016");
		comboBox_3.addItem("2017");
		comboBox_3.addItem("2018");
		comboBox_3.addItem("2019");
		comboBox_3.addItem("2020");
		comboBox_3.addItem("2021");
		
		lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JTextArea textArea = new JTextArea();
		this.setResizable(false);
		
		JLabel lblDoj = new JLabel("DOJ:");
		lblDoj.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnAddLibrarian = new JButton("ADD LIBRARIAN");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddLibrarian)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","root");
						
						String query="INSERT into librarian values(?,?,?,?,?,?,?)";
						
						String name=textField.getText();
						String pass=new String(passwordField.getPassword());
						String email=textField_2.getText();
						
						String contact_no=textField_3.getText();
						String gender=comboBox.getSelectedItem().toString();
						String address=textArea.getText();
						String DOJ=comboBox_1.getSelectedItem().toString();
						String DOJ1=comboBox_2.getSelectedItem().toString();
						String DOJ2=comboBox_3.getSelectedItem().toString();
						
					DOJ=DOJ+"/"+DOJ1+"/"+DOJ2;
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, name);
					ps.setString(2,pass);
					ps.setString(3,email);
					ps.setString(4,contact_no);
					ps.setString(5,gender);
					ps.setString(6,address);
					ps.setString(7,DOJ);
					
					
					ps.executeUpdate();
					conn.close();
					ps.close();
					textField.setText("");
					passwordField.setText("");
					textField_2.setText("");
					textField_3.setText("");
					comboBox.getSelectedItem();
					textArea.setText("");
					comboBox_1.getSelectedItem();
					comboBox_2.getSelectedItem();
					comboBox_3.getSelectedItem();
					
					
					
					
					
					}
					
					catch(Exception ex)
					{
						System.out.println(ex);
					}
					
				}
				JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED!!");	
			}
		});
		btnAddLibrarian.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack)
				{
					third th=new third();
					th.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblLibrarianDetails = new JLabel("LIBRARIAN - DETAILS");
		lblLibrarianDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		
		passwordField = new JPasswordField();
		
		
		
		
		
		
		
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail)
						.addComponent(lblContactNo)
						.addComponent(lblPassword)
						.addComponent(lblName)
						.addComponent(lblGender)
						.addComponent(lblAddress)
						.addComponent(lblDoj))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btnAddLibrarian, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnBack))
								.addComponent(textField_2, 211, 211, Short.MAX_VALUE)
								.addComponent(textField_3, 211, 211, Short.MAX_VALUE)
								.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_1, 0, 54, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
								.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
							.addGap(75))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(135, Short.MAX_VALUE)
					.addComponent(lblLibrarianDetails)
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianDetails)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNo)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDoj)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddLibrarian)
						.addComponent(btnBack))
					.addGap(34))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
