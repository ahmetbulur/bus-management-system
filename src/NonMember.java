
public class NonMember extends Passenger{
	private int NonmemberID;

	public NonMember(String name, String surname, String email, Phone phone, String gender, int nonmemberID) {
		super(name, surname, email, phone, gender);
		NonmemberID = nonmemberID;
	}

	public int getNonmemberID() {
		return NonmemberID;
	}

	public void setNonmemberID(int nonmemberID) {
		NonmemberID = nonmemberID;
	}
	
	
}
