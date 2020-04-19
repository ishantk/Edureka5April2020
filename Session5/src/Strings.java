
public class Strings {

	public static void main(String[] args) {
		
		// Object Construction
		String str1 = new String("Hello");
		String str2 = new String("HELlo");
		
		// Interned Strings
		String str3 = "Hello";
		String str4 = "Hello";
		
		// str4 = "Bye"; // str4 will have a different hashcode now :)
		
		// Printing reference variables prints HashCode
		// But here we don't see the HashCodes, rather we see the data directly :)
		
		System.out.println(">> Strings without toString method");
		System.out.println(">> str1 is: "+str1);
		System.out.println(">> str2 is: "+str2);
		System.out.println(">> str3 is: "+str3);
		System.out.println(">> str4 is: "+str4);
		
		System.out.println(">> Strings with toString method");
		System.out.println(">> str1.toString() is: "+str1.toString());
		System.out.println(">> str2.toString() is: "+str2.toString());
		System.out.println(">> str3.toString() is: "+str3.toString());
		System.out.println(">> str4.toString() is: "+str4.toString());
		
		// toString method is automatically executed and hence we dont see the hashcodes and see the data in the string object :)
		
		// POC: 
		if(str1 == str2) {	// We are comparing sort of memory addressing, instead of content :)
			System.out.println(">> str1 == str2");
		}else {
			System.out.println(">> str1 != str2");
		}
		
		if(str3 == str4) {
			System.out.println(">> str3 == str4");
		}else {
			System.out.println(">> str3 != str4");
		}
		
		if(str1 == str3) {
			System.out.println(">> str1 == str3");
		}else {
			System.out.println(">> str1 != str3");
		}

		// To compare the data:
		//if(str1.equals(str2)) {
		if(str1.equalsIgnoreCase(str2)) { // Ignore Case
			System.out.println(">> str1 is equal to str2");
		}else {
			System.out.println(">> str1 is not equal to str2");
		}
		
		if(str3.equals(str4)) {
			System.out.println(">> str3 is equal to str4");
		}else {
			System.out.println(">> str3 is not equal to str4");
		}
		
		if(str1.equals(str3)) {
			System.out.println(">> str1 is equal to str3");
		}else {
			System.out.println(">> str1 is not equal to str3");
		}
		
		// PS: explore another string comparison API : compareTo :)
		
	}

}
