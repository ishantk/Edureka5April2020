package Session3.src;

public class WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("====while loop======");
		
		int num = 5;
		int idx = 1;
		
		// Another way to do the same job
		while(idx <= 10) { // condition is checked in the starting/entry level check
			System.out.println(num+" "+idx+"'s are "+(num*idx));
			idx++;
		}
		
		System.out.println("====for as while====");
		
		num = 7;
		idx = 1;
		
		// For working as while
		for(;idx<=10;) {
			System.out.println(num+" "+idx+"'s are "+(num*idx));
			idx++;
		}
		
		// Difference between for and while
		System.out.println("====difference in for and while======");
		for(int n=9, i=1; i<=10; i++) {
			System.out.println(n+" "+i+"'s are "+(n*i));
		}
		
		System.out.println("=====reverse loop with decrement by 2 instead of 1=====");
		for(int n=9, i=10; i>0; i-=2) {
			System.out.println(n+" "+i+"'s are "+(n*i));
		}
		
		System.out.println("====do while loop======");
		
		num = 11;
		idx = 100;
		
		do {
			System.out.println(num+" "+idx+"'s are "+(num*idx));
			idx++;	
		}while(idx<=10); // condition is checked later/exit level check
				
	}

}
