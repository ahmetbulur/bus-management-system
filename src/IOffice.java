
public interface IOffice {
	
	public void addAgent(TicketAgent newAgent);
	
	public int getOfficeID();
	
	public void setOfficeID(int officeID);

	public String getOfficeName();

	public void setOfficeName(String officeName);

	public int getAdminID();

	public void setAdminID(int adminID);

	public Address getAddress();

	public void setAddress(Address address);

	public Phone getPhone();

	public void setPhone(Phone phone);
	
}
