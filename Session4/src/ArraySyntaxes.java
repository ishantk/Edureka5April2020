
public class ArraySyntaxes {

	public static void main(String[] args) {
	
		// Syntax #1 | IMPLICIT SYNTAX
		int[] a1 = {10, 20, 30, 40, 50};
		
		// Syntax #2 | IMPLICIT SYNTAX
		int a2[] = {10, 20, 30, 40, 50};
		
		// Syntax #3 | EXPLICIT SYNTAX
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// new int[] -> is command to create array when we will execute the program
		// array gets created at run time i.e. when your program is in action
		
		// Above Arrays have the data as they get created
		// We can create Arrays with fixed size and put the data later
		
		// Syntax #4 | ARRAY CREATION WITH SIZE
		// Array Creation with the size and no elements
		// Here all the elements will be by default 0
		int[] a5 = new int[5];
		int a6[] = new int[10];
		
		a6[5] = 9;
		a6[7] = 1;
				
		for(int i=0;i<a6.length;i++) {
			System.out.print(a6[i]+"  ");
		}
		
	}

}
