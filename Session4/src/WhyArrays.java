
public class WhyArrays {

	public static void main(String[] args) {
	
		// Number of Infections for COVID-19
		int inidaCount = 10000;
		int ukCount = 20000;
		int chinaCount = 50000;
		int usaCount = 90000;
		int skoreaCount = 15000;
		
		int totalInfections = inidaCount + ukCount + chinaCount + usaCount + skoreaCount;
		// To create Single Value Container and Add the data in above is easy
		// Since we have considered only 5 countries
		
		// BUT, when we need to work for data of world, this is huge
		// We cant write storage containers
		
		// We need Arrays to save our time :)
		
		// Array to hold this data
		// 						0						4
		int[] infections = {10000, 20000, 50000, 90000, 15000};
		//					0					4
		int[] recovered = {100, 200, 500, 900, 150};
								// 0								4
		String[] countryNames = {"India", "UK", "CHINA", "USA", "S.Korea"};
		
		int total = 0;
		for( int i=0; i<infections.length;i++) {
			total += infections[i];
		}

		System.out.println(">> TOTAL INFECTIONS "+totalInfections);
		System.out.println(">> TOTAL "+total);
		
		// Array of Arrays
		int[][] covid = {
						  // Infections, Deaths, Recovered
						  // 0		1   2 
						  {10000, 100, 10},	// 0 India
						  {20000, 200, 20},	// 1 UK
						  {50000, 500, 50},	// 2 China
						  {90000, 900, 90},	// 3 USA
						  {15000, 150, 15},	// 4 S.Korea
						};
		
		int[] covidWorld = new int[3];	// indexes: 0, 1 and 2 -> all of them are having values as 0
		
		for(int i=0;i<covid.length;i++) {
			for(int j=0;j<covid[i].length;j++) {
				// Implement the Logic Here
			}
		}
		
		// Assignment:
		/*
			covidWorld[0] -> Total Infections
			covidWorld[1] -> Total Deaths
			covidWorld[2] -> Total Recovered
		*/
		
		// PS: Arrays are Homogeneous -> We cannot mix strings and integers
		//    Should always have the same data type
		
	}

}
