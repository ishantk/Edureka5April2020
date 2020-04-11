
public class RelationalOperators {

	public static void main(String[] args) {
		
		double productPrice = 1982.34;
		double profitPercent = 0.1;
		
		double salesOnMonday = 1700;
		double salesOnTuesday = 1940;
		
		double profitOnMonday = (productPrice*profitPercent) * salesOnMonday;
		double profitOnTuesday = (productPrice*profitPercent) * salesOnTuesday;
		
		System.out.println("profitOnMonday: "+profitOnMonday);
		System.out.println("profitOnTuesday: "+profitOnTuesday);
		
		System.out.println(">> Were Profits High on Monday : "+(profitOnMonday > profitOnTuesday));
		System.out.println(">> Were Profits High on Tuesday : "+(profitOnTuesday > profitOnMonday));

		// Relational
		// >, <, >=, <=, ==, !=
		
		boolean isInternetOn = true;
		boolean isGPSOn = false;
		
		System.out.println(">> Can i login to Instagram: "+isInternetOn);
		System.out.println(">> Can i Navigate with Google Maps: "+ (isInternetOn && isGPSOn));
		
		// for testing multiple conditions
		// Logical : && || ! ^
		
	}
	

}
