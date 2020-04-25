package co.edureka.interfaces;

// No one can inherit further
final class AmazonPayGateway{
	// final method cannot be re-defined by child
	final void showSuccessMessage() {
		System.out.println(">> Payemt Successfully Done from Amazon");
	}
}

class MyGateway{// extends AmazonPayGateway{
	
	/*void showSuccessMessage() {
		System.out.println(">> Payment Failed");
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		//int fare = 100;
		//fare += 50; 			// modification/updation is allowed

		final int fare = 100;	// we cannot modify/update
		//fare += 50;			// error
		
		//AmazonPayGateway gw = new MyGateway();	// RTP
		//gw.showSuccessMessage();				// executing the method
		
		AmazonPayGateway gw = new AmazonPayGateway();
		gw.showSuccessMessage();	
	}
}
