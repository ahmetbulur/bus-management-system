
public class Member extends Passenger{
	private Date birthdate;
	private Address address;
	private int memberID;
	private int cardID;
	private double awardCredit;
	private static int cardCounter = 0;
    private static int memberCounter = 0;

    public Member(String name, String surname, String email, Phone phone, String gender, Date birthdate,
            Address address) {
        super(name, surname, email, phone, gender);
        this.birthdate = birthdate;
        this.address = address;
        this.memberID = ++memberCounter;
        this.cardID = ++cardCounter;
        this.awardCredit = 0;
    }
	public double calculateAwardCredit() { 
		//
		//
		//
		return 1.2;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public double getAwardCredit() {
		return awardCredit;
	}

	public void setAwardCredit(double awardCredit) {
		this.awardCredit = awardCredit;
	}
	
	
}
