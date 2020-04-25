package co.edureka.interfaces;

import java.util.Scanner;

// RuleBook1 By Amazon Pay
interface AmazonPayCallBacks{
	void onSuccess();
	void onFailure();
}

//RuleBook2 By Google Pay
interface GooglePayCallBacks{
	void onPaymentSuccess();
	void onFailure();
}

// Interface Level Inheritance
// One Interface can extend another interface and with multiple inheritance as well
interface PaymentCallBacks extends AmazonPayCallBacks, GooglePayCallBacks{
	void sendNotification();
}

// 1. One Class can implement multiple interfaces
//    PS: This is not Multiple Inheritance. This is Multiple Implementation
//class ZomatoPayments implements AmazonPayCallBacks, GooglePayCallBacks{
class ZomatoPayments implements PaymentCallBacks{
	
	public void onSuccess() {
		System.out.println(">> Amazon Payment Successfully Done");
	}
	
	public void onPaymentSuccess() {
		System.out.println(">> Google Payment Successfully Done");
	}
	
	public void onFailure() {
		System.out.println(">> Payment Failed from Payment Gateway");
	}
	
	public void sendNotification() {
		System.out.println(">> Invoice Sent over the Email");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		
		System.out.println("== Choose Payment Method ==");
		System.out.println("(1.) Amazon Pay");
		System.out.println("(2.) Google Pay");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		
		/*
		if(choice == 1) {
			AmazonPayCallBacks aRef = new ZomatoPayments();
			aRef.onSuccess();
			//aRef.onPaymentSuccess(); error
			aRef.onFailure();
		}else {
			GooglePayCallBacks gRef = new ZomatoPayments();
			//gRef.onSuccess();// error
			gRef.onPaymentSuccess();
			gRef.onFailure();
		}*/
		
		PaymentCallBacks pRef = new ZomatoPayments();
		if(choice == 1) {
			pRef.onSuccess();
			pRef.sendNotification();
		}else {
			pRef.onPaymentSuccess();
			pRef.sendNotification();
		}
		
	}

}
