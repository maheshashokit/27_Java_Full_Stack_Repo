
public class Customer {
	
	 //Defining Fields
	 public int id;//0
	 public String name;//null
	 public String location;//null
	 public String contactNo;//null
	 public double billAmount;//0.0
	 
	 //Defining the method for assignment
	 public void intializeValues(int custId,String custName,String custLocation,
			 			  String custContactNo,double custBillAmount) {
		 //Perform assignment
		 id = custId;
		 name = custName;
		 location = custLocation;
		 contactNo = custContactNo;
		 billAmount = custBillAmount;
	 }
	 
	 //Defining the method for displaying
	 public void displayCustomerDetails() {
		 System.out.println("Customer ID           ::::::" + id);
		 System.out.println("Customer Name         ::::::" + name);
		 System.out.println("Customer Location     ::::::" + location);
		 System.out.println("Customer ContactNo    ::::::" + contactNo);
		 System.out.println("Customer Bill Amount  ::::::" + billAmount);
		 System.out.println("Customer Discount     ::::::" + getDiscountOnBillAmount());
		 System.out.println("Customer Final Amount ::::::" + getBillAmount());
	 }
	 
	 //Defining the method for getting discount based on billAmount
	 public double getDiscountOnBillAmount() {
		 if(billAmount > 10000) {
			 return 0.1;
		 }else if (billAmount > 5000 && billAmount <=10000) {
			 return 0.05;
		 }else {
			 return 0.02;
		 }
	 }
	 
	 //Defining the method for calculating bill Payment
	 public double getBillAmount() {
		 double discountAmount = billAmount * getDiscountOnBillAmount();
		 double finalAmount = billAmount -discountAmount;
		 return finalAmount;
	 }
	 
	 public static void main(String[] args) {
		
		 //create an object for customer Class
		 Customer c1 = new Customer();
		 //calling the method 
		 c1.intializeValues(123,"Mahesh","Hyderabad","1234567890",15000.0d);
		 //calling the display method
		 c1.displayCustomerDetails(); 
		 
		 System.out.println("======================================================");
		 //Create another Object for customer class
		 Customer c2 = new Customer();
		 //calling the method
		 c2.intializeValues(354, "Ashok", "Hyderabad", "12323232", 8000.0d);
		 //calling the display method
		 c2.displayCustomerDetails();
		 
	}
}
