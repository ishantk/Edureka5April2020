package Session3.src;

import java.util.Scanner;

public class MethodsRealExample {

	
	// promoCode 1 -> ZOMATO -> 40% OFF UPTO 100 | Min Amount 200
	// promoCode 2 -> JUMBO ->  FLAT 30% OFF	 | Min Amount 500
	// ANY OTHER PROMO CODE MEANS NO DISCOUNTS

	static double applyPromoCode(double amount, int promoCode) {
		
		if (amount >=200) {
			
			if(promoCode == 1) {
				double discount = 0.4*amount;
				if (discount > 100) {
					amount -= 100;
					System.out.println(">> Promo Code ZOMATO Applied. You Got a Discount of \u20b9"+100);
				}else {
					System.out.println(">> Promo Code ZOMATO Applied. You Got a Discount of \u20b9"+discount);
					amount -= discount;
				}
				
			}else if (promoCode == 2 && amount >=500) {
				System.out.println(">> Promo Code JUMBO Applied. You Got a Discount of \u20b9"+(0.3*amount));
				amount -= 0.3*amount;
			}else {
				System.out.println(">> Sorry !! Promo Code Not Applicable !!");
			}
			
		}else {
			System.out.println(">> Sorry !! No Discounts Available !!");
		}
		
		return amount;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println(">> Enter PromoCode: ");
		int promoCode = scanner.nextInt();
		
		double amountToPay = MethodsRealExample.applyPromoCode(amount, promoCode);
		System.out.println(">> Amount to be Paid is: \u20b9"+amountToPay);

		scanner.close();
		
	}

}

// Assignments: 
// 1. Simplify if/else block
// 2. suggest the promo code which can offer more discount in case user entered a wrong promo code
