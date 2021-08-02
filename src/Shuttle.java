
public class Shuttle extends Vehicle implements IVehicle{
	private String size;
	private String vehicleType;

	public Shuttle(String vehicleType, String plate, int numberOfSeat, String size) {
		super(plate, numberOfSeat);
		this.vehicleType = vehicleType;
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	
	
	
}
