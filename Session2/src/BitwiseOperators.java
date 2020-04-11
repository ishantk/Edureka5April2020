
public class BitwiseOperators {

	public static void main(String[] args) {
		
		// Explore: Practical Usage of Bitwise Operators
		
		int num1 = 8;				// 1 0 0 0
		int num2 = 12;				// 1 1 0 0
		
		int num3 = num1 | num2;		// 1 1 0 0	-> 12
		int num4 = num1 & num2;		// 1 0 0 0  -> 8
		int num5 = num1 ^ num2;		// 0 1 0 0  -> 4
		
		System.out.println(">> num3: "+num3);
		System.out.println(">> num4: "+num4);
		System.out.println(">> num5: "+num5);
		
		// Shift Operators
		// >>, <<, >>>
		int num6 = num1 >> 2;	//  0 0 0 0  1 0 0 0 >> 2 -> _ _ 0 0  0 0 1 0 -> 0 0 0 0  0 0 1 0
		System.out.println(">> num6 is: "+num6);
		
		// Right Shifting means divide the number with 2 power x, x is the number with which you are shifting
		// num1 / 2 power 2 -> 8 / 4 => 2 
		
		// Left Shift is multiplication
		int num7 = num1 << 3;	//  0 0 0 0  1 0 0 0 << 3 -> 0 1 0 0  0 _ _ _ ->  0 1 0 0  0 0 0 0 -> 64
		System.out.println(">> num7 is: "+num7); // 64

		// Ternary Operator
		int johnsAge = 10;
		int jenniesAge = 20;
		
		int greaterAge = (johnsAge > jenniesAge) ? johnsAge : jenniesAge;
		System.out.println(">> Greater Age is: "+greaterAge);
		
	}

}
