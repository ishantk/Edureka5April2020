package co.edureka.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		//     			 0   1   2   3   4
		int[] numbers = {10, 20, 30, 40, 50};
		int a = 10, b=0, c=0;
		
		try {
			System.out.println(">> numbers[1] is: "+numbers[1]); 	// if we get error at this line, 
																	//control directly jumps to catch and below statements in try will not be executed
			c = a/b;
			System.out.println(">> c is: "+c);
		}/*catch(ArrayIndexOutOfBoundsException aRef) {
			System.out.println(">> Some Array Index Exception: "+aRef);
		}catch(ArithmeticException aRef) {
			System.out.println(">> Some Arithmetic Exception: "+aRef);
		}*/
		catch(Exception eRef) { // RTP : Ref Var of Exception Parent Class can point to any Child Exception Object
			System.out.println(">> Some  Exception: "+eRef);
		}finally { // will be executed regardless, exception occurs / its is handled or not
			System.out.println(">> This is suppose to be executed at any cost");
		}
		
		System.out.println(">> App Finished");
		
	}
	
	// Graceful/Normal Termination of Program -> Execution of all the statements in the main is achieved
	// Abnormal Termination of Program -> Due to some error in the main, program came to HALT. 

	// Exception or Run Time Error -> Disrupts the flow of Program and hence, will terminate the program abnormally
	// Certain errors are reflected as -> Unfortunately Your App Stopped Working -> Crash in Program
}

/*
 	
 	try{
 	
 	}catch(){
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}catch(){
 	
 	}
 	
 	// here, exception will definitely not be handled, but finally will be executed before program crashes
 	try{
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	
 	}catch(){
 	
 	 	try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	
 	}finally{
 	 	
 	 	try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 	
 */

// PS: We need not to remember the names of Exceptions. When they come you know them and you handle them !!
//    Further, Exception is a built in Class which is Parent of all the Exceptions in Java
