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
		
		System.out.println("Passenger ::::" + pas);
		System.out.println("Passenger ::::" + pas.toString());
		
		Integer i = 30;
		System.out.println("Integer :::::" + i);
		System.out.println("Integer :::::" + i.toString());
		
		//Widening i.e.,Implicit Casting
		long lg =36987;
		System.out.println("lg ====" + lg);
		float ft = lg;
		System.out.println("Float Value::::" + ft);
		
		//narrowing i.e.,Explicit Casting
		int a = 40000;
		System.out.println("a =" + a);
		short sh =(short) a;
		System.out.println("sh =" + sh);
	}
}