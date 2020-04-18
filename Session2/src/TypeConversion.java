package Session2.src;

public class TypeConversion {

	public static void main(String[] args) {

		// Created 32 bit integral container
		int number1 = 8;	//  0 0 0 0 1 0 0 0 -> 8 bits representation

		// Created 64 bit integral container and copied 32 bit of data
		// This is OK as we are copying 32 bits in 64 bits :)
		long number2 = number1;

		// Error
		// We are trying to copy 64 bits of data into 32 bits
		// even though the data can be easily stored in 32 bits 
		// int number3 = number2;
		
		// Down Casting
		// We wish to explicitly store larger containers data into smaller container :)
		// Copy only 32 bits and leave other 32 bits -> May be loss of data 
		int number3 = (int)number2;
		
		// Wrapper Classes : Built In Codes for Type Conversion
		String number = "100";
		System.out.println("number is: "+number);
		System.out.println("data type of number is: "+number.getClass());
		
		// below line gives us error
		// as we are trying to add String + int -> error
		//int result = number + number1; 
		
		// Convert String into integer | Integer.parseInt -> built in code snippet for us
		int result = Integer.parseInt(number) + number1;
		// Integer is a Wrapper Class
		// parseInt is a method to convert string to integers
		
		// getClass() -> works with references (eg: String and Arrays) and not primitives (eg: int, float etc)
		String pi = "3.14";
		System.out.println("pi is: "+pi+" and data type of pi is:"+pi.getClass());
		
		double dPi = Double.parseDouble(pi);
		System.out.println("dPi is: "+dPi);
		// Double is Wrapper class in Java
		// parseDouble is a method to convert string data into double
		
		// Float.parseFloat(s) 
		
		// Why we need string to primtive conversions.
		// When we work on User Interfaces, data entered by user is always by default textual
		// For UI, data is taken as input as text and also displayed as text
		
		
	}

}
