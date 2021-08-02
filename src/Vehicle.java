
public abstract class Vehicle {
	
	private int vehicleID;
	private String plate;
	private int numberOfSeat;
	private static int IdCount= 0;
	
	public Vehicle(String plate, int numberOfSeat) {
		this.vehicleID = ++IdCount;
		this.plate = plate;
		this.numberOfSeat = numberOfSeat;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	
	
	
	
	
}
