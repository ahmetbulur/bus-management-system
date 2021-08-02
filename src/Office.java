
public class Office implements IOffice{
	
	private int officeID;
	private String officeName;
	private TicketAgent[] agents;
	private int adminID;
	private Address address;
	private Phone phone;
	private int numberOfAgents= 0;
	private static int IDcount= 0;
	
	public Office(String officeName, int adminID, Address address, Phone phone) {
		
		this.officeID = ++IDcount;
		this.officeName = officeName;
		this.adminID = adminID;
		this.address = address;
		this.phone = phone;
		agents= new TicketAgent[100];
	}
	@Override
	public void addAgent(TicketAgent newAgent) {
		agents[numberOfAgents] = newAgent;
		numberOfAgents++;
	}
	@Override
	public int getOfficeID() {
		return officeID;
	}
	
	@Override
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}
	
	@Override
	public String getOfficeName() {
		return officeName;
	}
	
	@Override
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	@Override
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Phone getPhone() {
		return phone;
	}
	
	@Override
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	
	
	
}
