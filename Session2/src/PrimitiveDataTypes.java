// PrimitiveDataTypes -> Stores Single Value :)

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		System.out.println(">> Program Execution Stated");
		
		// Storage Container Creation Statement
		byte age = 20;		  // 8 bits
		
		// Storage Container Updation Statement
		age = 25;

		// Read Data in Container
		System.out.println(">> Age is: "+age);
		System.out.println(age);
		
		System.out.println(">> Program Execution Finished");
		
		// error : out of range
		//age = 225;
		
		int myAge = 30; 		// 32 bits
		
		float pi = 3.14f; 		// 32 bits
		double taxes = 18.85;	// 64 bits
		
		// Takes characters as data in single quotes
		char ch1 = 'A';			// Character
		char ch2 = 98;			// ASCII CODE
		char ch3 = '\u20b9';	// UNICODE
		
		System.out.println("ch1: "+ch1);
		System.out.println("ch2: "+ch2);
		System.out.println("ch3: "+ch3);
		
		boolean isInternetOn = true; // or false
		System.out.println("isInternetOn: "+isInternetOn);
		
	}

}
