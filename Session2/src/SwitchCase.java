
public class SwitchCase {

	public static void main(String[] args) {
		
		// Different Choices which User can Make for transaction
		int netBanking = 1;
		int payTm = 2;
		int amazonPay = 3;
		int creditCard = 4;
		int debitCard = 5;
		int upi = 6;
		
		// User Choice
		int userChoice = upi;
		
		// Ladder if/else
		if(userChoice == netBanking) {
			System.out.println(">> Opening NetBanking Interface for Transaction");
		}else if(userChoice == payTm) {
			System.out.println(">> Opening payTm Interface for Transaction");
		}else if(userChoice == amazonPay) {
			System.out.println(">> Opening amazonPay Interface for Transaction");
		}else if(userChoice == creditCard) {
			System.out.println(">> Opening creditCard Interface for Transaction");
		}else if(userChoice == debitCard) {
			System.out.println(">> Opening debitCard Interface for Transaction");
		}else if(userChoice == upi) {
			System.out.println(">> Opening upi Interface for Transaction");
		}else {
			System.out.println(">> Please Select the Payment Interface Option to Proceed");
		}
		
		System.out.println("===========");
		
		// switch case : works with integral constants + characters + strings
		switch (userChoice) {
			case 1:
				System.out.println(">> Opening NetBanking Interface for Transaction");
				break;
	
			case 2:
				System.out.println(">> Opening payTm Interface for Transaction");
				break;
				
			case 3:
				System.out.println(">> Opening amazonPay Interface for Transaction");
				break;
				
			case 4:
				System.out.println(">> Opening creditCard Interface for Transaction");
				break;
				
			case 5:
				System.out.println(">> Opening debitCard Interface for Transaction");
				break;
				
			case 6:
				System.out.println(">> Opening upi Interface for Transaction");
				break; // come out of switch case
				
			default:
				System.out.println(">> Please Select the Payment Interface Option to Proceed");
				break;
		}
		
		
	}

}
