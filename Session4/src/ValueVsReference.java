
public class ValueVsReference {

	// input here is number -> single value container | Value Type | Primitive
	static void squareOfNumber(int number) { 
		// Reading the data in number
		System.out.println(">> number before is: "+number); // 5
		// updated the data in number
		number = number * number;	// 25
		System.out.println(">> number after is: "+number);	// 25
	}
	

	// input here is numbers -> multi value container | Reference Type | Array
	static void squareOfNumbers(int[] numbers) {
		
		System.out.println(">> numbers is: "+numbers);
		System.out.println(">> elements in numbers");
		for(int i=0;i<numbers.length;i++) {
			//System.out.print(numbers[i]+"  ");
			// Manipulated Data in Array
			numbers[i] = numbers[i] * numbers[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		// Storage Container Creation
		int num = 5;
		
		// Reading the Container
		System.out.println(">> num before is: "+num);	// 5
		
		// Execution of Method from main -> till this method will not finish, 
		// below instructions in main will not be executed
		ValueVsReference.squareOfNumber(num);
		
		System.out.println(">> num after is: "+num);	// 5
		
		System.out.println();
		
		int[] nums = {10, 20, 30, 40, 50};
		System.out.println(">> nums is: "+nums);
		System.out.println(">> elements in nums");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+"  ");
		}
		System.out.println();
		
		ValueVsReference.squareOfNumbers(nums);

		System.out.println();
		
		System.out.println(">> re read elements in nums after we executed ValueVsReference.squareOfNumbers(nums)");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+"  ");
		}	
	}
}


/*
 	
 	Single Value Containers: Primitive
 	Multi Value Containers : Homo -> Arrays
 	
	Operators
	
	Conditional Flows
	Iterations
	
	Methods
	static or non static
	static -> Access with Class Name
	non static -> Access with Object of Class 
	
	Value and Reference Concept
 
 
 */

