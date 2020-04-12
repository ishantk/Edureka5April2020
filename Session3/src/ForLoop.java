// Java Program Must have a Class
public class ForLoop {

	// In the Class must have a main method
	// As whatever we will write in the main will be executed in a sequence
	public static void main(String[] args) {
	
		double product1Price = 300.22;
		double product2Price = 400.11;
		double product3Price = 700.45;
		double product4Price = 900.0;
		double product5Price = 100.0;

		// As per some end of reason sale, we need to offer flat 50% off on all the product prices
		double discount = 0.5; 
		
		product1Price -= product1Price*discount;
		product2Price -= product2Price*discount;
		product3Price -= product3Price*discount;
		product4Price -= product4Price*discount;
		product5Price -= product5Price*discount;
		
		System.out.println("product1 Price in EORS Sale: \u20b9"+product1Price);
		System.out.println("product2 Price in EORS Sale: \u20b9"+product2Price);
		System.out.println("product3 Price in EORS Sale: \u20b9"+product3Price);
		System.out.println("product4 Price in EORS Sale: \u20b9"+product4Price);
		System.out.println("product5 Price in EORS Sale: \u20b9"+product5Price);
		
		// Challenge:
		// 1. We have to write similar instructions again and again
		// 2. We have to create multiple single value containers to store product prices
		// 3. Time here is a wastage -> DEVELOPMENT TIME
		
		System.out.println("==========");
		
		// Solution to point # 2 -> Create Array (Indexed Automatically from 0 to n-1)
		// 
		// Indexed:				   0        1      2       3      4
		double productPrices[] = {300.22, 400.11, 700.45, 900.0, 100.0};
		/*
		productPrices[0] -= productPrices[0]*discount;
		productPrices[1] -= productPrices[1]*discount;
		productPrices[2] -= productPrices[2]*discount;
		productPrices[3] -= productPrices[3]*discount;
		productPrices[4] -= productPrices[4]*discount;
		
		System.out.println("product1 Price in EORS Sale: \u20b9"+productPrices[0]);
		System.out.println("product2 Price in EORS Sale: \u20b9"+productPrices[1]);
		System.out.println("product3 Price in EORS Sale: \u20b9"+productPrices[2]);
		System.out.println("product4 Price in EORS Sale: \u20b9"+productPrices[3]);
		System.out.println("product5 Price in EORS Sale: \u20b9"+productPrices[4]);
		*/
		
		/*
		System.out.println("==========");
		
		// Iterative Statement -> For Loop
		for(int num=0; num<10; num++) {
			System.out.println(">> num is: "+num);
		}
		*/
		
		System.out.println("=====Simple/Basic For Loop=====");
		for(int idx=0; idx<productPrices.length; idx++) {
			productPrices[idx] -= productPrices[idx]*discount; // productPrices[idx] = productPrices[idx] - productPrices[idx]*discount;
			System.out.println("product"+(idx+1)+" Price in EORS Sale: \u20b9"+productPrices[idx]);
		}
		
		System.out.println("=====Enhaced/For-Each Loop=====");
		// We directly read the data and we do not have indexes here :)
		// Here it always works from 0 to n-1 on values
		// Is only to read the data in array
		double total = 0;
		for(double price : productPrices) {
			System.out.println(">> Price: "+price);
			total += price;
		}
		
		System.out.println(">> All Products shall Cost: "+total);
		
		// Infinite For Loop
		/*for (int i=0; ;i++) {
			
		}*/
		
		// Labeled Loop
		myloop:
		for(int i=0;i<5;i++) {
			
		}
		
		
	}

}
