
public class Operators {

	public static void main(String[] args) {
		
		// MODEL 		: Data Storage Container
		// VIEW  		: UI | As of now we are not working on it
		
		// Focusing on Controller
		// CONTROLLER	: Logic
		//				  1. Operators for Computation
		//				  2. Conditional Flows for Decision Making
		//				  3. Iterations for repetitive tasks
		
		// Storage Containers : Model
		double amount = 700;
		double cashBackPercent = 0.1;
		
		// Computations Statements : Controller
		double cashBack = amount * cashBackPercent;
		
		// Printing Statements : UI
		System.out.println(">> CashBack Received on Transaction of \u20b9"+amount+" is: \u20b9"+cashBack);
		
		int number = 203;
		
		System.out.println(">> number/2 is:"+number/2);
		System.out.println(">> number%2 is:"+number%2);
		
		
	}

}
