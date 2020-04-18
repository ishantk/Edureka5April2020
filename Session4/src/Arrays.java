
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Container : Primitive Type (Value Type)
		int age = 10;
		
		// Multi Value Container : Array (Reference Type)
		int[] ages = {10, 20, 30, 40, 50}; // Here size of array is taken automatically 
		
		// Read Data from Storage Containers
		System.out.println(">> age is: "+age);	 // 10			-> Value
		System.out.println(">> ages is: "+ages); // 7852e922    -> HashCode	

		System.out.println(">> READING ARRAY");
		
		// We can read Array from indexes
		// Read Entire Array
		for(int i=0;i<ages.length;i++) {
			System.out.println(">> ages["+i+"] is: "+ages[i]);
		}
		
		// Read Single Element
		System.out.println(">> ages[3] is: "+ages[3]);
		
		// Enhanced For Loop
		for(int element : ages) {
			System.out.println(">> element is: "+element);
		}
		
		System.out.println(">> UPDATING ARRAY");
		
		// Update Data in Array
		ages[3] = 77;
		ages[4] += 10;
		
		// Read Entire Array
		for(int i=0;i<ages.length;i++) {
			System.out.println(">> ages["+i+"] is: "+ages[i]);
		}
		
		// For Arrays -> To read or update the data we need indexes for performing operations
		
	}

	
}
