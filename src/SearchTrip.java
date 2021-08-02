import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class SearchTrip {
	
	private JFrame frmSearchTrip;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JTextField txtDeparture;
	private JTextField txtDestination;
	private BookASeat bs;
	
    private JFrame superF;
	
    public JFrame getFrame() {
		return frmSearchTrip;
	}


	public void setFrame(JFrame frame) {
		this.frmSearchTrip = frame;
	}
    
	public SearchTrip(JFrame superF) {
		
		frmSearchTrip = new JFrame();
		frmSearchTrip.addWindowListener(new WindowAdapter() {
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
		
		frmSearchTrip.setTitle("Search Trip");
		frmSearchTrip.setBounds(100, 100, 328, 329);
		frmSearchTrip.getContentPane().setLayout(null);
		
		JLabel lblDay = new JLabel("Day :");
		lblDay.setBounds(33, 30, 46, 14);
		frmSearchTrip.getContentPane().add(lblDay);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setBounds(33, 55, 46, 14);
		frmSearchTrip.getContentPane().add(lblMonth);
		
		JLabel lblYear = new JLabel("Year :");
		lblYear.setBounds(33, 80, 46, 14);
		frmSearchTrip.getContentPane().add(lblYear);
		
		JLabel lblDeparture = new JLabel("Departure :");
		lblDeparture.setBounds(33, 105, 46, 14);
		frmSearchTrip.getContentPane().add(lblDeparture);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setBounds(33, 130, 46, 14);
		frmSearchTrip.getContentPane().add(lblDestination);
		
		txtDay = new JTextField();
		txtDay.setBounds(100, 27, 86, 20);
		frmSearchTrip.getContentPane().add(txtDay);
		txtDay.setColumns(10);
		
		txtMonth = new JTextField();
		txtMonth.setBounds(100, 52, 86, 20);
		frmSearchTrip.getContentPane().add(txtMonth);
		txtMonth.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(100, 77, 86, 20);
		frmSearchTrip.getContentPane().add(txtYear);
		txtYear.setColumns(10);
		
		txtDeparture = new JTextField();
		txtDeparture.setBounds(100, 102, 86, 20);
		frmSearchTrip.getContentPane().add(txtDeparture);
		txtDeparture.setColumns(10);
		
		txtDestination = new JTextField();
		txtDestination.setBounds(100, 127, 86, 20);
		frmSearchTrip.getContentPane().add(txtDestination);
		txtDestination.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				Date d = new Date(Integer.parseInt(txtDay.getText()), 
						Integer.parseInt(txtMonth.getText()),
						Integer.parseInt(txtYear.getText())
						);
				
				try {
					Management.searchTrip(d, txtDeparture.getText(), txtDestination.getText());
					bs = new BookASeat(frmSearchTrip);
					bs.getFrame().setVisible(true);
					frmSearchTrip.setVisible(false);
				} catch (QueueEmpty e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnSearch.setBounds(134, 235, 89, 23);
		frmSearchTrip.getContentPane().add(btnSearch);
		
	}
	

}
