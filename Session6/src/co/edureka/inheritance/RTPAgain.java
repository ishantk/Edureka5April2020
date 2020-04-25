package co.edureka.inheritance;

// Generalized Class
/*class Shape{
	
	Shape(){
		System.out.println(">> Shape Object Constructed");
	}
	
	void draw() {
		System.out.println(">> Drawing a Shape");
	}
}*/

// abstract class -> we cannot create the direct object now :)
// Optimizing our RTP technique
// As per RULE of Inheritance, Parent Shape Object will be created by Run Time Env i.e. JVM
// BUT, as a developer you cannot write the direct object of abstract class
/*abstract class Shape{
	
	Shape(){
		System.out.println(">> Shape Object Constructed");
	}
	
	// abstract method is always created in abstract class
	// it has no definition
	// its a rule made by parent object and children must define it
	// if in a class we have n-number of abstract methods as rules they all must be defined by children
	abstract void draw();
	
	void show() {
		System.out.println(">> This is show of Shape");
	}
}*/

// interface is a RULE BOOK
// It is NOT INHERITANCE. IT is IMPLEMENTATION
// NEITHER We as Developer, NOT JVM can create the Object of Shape Interface
interface Shape{
	
	// Interfaces cannot have constructors
	// Nothing like object in case of interfaces
	/*Shape(){
		System.out.println(">> Shape Object Constructed");
	}*/
	
	// method is always abstract method in Interface
	// it has no definition
	// its a rule made by Interface and must be defined by all thos who implements it
	// if in a class we have n-number of abstract methods as rules they all must be defined by children
	void draw(); // -> public void abstract draw();
	
	/*
	void show() {
		System.out.println(">> This is show of Shape");
	}*/
}


class Rectangle implements Shape{ //extends Shape{ // extends Shape is an error as interface is not parent object
	
	Rectangle(){
		System.out.println(">> Rectangle Object Constructed");
	}
	
	// RULE from Interface must be defined
	public void draw() {	// OVERRIDING -> Re-Defining method of Parent in Child 
		System.out.println(">> Drawing a Rectangle");
	}
}

class Circle implements Shape{ //extends Shape{
	
	Circle(){
		System.out.println(">> Circle Object Constructed");
	}
	
	public void draw() {	// OVERRIDING -> Re-Defining method of Parent in Child 
		System.out.println(">> Drawing a Circle");
	}
}

class Triangle implements Shape{ //extends Shape{
	
	Triangle(){
		System.out.println(">> Triangle Object Constructed");
	}
	
	public void draw() {	// OVERRIDING -> Re-Defining method of Parent in Child 
		System.out.println(">> Drawing a Triangle");
	}
}



public class RTPAgain {

	public static void main(String[] args) {
		
		// Shape as parent can point to child								: Inheritance
		// Shape as Interface can point to the object which implements it	: Implementation
		Shape sRef;
		
		sRef = new Circle();
		sRef.draw();
		
		System.out.println();
		
		sRef = new Rectangle();
		sRef.draw();
		
		System.out.println();
		
		sRef = new Triangle();
		sRef.draw();
		
		System.out.println();
		
		// Direct Object Construction of Shape which is a Generalized Object
		// And draw method which again is a generalized definition is not required
		//sRef = new Shape();// Not Required
		//sRef.draw();	     // Not Required
		

	}

}
