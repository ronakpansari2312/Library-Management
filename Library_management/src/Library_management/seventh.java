package Library_management;

import java.awt.BorderLayout;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class seventh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seventh frame = new seventh();
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
	public seventh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBookNo = new JLabel("BOOK NO:");
		lblBookNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblStudentId = new JLabel("STUDENT ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblStudentName = new JLabel("STUDENT NAME:");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblIssuedate = new JLabel("ISSUE_DATE:");
		lblIssuedate.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblDuedate = new JLabel("DUE_DATE:");
		lblDuedate.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblIssueDbookDetails = new JLabel("ISSUED_BOOK DETAILS");
		lblIssueDbookDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnIssue = new JButton("ISSUE");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnIssue)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","root");
						
						String query="INSERT into issue_book values(?,?,?,?,?)";
						
						String Book_no=textField.getText();
						String Student_id=textField_1.getText();
						String Student_name=textField_2.getText();
						String Issue_date=textField_3.getText();
						String Due_date=textField_4.getText();
							
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, Book_no);
					ps.setString(2,Student_id);
					ps.setString(3,Student_name);
					ps.setString(4,Issue_date);
					ps.setString(5,Due_date);
						
					ps.executeUpdate();
					conn.close();
					ps.close();
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					
					
					
					
					
					}
					
					catch(Exception ex)
					{
						System.out.println(ex);
					}
					
				}
				JOptionPane.showMessageDialog(null, "SUCCESSFULLY ISSUED!!");		
			}
		});
		btnIssue.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnBack)
				{
					sixth s=new sixth();
					s.setVisible(true);
					dispose();
				}
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(120, Short.MAX_VALUE)
					.addComponent(lblIssueDbookDetails)
					.addGap(74))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBookNo)
								.addComponent(lblStudentId)
								.addComponent(lblStudentName)
								.addComponent(lblIssuedate)
								.addComponent(lblDuedate))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnIssue)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnClose)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBack)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(81))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIssueDbookDetails)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentId)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudentName))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIssuedate)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDuedate)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssue)
						.addComponent(btnClose)
						.addComponent(btnBack))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
