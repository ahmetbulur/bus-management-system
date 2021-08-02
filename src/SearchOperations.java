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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchOperations extends JFrame {

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
					SearchOperations window = new SearchOperations("Bus");
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

	public SearchOperations(String choice){
		
		if(choice.equals("Bus")) {
			
			JTextField txtBusID;
			
			frame = new JFrame();
			frame.setTitle("Search Bus");
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

			Label label_1 = new Label("Search Bus");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);

			
			txtBusID = new JTextField();
			txtBusID.setBounds(98, 116, 86, 20);
			frame.getContentPane().add(txtBusID);
			txtBusID.setColumns(10);
			
			Label label_2 = new Label("Bus ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(52, 115, 45, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.busList.size(); i++) {
								
								if(Management.busList.get(i).getVehicleID() == Integer.parseInt(txtBusID.getText().toString())) {
									
									lst.add( new String[] { String.valueOf(Management.busList.get(i).getVehicleID()), 
											Management.busList.get(i).getPlate(), 
											String.valueOf(Management.busList.get(i).getNumberOfSeat()), 
											Management.busList.get(i).getType(), 
											Management.busList.get(i).isWifi() ? "True":"False", 
											Management.busList.get(i).isTv() ? "True":"False",
										    Management.busList.get(i).isPlug() ? "True":"False"
										});
									
								}
								
							}
							
							String col[] = { "Id", "Plate", "NumberOfSeat", "Type", "Wifi", "TV", "Plug" };
							model = new DefaultTableModel(col, 0);
							for (String[] row : lst) {
								model.addRow(row);
							}
							table = new JTable();
							table.setModel(model);
							
							header = table.getTableHeader();
							header.setBackground(SystemColor.activeCaption);
							frame.getContentPane().setLayout(null);

							scrollPanel = new JScrollPane(table);
							scrollPanel.setBounds(52, 155, 524, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(202, 115, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
		

			
		}
		else if(choice.equals("Shuttle")) {
			
			JTextField txtShuttleID;
			
			frame = new JFrame();
			frame.setTitle("Search Shuttle");
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

			Label label_1 = new Label("Search Shuttle");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);

			
			txtShuttleID = new JTextField();
			txtShuttleID.setBounds(210, 116, 86, 20);
			frame.getContentPane().add(txtShuttleID);
			txtShuttleID.setColumns(10);
			
			Label label_2 = new Label("Shuttle ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(150, 115, 59, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst2 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.shuttleList.size(); i++) {
								
								if(Management.shuttleList.get(i).getVehicleID() == Integer.parseInt(txtShuttleID.getText())) {
									
									lst2.add( new String[] { String.valueOf(Management.shuttleList.get(i).getVehicleID()), 
											Management.shuttleList.get(i).getPlate(), 
											String.valueOf(Management.shuttleList.get(i).getNumberOfSeat()), 
											Management.shuttleList.get(i).getSize()
										});
									
								}
								
							}
							
							String col[] = { "Id", "Plate", "NumberOfSeat", "size"};
							model = new DefaultTableModel(col, 0);
							for (String[] row : lst2) {
								model.addRow(row);
							}
							table = new JTable();
							table.setModel(model);
							
							header = table.getTableHeader();
							header.setBackground(SystemColor.activeCaption);
							frame.getContentPane().setLayout(null);

							scrollPanel = new JScrollPane(table);
							scrollPanel.setBounds(164, 155, 300, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(314, 115, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
		

			
		}
		else if(choice.equals("Member")) {
			

			JTextField txtMemberID;
			
			frame = new JFrame();
			frame.setTitle("Search Member");
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

			Label label_1 = new Label("Search Member");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(247, 79, 180, 22);
			frame.getContentPane().add(label_1);

			
			txtMemberID = new JTextField();
			txtMemberID.setBounds(210, 116, 86, 20);
			frame.getContentPane().add(txtMemberID);
			txtMemberID.setColumns(10);
			
			Label label_2 = new Label("Member ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(150, 115, 59, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst3 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.memberList.size(); i++) {
								
								if(Management.memberList.get(i).getMemberID() == Integer.parseInt(txtMemberID.getText())) {
									
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
								
								
							}
							
							String col[] = { "Id", "Name", "Surname", "E-mail", "Phone", "Gender", "Birthdate", "Address" };
							model = new DefaultTableModel(col, 0);
							for (String[] row : lst3) {
								model.addRow(row);
							}
							table = new JTable();
							table.setModel(model);
							
							header = table.getTableHeader();
							header.setBackground(SystemColor.activeCaption);
							frame.getContentPane().setLayout(null);

							scrollPanel = new JScrollPane(table);
							scrollPanel.setBounds(36, 155, 557, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(314, 114, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
		
			
		}
		else if(choice.equals("Bus Driver")) {
			

			JTextField txtBusDriverID;
			
			frame = new JFrame();
			frame.setTitle("Search Bus Driver");
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

			Label label_1 = new Label("Search Bus Driver");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(229, 79, 198, 22);
			frame.getContentPane().add(label_1);

			
			txtBusDriverID = new JTextField();
			txtBusDriverID.setBounds(210, 116, 86, 20);
			frame.getContentPane().add(txtBusDriverID);
			txtBusDriverID.setColumns(10);
			
			Label label_2 = new Label("Bus Driver ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(134, 115, 70, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst4 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.busDriverList.size(); i++) {
							
								if(Management.busDriverList.get(i).getDriverID() == Integer.parseInt(txtBusDriverID.getText())) {
									
									lst4.add( new String[] { String.valueOf(Management.busDriverList.get(i).getDriverID()), 
											Management.busDriverList.get(i).getName(), Management.busDriverList.get(i).getSurname(), 
											Management.busDriverList.get(i).getEmail(), String.valueOf(Management.busDriverList.get(i).getSalary()), 
											Management.busDriverList.get(i).getPhone().toString(), Management.busDriverList.get(i).getGender(), 
											Management.busDriverList.get(i).getBirthdate().toString(), Management.busDriverList.get(i).getAddress().toString()
										});
									
								}
								
								
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
							scrollPanel.setBounds(36, 155, 557, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(314, 114, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
		
			
		}
		else if(choice.equals("Assistant")) {
			

			JTextField txtAssistantID;
			
			frame = new JFrame();
			frame.setTitle("Search Assistant");
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

			Label label_1 = new Label("Search Assistant");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(229, 79, 198, 22);
			frame.getContentPane().add(label_1);

			
			txtAssistantID = new JTextField();
			txtAssistantID.setBounds(210, 116, 86, 20);
			frame.getContentPane().add(txtAssistantID);
			txtAssistantID.setColumns(10);
			
			Label label_2 = new Label("Assistant ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(134, 115, 70, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst5 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.assistantList.size(); i++) {
								
								if(Management.assistantList.get(i).getAssistantID() == Integer.parseInt(txtAssistantID.getText())) {
									
									lst5.add( new String[] { String.valueOf(Management.assistantList.get(i).getAssistantID()), 
											Management.assistantList.get(i).getName(), Management.assistantList.get(i).getSurname(), 
											Management.assistantList.get(i).getEmail(), String.valueOf(Management.assistantList.get(i).getSalary()), 
											Management.assistantList.get(i).getPhone().toString(), Management.assistantList.get(i).getGender(), 
											Management.assistantList.get(i).getBirthdate().toString(), Management.assistantList.get(i).getAddress().toString()
										});
									
								}
								
								
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
							scrollPanel.setBounds(36, 155, 557, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(314, 114, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
			
			
		}
		else if(choice.equals("Ticket Agent")) {
	
			JTextField txtTicketAgentID;
			
			frame = new JFrame();
			frame.setTitle("Search Ticket Agent");
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

			Label label_1 = new Label("Search Ticket Agent");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(210, 79, 217, 22);
			frame.getContentPane().add(label_1);

			
			txtTicketAgentID = new JTextField();
			txtTicketAgentID.setBounds(210, 116, 86, 20);
			frame.getContentPane().add(txtTicketAgentID);
			txtTicketAgentID.setColumns(10);
			
			Label label_2 = new Label("Ticket Agent ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(124, 115, 80, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst6 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.ticketAgentList.size(); i++) {
								
								if(Management.ticketAgentList.get(i).getAgentID() == Integer.parseInt(txtTicketAgentID.getText())) {
									
									lst6.add( new String[] { String.valueOf(Management.ticketAgentList.get(i).getAgentID()), 
											String.valueOf(Management.ticketAgentList.get(i).getOfficeID()), Management.ticketAgentList.get(i).getName(), 
											Management.ticketAgentList.get(i).getSurname(), Management.ticketAgentList.get(i).getEmail(), 
											String.valueOf(Management.ticketAgentList.get(i).getSalary()), Management.ticketAgentList.get(i).getPhone().toString(), 
											Management.ticketAgentList.get(i).getGender(), Management.ticketAgentList.get(i).getBirthdate().toString(), 
											Management.ticketAgentList.get(i).getAddress().toString()
										});
									
								}
								
								
							}
							
							String col[] = { "Id","Office Id", "Name", "Surname", "E-mail", "Salary","Phone", "Gender", "Birthdate", "Address"  };
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
							scrollPanel.setBounds(36, 155, 557, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(314, 114, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
			
		}
		else if(choice.equals("Office")) {
			

		    JTextField txtOfficeID;
			
			frame = new JFrame();
			frame.setTitle("Search Office");
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

			Label label_1 = new Label("Search Office");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(232, 80, 217, 22);
			frame.getContentPane().add(label_1);

			
			txtOfficeID = new JTextField();
			txtOfficeID.setBounds(232, 117, 86, 20);
			frame.getContentPane().add(txtOfficeID);
			txtOfficeID.setColumns(10);
			
			Label label_2 = new Label("Office ID");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(177, 116, 49, 22);
			frame.getContentPane().add(label_2);
			
			Button btnSearch = new Button("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setBackground(SystemColor.activeCaption);
			btnSearch.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ArrayList<String[]> lst7 = new ArrayList<String[]>();
							
							for (int i = 0; i < Management.officeList.size(); i++) {
								
								if(Management.officeList.get(i).getOfficeID() == Integer.parseInt(txtOfficeID.getText())) {
									
									lst7.add( new String[] { String.valueOf(Management.officeList.get(i).getOfficeID()), String.valueOf(Management.officeList.get(i).getAdminID()), 
											Management.officeList.get(i).getOfficeName(), Management.officeList.get(i).getAddress().toString(), 
											Management.officeList.get(i).getPhone().toString()
										});
									
								}
								
								
							}
							
							String col[] = { "Id","Admin Id","Name", "Address", "Phone" };
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
							scrollPanel.setBounds(123, 156, 373, 241);
							table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							frame.getContentPane().add(scrollPanel);
							
						}
					});
			btnSearch.setBounds(336, 115, 70, 22);
			frame.getContentPane().add(btnSearch);
			
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
			
		}
		else if(choice.equals("Trip")) {
			
			JTextField txtDepartureTime,txtDestinationTime,txtDay,txtMonth,txtYear;
			
			frame = new JFrame();
			frame.setTitle("Search Trip");
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
			button_3.setBounds(285, 370, 70, 22);
			frame.getContentPane().add(button_3);

			Label label_1 = new Label("Search Trip");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(248, 79, 130, 22);
			frame.getContentPane().add(label_1);

			
			txtDepartureTime = new JTextField();
			txtDepartureTime.setBounds(230, 119, 86, 20);
			frame.getContentPane().add(txtDepartureTime);
			txtDepartureTime.setColumns(10);
			
			ArrayList<String[]> lst8 = new ArrayList<String[]>();
			
			for (int i = 0; i < Management.tripList.size(); i++) {
				
				lst8.add( new String[] { String.valueOf(Management.tripList.get(i).getTripID()), String.valueOf(Management.tripList.get(i).getTicketPrice()),
						Management.tripList.get(i).getDepartureTime().toString(), String.valueOf(Management.tripList.get(i).getBus().getVehicleID()), 
						String.valueOf(Management.tripList.get(i).getDriver().getDriverID()), String.valueOf(Management.tripList.get(i).getAssistant().getAssistantID()), 
						Management.tripList.get(i).getDate().toString()
						
					});
			}
			
			String col[] = { "Id", "Departure","Destination","Date"};
			model = new DefaultTableModel(col, 0);
			for (String[] row : lst8) {
				model.addRow(row);
			}
			table = new JTable();

			table.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent evt) {
					
					String value;
					int update_row = table.rowAtPoint(evt.getPoint());

					// txtId.setText(model.getValueAt(update_row, 0).toString());
					value = model.getValueAt(update_row, 0).toString();
				}
			});

			table.addKeyListener(new KeyListener() {

				@Override
				public void keyPressed(KeyEvent e) {

					String value;
					
					int keyboard_row = table.getSelectedRow();

					if (e.getKeyCode() == 38) {
						if (keyboard_row > 0) {
							keyboard_row--;

							value = model.getValueAt(keyboard_row, 0).toString();
						}
					} else if (e.getKeyCode() == 40) {
						if (keyboard_row < model.getRowCount()) {
							keyboard_row++;
							value = model.getValueAt(keyboard_row, 0).toString();
							
						}
					}
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

			});
			
			table.setModel(model);
			header = table.getTableHeader();
			header.setBackground(SystemColor.activeCaption);
			frame.getContentPane().setLayout(null);

			scrollPanel = new JScrollPane(table);
			scrollPanel.setBounds(161, 179, 300, 185);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			frame.getContentPane().add(scrollPanel);
			
			Label label_2 = new Label("Departure");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(161, 118, 62, 22);
			frame.getContentPane().add(label_2);
			
			Button button = new Button("Search");
			button.setForeground(Color.WHITE);
			button.setBackground(SystemColor.activeCaption);
			button.setBounds(364, 151, 70, 22);
			frame.getContentPane().add(button);
			
			txtDestinationTime = new JTextField();
			txtDestinationTime.setColumns(10);
			txtDestinationTime.setBounds(230, 153, 86, 20);
			frame.getContentPane().add(txtDestinationTime);
			
			Label label_3 = new Label("Destination");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(156, 152, 70, 22);
			frame.getContentPane().add(label_3);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(388, 119, 23, 20);
			frame.getContentPane().add(txtDay);
			
			Label label_4 = new Label("Date");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(354, 118, 28, 22);
			frame.getContentPane().add(label_4);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(421, 119, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(455, 119, 36, 20);
			frame.getContentPane().add(txtYear);
			
			Button button_1 = new Button("Book");
			button_1.setForeground(Color.WHITE);
			button_1.setBackground(SystemColor.activeCaption);
			button_1.setBounds(477, 251, 70, 22);
			frame.getContentPane().add(button_1);
			
		}
		
		
	}
	
	
	
}
