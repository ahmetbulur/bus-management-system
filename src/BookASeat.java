
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class BookASeat {

	private JFrame frmBookASeat;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtEmail;
	private JTextField txtCountryCode;
	private JTextField txtAreaCode;
	private JTextField txtPhoneNumber;
	private JComboBox cbxPhoneType; 
    private JComboBox cbxSeatNumber;
    private JRadioButton rbtnGenderFemale;
    private JRadioButton rbtnGenderMale;
    private JFrame superF;
	
	public JFrame getFrame() {
		return frmBookASeat;
	}


	public void setFrame(JFrame frame) {
		this.frmBookASeat = frame;
	}


	public BookASeat(JFrame superF) 
	{
		frmBookASeat = new JFrame();
		frmBookASeat.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		frmBookASeat.setTitle("Book a seat");
		frmBookASeat.setBounds(100, 100, 328, 329);
		frmBookASeat.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(33, 30, 46, 14);
		frmBookASeat.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(33, 55, 46, 14);
		frmBookASeat.getContentPane().add(lblSurname);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(33, 70, 46, 14);
		frmBookASeat.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setBounds(33, 80, 46, 14);
		frmBookASeat.getContentPane().add(lblNewLabel);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(33, 105, 46, 14);
		frmBookASeat.getContentPane().add(lblPhone);
		
		txtName = new JTextField();
		txtName.setBounds(100, 27, 86, 20);
		frmBookASeat.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(100, 52, 86, 20);
		frmBookASeat.getContentPane().add(txtSurname);
		txtSurname.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(100, 70, 86, 20);
		frmBookASeat.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		rbtnGenderFemale = new JRadioButton("Female");
		rbtnGenderFemale.setBounds(100, 76, 59, 23);
		frmBookASeat.getContentPane().add(rbtnGenderFemale);
		
		rbtnGenderMale = new JRadioButton("Male");
		rbtnGenderMale.setBounds(173, 76, 109, 23);
		frmBookASeat.getContentPane().add(rbtnGenderMale);
		
		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnGenderFemale);
		btnG.add(rbtnGenderMale);
		
		txtCountryCode = new JTextField();
		txtCountryCode.setBounds(100, 102, 24, 20);
		frmBookASeat.getContentPane().add(txtCountryCode);
		txtCountryCode.setColumns(10);
		
		txtAreaCode = new JTextField();
		txtAreaCode.setBounds(134, 102, 32, 20);
		frmBookASeat.getContentPane().add(txtAreaCode);
		txtAreaCode.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(173, 102, 86, 20);
		frmBookASeat.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		JLabel lblPhoneType = new JLabel("Phone Type:");
		lblPhoneType.setBounds(33, 142, 68, 14);
		frmBookASeat.getContentPane().add(lblPhoneType);
		
		cbxPhoneType = new JComboBox();
		cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
		cbxPhoneType.setBounds(173, 139, 76, 20);
		frmBookASeat.getContentPane().add(cbxPhoneType);
		
		JLabel lblSeatNumber = new JLabel("Seat Number:");
		lblSeatNumber.setBounds(33, 180, 126, 14);
		frmBookASeat.getContentPane().add(lblSeatNumber);
		
		cbxSeatNumber = new JComboBox();
		cbxSeatNumber.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbxSeatNumber.setBounds(173, 177, 66, 20);
		frmBookASeat.getContentPane().add(cbxSeatNumber);
		
		JOptionPane.showMessageDialog(frmBookASeat, cbxSeatNumber.getSelectedItem());
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//

			}
		});
		btnAdd.setBounds(134, 235, 89, 23);
		frmBookASeat.getContentPane().add(btnAdd);
	}
}
