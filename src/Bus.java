
public class Bus extends Vehicle implements IVehicle{
	
	private String vehicleType;
	private String type;
	private boolean wifi;
	private boolean tv;
	private boolean plug;
	private Seat[] seats;
	
	public Bus(String vehicleType, String plate, int numberOfSeats, String type, boolean wifi, boolean tv, boolean plug) {
		super(plate, numberOfSeats);
		
		this.vehicleType = vehicleType;
		this.type = type;
		this.wifi = wifi;
		this.tv = tv;
		this.plug = plug;
		seats = new Seat[numberOfSeats];
		for (int i = 0; i < numberOfSeats; i++) {
			this.seats[i] = new Seat(i+1,true);
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isPlug() {
		return plug;
	}
	public void setPlug(boolean plug) {
		this.plug = plug;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	public boolean isSeatAvailable(int seatID) {
		boolean flag = false;
		for (int i = 0; i < seats.length; i++) {
			if(seats[i].getSeatID() == seatID && seats[i].isAvailable()) {
				flag = true;
				seats[i].setAvailable(false);
			}
		}
		return flag;
	}
	public void clearSeat() {
		for (int i = 0; i < seats.length; i++) {
			seats[i].setAvailable(true);
		}
	}
	
	
	public String toString() {
        return "Bus [plate=" + getPlate() + ", type=" + type + ", wifi=" + wifi + ", tv=" + tv + ", plug=" + plug + "numberOfSeats= " + getNumberOfSeat() +"]";
    }
	
}
