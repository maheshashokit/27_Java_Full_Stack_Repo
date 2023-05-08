public class Address {

	public String doorNo;
	public String streetName;
	public String cityName;
	public String pinCode;

	public Address() {
		System.out.println("Address Class Default Constructor!!!!!");
	}

	public Address(String doorNo, String streetName, String cityName, String pinCode) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}
	
	public void setAddressDetails(String doorNo, String streetName, String cityName, String pinCode) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}

	public void displayAddressInfo() {
		System.out.println(doorNo + "=====" + streetName + "======" + cityName + "=======" + pinCode);
	}
}