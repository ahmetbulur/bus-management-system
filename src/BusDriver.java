
public class BusDriver extends Employee{
	private int driverID;
	private boolean isUnderWay;
	private String location;
	private static int IDcount= 0;
	public BusDriver(String name, String surname, String email, Phone phone, Address address, String gender, int salary,
			Date birthdate) {
		
		super(name, surname, email, phone, address, gender, salary, birthdate);
		this.driverID = ++IDcount;
		this.isUnderWay = false;
		this.location = "";
	}

	public int getDriverID() {
		return driverID;
	}

	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}

	public boolean isUnderWay() {
		return isUnderWay;
	}

	public void setUnderWay(boolean isUnderWay) {
		this.isUnderWay = isUnderWay;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
