package Session3.src;

import java.util.Scanner;

public class Methods {
	
	// A method can be created either
	// 1. non static -> i.e. we do not use static keyword in front of it
	// 2. static -> i.e. we use static keyword in front of it
	
	// And always in the class and not outside the class
	
	// addNumbers is the name of method
	// void is return type which means, do not return anything
	// () -> input list which is empty and hence we are not using it
	void addNumbers() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter 2 Numbers:");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		double result = num1 + num2;
		System.out.println(">> result is: "+result);
		
		scanner.close(); // it will release the memory resources
		
	}
	
	// addNumbersWithInputAndReturn is the name of method
	// int is return type which means, return an integer in the end of function
	// (int num1, int num2) -> input list
	int addNumbersWithInputAndReturn(int num1, int num2) {
		int result = num1 + num2;
		return result; // return must be the last statement :)

		// as after we write return statement, below instructions shall not be executed
		//System.out.println(">> Hello"); // not executable as we return on top of it 
	}

	static void addNumbersAgain() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter 2 Numbers:");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		double result = num1 + num2;
		System.out.println(">> result is: "+result);
		
		scanner.close(); // it will release the memory resources
		
	}
	
	// addNumbersWithInputAndReturn is the name of method
	// int is return type which means, return an integer in the end of function
	// (int num1, int num2) -> input list
	static int addNumbersWithInputAndReturnAgain(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// main is a Method
	// it is a block of statements
	// all the statements written in it will be executed automatically when we run the program
	public static void main(String[] args) {
	
		// Execution of Methods:
		// We execute methods from the main method
		
		// 1. Execute Non Static Methods
		//    to execute non static method -> create object of class
		
		// Object Construction Statement
		// An object which is a storage container gets created in RAM
		// Its HashCode is available in mRef (this mRef can be any name of your choice)
		// Methods mRef = new Methods(); // Syntax -> ClassName refVarNameOfYourChoice = new ClassName();
		
		/*
		// Our Future Discussions: non static, static, object
		// Our Present Discussions: what is a method, how we create it, and how we execute it
		mRef.addNumbers(); // execution of non static method
		int sum = mRef.addNumbersWithInputAndReturn(10, 20);
		System.out.println(">> sum is: "+sum);
		
		sum = mRef.addNumbersWithInputAndReturn(100, 120);
		System.out.println(">> sum is: "+sum);
		*/
		
		// 1. Execute Static Methods
		//    to execute static method -> Use class Name
		Methods.addNumbersAgain();
		int sum = Methods.addNumbersWithInputAndReturnAgain(11, 33);
		System.out.println(">> sum is: "+sum);
		
		
	}

}
