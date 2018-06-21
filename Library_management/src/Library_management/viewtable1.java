package Library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

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

public class viewtable1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewtable1 frame = new viewtable1();
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
	public viewtable1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JTable();
		
		JButton btnClickHereTo = new JButton("CLICK HERE TO VIEW BOOK_DETAILS");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnClickHereTo)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","root");
						
						String query="select * from book_details";
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
		btnClickHereTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack)
				{
					sixth s=new sixth();
					s.setVisible(true);
					dispose();
				}	
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblBookdetails = new JLabel("BOOK_DETAILS");
		lblBookdetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblUniquecode = new JLabel("UNIQUE_CODE");
		lblUniquecode.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblBookname = new JLabel("BOOK_NAME");
		lblBookname.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblPublisher = new JLabel("PUBLISHER");
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblEdition = new JLabel("EDITION");
		lblEdition.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(75)
					.addComponent(btnClickHereTo)
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addComponent(lblBookdetails)
					.addGap(121))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUniquecode)
					.addGap(18)
					.addComponent(lblBookname)
					.addGap(18)
					.addComponent(lblAuthor)
					.addGap(18)
					.addComponent(lblPublisher)
					.addGap(18)
					.addComponent(lblEdition)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBookdetails)
							.addGap(39))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUniquecode)
								.addComponent(lblBookname)
								.addComponent(lblAuthor)
								.addComponent(lblPublisher)
								.addComponent(lblEdition))
							.addGap(2)))
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickHereTo)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
