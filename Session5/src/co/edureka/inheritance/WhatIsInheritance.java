package co.edureka.inheritance;

// Parent Class Represents Parent Object
// Parent Object has 3 attributes, constructor and a method 
class Parent{
	
	// Attributes of Parent Object
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		System.out.println(">> Parent Object Constrcuted");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
	}
	
	void showDetails() {
		System.out.println(">> Parent Details: "+this.fname+" "+lname+" \u20b9"+wealth);
	}
	
}

// IS-A Relationship -> Inheritance
// Child Class Represents Child Object
// It has as of now no attribute and no method. only a constructor

// Later we create 2 attributes in the Child Object
class Child extends Parent{
	
	int wealth;
	String companyName;
	
	Child(){
		System.out.println(">> Child Object Constructed");
		wealth = 50000;
		companyName = "ABC Ltd";
	}
	
	// Defining the same function which was already in the Parent
	// OVERRIDING
	void showDetails() {
		System.out.println(">> Details of Parent:");
		super.showDetails(); // From the child to access properties of Parent
		
		System.out.println(">> Details of Child:");
		System.out.println(">> I have wealth of \u20b9"+wealth+" and working at "+companyName);
	}
}


public class WhatIsInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.showDetails();
		
		// Create the Object of Child
		Child cRef = new Child();
			
		// Inheritance RULE #1
		// Before the Object of Child, Object of Parent is Created
		// And Child gets Linked to that Parent Object
		
		// Inheritance RULE #2
		// Child Object, can access any attribute or method of the Parent object, in case it is not having it within
		// Only private is not accessible by Child
		
		cRef.wealth -= 5000;
		cRef.showDetails(); // is not in the child, it is in the parent. Later we got the same method availabe in Child.

		// Inheritance RULE #3
		// To access something of Parent from Child, use keyword super
	}

}

// PS: Code the same example with static keyword here :)
