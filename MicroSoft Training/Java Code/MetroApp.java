package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MetroApp {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroApp window = new MetroApp();
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
	public MetroApp() {
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
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(117, 11, 120, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(68, 58, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(68, 101, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(68, 144, 65, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("No Of Tickets");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(68, 194, 73, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "CHINTAL", "BALANAGAR", "AMMERPET", "ERRAGADA", "KOMPALLY"}));
		cb1.setBounds(173, 101, 86, 14);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "CHINTAL", "BALANAGAR", "AMMERPET", "ERRAGADA", "KOMPALLY"}));
		cb2.setBounds(173, 144, 86, 14);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "0", "1 ", "2", "3", "4", "5"}));
		cb3.setBounds(173, 194, 86, 14);
		frame.getContentPane().add(cb3);
		
		tf1 = new JTextField();
		tf1.setBounds(173, 58, 86, 14);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				String name = tf1.getName();
				String source = (String) cb1.getSelectedItem();
				String destination = (String) cb2.getSelectedItem();
				String tickets = (String) cb3.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please check stations!");
				}
				else
				{
					int bill = nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "Name : "+name+
							"\nSource : "+source+"\n Destination : "+destination+
							"\nNumber Of Tickets : "+nt+"\nTotal Amount : "+bill);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(118, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\metro01.jpg"));
		lblNewLabel_5.setBounds(-104, -166, 868, 562);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
