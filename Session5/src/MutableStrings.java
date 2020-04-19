
public class MutableStrings {

	public static void main(String[] args) {
		
		String str = new String("John");
		str.concat(" Watson");
		
		// Strings are IMMUTABLE.
		System.out.println(">> str is: "+str);
		
		StringBuffer buffer = new StringBuffer("John");
		buffer.append(" Watson");
		
		// StringBuffer is MUTABLE. We can modify the same String
		System.out.println(">> buffer is: "+buffer);
		
		StringBuilder builder = new StringBuilder("John");
		builder.append(" Watson");
		
		// StringBuilder is MUTABLE. We can modify the same String
		System.out.println(">> builder is: "+builder);
		
		// Both StringBuffer and StringBuilder are MUTABLE
		// StringBuffer is THREAD-SAFE and StringBuilder is NOT THREAD-SAFE
		// Threads are future discussions
		
		// PS: If you wish to manipulate the strings a lot -> user buffer or builder
		//     Use String if you do not wish to change/manipulate string a lot
		
		// Do also explore other built in methods of StringBuffer and StringBuilder
		
		// Answer to a Qury in Session:
		// If you anytime wish to release un-used memory resources
		System.gc(); // Execute Garbage Collector
	}

}
