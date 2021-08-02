import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private SearchTrip st;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		frame = new JFrame();
		frame.setTitle("Log in");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 250, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(175, 93, 86, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		Button btnLogin = new Button("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(SystemColor.activeCaption);
		btnLogin.setBounds(183, 175, 60, 22);
		frame.getContentPane().add(btnLogin);
		
		Label label = new Label("Bus Transportation System");
		label.setFont(new Font("Arial Narrow", Font.ITALIC, 20));
		label.setForeground(SystemColor.text);
		label.setBackground(SystemColor.activeCaption);
		label.setBounds(88, 20, 300, 22);
		frame.getContentPane().add(label);
		
		Label lblUsername = new Label("Username");
		lblUsername.setForeground(SystemColor.activeCaption);
		lblUsername.setBounds(113, 91, 62, 22);
		frame.getContentPane().add(lblUsername);
		
		Label lblPassw = new Label("Password");
		lblPassw.setForeground(SystemColor.activeCaption);
		lblPassw.setBounds(113, 120, 62, 22);
		frame.getContentPane().add(lblPassw);
		
		Button btnWthLogin = new Button("Continue without login");
		btnWthLogin.setForeground(SystemColor.text);
		btnWthLogin.setBackground(SystemColor.activeCaption);
		btnWthLogin.setBounds(140, 203, 150, 22);
		frame.getContentPane().add(btnWthLogin);
		
		Label label_3 = new Label("Welcome !");
		label_3.setForeground(SystemColor.activeCaption);
		label_3.setFont(new Font("Bahnschrift", Font.ITALIC, 13));
		label_3.setBounds(183, 63, 70, 22);
		frame.getContentPane().add(label_3);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(SystemColor.text);
		panel_4.setForeground(SystemColor.text);
		panel_4.setBounds(0, 240, 434, 3);
		frame.getContentPane().add(panel_4);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(0, 237, 434, 24);
		frame.getContentPane().add(panel_3);
		
		Panel panel_5 = new Panel();
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 4, 434, 3);
		frame.getContentPane().add(panel_5);
		
		Panel panel_6 = new Panel();
		panel_6.setForeground(Color.WHITE);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 52, 434, 3);
		frame.getContentPane().add(panel_6);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 434, 59);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnMember = new JRadioButton("Member");
		rdbtnMember.setForeground(SystemColor.activeCaption);
		rdbtnMember.setBackground(SystemColor.text);
		rdbtnMember.setBounds(205, 146, 80, 23);
		frame.getContentPane().add(rdbtnMember);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setForeground(SystemColor.activeCaption);
		rdbtnAdmin.setBackground(SystemColor.text);
		rdbtnAdmin.setBounds(140, 146, 70, 23);
		frame.getContentPane().add(rdbtnAdmin);
		
		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rdbtnMember);
		btnG.add(rdbtnAdmin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(175, 122, 86, 20);
		frame.getContentPane().add(txtPassword);
		
		
		btnLogin.addActionListener(new ActionListener()  //create an instance of the listener
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if((rdbtnMember.isSelected() ? "Member":"Admin").equals("Member")) {
					
					if(txtUserName.getText().equals("member") &&
							txtPassword.getText().equals("member"))
					{
						CustomerMenu csm = new CustomerMenu();
						csm.getFrame().setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						txtUserName.setText("");
						txtPassword.setText("");
						JOptionPane.showMessageDialog(frame, "Wrong password or user name");

					}
					
				}
				else if((rdbtnMember.isSelected() ? "Member":"Admin").equals("Admin")) {
					
					if(txtUserName.getText().equals("admin") &&
							txtPassword.getText().equals("admin"))
					{
						AdminMenu adm = new AdminMenu();
						adm.getFrame().setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						txtUserName.setText("");
						txtPassword.setText("");
						JOptionPane.showMessageDialog(frame, "Wrong password or user name");

					}
					
				}
				else
					JOptionPane.showMessageDialog(frame, "Please make a choice between Admin and Member before Login");
				
				
				
			}
		});
		btnWthLogin.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						st = new SearchTrip(frame);
						st.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		
		
		
	}
}
