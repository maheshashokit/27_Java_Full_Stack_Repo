
public class StringDemo {
	
	public static void main(String[] args) {
		
		String str  = "Welcome To Ashok IT";
		
		//wanted to find the string of Ashok IT
		String substring = str.substring(11);//Ashok IT
		System.out.println(substring);
		
		System.out.println("Last index::::" + str.indexOf("Ashok"));//11
		String substring1 = str.substring(str.indexOf("Ashok"));//
		System.out.println("Substring with Single Parameters:::" + substring1);//Ashok IT	
		System.out.println("This is last index:::::" + str.lastIndexOf("T") );
		System.out.println("SubString with two Parameters:::::" +str.substring(str.indexOf("Ashok"),str.lastIndexOf("T") +1));
		
		//converting the String into charArray
		char[] chars = str.toCharArray();		
		for(int i = 0 ; i<chars.length ; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		//constructing the string dynamically
		String st = "Good Morning User %s";
		System.out.println(String.format(st, "Mahesh"));
		
		String st1 = "Welcome To Ashok IT %s and Username is %s";
		System.out.println(String.format(st1, "Hyderabad","Mahesh"));
		
		//equals method
		String message = "Hyderabad";
		String message1 ="hyderabad";
		
		if(message ==  message1) {
			System.out.println("Both are Equal");
		}else {
		    System.out.println("Both are not Equal");
		}
		
		//comparing the string with equals method i.e.,case sensitive
		if(message.equalsIgnoreCase(message1)) {
			System.out.println("Both are Equally");
		}else {
			System.out.println("Both are not Equally");
		}	
		
		String replacedString = message.replaceAll("a", "XY");
		System.out.println("Replaced String::::" + replacedString);
		
		String[] splitedStrings = str.split(" ");
		for(int i = 0 ; i<splitedStrings.length; i++) {
			System.out.println(splitedStrings[i]);
		}
		
		for(String mahesh: splitedStrings) {
			System.out.println(mahesh);
		}
		
		String name = "Mahesh";
		String name1 = "Mahesh";
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		if(name  == name1) {
			System.out.println("Both are Equal...");
		}else {
			System.out.println("Both Are not equal....");
		}
		
		//mutuable behaviour
		Address add = new Address("1-2-3","XYZ","Hyderabad","123456");
		System.out.println("Hashscode of add::::"+ add.hashCode());
		add.displayAddressInfo();
		
		//now i am changing the cityname property from Hyderabad to Pune
		add.cityName ="PUNE";
		System.out.println("HashCode of add1:::::" + add.hashCode());
		add.displayAddressInfo();
		
		//Testing hashcode
		String s1 = "data";
		System.out.println("Hashcode:::: s1 ::::" + s1.hashCode());
		System.out.println("s1 :::" + s1);
		String s2 = "base";
		System.out.println("Hashcode:::: s2 ::::" + s2.hashCode());
		//performing the concatenation
		s1 = s1+s2;
		System.out.println("HashCode:::: s1 :::: " + s1.hashCode());
		System.out.println("s1===" + s1);
		/*
		String name11 ="MaheshKumar";
		String name22 = new String("MaheshKumar");
		System.out.println("Name11:::::" + name11.hashCode());
		System.out.println("Name22:::::" + name22.hashCode());*/
	}
}
