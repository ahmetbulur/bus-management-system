
public class City {
	
	private String cityName;
	private Clock arriveTime;
	public City(String cityName, Clock arriveTime) {
		
		this.cityName = cityName;
		this.arriveTime = arriveTime;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Clock getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Clock arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	
}
