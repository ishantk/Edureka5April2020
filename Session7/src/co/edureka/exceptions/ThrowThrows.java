package co.edureka.exceptions;

import java.io.IOException; // CHECEKD EXCEPTION - Built In

/*
 		
 
		Exception	| Parent to all the built in Exceptions
 			|
 			RunTimeException					[UNCHECKED EXCEPTIONS]
 				NullPointerException
 				ArrayIndexOutOfBoundsException
 				ArithmeticException
 				.
 				...
 				.....
 												[CHECKED EXCEPTIONS]
 			SQLException
 			IOException
 				FileNotFoundException
 			.	
 			..
 			....
 			
 			Classification of Exceptions:
 			1. UNCHECKED EXCEPTIONS : RunTimeException or the Child of RunTimeException
 			2. CHECKED EXCEPTIONS   : Other than the family of RunTimeException all Exceptions are CHECKED
 		
 */

// UNCHECKED EXCEPTION - User Defined
class MyBankingException extends RuntimeException{
	
	MyBankingException(String message){
		super(message);
	}
	
}

//CHECKED EXCEPTION - User Defined
class YourBankingException extends Exception{
	
	YourBankingException(String message){
		super(message);
	}
	
}

class BankAccount{
	
	int balance;
	int minBalance;
	int attempts;
	
	BankAccount() {
		balance = 10000;
		minBalance = 2000;
		attempts = 0;
		System.out.println(">> Bank Account with Initial Balance: \u20b9"+balance);
	}
	
	// Include throws in the method signature in case you are throwing a Checked Exception
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance -= amount;
		
		if(balance <= minBalance) {
			balance += amount;
			System.out.println(">> WITHDRAWL FAILED. Balance is LOW \u20b9"+balance);
			attempts++;
		}else {
			System.out.println(">> WITHDRAWL SUCCESS. New Balance is \u20b9"+balance);
		}
		
		if(attempts == 3) {
			// throw keyword - Crash the Program Explicitly
			// With throw keyword, we are throwing an UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("ILLEGAL ATTEMPTS");
			//throw aRef;
			
			// With throw keyword, we are throwing a CHECKED EXCEPTION
			// Throwing a Checked Exception we get Error from Compiler
			//IOException iRef = new IOException("ILLEGAL ATTEMPTS");
			//throw iRef;
			
			YourBankingException yRef = new YourBankingException("ILLEGAL ATTEMPTS");
			throw yRef;
		}
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println(">> DEPOSIT SUCCESS. New Balance is \u20b9"+balance);
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println(">> Banking Started");

		BankAccount account = new BankAccount();
		
		// If user is trying to withdraw 500 times, is this a problem in case withdraw is failing everytime ?
		// This will block the banks resources
		try {
			for(int i=0;i<500;i++) {
				account.withdraw(3000);
			}
		}catch (Exception e) {
			System.out.println(">> WITHDRAW OPERATION CRASHED: "+e);
		}
		
		System.out.println(">> Banking Finished");
		
	}

}
