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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeletingOperations extends JFrame {

	private JFrame frame;
	private AdminMenu adm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletingOperations window = new DeletingOperations("Bus");
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
	public DeletingOperations(String choice) {
		
		if(choice.equals("Bus")) {
			
			JTextField txtBusID;
			
			frame = new JFrame();
			frame.setTitle("Delete Bus");
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

			
			Label label_1 = new Label("Delete Bus");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(240, 142, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtBusID = new JTextField();
			txtBusID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtBusID);
			txtBusID.setColumns(10);
			
			Label label_2 = new Label("Bus ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(220, 194, 50, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteBus(Integer.parseInt(txtBusID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Shuttle")) {
			
			JTextField txtShuttleID;
			
			frame = new JFrame();
			frame.setTitle("Delete Shuttle");
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

			Label label_1 = new Label("Delete Shuttle");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(234, 142, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtShuttleID = new JTextField();
			txtShuttleID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtShuttleID);
			txtShuttleID.setColumns(10);
			
			Label label_2 = new Label("Shuttle ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(204, 194, 53, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteShuttle(Integer.parseInt(txtShuttleID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Member")) {
			
			JTextField txtMemberID;
			
			frame = new JFrame();
			frame.setTitle("Delete Member");
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

			Label label_1 = new Label("Delete Member");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(234, 142, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtMemberID = new JTextField();
			txtMemberID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtMemberID);
			txtMemberID.setColumns(10);
			
			Label label_2 = new Label("Member ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(204, 194, 53, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteMember(Integer.parseInt(txtMemberID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Bus Driver")) {
			
			JTextField txtBusDriverID;
			
			frame = new JFrame();
			frame.setTitle("Delete Bus Driver");
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

			Label label_1 = new Label("Delete Bus Driver");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(234, 142, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtBusDriverID = new JTextField();
			txtBusDriverID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtBusDriverID);
			txtBusDriverID.setColumns(10);
			
			Label label_2 = new Label("Bus Driver ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(185, 194, 72, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteBusDriver(Integer.parseInt(txtBusDriverID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Assistant")) {
			
			JTextField txtAssistantID;
			
			frame = new JFrame();
			frame.setTitle("Delete Assistant");
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

			Label label_1 = new Label("Delete Assistant");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(228, 142, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtAssistantID = new JTextField();
			txtAssistantID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtAssistantID);
			txtAssistantID.setColumns(10);
			
			Label label_2 = new Label("Assistant ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(192, 194, 65, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteAssistant(Integer.parseInt(txtAssistantID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Ticket Agent")) {
			
			JTextField txtTicketAgentID;
			
			frame = new JFrame();
			frame.setTitle("Delete Ticket Agent");
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

			Label label_1 = new Label("Delete Ticket Agent");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(204, 142, 210, 22);
			frame.getContentPane().add(label_1);
			
			txtTicketAgentID = new JTextField();
			txtTicketAgentID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtTicketAgentID);
			txtTicketAgentID.setColumns(10);
			
			Label label_2 = new Label("Ticket Agent ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(179, 194, 78, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteTicketAgent(Integer.parseInt(txtTicketAgentID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Office")) {
			
			JTextField txtOfficeID;
			
			frame = new JFrame();
			frame.setTitle("Delete Office");
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

			Label label_1 = new Label("Delete Office");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(238, 142, 210, 22);
			frame.getContentPane().add(label_1);
			
			txtOfficeID = new JTextField();
			txtOfficeID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtOfficeID);
			txtOfficeID.setColumns(10);
			
			Label label_2 = new Label("Office ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(203, 194, 50, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteOffice(Integer.parseInt(txtOfficeID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			
		}
		else if(choice.equals("Trip")) {
	
			JTextField txtTripID;
			
			frame = new JFrame();
			frame.setTitle("Delete Trip");
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

			Label label_1 = new Label("Delete Trip");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(245, 142, 210, 22);
			frame.getContentPane().add(label_1);
			
			txtTripID = new JTextField();
			txtTripID.setBounds(263, 195, 86, 20);
			frame.getContentPane().add(txtTripID);
			txtTripID.setColumns(10);
			
			Label label_2 = new Label("Trip ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(213, 194, 44, 22);
			frame.getContentPane().add(label_2);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteTrip(Integer.parseInt(txtTripID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(270, 244, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(260, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		else if(choice.equals("Ticket")) {
	
			JTextField txtTripID,txtTicketID;
			
			frame = new JFrame();
			frame.setTitle("Delete Ticket");
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

			Label label_1 = new Label("Delete Ticket");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(245, 142, 210, 22);
			frame.getContentPane().add(label_1);
			
			txtTripID = new JTextField();
			txtTripID.setBounds(209, 194, 86, 20);
			frame.getContentPane().add(txtTripID);
			txtTripID.setColumns(10);
			
			Label label_2 = new Label("Trip ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(159, 193, 44, 22);
			frame.getContentPane().add(label_2);
			
			txtTicketID = new JTextField();
			txtTicketID.setColumns(10);
			txtTicketID.setBounds(362, 194, 86, 20);
			frame.getContentPane().add(txtTicketID);
			
			Label label_3 = new Label("Ticket ID");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(312, 193, 44, 22);
			frame.getContentPane().add(label_3);
			
			Button btnDel = new Button("Delete");
			btnDel.setForeground(SystemColor.text);
			btnDel.setBackground(SystemColor.activeCaption);
			btnDel.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.deleteTicket(Integer.parseInt(txtTripID.getText()), Integer.parseInt(txtTicketID.getText()));
							
							SingleObjectY object = SingleObjectY.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnDel.setBounds(277, 245, 70, 22);
			frame.getContentPane().add(btnDel);
			
			Button btnBackToMenu = new Button("Back To Menu");
			btnBackToMenu.setForeground(SystemColor.text);
			btnBackToMenu.setBackground(SystemColor.activeCaption);
			btnBackToMenu.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnBackToMenu.setBounds(270, 302, 90, 22);
			frame.getContentPane().add(btnBackToMenu);
			
		}
		
	}
}
