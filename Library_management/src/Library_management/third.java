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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class third extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					third frame = new third();
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
	public third() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAddLibrarian = new JButton("ADD LIBRARIAN");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddLibrarian)
				{
					forth f=new forth();
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnAddLibrarian.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnViewLibrarian = new JButton("VIEW LIBRARIAN");
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnViewLibrarian)
				{
					viewtable3 v=new viewtable3();
					v.setVisible(true);
					dispose();
				}	
			}
		});
		btnViewLibrarian.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnDeleteLibrarian = new JButton("REMOVE LIBRARIAN");
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnDeleteLibrarian)
				{
					tenth t=new tenth();
					t.setVisible(true);
					dispose();
				}
				
			}
		});
		btnDeleteLibrarian.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnLogout)
				{
					second s=new second();
					s.setVisible(true);
					dispose();
				}
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JLabel lblAdminSection = new JLabel("ADMIN - SECTION");
		lblAdminSection.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnLogout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDeleteLibrarian, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddLibrarian, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewLibrarian, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(131, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(120, Short.MAX_VALUE)
					.addComponent(lblAdminSection)
					.addGap(102))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAdminSection)
					.addGap(38)
					.addComponent(btnAddLibrarian)
					.addGap(18)
					.addComponent(btnViewLibrarian)
					.addGap(18)
					.addComponent(btnDeleteLibrarian)
					.addGap(18)
					.addComponent(btnLogout)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
