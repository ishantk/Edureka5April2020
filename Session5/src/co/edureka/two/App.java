package co.edureka.two;

//import co.edureka.one.*; // import all public classes
import co.edureka.one.One; // Import the class One to use it outside the package
//import co.edureka.one.Two; // Import the class Two -> Error as Two is default

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		
		//oRef.pvtShow();	// Limited to Class
		//oRef.defShow(); // Limited to Package
		//oRef.protShow();// Limited to Package
		oRef.pubShow(); // Globally Accessible Any Where

	}

}

// PS:
// 1. private -> accessible within the class and not outside
// 2. default/protected -> accessible only within the package and not outside
// 3. public -> accessible within and outside the package

// We still need to find the difference between default and protected
// This we will discuss after inheritance :)