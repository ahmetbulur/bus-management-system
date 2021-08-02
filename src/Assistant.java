
public class Assistant extends Employee{
	private int assistantID;
	private boolean isUnderWay;
	private String location;
	private static int IDcount=0;
	public Assistant(String name, String surname, String email, Phone phone, Address address, String gender, int salary,
			Date birthdate) {
		super(name, surname, email, phone, address, gender, salary, birthdate);
		this.assistantID = ++IDcount;
		this.isUnderWay = false;
		this.location = "";
	}

	public int getAssistantID() {
		return assistantID;
	}

	public void setAssistantID(int assistantID) {
		this.assistantID = assistantID;
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
