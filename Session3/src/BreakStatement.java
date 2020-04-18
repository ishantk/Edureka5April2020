package Session3.src;

public class BreakStatement {

	public static void main(String[] args) {
		
		// For Array Creation : [] either before or after | OK
		//int[] productCodes = {101, 201, 301, 401, 777, 901, 121, 223, 109};
		int productCodes[] = {101, 201, 301, 401, 777, 901, 121, 223, 109};
		int searchPid = 777;
		
		// Linear Search
		products:
		for(int i=0;i<productCodes.length;i++) {
			
			System.out.println(">> Matching "+productCodes[i]+" with "+searchPid);
			
			if(productCodes[i] == searchPid) {
				System.out.println(">> Product Found");
				//break; 		// terminate the loop
				break products;	// terminate the loop with the help of label
			}
		}

		// break with labels
		/*
		outer:
		for(int i=1;i<=10;i++) {
			inner:
			for(int j=1;j<=10;j++) {
				if(i==3) {
					break outer;
				}
			}
			
		}
		*/
		
	}

}
