
public class StringBuiltInMethods {

	public static void main(String[] args) { //(String[] args) -> Array Of Strings -> Command Line Arguments
		
		String name = "John Watson";
		System.out.println(">> name is: "+name);
		
		name.toUpperCase();
		System.out.println(">> name after toUpperCase is: "+name); // No Changes will be made
		
		// PS: Strings are IMMUTABLE i.e. we cannot change them
		//     If you try to manipulate string you get a new string in return
		
		// We get another string returned back which will be modified version
		String upperName = name.toUpperCase();
		System.out.println(">> upperName is: "+upperName);
		
		//String fullName = "Mr.".concat(name);
		String fullName = "Mr." + name; // Concatenation
		System.out.println(">> fullName is: "+fullName);
		
		System.out.println(">> name still now is: "+name);
		
		// 			    0123					   27
		String names = "John, Jennie, Jim, Jack, Joe";
		int length = names.length();
		System.out.println(">> length of "+names+" is "+length+" number of characters including white spaces");
		
		char ch = names.charAt(2);
		System.out.println(">> ch is: "+ch); // h
		
		ch = names.charAt(length-1);
		System.out.println(">> ch now is: "+ch); // e
		
		int idx = names.indexOf('o');
		System.out.println(">> idx of o is: "+idx); // 1
		idx = names.lastIndexOf('o');	// index from the end
		System.out.println(">> last idx of o is: "+idx); // 26
		
		idx = names.indexOf("Jo");
		System.out.println(">> idx of Jo is: "+idx); // 0
		
		idx = names.lastIndexOf("Jo");
		System.out.println(">> last idx of Jo is: "+idx); // 25
		
		// Split the String on some Pattern and you get Array of Strings in return
		String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(str.trim()); // trim eliminates white spaces from front and end
		}
		
		// from 3rd index till the end
		//String subStr = names.substring(3);
		// from 3rd index but less than 9 i.e. till 8th index -> SLICING the Strings
		String subStr = names.substring(3, 9);
		System.out.println(">> subStr is: "+subStr);
		
		// Convert the String into Array of Characters
		char[] chArr = names.toCharArray();
		int JFrequency = 0;
		for(char c : chArr) {
			System.out.print(c+" ");
			if(c == 'J') {
				JFrequency++;
			}
		}
		System.out.println();
		System.out.println(">> J Character Found "+JFrequency+" times");
		
		String email = "john@example.com";
		String phone = "+91 99999 77777";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println(">> A Valid Email");
		}else {
			System.out.println(">> Please Enter a Valid Email");
		}
		
		if(phone.length() < 10) {
			System.out.println(">> Invalid Phone");
		}else {
			System.out.println(">> A Valid Phone");
		}
		
		String songName = "ABC.mp3"; // startsWith
		if(songName.endsWith(".mp3")) {
			System.out.println(">> Its MP3 Format and we can play the song");
		}else {
			System.out.println(">> Its not MP3 Format and we cannot play the song");
		}
		
		// Search and Filter Operations on Strings -> contains, startsWith and endsWith
	}

}
