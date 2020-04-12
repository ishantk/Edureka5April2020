
public class NestedLoops {

	public static void main(String[] args) {
		
		// what ever we write in for's block shall be executed, n number of times
		// here n is 5 for us
		for(int i=1;i<=5;i++) {
			System.out.println(">> i is: "+i);
			//System.out.println(">> Work Hard, Get Luckier");
			
			for (int j=1;j<=3;j++) {
				//System.out.println(">> j is: "+j);
				System.out.println(">> For i: " + i + " j is: " + j);
			}
			System.out.println("-------------");
		}

	}

}
