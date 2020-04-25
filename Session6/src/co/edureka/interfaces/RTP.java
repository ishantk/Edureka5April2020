package co.edureka.interfaces;

import java.util.Scanner;


//CAB here is a GENERALIZED OBJECT :)
/*class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> CAB Object Constructed");
	}
	

	void bookCab(String source, String destination) {
		System.out.println(">> CAB Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+baseFare);
	}
	
}*/

/*abstract class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> CAB Object Constructed");
	}
	

	abstract void bookCab(String source, String destination);
	
}*/

interface Cab{
	
	// In Interfaces we can only and only have constants and no variables
	int baseFare = 100; // public static final in baseFare = 100	

	// In Interfaces we can have only and only rules with no definitions
	// For n number of rules, all the classes which are going to implement this interface, needs to define them
	void bookCab(String source, String destination); // -> public abstract void bookCab(String source, String destination);
	
}


//Hierarchy
class MiniCab implements Cab{//extends Cab{
	
	int fare;
	
	MiniCab(){
		fare = baseFare + 50;
		System.out.println(">> Mini Cab Object Constructed");
	}
	
	// Re-Define the same method which is available in the Parent
	// OVERRIDING -> In case Parent Child have the same method with same inputs
	public void bookCab(String source, String destination) {
		System.out.println(">> Mini Cab Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+fare+" fare for Mini Cab");
	}
}

class SedanCab implements Cab{//extends Cab{
	
	int fare;
	
	SedanCab(){
		fare = baseFare + 100;
		System.out.println(">> Sedan Cab Object Constructed");
	}
	
	// Re-Define the same method which is available in the Parent
	public void bookCab(String source, String destination) {
		System.out.println(">> Sedan Cab Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+fare+" fare for Sedan Cab");
	}
}

class BikeCab implements Cab{//extends Cab{
	
	int fare;
	
	BikeCab(){
		fare = baseFare + 20;
		System.out.println(">> Bike Cab Object Constructed");
	}
	
	// Re-Define the same method which is available in the Parent
	public void bookCab(String source, String destination) {
		System.out.println(">> Bike Cab Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+fare+" fare for Bike Cab");
	}
}

//In case the same method has different inputs -> METHOD OVERLOADING
//METHOD OVERLOADING can work in the same class as well
//METHOD OVERIDING only works if we have Parent and Child Relationship

public class RTP {

	// static main means it is not counted as property of RTP Class Object.
	// It is linked to class 
	public static void main(String[] args) {
	
		//Cab cab = new Cab();
		//cab.bookCab("Pristine Magnum", "Country Homes");
		
		//Cab cab;
		// Polymorphic Statement -> Parent's Ref Variable can point to the Object of Child
		//cab = new MiniCab(); 
		
		// bookCab method of Child will be executed as Object belongs to MiniCab which is the Child Object
		//cab.bookCab("Pristine Magnum", "Country Homes");
		
		System.out.println("== Slect CAB ==");
		System.out.println("(1.) MINI CAB");
		System.out.println("(2.) SEDAN CAB");
		System.out.println("(3.) BIKE CAB");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		Cab cab = null; // cab is reference var of Parent and is referring to null (default value for ref var);
		//int i = 0; // default initial value
		
		// RTP
		// Run Time Polymorphism : More than one forms
		// cab can point to MiniCab or SedanCab or BikeCab
		switch (choice) {
			case 1:
				cab = new MiniCab();
				break;
	
			case 2:
				cab = new SedanCab();
				break;
				
			case 3:
				cab = new BikeCab();
				break;
				
			default:
				System.out.println(">> PLEASE SELECT THE CAB");
				break;
		}
		
		if(cab != null) {
			cab.bookCab("Pristine Magnum", "Country Homes");
		}
		
		scanner.close();
	}
	
	

}
