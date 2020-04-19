class User{
	
	String name;
	
	// Encapsulation -> Making properties of object as private so we dont have a direct access
	private String email;
	private String phone;
	
	void setEmail(String email) {
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		}else {
			this.email = "NA";
		}
	}
	
	void setPhone(String phone) {
		if(phone.length() >= 10 && phone.length() <= 15 && phone.startsWith("+91")) {
			this.phone = phone;
		}else {
			this.phone = "NA";
		}
	}
	
	String getEmail() {
		return email;
	}
	
	String getPhone() {
		return phone;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		User user = new User();
		
		// Data in the Object is directly accessible :(
		
		// Writing/Updating the Data Directly
		user.name = "John";
		
		// private : which cannot be directly accessed :(
		//user.email = "ajshdfksldflg"; // err
		//user.phone = "56789087654356789008"; // err
		
		user.setEmail("ajshdfksldflg");
		user.setPhone("+1 99999 77777");

		// Read the Data Directly
		// System.out.println(">> "+user.name+" can be called at "+user.phone+" and can be emailed at "+user.email); // err
		
		// Data Hiding -> ENCAPSULATION
		
		System.out.println(">> "+user.name+" can be called at "+user.getPhone()+" and can be emailed at "+user.getEmail()); // err
	}

}
