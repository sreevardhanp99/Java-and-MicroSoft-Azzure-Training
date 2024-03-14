package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class login {

	private JFrame frame;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(167, 41, 46, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name      :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(84, 86, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(84, 130, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(158, 87, 86, 14);
		frame.getContentPane().add(tb1);
		
		p1 = new JPasswordField();
		p1.setBounds(158, 131, 84, 14);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String name = tb1.getText();
				String password = p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"Name : "+name+"\nPassword : "+password);
				if(name.equals("vardhan") && password.equals("12345"))
				{
					JOptionPane.showMessageDialog(btnNewButton,"Login Successfull !");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Login Failed");
				}
			}
		});
		btnNewButton.setBounds(124, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
