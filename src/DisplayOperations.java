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

public class DisplayOperations extends JFrame {

	private JFrame frame;
	private JScrollPane scrollPanel;
    private DefaultTableModel model;
    private JTableHeader header;
    private JTable table;
    private AdminMenu adm;
    
   /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					DisplayOperations window = new DisplayOperations("Bus");
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

	public DisplayOperations(String choice){
		
		if(choice.equals("Bus")) {
			
			frame = new JFrame();
			frame.setTitle("Display Bus");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Bus");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);
			
			ArrayList<String[]> lst = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.busList.size(); i++) {
				
				lst.add( new String[] { String.valueOf(Management.busList.get(i).getVehicleID()), 
						Management.busList.get(i).getPlate(), 
						String.valueOf(Management.busList.get(i).getNumberOfSeat()), 
						Management.busList.get(i).getType(), 
						Management.busList.get(i).isWifi() ? "True":"False", 
						Management.busList.get(i).isTv() ? "True":"False",
					    Management.busList.get(i).isPlug() ? "True":"False"
					});
			}

			String col[] = { "Id", "Plate", "NumberOfSeat", "Type", "Wifi", "TV", "Plug" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);
			
			header=table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);
			
			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(52, 111, 524, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
		}
		else if(choice.equals("Shuttle")) {
			
			frame = new JFrame();
			frame.setTitle("Display Shuttle");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Shuttle");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);
			
			ArrayList<String[]> lst2 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.shuttleList.size(); i++) {
				
				lst2.add( new String[] { String.valueOf(Management.shuttleList.get(i).getVehicleID()), 
						Management.shuttleList.get(i).getPlate(), 
						String.valueOf(Management.shuttleList.get(i).getNumberOfSeat()), 
						Management.shuttleList.get(i).getSize()
					});
			}
			
			String col[] = { "Id", "Plate", "NumberOfSeat", "size" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst2) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);
			
			header=table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);
			
			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(170, 111, 300, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
		}
		else if(choice.equals("Member")) {
			
			frame = new JFrame();
			frame.setTitle("Display Member");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Member");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);
			
			ArrayList<String[]> lst3 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.memberList.size(); i++) {
				
				lst3.add( new String[] { String.valueOf(Management.memberList.get(i).getMemberID()), 
						Management.memberList.get(i).getName(), 
						Management.memberList.get(i).getSurname(), 
						Management.memberList.get(i).getEmail(),
						Management.memberList.get(i).getPhone().toString(),
						Management.memberList.get(i).getGender(),
						Management.memberList.get(i).getBirthdate().toString(),
						Management.memberList.get(i).getAddress().toString()
					});
			}

			String col[] = { "Id", "Name", "Surname", "E-mail",  "Phone",  "gender",  "Birthdate",  "Address" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst3) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);
			
			header=table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);
			
			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(38, 111, 550, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
		}
		else if(choice.equals("Bus Driver")) {
			

			frame = new JFrame();
			frame.setTitle("Display Bus Driver");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Bus Driver");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(215, 76, 194, 22);
			frame.getContentPane().add(label_1);

			ArrayList<String[]> lst4 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.busDriverList.size(); i++) {
				
				lst4.add( new String[] { String.valueOf(Management.busDriverList.get(i).getDriverID()), 
						Management.busDriverList.get(i).getName(), Management.busDriverList.get(i).getSurname(), 
						Management.busDriverList.get(i).getEmail(), String.valueOf(Management.busDriverList.get(i).getSalary()), 
						Management.busDriverList.get(i).getPhone().toString(), Management.busDriverList.get(i).getGender(), 
						Management.busDriverList.get(i).getBirthdate().toString(), Management.busDriverList.get(i).getAddress().toString()
					});
			}
			
			String col[] = { "Id", "Name", "Surname", "E-mail", "Salary", "Phone", "Gender", "Birthdate", "Address" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst4) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);

			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(38, 111, 550, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
		}
		else if(choice.equals("Assistant")) {
			

			frame = new JFrame();
			frame.setTitle("Display Assistant");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Assistant");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(215, 76, 194, 22);
			frame.getContentPane().add(label_1);

			ArrayList<String[]> lst5 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.assistantList.size(); i++) {
				
				lst5.add( new String[] { String.valueOf(Management.assistantList.get(i).getAssistantID()), 
						Management.assistantList.get(i).getName(), Management.assistantList.get(i).getSurname(), 
						Management.assistantList.get(i).getEmail(), String.valueOf(Management.assistantList.get(i).getSalary()), 
						Management.assistantList.get(i).getPhone().toString(), Management.assistantList.get(i).getGender(), 
						Management.assistantList.get(i).getBirthdate().toString(), Management.assistantList.get(i).getAddress().toString()
					});
			}
			
			String col[] = { "Id", "Name", "Surname", "E-mail", "Salary", "Phone", "Gender", "Birthdate", "Address" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst5) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);

			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(38, 111, 550, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
		}
		else if(choice.equals("Ticket Agent")) {
	
			frame = new JFrame();
			frame.setTitle("Display Ticket Agent");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Ticket Agent");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(208, 75, 220, 22);
			frame.getContentPane().add(label_1);

			ArrayList<String[]> lst6 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.ticketAgentList.size(); i++) {
				
				lst6.add( new String[] { String.valueOf(Management.ticketAgentList.get(i).getAgentID()), 
						String.valueOf(Management.ticketAgentList.get(i).getOfficeID()), Management.ticketAgentList.get(i).getName(), 
						Management.ticketAgentList.get(i).getSurname(), Management.ticketAgentList.get(i).getEmail(), 
						String.valueOf(Management.ticketAgentList.get(i).getSalary()), Management.ticketAgentList.get(i).getPhone().toString(), 
						Management.ticketAgentList.get(i).getGender(), Management.ticketAgentList.get(i).getBirthdate().toString(), 
						Management.ticketAgentList.get(i).getAddress().toString()
					});
			}
			
			String col[] = { "Id","Office Id", "Name", "Surname", "E-mail", "Salary", "Phone", "Gender", "Birthdate", "Address" };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst6) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);

			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(38, 111, 550, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
			
		}
		else if(choice.equals("Office")) {
			
			frame = new JFrame();
			frame.setTitle("Display Office");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Office");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(238, 76, 220, 22);
			frame.getContentPane().add(label_1);

			ArrayList<String[]> lst7 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.officeList.size(); i++) {
				
				lst7.add( new String[] { String.valueOf(Management.officeList.get(i).getOfficeID()), String.valueOf(Management.officeList.get(i).getAdminID()), 
						Management.officeList.get(i).getOfficeName(), Management.officeList.get(i).getAddress().toString(), 
						Management.officeList.get(i).getPhone().toString()
					});
			}
			
			String col[] = { "Id","Admin Id","Name", "Address", "Phone", };
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst7) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);

			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(125, 111, 375, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
			
		}
		else if(choice.equals("Trip")) {
			

			frame = new JFrame();
			frame.setTitle("Display Trip");
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
			btnBackToMenu.setBounds(270, 402, 90, 22);
			frame.getContentPane().add(btnBackToMenu);

			Label label_1 = new Label("Display Trip");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(241, 75, 220, 22);
			frame.getContentPane().add(label_1);

			ArrayList<String[]> lst8 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.tripList.size(); i++) {
				
				lst8.add( new String[] { String.valueOf(Management.tripList.get(i).getTripID()), String.valueOf(Management.tripList.get(i).getTicketPrice()),
						Management.tripList.get(i).getDepartureTime().toString(), String.valueOf(Management.tripList.get(i).getBus().getVehicleID()), 
						String.valueOf(Management.tripList.get(i).getDriver().getDriverID()), String.valueOf(Management.tripList.get(i).getAssistant().getAssistantID()), 
						Management.tripList.get(i).getDate().toString()
						
					});
			}
			
			String col[] = { "Id","Ticket Price","Departure Time", "Bus Id", "Driver Id", "Assistant Id","Date",};
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst8) {
				model.addRow(row);
			}
			table = new JTable();
			table.setModel(model);

			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(53, 111, 524, 285);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
			
		}
		
		
	}
	
	
	
}
