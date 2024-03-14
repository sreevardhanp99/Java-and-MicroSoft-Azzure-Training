package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class movieApplication {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieApplication window = new movieApplication();
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
	public movieApplication() {
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
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(157, 11, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(38, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Movie");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(38, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number Of Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(38, 143, 109, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(157, 64, 80, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "KGF"}));
		cb1.setBounds(157, 99, 80, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(157, 140, 80, 20);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int bill=0;
				String name = tb1.getText();
				String movie =  (String) cb1.getSelectedItem();
				String tickets = (String) cb2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				if(movie.equals("RRR"))
				{
					bill=bill + 300*nt;
				}
				if(movie.equals("KGF"))
				{
					bill = bill + 200*nt;
				}
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton, "Name : "+name+"\nMovie : "+movie+
						"\nNumber Of Tickets : "+tickets+"\nAmount : "+bill);
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
		});
		btnNewButton.setBounds(78, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\movieImage.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
