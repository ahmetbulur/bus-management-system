import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CustomerMenu extends JFrame {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu frame = new CustomerMenu();
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Create the frame.
	 */
	public CustomerMenu() {
		
		frame = new JFrame();
		frame.setTitle("Customer Menu");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(700, 450, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Bus Transportation System");
		label.setFont(new Font("Arial Narrow", Font.ITALIC, 20));
		label.setForeground(SystemColor.text);
		label.setBackground(SystemColor.activeCaption);
		label.setBounds(185, 20, 300, 22);
		frame.getContentPane().add(label);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(SystemColor.text);
		panel_4.setForeground(SystemColor.text);
		panel_4.setBounds(0, 440, 635, 3);
		frame.getContentPane().add(panel_4);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(0, 437, 635, 24);
		frame.getContentPane().add(panel_3);
		
		Panel panel_5 = new Panel();
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 4, 635, 3);
		frame.getContentPane().add(panel_5);
		
		Panel panel_6 = new Panel();
		panel_6.setForeground(Color.WHITE);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 52, 635, 3);
		frame.getContentPane().add(panel_6);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 635, 59);
		frame.getContentPane().add(panel);
		
		Button btnBook = new Button("Book a seat");
		btnBook.setForeground(SystemColor.text);
		btnBook.setBackground(SystemColor.activeCaption);
		btnBook.setBounds(133, 144, 357, 34);
		frame.getContentPane().add(btnBook);
		
		Button btnAward = new Button("Check award credit");
		btnAward.setForeground(SystemColor.text);
		btnAward.setBackground(SystemColor.activeCaption);
		btnAward.setBounds(133, 194, 357, 34);
		frame.getContentPane().add(btnAward);
		
		Button btnExit = new Button("Exit");
		btnExit.setForeground(SystemColor.text);
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.setBounds(278, 262, 70, 22);
		frame.getContentPane().add(btnExit);
		
		Label label_1 = new Label("Menu");
		label_1.setForeground(SystemColor.activeCaption);
		label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
		label_1.setBounds(278, 94, 62, 22);
		frame.getContentPane().add(label_1);
		
		btnBook.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						SearchTrip st = new SearchTrip(frame);
						st.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		btnExit.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						frame.setVisible(false);
					}
				});
	}

}
