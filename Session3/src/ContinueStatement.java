package Session3.src;

public class ContinueStatement {

	public static void main(String[] args) {
		
		double productPrices[] = {300.22, 400.11, 700.45, 900.0, 100.0};
		// Flat 50 Off only for those products whose price > 350
		
		for(double price : productPrices) {
			System.out.print(price+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<productPrices.length; i++) {
			
			if (productPrices[i] < 350) {
				continue;	// skip the statements below in the loop and move the loop into next iteration
			}
			
			productPrices[i] -= productPrices[i] * 0.5;
			
		}
		
		for(double price : productPrices) {
			System.out.print(price+"  ");
		}

	}

}
