
public class VehicleFactory {
	
	public IVehicle getVehicle(String vehicleType, String plate, int numberOfSeats, String type, boolean wifi, boolean tv, boolean plug, String size) {
		
		if(vehicleType.equalsIgnoreCase("BUS")){
			return new Bus(vehicleType, plate, numberOfSeats, type, wifi, tv, plug);
		}
		else if(vehicleType.equalsIgnoreCase("SHUTTLE"))
			return new Shuttle(vehicleType, plate, numberOfSeats, size);
		else
			return null;
		
	}

}
