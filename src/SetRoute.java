import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SetRoute extends JFrame {

	private JPanel contentPane;

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetRoute window = new SetRoute();
					window.frame.setVisible(true);
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
	public SetRoute() {
		
		JTextField txtCity,txtHour,txtMinute;
		
		frame = new JFrame();
		frame.setTitle("SeatRoute");
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

		Button button_3 = new Button("Exit");
		button_3.setForeground(SystemColor.text);
		button_3.setBackground(SystemColor.activeCaption);
		button_3.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						frame.setVisible(false);
						
					}
				});
		button_3.setBounds(270, 291, 70, 22);
		frame.getContentPane().add(button_3);

		Label label_1 = new Label("Set Route");
		label_1.setForeground(SystemColor.activeCaption);
		label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
		label_1.setBounds(254, 77, 130, 22);
		frame.getContentPane().add(label_1);

		
		txtCity = new JTextField();
		txtCity.setBounds(273, 123, 86, 20);
		frame.getContentPane().add(txtCity);
		txtCity.setColumns(10);
		
		Label label_2 = new Label("City");
		label_2.setForeground(SystemColor.activeCaption);
		label_2.setBounds(244, 121, 23, 22);
		frame.getContentPane().add(label_2);
		
		txtHour = new JTextField();
		txtHour.setColumns(10);
		txtHour.setBounds(273, 157, 86, 20);
		frame.getContentPane().add(txtHour);
		
		Label label_3 = new Label("Hour");
		label_3.setForeground(SystemColor.activeCaption);
		label_3.setBounds(239, 155, 28, 22);
		frame.getContentPane().add(label_3);
		
		txtMinute = new JTextField();
		txtMinute.setColumns(10);
		txtMinute.setBounds(273, 188, 86, 20);
		frame.getContentPane().add(txtMinute);
		
		Label label_4 = new Label("Minute");
		label_4.setForeground(SystemColor.activeCaption);
		label_4.setBounds(231, 187, 36, 22);
		frame.getContentPane().add(label_4);
		
		Button button = new Button("Add Route");
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.activeCaption);
		button.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						Management.tripList.get(Management.tripList.size() - 1).setRoute(txtCity.getText(), Integer.parseInt(txtHour.getText()), Integer.parseInt(txtMinute.getText()));
						JOptionPane.showMessageDialog(frame, "Successfully added!");
					}
				});
		button.setBounds(270, 225, 70, 22);
		frame.getContentPane().add(button);
		
	}

}
