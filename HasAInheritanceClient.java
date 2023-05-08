public class HasAInheritanceClient {

	public static void main(String[] args) {
		
		//Creating the main Object i.e.,Passenger Class object
		Passenger pas = new Passenger("Mahesh","Mahesh.ashokit@gmail.com","12323232");
		
		//Access Address object through Passenger Object i.e.,pas
		pas.add.setAddressDetails("1-2-3", "ABC", "Hyderabad", "1212121");
		
		//printing the object
		System.out.println(pas.add);
		System.out.println(pas.add.toString());
		
		//Calling the display methods using Passsenger Object
		pas.displayPassengerDetails();
		pas.add.displayAddressInfo();
	}
}