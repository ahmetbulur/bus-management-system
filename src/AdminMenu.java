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

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminMenu extends JFrame {
	
	private JFrame frame;
	private JComboBox cbxAddOp; 
    private JComboBox cbxDelOp;
    private JComboBox cbxDispOp; 
    private JComboBox cbxSrchOp;
    
    private AddingOperations ao;
    private DeletingOperations dop;
    private DisplayOperations disop;
    private SearchOperations srchop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu window = new AdminMenu();
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
	public AdminMenu() {
		
		frame = new JFrame();
		frame.setTitle("Admin Menu");
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
		
		JLabel lblAddOp = new JLabel("Add");
		lblAddOp.setBounds(90, 144, 357, 34);
		frame.getContentPane().add(lblAddOp);
		
		JLabel lblDelOp = new JLabel("Delete");
		lblDelOp.setBounds(90, 194, 357, 34);
		frame.getContentPane().add(lblDelOp);
		
		JLabel lblDispOp = new JLabel("Display");
		lblDispOp.setBounds(90, 244, 357, 34);
		frame.getContentPane().add(lblDispOp);
		
		JLabel lblSrchOp = new JLabel("Search");
		lblSrchOp.setBounds(90, 294, 357, 34);
		frame.getContentPane().add(lblSrchOp);
		
		cbxAddOp = new JComboBox();
		cbxAddOp.setModel(new DefaultComboBoxModel(new String[] {"Bus", "Shuttle", "Member", "Bus Driver", "Assistant", "Ticket Agent", "Office", "Trip"}));
		cbxAddOp.setBounds(145, 144, 357, 34);
		frame.getContentPane().add(cbxAddOp);
		
		cbxDelOp = new JComboBox();
		cbxDelOp.setModel(new DefaultComboBoxModel(new String[] {"Bus", "Shuttle", "Member", "Bus Driver", "Assistant", "Ticket Agent", "Office", "Trip", "Ticket"}));
		cbxDelOp.setBounds(145, 194, 357, 34);
		frame.getContentPane().add(cbxDelOp);
		
		cbxDispOp = new JComboBox();
		cbxDispOp.setModel(new DefaultComboBoxModel(new String[] {"Bus", "Shuttle", "Member", "Bus Driver", "Assistant", "Ticket Agent", "Office", "Trip"}));
		cbxDispOp.setBounds(145, 244, 357, 34);
		frame.getContentPane().add(cbxDispOp);
		
		cbxSrchOp = new JComboBox();
		cbxSrchOp.setModel(new DefaultComboBoxModel(new String[] {"Bus", "Shuttle", "Member", "Bus Driver", "Assistant", "Ticket Agent", "Office", "Trip"}));
		cbxSrchOp.setBounds(145, 294, 357, 34);
		frame.getContentPane().add(cbxSrchOp);
		
		Button btnAddOk = new Button("Ok");
		btnAddOk.setForeground(SystemColor.text);
		btnAddOk.setBackground(SystemColor.activeCaption);
		btnAddOk.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						ao = new AddingOperations((String)cbxAddOp.getSelectedItem());
						ao.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		btnAddOk.setBounds(522, 144, 35, 34);
		frame.getContentPane().add(btnAddOk);
		
		Button btnDelOk = new Button("Ok");
		btnDelOk.setForeground(SystemColor.text);
		btnDelOk.setBackground(SystemColor.activeCaption);
		btnDelOk.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						dop = new DeletingOperations((String)cbxDelOp.getSelectedItem());
						dop.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		btnDelOk.setBounds(522, 194, 35, 34);
		frame.getContentPane().add(btnDelOk);
		
		Button btnDispOk = new Button("Ok");
		btnDispOk.setForeground(SystemColor.text);
		btnDispOk.setBackground(SystemColor.activeCaption);
		btnDispOk.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						disop = new DisplayOperations((String)cbxDispOp.getSelectedItem());
						disop.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		btnDispOk.setBounds(522, 244, 35, 34);
		frame.getContentPane().add(btnDispOk);
		
		Button btnSrchOk = new Button("Ok");
		btnSrchOk.setForeground(SystemColor.text);
		btnSrchOk.setBackground(SystemColor.activeCaption);
		btnSrchOk.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						srchop = new SearchOperations((String)cbxSrchOp.getSelectedItem());
						srchop.getFrame().setVisible(true);
						frame.setVisible(false);
					}
				});
		btnSrchOk.setBounds(522, 294, 35, 34);
		frame.getContentPane().add(btnSrchOk);
		
		Button btnExit = new Button("Exit");
		btnExit.setForeground(SystemColor.text);
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.addActionListener(new ActionListener()  //create an instance of the listener
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						frame.setVisible(false);
					}
				});
		btnExit.setBounds(278, 367, 70, 22);
		frame.getContentPane().add(btnExit);
		
		Label label_1 = new Label("Menu");
		label_1.setForeground(SystemColor.activeCaption);
		label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
		label_1.setBounds(278, 94, 62, 22);
		frame.getContentPane().add(label_1);
		
		
		
		
		
	}

}
