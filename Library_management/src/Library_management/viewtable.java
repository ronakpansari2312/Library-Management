package Library_management;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import net.proteanit.sql.DbUtils;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class viewtable extends JFrame {

	
	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewtable frame = new viewtable();
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
	public viewtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		table=new JTable();
		
		JButton btnViewButton = new JButton("VIEW_BOOK DETAILS");
		btnViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnViewButton)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","root");
						
						String query="select * from issue_book";
						PreparedStatement ps=conn.prepareStatement(query);
						
						ResultSet res1=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(res1));
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}	
			}
		});
		btnViewButton.setFont(new Font("Tahoma", Font.BOLD, 11));	
		
		JButton btnClose = new JButton("BACK");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnClose)
				{
					sixth s=new sixth();
					s.setVisible(true);
					dispose();
				}
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblViewbookDetails = new JLabel("View_Book Details");
		lblViewbookDetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblBookno = new JLabel("BOOK_NO");
		lblBookno.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblStudentid = new JLabel("STUDENT_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblStudentname = new JLabel("STUDENT_NAME");
		lblStudentname.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblIssuedate = new JLabel("ISSUE_DATE");
		lblIssuedate.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDuedate = new JLabel("DUE_DATE");
		lblDuedate.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(126)
							.addComponent(lblViewbookDetails))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblBookno)
							.addGap(18)
							.addComponent(lblStudentid)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(35)
									.addComponent(btnViewButton)
									.addGap(18)
									.addComponent(btnClose))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lblStudentname)
									.addGap(18)
									.addComponent(lblIssuedate)
									.addGap(18)
									.addComponent(lblDuedate))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblViewbookDetails)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookno)
						.addComponent(lblStudentid)
						.addComponent(lblStudentname)
						.addComponent(lblIssuedate)
						.addComponent(lblDuedate))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnViewButton)
						.addComponent(btnClose))
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
