package co.edureka.one;

public class App {

	public static void main(String[] args) {
		
		// In the same package, any class can have the objects constructed for any other class
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow();		// Only private is not accessible outside the class
		oRef.protShow();
		oRef.defShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow();		// Only private is not accessible outside the class
		tRef.protShow();
		tRef.defShow();
		tRef.pubShow();
		
		// PS: In the same package, its the family
		//     Only private is not accessible :)

	}

}
