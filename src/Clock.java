
public class Clock {
	private int hour;
	private int minute;
	public Clock(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	public String convert() { // AM PM conversion
		return "";
	}
	
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	@Override
	public String toString() {
		return "Clock [hour=" + hour + ", minute=" + minute + "]";
	}
	
	
}
