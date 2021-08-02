
public class Seat {
	private int seatID;
	private boolean isAvailable;
	public Seat(int seatID, boolean isAvailable) {
		this.seatID = seatID;
		this.isAvailable = isAvailable;
	}
	public int getSeatID() {
		return seatID;
	}
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}
