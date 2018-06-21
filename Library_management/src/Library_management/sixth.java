package Library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class sixth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sixth frame = new sixth();
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
	public sixth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAddBooks = new JButton("ADD BOOKS");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAddBooks)
				{
					fifth fi=new fifth();
					fi.setVisible(true);
					dispose();
				}
			}
		});
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnIssueBooks = new JButton("ISSUE BOOK");
		btnIssueBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnIssueBooks)
				{
					seventh se=new seventh();
					se.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnViewBooks = new JButton("VIEW BOOKS");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnViewBooks)
				{
					viewtable1 v=new viewtable1();
					v.setVisible(true);
					dispose();
				}	
			}
		});
		btnViewBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnViewIssuedBooks = new JButton("VIEW ISSUED BOOKS");
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnViewIssuedBooks)
				{
					viewtable v=new viewtable();
					v.setVisible(true);
					dispose();
				}
			}
		});
		btnViewIssuedBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnReturnBook = new JButton("RETURN BOOK");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReturnBook)
				{
					ninth n=new ninth();
					n.setVisible(true);
					dispose();
				}
			}
		});
		btnReturnBook.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnLogout)
				{
					second s=new second();
					s.setVisible(true);
					dispose();
				}
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblLibrarianSection = new JLabel("LIBRARIAN - SECTION");
		lblLibrarianSection.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(92, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnLogout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnReturnBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAddBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnIssueBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnViewBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnViewIssuedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(119))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblLibrarianSection)
							.addGap(81))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianSection)
					.addGap(43)
					.addComponent(btnAddBooks)
					.addGap(18)
					.addComponent(btnIssueBooks)
					.addGap(18)
					.addComponent(btnViewBooks)
					.addGap(18)
					.addComponent(btnViewIssuedBooks)
					.addGap(18)
					.addComponent(btnReturnBook)
					.addGap(18)
					.addComponent(btnLogout)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
