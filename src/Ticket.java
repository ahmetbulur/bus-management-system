
public class Ticket {
	private String status;
	private boolean isMember;
	private Member member;
	private NonMember nonMember;
	private int seatID;
	private int tripID;
	private int ticketID;
	
	public Ticket(String status, boolean isMember, Member member, NonMember nonMember, int tripID, int ticketID, int seatID) {
		super();
		this.status = status;
		this.isMember = isMember;
		this.member = member;
		this.nonMember = nonMember;
		this.tripID = tripID;
		this.ticketID = ticketID;
		this.seatID = seatID;
	}
	
	public int getSeatID() {
		return seatID;
	}

	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public NonMember getNonMember() {
		return nonMember;
	}

	public void setNonMember(NonMember nonMember) {
		this.nonMember = nonMember;
	}

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	
}
