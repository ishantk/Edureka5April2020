package Session2.src;

import java.util.Scanner; // PS: Import Scanner which is a built in class in Java to read data on Cosnole from User

public class ConditionalFlows {

	public static void main(String[] args) {
		
		// Get the amount from User as input
		// if amount is greater than 500, apply flat 50% off
		// for greater than 300 and less than 500, apply flat 30% off
		// otherwise its a flat 10% off
		
		// Scanner is a built in class to take inputs from User on Console:
		Scanner scanner = new Scanner(System.in); // System.in to read the data from console
		
		System.out.println(">> Enter Amount: ");
		double amount = scanner.nextDouble();
		System.out.println(">> Your Amount is: \u20b9"+amount);

		scanner.close(); // close Scanner once you are done, to release the memory resources
		
		System.out.println(">> Applying Dicsounts for You:) ");
		
		/*
		 
		//Simple if/else 
		if(amount > 500) {
			amount = amount - (0.5*amount);
			System.out.println(">> You Got a Flat 50% OFF");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else {
			System.out.println(">> Sorry No Discounts for "+amount);
			System.out.println(">> Please Pay: \u20b9"+amount);
		}*/
		
		double discount = 0.0;
		
		// Ladder if/else
		if(amount > 500) {
			System.out.println(">> You Got a Flat 50% OFF");
			discount = 0.5;
		}else if(amount >=300 && amount <=500) {
			System.out.println(">> You Got a Flat 30% OFF");
			discount = 0.3;
		}else {
			System.out.println(">> You Got a Flat 10% OFF");
			discount = 0.1;
		}
		
		double discountAmount =  discount*amount;
		double discountedPrice = amount - discountAmount;
		System.out.println(">> You Got a discount of \u20b9"+discountAmount);
		System.out.println(">> Please Pay: \u20b9"+discountedPrice);
		
		
		System.out.println("===============");
		
		// Nested if/else
		boolean isInternetEnabled = true;
		boolean isGPSEnabled = false;
		
		if(isInternetEnabled) {
			
			if(isGPSEnabled) {
				System.out.println(">> You can navigate with Google Maps");
			}else {
				System.out.println(">> Please Enable GPS to Navigate");
			}
			
		}else {
			System.out.println(">> Please Enable Internet and Try Again");
		}
	}

}
