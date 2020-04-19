/*
 	
 	OOPS : Object Oriented Programming Structure
 		   Object is suppose to be the main part of our discussion -> Object Oriented 
 		   
 		   Object is a Multi Value Container
 		   Its a BOX
 		   It contains data which may be homogneous or hetrogeneous
 		   Data in Object is stored as KEY/VALUE Pair
 		   i.e. A Dictionary or a HashMap
 		   
 		   eg: Restaurant is an Object
 		   	   attribute: data
 		   	   name : Johns Coffee Shop
 		   	   phone: +91 99999 55555
 		   	   adddress: Redwood Shores
 		   	   
 	OOPS Principle:
 		We need OOPS if we have to create a software solution
 		
 		Lets take requirements like below: (Food Delivery App -> Zomato, Swiggy, Uber Eats etc...)
	 		1. User should Register
	 		2. User should see Restaurants in the App
	 		3. Every Restaurant is going to have a Menu which displays Dishes
	 		4. User should be able to create an Order by putting Dishes in the Cart 
	 		5. User must give his/her Address where our DeliveryPerson can deliver the Order
	 		6. User can pay by Cash or any other Online Payment Method
 
 	OOPS Principle:
	 	1. Think of Object from Set of Requirements
	 	2. Write its Attributes
	 	3. Create the Class for Object
	 	4. From the Class create a Real Object in Memory
	 	5. If you have n-number of Different Objects, define Relationships between them
	 	6. Create Methods in Objects so as to process the data within the object
 
	For Books -> Java Documentation  | https://docs.oracle.com/en/java/javase/14/
	
	How we will identify Objects from Requirements:
	Look out for the terms which will have lot of data associated with it
	
	User -> name, phone, email, gender, age
	Address -> adrsLine, city, state, zipCode
	
	User Has An Address -> 1 User will have a Min of 1 Address :)
	
	Restaurant -> name, phone, email, openingHours, category, pricePerson, ratings
	Menu	-> title, numberOfDishes, numberOfCategories
	Dish	-> name, description, price, category
	
	Restaurant Has A Menu	-> 1 Restaurant has 1 Menu | 1 Restaurant may have multiple Menus
	Menu Has Dishes			-> 1 Menu has many Dishes
	
	
 */

// 1. Think of Object
//    User -> name, phone, email, gender, age
//    Object: 		User
// 	  Attributes: 	name, phone, email, gender, age

// 2. Create the Class for the Object
//    Class is a Textual Representation in our coding term, how any object will look like in memory
//    Whatever you write in class -> is property of object

// We describe the object by writing the class :)
class User{	// It means Object User Representation. We have a BOX (Multi Value Container) called User
	
	// Attributes:
	// Property of Object which will be stored in the BOX (Multi Value Container)
	String name;
	String phone;
	String email;
	char gender;
	int age;
	
	// Special Method:
	// Constructor : which is executed when we object is constructed in memory
	
	// Default Constructor : if you do not create a constructor: this is by default created by compiler in your class
	/*
	User(){
		name = null;
		phone = null;
		email = null;
		gender = ' ';
		age = 0;
	}*/
	
	// To have the default values for objects attributes :)
	// Default configuration for the objects :)
	User(){
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 18;
	}
	
	// Parameterized Constructor
	// We created it with inputs
	User(String name, String phone, String email, char gender, int age) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	// Methods: 
	// Property of Object which will be stored in the BOX
	void setDataForUser(String name, String phone, String email, char gender, int a) {
		
		// if inputs to the method are same variable names of objects attributes
		// use this to differentiate between them
		// this.name -> attribute of object
		// name is input to the method setDataForUser
		// this -> represents reference to the object in action
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		age = a;
				
	}

	void showUserDetails() {
		System.out.println("=========="+name+" Details==========");
		System.out.println(phone+"\t"+email+"\t"+gender+"\t"+age);
		System.out.println("==================================");
	}
	
}


public class OOPS { // class OOPS here is going to help us define main method -> from where we will be able to do the executions

	public static void main(String[] args) {
		
		// 3. Come in the main
		// Write an Object in Real which gets created by reading the class into the Memory
		
		// Object Construction Statement
		// We are going to read the class User and create a BOX (Multi Value Container) in the memory
		User user1 = new User();
		User user2 = new User();
		
		// user1 is a Reference Variable. It holds HashCode of the Object
		// so is user2
		
		User user3 = user1; // Reference Copy
		
		System.out.println(">> user1 is: "+user1);
		System.out.println(">> user2 is: "+user2);
		System.out.println(">> user3 is: "+user3);
		
		// Object -> Multi Value Container (Homo/Hetro)
		// Class ->  Textual Representation of Object
		// Method -> A way to execute some algorithm which we wish to exeute again and again | Logical Data Processing Block
		
		
		// From above Line 89, 90 and 95
		// We have only 2 objects in the memory created by new User();
		// And 3 reference variables -> user1, user2 and user3
		// user1 and user3 are referring to the same Object
		// user2 is referring to another object

		// Operations on Objects:
		
		// 1. Add/Update Data in Object
		/*
		user1.name = "John";
		user1.phone = "+91 99999 88888";
		user3.email = "john@example.com";
		user1.gender = 'M';
		user3.age = 22;
		
		user1.email = "john.watson@example.com";
		
		
		user2.name = "Fionna";
		user2.phone = "+91 99999 77777";
		user2.email = "fionna@example.com";
		user2.gender = 'F';
		user2.age = 21;
		*/
		
		user1.setDataForUser("John", "+91 99999 88888", "john@example.com", 'M', 22);
		user2.setDataForUser("Fionna", "+91 99999 77777", "fionna@example.com", 'F', 21);
		
		
		// new User(); // we created an object but we have no reference variable to access this object
		
		// Read Data From Object
		//System.out.println(">> "+user1.name+" can be called at "+user3.phone+" and is "+user1.age+" years old");
		//System.out.println(">> "+user2.name+" can be called at "+user2.phone+" and is "+user2.age+" years old");
		
		user1.showUserDetails();
		user2.showUserDetails();
		
		// PS: Objects are also known as Instances
		//     Objects attributes are known as Instance Variables
		//     Objects attributes are known as State of Object
		//     Objects attributes are known as Data Members
		
		// 	   Objects Methods are known as Behavior
		// 	   Objects Methods are known as Member Functions
		
		User user4 = new User();
		System.out.println(">> user4 is: "+user4);
		// We are not going to write data in object
		// we will directly read the data
		
		user4.showUserDetails(); // We will get to see some default data in object
		
		// At the time of object construction -> we can use parameterized constructor to put up the data
		// instead of executing set method to set the data :)
		User user5 = new User("Ben", "+91 99999 00000", "ben@example.com", 'M', 30);
		
		// Now Set Method can be used later to update the data in Object
		// user5.setDataForUser("Ben Afleck", "+91 99999 00000", "ben.a@example.com", 'M', 32);
		
		user5.showUserDetails();
		
	}

}
