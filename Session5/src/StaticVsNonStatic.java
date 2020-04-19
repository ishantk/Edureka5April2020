// 1. Think of an Object
//    Order -> id, customerName, price ....

// 2. Create its Class
// Class -> Description of Object
// PS: Whatever we write in class is the Property of Object -> i.e. goes into the storage container 
class Order{
	
	// Non Static Attributes: Property of Object
	int id;
	String customerName;
	int price;
	
	// Static Attributes : Property of Class
	static int numberOfOrders;
	
	// PS: Constructor Name is same name as that of class name. 
	//     Constructors wont have return type
	//     They get executed automatically when object is created in memory
	
	
	// Constructors: Property of Object
	// Default Constructor -> Default values for attributes of an Object
	// PS: Constructors cannot be static as they are a concept linked with Object -> i.e. gets executed when object is constructed in memory
	Order(){
		id = 0;
		customerName = "NA";
		price = 0;
		
		// we are incrementing property of class
		numberOfOrders += 1;
	}
	
	// Parameterized Constructor
	Order(int id, String customerName, int price){
		this.id = id;
		this.customerName = customerName;
		this.price = price;
		
		// we are incrementing property of class
		numberOfOrders += 1;
	}
	
	// Non Static Methods: Property of Object
	void setOrderDetails(int id, String customerName, int price){
		this.id = id;
		this.customerName = customerName;
		this.price = price;
	}
	
	void showOrderDetails() {
		System.out.println(">> Order Details:");
		System.out.println(id+"\t"+customerName+"\t"+"\t"+price);
		System.out.println("~~~~~~~~~~~~~~~~~");
	}
	
	// Static Methods: Property of Class 
	static void showTotalOrders() {
		System.out.println(">> Total Orders: "+numberOfOrders);
		// customerName = "NA"; // Error -> static method cannot access non static properties :(
	}
	
}


public class StaticVsNonStatic {

	public static void main(String[] args) {
		
		// 3. Create the Object in Memory from Class
		Order oRef1 = new Order();
		
		Order oRef2 = new Order(1, "John", 250);
		
		Order oRef3 = new Order();
		oRef3.setOrderDetails(2, "Fionna", 500);
		
		oRef1.showOrderDetails();
		oRef2.showOrderDetails();
		oRef3.showOrderDetails();
		
		// PS: We can access Property of Class by the Class Name directly
		//System.out.println(">> Total Number of Orders: "+Order.numberOfOrders);
		Order.showTotalOrders();

	}

}
