package Session2.src;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// = -> copy data on rhs into lhs
		int num1 = 10;
		
		// update
		num1 = 100;
		
		// update
		num1 += 20; // means -> num1 = num1 + 20;
		System.out.println(">> num1 is: "+num1);
		
		System.out.println(">> num1%=3 is: "+(num1%=3)); // num1%=3 -> num1 = num1 % 3
		System.out.println(">> num1 is: "+num1);
		
		int num2 = 10;
		
		// PostFix Notation
		num2++;	// num2 = num2 + 1
		
		// PreFix Notation
		++num2; // num2 = num2 + 1
		
		++num2;
		--num2;
		++num1;
		
		System.out.println(">> num1 is: "+num1); // 1
		System.out.println(">> num2 is: "+num2); // 12
		
		// num1 value in firstly copied into num3
		// and than increments by 1
		int num3 = num1++;
		System.out.println(">> num1 is: "+num1+" and num3 is: "+num3);
		
		// Increment First and than assign the value
		int num4 = ++num1;
		System.out.println(">> num1 is: "+num1+" and num4 is: "+num4);

	}

}
