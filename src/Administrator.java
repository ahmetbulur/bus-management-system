
public class Administrator extends Employee {
	private int officeID;
	private String status;
	private int adminID;
	private static int IDcount = 0;
	
	public Administrator(String name, String surname, String email, Phone phone, Address address, String gender,
			int salary, Date birthdate, int officeID, String status) {
		super(name, surname, email, phone, address, gender, salary, birthdate);
		this.officeID = officeID;
		this.status = status;
		this.adminID = ++IDcount;
	}
	public int getOfficeID() {
		return officeID;
	}
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
