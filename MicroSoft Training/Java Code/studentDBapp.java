package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
public class studentDBapp {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=395,-1
	 */
	private final JComboBox comboBox = new JComboBox();
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDBapp window = new studentDBapp();
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
	public studentDBapp() {
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
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(150, 11, 96, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(87, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(87, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(87, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marks");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(87, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tf1 = new JTextField();
		tf1.setBounds(189, 58, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(189, 95, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "ECE", "EEE", "MECH", "CIVIL", "CSE", "CSE - DS", "CSE - AIML", "CSE - CS", "CSE - IOT"}));
		cb1.setBounds(189, 134, 86, 22);
		frame.getContentPane().add(cb1);
		
		tf3 = new JTextField();
		tf3.setBounds(189, 173, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id = tf1.getText();
				String name = tf2.getText();
				String branch = (String) cb1.getSelectedItem();
				String marks = tf3.getText();
				int m = Integer.parseInt(marks);
				try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q = "insert into student values ('"+id+"','"+name+"','"+branch+"','"+m+"')";
					Statement st = con.createStatement();
					st.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "inserted successfully!");
					
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(189, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Documents\\MicroSoft Training\\pic01.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
