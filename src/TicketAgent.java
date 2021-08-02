
public class TicketAgent extends Employee{
	private int agentID;
	private int officeID;
	private static int IDcount= 0;
	
	public TicketAgent(String name, String surname, String email, Phone phone, Address address, String gender,
			int salary, Date birthdate, int officeID) {
		super(name, surname, email, phone, address, gender, salary, birthdate);
		this.agentID = ++IDcount;
		this.officeID = officeID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	public int getOfficeID() {
		return officeID;
	}
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}
	
}
