
public class NDimensionalArrays {

	public static void main(String[] args) {
		
		// 1-D Array
		// It has only elements within :)
		int[] a1 = {10, 20, 30};
		System.out.println(">> a1 is: "+a1);				// 7852e922
		System.out.println(">> a1 length is: "+a1.length);	// 3
		
		System.out.println();
		
		// 2-D Array
		// Array of Arrays :)
		// 1 Array contains many Arrays where each Array contains some elements
		int[][] a2 = {
						{10, 20, 30},				// 0
						{40, 50, 60, 70},			// 1
						{10, 20},					// 2
						{40, 50, 60, 70, 80, 90},	// 3
						{40},						// 4
					 };
		
		System.out.println(">> a2 is: "+a2);				// 4e25154f
		System.out.println(">> a2 length is: "+a2.length);	// 5
		
		System.out.println();
		
		System.out.println(">> a1[1] is: "+a1[1]);			// 20
		System.out.println(">> a2[1] is: "+a2[1]);			// 70dea4e
		
		// PS: a1 and a2 are reference variables as they hold the HashCodes and not the values
		
		// Run a Loop on 2-D Array and lets print indexes
		for(int i=0;i<a2.length;i++) {
			System.out.println(">> a2["+i+"] is: "+a2[i]+" and length is: "+a2[i].length);
		}
		
		// Accessing element in 2-D Array
		System.out.println(">> a2[1][2]: "+a2[1][2]); // 60
		
		// Updating the Data
		a2[1][2] = 99;
		
		// Read All the elements from 2-D Array
		for(int i=0;i<a2.length;i++) {
			// when i is 0, j -> 0 1 2
			// when i is 1, j -> 0 1 2 3
			// when i is 2, j -> 0 1
			// when i is 3, j -> 0 1 2 3 4 5
			// when i is 4, j -> 0 
			for(int j=0;j<a2[i].length;j++) {
				a2[i][j] += 3; // Put The Data
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		// 2-D Array
		// 3 Arrays containing 5 elements each
		// But all the elements will be by default 0
		int[][] array = new int[3][5];

		// 3-D Arrays
		int[][][] a3 = {
							{
								{10, 20, 30},				// 0
								{40, 50, 60, 70},			// 1
								{10, 20},					// 2		// 0
								{40, 50, 60, 70, 80, 90},	// 3
								{40},						// 4
							 },
							 {
								{10, 20, 30},				// 0
								{40, 50, 60, 70},			// 1
								{10, 20},					// 2		// 1
								{40, 50, 60, 70, 80, 90},	// 3
								{40},						// 4
							 }
						};
		
		System.out.println();
		
		// JAGGED ARRAYS
		int[][] jagged = new int[3][];
		jagged[0] = new int[5];		// 0th Array has 5 elements
		jagged[1] = new int[15];	// 1st Array has 15 elements
		jagged[2] = new int[50];	// 2nd Array has 50 elements
		
		for(int i=0;i<jagged.length;i++) {
			for(int j =0;j<jagged[i].length;j++) {
				jagged[i][j] += 2;
				System.out.print(jagged[i][j]+"  ");
			}
			System.out.println();
		}
		
		double [][] averages = new double[3][3];
		char [][] chars = new char[3][3];
		
		// Assignment: Implement loops in 3D Arrays and implement enhanced for loop on 2d and 3d arrays
		
	}
	

}
