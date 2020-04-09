
public class Orders {

	public static void main(String[] args) {
		
		// Storage Container Creation Statements
		// Container is created in memory with data :)
		// dish1 is name of container
		// 100 is data residing in the container as binary in 1's and 0's
		// int is the type of container which means 32 bits of data which should be integral
		
		int dish1 = 100;
		
		// dish2 is name of container
		// 222.56 is data residing in the container as binary in 1's and 0's
		// double is the type of container which means 64 bits of data which can be integral or decimal
		double dish2 = 222.56;
		
		// Storage Container Creation Statement (double total =)
		// AND Computational Statement (dish1 + dish2)
		// total is a Storage container which shall contain the result
		double total = dish1 + dish2;
		
		// Printing Statement
		// With Container Substitution
		System.out.println("Total Amount to be paid for dish1[Rs." + dish1 +"] and dish2 [Rs."+dish2+"] is: Rs." + total);
		
		// Assignment: Calculate Taxes: 18% on Total Amount and show the Final Amount :)

	}

}
