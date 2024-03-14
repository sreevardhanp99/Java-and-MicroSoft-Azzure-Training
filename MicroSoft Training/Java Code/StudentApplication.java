package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;

public class StudentApplication {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentApplication window = new StudentApplication();
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
	public StudentApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(71, 46, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(71, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(255, 0, 128));
		lblNewLabel_2.setBounds(71, 116, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(71, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student Registration");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(146, 11, 118, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(146, 43, 86, 17);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(146, 75, 86, 17);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE ", "MECH", "ECE", "EEE"}));
		cb1.setBounds(146, 112, 86, 18);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("Prog Lang");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(71, 199, 59, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(147, 161, 59, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(216, 161, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(146, 195, 46, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Java");
		c2.setBounds(194, 195, 59, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Python");
		c3.setBounds(255, 195, 59, 23);
		frame.getContentPane().add(c3);
		
		JCheckBox c4 = new JCheckBox("C++");
		c4.setBounds(316, 195, 59, 23);
		frame.getContentPane().add(c4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String name = t1.getText();
				String roll = t2.getText();
				String gender =" ";
				String langs ="";
				String branch = (String) cb1.getSelectedItem();
				if(r1.isSelected())
				{
					gender = "male";
				}
				else
				{
					gender = "female";
				}
				if(c1.isSelected())
				{
					langs = langs +"C, ";
				}
				if(c1.isSelected())
				{
					langs+="Java, ";
				}
				if(c1.isSelected())
				{
					langs+="Python, ";
				}
				if(c1.isSelected())
				{
					langs+="C++";
				}
				JOptionPane.showMessageDialog(btnNewButton,"Name : "+name+"\nroll NO : "+roll+"\nBranch : "+branch+"\nGender : "+gender+"\nLanguage Selected : "+langs);
			}
		});
		btnNewButton.setBounds(143, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, t1, t2, cb1, lblNewLabel_5, r1, r2, c1, c2, c3, c4, btnNewButton}));
	}
}
