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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddingOperations extends JFrame {

	private JFrame frame;
	private AdminMenu adm;
	private SetRoute sr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					AddingOperations window = new AddingOperations("Bus");
					window.getFrame().setVisible(true);
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
	public AddingOperations(String choice) {
		
		if(choice.equals("Bus")) {
			
			JTextField txtPlate;
			JTextField txtNumberOfSeat;
			JTextField txtType;
			
			frame = new JFrame();
			frame.setTitle("Add Bus");
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

			Label label_1 = new Label("Add Bus");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(290, 127, 180, 22);
			frame.getContentPane().add(label_1);
			
			Label label_2 = new Label("Plate");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(191, 179, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_3 = new Label("Number of Seats");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(135, 234, 93, 22);
			frame.getContentPane().add(label_3);
			
			Label label_4 = new Label("Type");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(191, 279, 40, 22);
			frame.getContentPane().add(label_4);
			
			txtPlate = new JTextField();
			txtPlate.setBounds(234, 179, 86, 20);
			frame.getContentPane().add(txtPlate);
			txtPlate.setColumns(10);
			
			txtNumberOfSeat = new JTextField();
			txtNumberOfSeat.setColumns(10);
			txtNumberOfSeat.setBounds(234, 231, 86, 20);
			frame.getContentPane().add(txtNumberOfSeat);
			
			txtType = new JTextField();
			txtType.setColumns(10);
			txtType.setBounds(234, 279, 86, 20);
			frame.getContentPane().add(txtType);
			
			JRadioButton rdbtnTv = new JRadioButton("TV");
			rdbtnTv.setForeground(SystemColor.activeCaption);
			rdbtnTv.setBackground(SystemColor.text);
			rdbtnTv.setBounds(370, 179, 60, 23);
			frame.getContentPane().add(rdbtnTv);
			
			JRadioButton rdbtnWifi = new JRadioButton("Wifi");
			rdbtnWifi.setForeground(SystemColor.activeCaption);
			rdbtnWifi.setBackground(SystemColor.text);
			rdbtnWifi.setBounds(370, 234, 60, 23);
			frame.getContentPane().add(rdbtnWifi);
			
			JRadioButton rdbtnPlug = new JRadioButton("Plug");
			rdbtnPlug.setForeground(SystemColor.activeCaption);
			rdbtnPlug.setBackground(SystemColor.text);
			rdbtnPlug.setBounds(370, 279, 60, 23);
			frame.getContentPane().add(rdbtnPlug);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.addVehicle("BUS", txtPlate.getText(), Integer.parseInt(txtNumberOfSeat.getText()), txtType.getText(), rdbtnWifi.isSelected(), rdbtnTv.isSelected(), rdbtnPlug.isSelected(), " ");
							
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnAdd.setBounds(280, 330, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
			
			JTextField txtPlate;
			JTextField txtNumberOfSeats;
			JTextField txtSize;
			
			frame = new JFrame();
			frame.setTitle("Add Shuttle");
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

			Label label_1 = new Label("Add Shuttle");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(286, 126, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtPlate = new JTextField();
			txtPlate.setBounds(100, 186, 86, 20);
			frame.getContentPane().add(txtPlate);
			txtPlate.setColumns(10);
			
			txtNumberOfSeats = new JTextField();
			txtNumberOfSeats.setColumns(10);
			txtNumberOfSeats.setBounds(311, 186, 86, 20);
			frame.getContentPane().add(txtNumberOfSeats);
			
			txtSize = new JTextField();
			txtSize.setColumns(10);
			txtSize.setBounds(459, 186, 86, 20);
			frame.getContentPane().add(txtSize);
			
			Label label_2 = new Label("Plate");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(62, 186, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_4 = new Label("Number of Seats");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(206, 186, 94, 22);
			frame.getContentPane().add(label_4);
			
			Label label_6 = new Label("Size");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(424, 186, 29, 22);
			frame.getContentPane().add(label_6);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Management.addVehicle("SHUTTLE", txtPlate.getText(), Integer.parseInt(txtNumberOfSeats.getText()), " ", false, false, false, txtSize.getText());
							
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnAdd.setBounds(311, 240, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
	
			JComboBox cbxPhoneType; 
			JTextField txtName,txtSurname,txtGender,txtEmail,txtCountryCode,txtAreaCode,txtNumber
			,txtStreetName,txtTown,txtCity,txtDay,txtMonth,txtYear;

			frame = new JFrame();
			frame.setTitle("Add Member");
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

			Label label_1 = new Label("Add Member");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(264, 127, 180, 22);
			frame.getContentPane().add(label_1);
			
			Label label_2 = new Label("Name");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(122, 177, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_3 = new Label("Surname");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(105, 207, 48, 22);
			frame.getContentPane().add(label_3);
			
			Label label_4 = new Label("E-mail");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(119, 240, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Phone");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(285, 178, 40, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Gender");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(111, 272, 40, 22);
			frame.getContentPane().add(label_6);
			
			Label label_7 = new Label("Birthdate");
			label_7.setForeground(SystemColor.activeCaption);
			label_7.setBounds(275, 207, 49, 22);
			frame.getContentPane().add(label_7);
			
			Label label_8 = new Label("Address");
			label_8.setForeground(SystemColor.activeCaption);
			label_8.setBounds(276, 240, 48, 22);
			frame.getContentPane().add(label_8);
			
			txtName = new JTextField();
			txtName.setBounds(165, 178, 86, 20);
			frame.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			txtSurname = new JTextField();
			txtSurname.setBounds(165, 209, 86, 20);
			frame.getContentPane().add(txtSurname);
			txtSurname.setColumns(10);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(165, 241, 86, 20);
			frame.getContentPane().add(txtEmail);
			
			txtGender = new JTextField();
			txtGender.setColumns(10);
			txtGender.setBounds(165, 273, 86, 20);
			frame.getContentPane().add(txtGender);
			
			txtCountryCode = new JTextField();
			txtCountryCode.setBounds(335, 178, 37, 20);
			frame.getContentPane().add(txtCountryCode);
			txtCountryCode.setColumns(10);
			
			txtAreaCode = new JTextField();
			txtAreaCode.setColumns(10);
			txtAreaCode.setBounds(382, 178, 37, 20);
			frame.getContentPane().add(txtAreaCode);
			
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
			txtNumber.setBounds(429, 178, 47, 20);
			frame.getContentPane().add(txtNumber);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(348, 207, 23, 20);
			frame.getContentPane().add(txtDay);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(381, 207, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(414, 207, 37, 20);
			frame.getContentPane().add(txtYear);
			
			txtStreetName = new JTextField();
			txtStreetName.setColumns(10);
			txtStreetName.setBounds(330, 241, 50, 20);
			frame.getContentPane().add(txtStreetName);
			
			txtTown = new JTextField();
			txtTown.setColumns(10);
			txtTown.setBounds(395, 241, 50, 20);
			frame.getContentPane().add(txtTown);
			
			txtCity = new JTextField();
			txtCity.setColumns(10);
			txtCity.setBounds(458, 241, 50, 20);
			frame.getContentPane().add(txtCity);
			
			cbxPhoneType = new JComboBox();
			cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
			cbxPhoneType.setBounds(483, 178, 76, 20);
			frame.getContentPane().add(cbxPhoneType);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Phone ph = new Phone(Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtAreaCode.getText()), 
									cbxPhoneType.getSelectedItem().toString());
							
							Date birth = new Date(Integer.parseInt(txtDay.getText()), 
									Integer.parseInt(txtMonth.getText()), 
									Integer.parseInt(txtYear.getText()));
							
							Address addr = new Address(txtStreetName.getText(), txtTown.getText(), txtCity.getText());
							
							Management.addMember(txtName.getText(), txtSurname.getText(), txtEmail.getText(), ph, txtGender.getText(), birth, addr);
							
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnAdd.setBounds(286, 319, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
	
			JComboBox cbxPhoneType;
			JTextField txtName,txtSurname,txtGender,txtEmail,txtCountryCode,txtAreaCode,txtNumber
			,txtStreetName,txtTown,txtCity,txtDay,txtMonth,txtYear,txtSalary;

			frame = new JFrame();
			frame.setTitle("Add Bus Driver");
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

			Label label_1 = new Label("Add Bus Driver");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(264, 127, 180, 22);
			frame.getContentPane().add(label_1);
			
			Label label_2 = new Label("Name");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(122, 177, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_3 = new Label("Surname");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(105, 207, 48, 22);
			frame.getContentPane().add(label_3);
			
			Label label_4 = new Label("E-mail");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(119, 240, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Phone");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(285, 178, 35, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Gender");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(111, 272, 40, 22);
			frame.getContentPane().add(label_6);
			
			Label label_7 = new Label("Birthdate");
			label_7.setForeground(SystemColor.activeCaption);
			label_7.setBounds(275, 207, 49, 22);
			frame.getContentPane().add(label_7);
			
			Label label_8 = new Label("Address");
			label_8.setForeground(SystemColor.activeCaption);
			label_8.setBounds(276, 240, 48, 22);
			frame.getContentPane().add(label_8);
			
			Label label_9 = new Label("Salary");
			label_9.setForeground(SystemColor.activeCaption);
			label_9.setBounds(286, 272, 40, 22);
			frame.getContentPane().add(label_9);
			
			txtName = new JTextField();
			txtName.setBounds(165, 178, 86, 20);
			frame.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			txtSurname = new JTextField();
			txtSurname.setBounds(165, 209, 86, 20);
			frame.getContentPane().add(txtSurname);
			txtSurname.setColumns(10);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(165, 241, 86, 20);
			frame.getContentPane().add(txtEmail);
			
			txtGender = new JTextField();
			txtGender.setColumns(10);
			txtGender.setBounds(165, 273, 86, 20);
			frame.getContentPane().add(txtGender);
			
			txtCountryCode = new JTextField();
			txtCountryCode.setBounds(335, 178, 37, 20);
			frame.getContentPane().add(txtCountryCode);
			txtCountryCode.setColumns(10);
			
			txtAreaCode = new JTextField();
			txtAreaCode.setColumns(10);
			txtAreaCode.setBounds(382, 178, 37, 20);
			frame.getContentPane().add(txtAreaCode);
			
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
			txtNumber.setBounds(429, 178, 47, 20);
			frame.getContentPane().add(txtNumber);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(348, 207, 23, 20);
			frame.getContentPane().add(txtDay);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(381, 207, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(414, 207, 37, 20);
			frame.getContentPane().add(txtYear);
			
			txtStreetName = new JTextField();
			txtStreetName.setColumns(10);
			txtStreetName.setBounds(330, 241, 50, 20);
			frame.getContentPane().add(txtStreetName);
			
			txtTown = new JTextField();
			txtTown.setColumns(10);
			txtTown.setBounds(395, 241, 50, 20);
			frame.getContentPane().add(txtTown);
			
			txtCity = new JTextField();
			txtCity.setColumns(10);
			txtCity.setBounds(458, 241, 50, 20);
			frame.getContentPane().add(txtCity);
			
			txtSalary = new JTextField();
			txtSalary.setColumns(10);
			txtSalary.setBounds(340, 273, 60, 20);
			frame.getContentPane().add(txtSalary);
			
			cbxPhoneType = new JComboBox();
			cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
			cbxPhoneType.setBounds(483, 178, 76, 20);
			frame.getContentPane().add(cbxPhoneType);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Phone ph = new Phone(Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtAreaCode.getText()), 
									cbxPhoneType.getSelectedItem().toString());
							
							Date birth = new Date(Integer.parseInt(txtDay.getText()), 
									Integer.parseInt(txtMonth.getText()), 
									Integer.parseInt(txtYear.getText()));
							
							Address addr = new Address(txtStreetName.getText(), txtTown.getText(), txtCity.getText());
							
							Management.addBusDriver(txtName.getText(), txtSurname.getText(), txtEmail.getText(), ph, addr, txtGender.getText(), Integer.parseInt(txtSalary.getText()), birth);
						
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						
						}
					});
			btnAdd.setBounds(286, 319, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
	
			JComboBox cbxPhoneType;
			JTextField txtName,txtSurname,txtGender,txtEmail,txtCountryCode,txtAreaCode,txtNumber
			,txtStreetName,txtTown,txtCity,txtDay,txtMonth,txtYear,txtSalary;

			frame = new JFrame();
			frame.setTitle("Add Assistant");
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

			Label label_1 = new Label("Add Assistant");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(264, 127, 180, 22);
			frame.getContentPane().add(label_1);
			
			Label label_2 = new Label("Name");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(122, 177, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_3 = new Label("Surname");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(105, 207, 48, 22);
			frame.getContentPane().add(label_3);
			
			Label label_4 = new Label("E-mail");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(119, 240, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Phone");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(285, 178, 35, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Gender");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(111, 272, 40, 22);
			frame.getContentPane().add(label_6);
			
			Label label_7 = new Label("Birthdate");
			label_7.setForeground(SystemColor.activeCaption);
			label_7.setBounds(275, 207, 49, 22);
			frame.getContentPane().add(label_7);
			
			Label label_8 = new Label("Address");
			label_8.setForeground(SystemColor.activeCaption);
			label_8.setBounds(276, 240, 48, 22);
			frame.getContentPane().add(label_8);
			
			Label label_9 = new Label("Salary");
			label_9.setForeground(SystemColor.activeCaption);
			label_9.setBounds(286, 272, 40, 22);
			frame.getContentPane().add(label_9);
			
			txtName = new JTextField();
			txtName.setBounds(165, 178, 86, 20);
			frame.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			txtSurname = new JTextField();
			txtSurname.setBounds(165, 209, 86, 20);
			frame.getContentPane().add(txtSurname);
			txtSurname.setColumns(10);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(165, 241, 86, 20);
			frame.getContentPane().add(txtEmail);
			
			txtGender = new JTextField();
			txtGender.setColumns(10);
			txtGender.setBounds(165, 273, 86, 20);
			frame.getContentPane().add(txtGender);
			
			txtCountryCode = new JTextField();
			txtCountryCode.setBounds(335, 178, 37, 20);
			frame.getContentPane().add(txtCountryCode);
			txtCountryCode.setColumns(10);
			
			txtAreaCode = new JTextField();
			txtAreaCode.setColumns(10);
			txtAreaCode.setBounds(382, 178, 37, 20);
			frame.getContentPane().add(txtAreaCode);
			
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
			txtNumber.setBounds(429, 178, 47, 20);
			frame.getContentPane().add(txtNumber);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(348, 207, 23, 20);
			frame.getContentPane().add(txtDay);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(381, 207, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(414, 207, 37, 20);
			frame.getContentPane().add(txtYear);
			
			txtStreetName = new JTextField();
			txtStreetName.setColumns(10);
			txtStreetName.setBounds(330, 241, 50, 20);
			frame.getContentPane().add(txtStreetName);
			
			txtTown = new JTextField();
			txtTown.setColumns(10);
			txtTown.setBounds(395, 241, 50, 20);
			frame.getContentPane().add(txtTown);
			
			txtCity = new JTextField();
			txtCity.setColumns(10);
			txtCity.setBounds(458, 241, 50, 20);
			frame.getContentPane().add(txtCity);
			
			txtSalary = new JTextField();
			txtSalary.setColumns(10);
			txtSalary.setBounds(340, 273, 60, 20);
			frame.getContentPane().add(txtSalary);
			
			cbxPhoneType = new JComboBox();
			cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
			cbxPhoneType.setBounds(483, 178, 76, 20);
			frame.getContentPane().add(cbxPhoneType);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Phone ph = new Phone(Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtAreaCode.getText()), 
									cbxPhoneType.getSelectedItem().toString());
							
							Date birth = new Date(Integer.parseInt(txtDay.getText()), 
									Integer.parseInt(txtMonth.getText()), 
									Integer.parseInt(txtYear.getText()));
							
							Address addr = new Address(txtStreetName.getText(), txtTown.getText(), txtCity.getText());
							
							Management.addAssistant(txtName.getText(), txtSurname.getText(), txtEmail.getText(), ph, addr, txtGender.getText(), Integer.parseInt(txtSalary.getText()), birth);
						
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						 
						}
					});
			btnAdd.setBounds(286, 319, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
	
			JComboBox cbxPhoneType;
			JTextField txtName,txtSurname,txtGender,txtEmail,txtCountryCode,txtAreaCode,txtNumber
			,txtStreetName,txtTown,txtCity,txtDay,txtMonth,txtYear,txtSalary,txtAgentID,txtOfficeID;

			frame = new JFrame();
			frame.setTitle("Add Ticket Agent");
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

			Label label_1 = new Label("Add Ticket Agent");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(264, 127, 180, 22);
			frame.getContentPane().add(label_1);
			
			Label label_2 = new Label("Name");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(122, 177, 37, 22);
			frame.getContentPane().add(label_2);
			
			Label label_3 = new Label("Surname");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(105, 207, 48, 22);
			frame.getContentPane().add(label_3);
			
			Label label_4 = new Label("E-mail");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(119, 240, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Phone");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(285, 178, 35, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Gender");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(111, 272, 40, 22);
			frame.getContentPane().add(label_6);
			
			Label label_7 = new Label("Birthdate");
			label_7.setForeground(SystemColor.activeCaption);
			label_7.setBounds(275, 207, 49, 22);
			frame.getContentPane().add(label_7);
			
			Label label_8 = new Label("Address");
			label_8.setForeground(SystemColor.activeCaption);
			label_8.setBounds(276, 240, 48, 22);
			frame.getContentPane().add(label_8);
			
			Label label_9 = new Label("Salary");
			label_9.setForeground(SystemColor.activeCaption);
			label_9.setBounds(286, 272, 40, 22);
			frame.getContentPane().add(label_9);
			
			Label label_10 = new Label("Agent ID");
			label_10.setForeground(SystemColor.activeCaption);
			label_10.setBounds(105, 303, 48, 22);
			frame.getContentPane().add(label_10);
			
			Label label_11 = new Label("Office ID");
			label_11.setForeground(SystemColor.activeCaption);
			label_11.setBounds(274, 303, 48, 22);
			frame.getContentPane().add(label_11);
			
			txtName = new JTextField();
			txtName.setBounds(165, 178, 86, 20);
			frame.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			txtSurname = new JTextField();
			txtSurname.setBounds(165, 209, 86, 20);
			frame.getContentPane().add(txtSurname);
			txtSurname.setColumns(10);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(165, 241, 86, 20);
			frame.getContentPane().add(txtEmail);
			
			txtGender = new JTextField();
			txtGender.setColumns(10);
			txtGender.setBounds(165, 273, 86, 20);
			frame.getContentPane().add(txtGender);
			
			txtCountryCode = new JTextField();
			txtCountryCode.setBounds(335, 178, 37, 20);
			frame.getContentPane().add(txtCountryCode);
			txtCountryCode.setColumns(10);
			
			txtAreaCode = new JTextField();
			txtAreaCode.setColumns(10);
			txtAreaCode.setBounds(382, 178, 37, 20);
			frame.getContentPane().add(txtAreaCode);
			
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
			txtNumber.setBounds(429, 178, 47, 20);
			frame.getContentPane().add(txtNumber);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(348, 207, 23, 20);
			frame.getContentPane().add(txtDay);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(381, 207, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(414, 207, 37, 20);
			frame.getContentPane().add(txtYear);
			
			txtStreetName = new JTextField();
			txtStreetName.setColumns(10);
			txtStreetName.setBounds(330, 241, 50, 20);
			frame.getContentPane().add(txtStreetName);
			
			txtTown = new JTextField();
			txtTown.setColumns(10);
			txtTown.setBounds(395, 241, 50, 20);
			frame.getContentPane().add(txtTown);
			
			txtCity = new JTextField();
			txtCity.setColumns(10);
			txtCity.setBounds(458, 241, 50, 20);
			frame.getContentPane().add(txtCity);
			
			txtSalary = new JTextField();
			txtSalary.setColumns(10);
			txtSalary.setBounds(340, 273, 60, 20);
			frame.getContentPane().add(txtSalary);
			
			txtAgentID = new JTextField();
			txtAgentID.setColumns(10);
			txtAgentID.setBounds(165, 304, 86, 20);
			frame.getContentPane().add(txtAgentID);
			
			txtOfficeID = new JTextField();
			txtOfficeID.setColumns(10);
			txtOfficeID.setBounds(330, 304, 86, 20);
			frame.getContentPane().add(txtOfficeID);
			
			cbxPhoneType = new JComboBox();
			cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
			cbxPhoneType.setBounds(483, 178, 76, 20);
			frame.getContentPane().add(cbxPhoneType);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Phone ph = new Phone(Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtAreaCode.getText()), 
									cbxPhoneType.getSelectedItem().toString());
							
							Date birth = new Date(Integer.parseInt(txtDay.getText()), 
									Integer.parseInt(txtMonth.getText()), 
									Integer.parseInt(txtYear.getText()));
							
							Address addr = new Address(txtStreetName.getText(), txtTown.getText(), txtCity.getText());
							
							Management.addTicketAgent(txtName.getText(), txtSurname.getText(), txtEmail.getText(), ph, addr, txtGender.getText(), Integer.parseInt(txtSalary.getText()), birth, Integer.parseInt(txtOfficeID.getText()));
						
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						    
						}
					});
			btnAdd.setBounds(283, 345, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
			
			JComboBox cbxPhoneType;
			JTextField txtOfficeName,txtAdminID,txtStreetName,txtCity,txtTown,txtCountryCode,txtAreaCode,txtNumber;
			
			frame = new JFrame();
			frame.setTitle("Add Office");
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

			Label label_1 = new Label("Add Office");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(235, 128, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtOfficeName = new JTextField();
			txtOfficeName.setBounds(132, 183, 86, 20);
			frame.getContentPane().add(txtOfficeName);
			txtOfficeName.setColumns(10);
			
			txtAdminID = new JTextField();
			txtAdminID.setColumns(10);
			txtAdminID.setBounds(132, 219, 86, 20);
			frame.getContentPane().add(txtAdminID);
			
			Label label_2 = new Label("Office Name");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(56, 181, 70, 22);
			frame.getContentPane().add(label_2);
			
			Label label_4 = new Label("Admin");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(86, 218, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Phone");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(252, 183, 35, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Address");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(240, 219, 48, 22);
			frame.getContentPane().add(label_6);
			
			txtTown = new JTextField();
			txtTown.setColumns(10);
			txtTown.setBounds(467, 219, 70, 20);
			frame.getContentPane().add(txtTown);
			
			txtStreetName = new JTextField();
			txtStreetName.setColumns(10);
			txtStreetName.setBounds(299, 219, 70, 20);
			frame.getContentPane().add(txtStreetName);
			
			txtCity = new JTextField();
			txtCity.setColumns(10);
			txtCity.setBounds(383, 219, 70, 20);
			frame.getContentPane().add(txtCity);
			
			txtCountryCode = new JTextField();
			txtCountryCode.setBounds(299, 183, 37, 20);
			frame.getContentPane().add(txtCountryCode);
			txtCountryCode.setColumns(10);
			
			txtAreaCode = new JTextField();
			txtAreaCode.setColumns(10);
			txtAreaCode.setBounds(344, 183, 37, 20);
			frame.getContentPane().add(txtAreaCode);
			
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
			txtNumber.setBounds(388, 183, 47, 20);
			frame.getContentPane().add(txtNumber);
			
			cbxPhoneType = new JComboBox();
			cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
			cbxPhoneType.setBounds(483, 178, 76, 20);
			frame.getContentPane().add(cbxPhoneType);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Phone ph = new Phone(Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtCountryCode.getText()), 
									Integer.parseInt(txtAreaCode.getText()), 
									cbxPhoneType.getSelectedItem().toString());
							
							Address addr = new Address(txtStreetName.getText(), txtTown.getText(), txtCity.getText());
							
							Management.addOffice(txtOfficeName.getText(), Integer.parseInt(txtAdminID.getText()), addr, ph);
							
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
							adm = new AdminMenu();
						    adm.getFrame().setVisible(true);
						    frame.setVisible(false);
						}
					});
			btnAdd.setBounds(252, 272, 70, 22);
			frame.getContentPane().add(btnAdd);
			
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
			
			JTextField txtTicketPrice,txtHour,txtMinute,txtBusID,txtDriverID,txtAssistantID
			,txtDay,txtMonth,txtYear;
			
			frame = new JFrame();
			frame.setTitle("Add Trip");
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

			Label label_1 = new Label("Add Trip");
			label_1.setForeground(SystemColor.activeCaption);
			label_1.setFont(new Font("Kristen ITC", Font.BOLD, 21));
			label_1.setBounds(256, 130, 180, 22);
			frame.getContentPane().add(label_1);
			
			txtTicketPrice = new JTextField();
			txtTicketPrice.setBounds(179, 182, 86, 20);
			frame.getContentPane().add(txtTicketPrice);
			txtTicketPrice.setColumns(10);
			
			txtBusID = new JTextField();
			txtBusID.setColumns(10);
			txtBusID.setBounds(179, 262, 86, 20);
			frame.getContentPane().add(txtBusID);
			
			Label label_2 = new Label("Ticket Price");
			label_2.setForeground(SystemColor.activeCaption);
			label_2.setBounds(99, 182, 64, 22);
			frame.getContentPane().add(label_2);
			
			Label label_4 = new Label("Bus ID");
			label_4.setForeground(SystemColor.activeCaption);
			label_4.setBounds(124, 261, 39, 22);
			frame.getContentPane().add(label_4);
			
			Label label_5 = new Label("Driver ID");
			label_5.setForeground(SystemColor.activeCaption);
			label_5.setBounds(323, 181, 60, 22);
			frame.getContentPane().add(label_5);
			
			Label label_6 = new Label("Assistant ID");
			label_6.setForeground(SystemColor.activeCaption);
			label_6.setBounds(308, 221, 70, 22);
			frame.getContentPane().add(label_6);
			
			txtDay = new JTextField();
			txtDay.setColumns(10);
			txtDay.setBounds(384, 262, 23, 20);
			frame.getContentPane().add(txtDay);
			
			txtMonth = new JTextField();
			txtMonth.setColumns(10);
			txtMonth.setBounds(416, 262, 23, 20);
			frame.getContentPane().add(txtMonth);
			
			txtYear = new JTextField();
			txtYear.setColumns(10);
			txtYear.setBounds(448, 262, 37, 20);
			frame.getContentPane().add(txtYear);
			
			Label label_3 = new Label("Date");
			label_3.setForeground(SystemColor.activeCaption);
			label_3.setBounds(346, 261, 30, 22);
			frame.getContentPane().add(label_3);
			
			Label label_7 = new Label("Departure Time");
			label_7.setForeground(SystemColor.activeCaption);
			label_7.setBounds(76, 222, 90, 22);
			frame.getContentPane().add(label_7);
			
			txtHour = new JTextField();
			txtHour.setBounds(179, 222, 39, 20);
			frame.getContentPane().add(txtHour);
			txtHour.setColumns(10);
			
			txtMinute = new JTextField();
			txtMinute.setColumns(10);
			txtMinute.setBounds(226, 222, 39, 20);
			frame.getContentPane().add(txtMinute);
			
			txtDriverID = new JTextField();
			txtDriverID.setColumns(10);
			txtDriverID.setBounds(384, 182, 86, 20);
			frame.getContentPane().add(txtDriverID);
			
			txtAssistantID = new JTextField();
			txtAssistantID.setColumns(10);
			txtAssistantID.setBounds(384, 222, 86, 20);
			frame.getContentPane().add(txtAssistantID);
			
			Button btnAdd = new Button("Add");
			btnAdd.setForeground(SystemColor.text);
			btnAdd.setBackground(SystemColor.activeCaption);
			btnAdd.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							Clock departureTime = new Clock(Integer.parseInt(txtHour.getText()), Integer.parseInt(txtMinute.getText()));
							
							Date d = new Date(Integer.parseInt(txtDay.getText()), 
									Integer.parseInt(txtMonth.getText()), 
									Integer.parseInt(txtYear.getText()));

							Management.addTrip(Double.parseDouble(txtTicketPrice.getText()), departureTime, Integer.parseInt(txtBusID.getText()), Integer.parseInt(txtDriverID.getText()), Integer.parseInt(txtAssistantID.getText()), d);
							
							SingleObjectX object = SingleObjectX.getInstance();
							JOptionPane.showMessageDialog(frame, object.message());
							
						    
						}
					});
			btnAdd.setBounds(270, 306, 70, 22);
			frame.getContentPane().add(btnAdd);
			
			Button btnSetRoute = new Button("Set Route");
			btnSetRoute.setForeground(SystemColor.text);
			btnSetRoute.setBackground(SystemColor.activeCaption);
			btnSetRoute.addActionListener(new ActionListener()  //create an instance of the listener
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							sr = new SetRoute();
						    sr.getFrame().setVisible(true);
						    frame.setVisible(false);
							
						}
					});
			btnSetRoute.setBounds(470, 306, 70, 22);
			frame.getContentPane().add(btnSetRoute);
			
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
		
		
	}
}
