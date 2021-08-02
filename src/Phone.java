
public class Phone {
	private int countryCode;
	private int areaCode;
	private int number;
	private String type;
	public Phone(int countryCode, int areaCode, int number, String type) {
		
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
		this.type = type;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", areaCode=" + areaCode + ", number=" + number + ", type=" + type
				+ "]";
	}
	
	
}
