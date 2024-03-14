package employee;

import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class movieDBapplication {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieDBapplication window = new movieDBapplication();
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
	public movieDBapplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Registration");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(132, 11, 107, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(73, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(73, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No Of Tickets");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(73, 158, 84, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "KGF", "AA", "PUSHPA", "MASTER"}));
		cb1.setBounds(175, 104, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "0", "1", "2", "3", "4", "5", "7"}));
		cb2.setBounds(175, 154, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf1.getText();
				String movie = (String) cb1.getSelectedItem();
				String noOfTickets = (String) cb2.getSelectedItem();
				int nt = Integer.parseInt(noOfTickets);
				int bill =0;
				try
				{
					
					if(movie.equals("RRR"))
					{
						bill = bill + 300 * nt;
					}
					if(movie.equals("KGF"))
					{
						bill = bill + 300 * nt;
					}
					if(movie.equals("AA"))
					{
						bill = bill + 150 * nt;
					}
					if(movie.equals("PUSHPA"))
					{
						bill = bill + 250 *nt;
					}
					if(movie.equals("MASTER"))
					{
						bill = bill + 350 * nt;
					}
					int res = 0;
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q = "insert into movie values('"+name+"','"+movie+"','"+nt+"','"+bill+"')";
					Statement st = con.createStatement();
					st.executeUpdate(q);
					con.close();
					res = JOptionPane.showConfirmDialog(btnNewButton, "Name : "+name+"\nMovie : "+movie+
							"\nNumber Of Tickets : "+noOfTickets+"\nAmount : "+bill);
					int YES_OPTION = 0;
					if(res == YES_OPTION)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed!");
					}
					else   
					{
						JOptionPane.showMessageDialog(btnNewButton, "Booking Cancelled!");
					}	
				}
				catch(SQLException e2)
				{
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(132, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tf1 = new JTextField();
		tf1.setBounds(175, 59, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\PIC04.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
