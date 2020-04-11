
public class ReferenceDataType {

	public static void main(String[] args) {
		
		// Primitive Type : Single Value Container
		int number = 10;
		System.out.println(">> number is: "+number);
		
		// Reference Type : Multi Value Container | Homo | Fixed Size i.e. 5 elements
		// Arrays :)
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println(">> numbers are: "+numbers);	// It prints HashCode rather than Values :(
		
		// toString is executed to print the data and we get the HashCode here
		System.out.println(">> numbers are: "+numbers.toString());

		// String in java is also Reference Type i.e. Multi Value Container
		// As it holds more than 1 character and that too in "text goes in quotes" 
		String name = "John Watson";
		
	}

}
