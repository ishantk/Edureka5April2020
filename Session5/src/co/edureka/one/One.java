package co.edureka.one;

// class One is public
public class One {

	private void pvtShow() {
		System.out.println(">> This is in private show of One");
	}
	
	protected void protShow() {
		System.out.println(">> This is in protecetd show of One");
	}
	
	void defShow() {
		System.out.println(">> This is in default show of One");
	}
	
	public void pubShow() {
		System.out.println(">> This is in public show of One");
	}
	
}

// class Two is default
class Two{
	
	private void pvtShow() {
		System.out.println(">> This is in private show of Two");
	}
	
	protected void protShow() {
		System.out.println(">> This is in protecetd show of Two");
	}
	
	void defShow() {
		System.out.println(">> This is in default show of Two");
	}
	
	public void pubShow() {
		System.out.println(">> This is in public show of Two");
	}
}

// Error : private is not allowed for creating class here :(
/*private class Three{
	
}*/

//Error : protected is not allowed for creating class here :(
/*protected class Four{
	
}*/

// PS: class can either be public or default
//     if class is public -> name of source file should be same name
//     eg: public class One can only be saved in One.java

// Error -> As for our source file, its name can either be One or Five
/*public class Five{
	
}*/

// Hence, in one source file i.e. .java file we can have only 1 public class :)