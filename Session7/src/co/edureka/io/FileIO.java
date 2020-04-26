package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// Customer Object Representation
class Customer{
	
	// Attributes
	String name;
	String phone;
	String email;
	
	
	public Customer() {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name:");
		name = scanner.nextLine();
		
		System.out.println(">> Enter Customer Phone:");
		phone = scanner.nextLine();
		
		System.out.println(">> Enter Customer Email:");
		email = scanner.nextLine();
		
		scanner.close();
		
	}
	
	// Data of Customer as CSV Format
	public String getCustomerDetails() {
		String customerDetails = name+","+phone+","+email+"\n";
		return customerDetails;
	}
}

public class FileIO {
	
	void writeDataInFile(String data) {
		
		// For Performing File Handling Operations, we need try catch bloc as many APIs will throw Checked Exceptions
		try {
			
			File file = new File("/users/ishantkumar/Downloads/customers-26-4-2020.csv");
			
			//FileWriter writer = new FileWriter(file); 	// Overwrite the data in file
			FileWriter writer = new FileWriter(file, true); // Append the data in file
			writer.write(data);
			System.out.println(">> DATA SAVED");
			writer.close(); 								// close releases memory resources
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}
	
	void writeDataInFileAgain(String data) {
		
		// For Performing File Handling Operations, we need try catch bloc as many APIs will throw Checked Exceptions
		try {
			
			File file = new File("/users/ishantkumar/Downloads/my-customers-26-4-2020.csv");
			
			// FileOutputStream outputStream = new FileOutputStream(file);
			FileOutputStream outputStream = new FileOutputStream(file, true);
			outputStream.write(data.getBytes());		// writes the data in the form of bytes
			
			System.out.println(">> DATA SAVED");
			outputStream.close(); 								// close releases memory resources
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}
	
	void readDataFromFile() {
		try {
			
			File file = new File("/users/ishantkumar/Downloads/customers-26-4-2020.csv");
			FileReader reader = new FileReader(file);			// reads char by char
			BufferedReader buffer = new BufferedReader(reader);	// reads line by line | So that we as developer can process the data
			
			String line = "";
			// Read the line from buffer till the end. end means null :)
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
				
				// We can process the data well if it is available as a line :)
				//String[] data = line.split(",");
				
			}
			buffer.close();
			reader.close();
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	

	void readDataFromFileAgain() {
		try {
			
			File file = new File("/users/ishantkumar/Downloads/my-customers-26-4-2020.csv");
			//File file = new File("/users/ishantkumar/Downloads/ThrowThrows.java");
			FileInputStream inputStream = new FileInputStream(file);
			
			int i = 0;
			char ch = ' ';
			
			while((i = inputStream.read()) != -1) {
				ch = (char)i;			// casting of byte into char
				System.out.print(ch);	// printing character by character
			}
			
			inputStream.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}

	public static void main(String[] args) {
		
		FileIO io = new FileIO();
		
		System.out.println("PLEASE SEELCT AN OPTION");
		System.out.println("1. ADD Customer");
		System.out.println("2. UPDATE Customer");
		System.out.println("3. DELETE Customer");
		System.out.println("4. VIEW Customer");
		System.out.println("5. VIEW ALL Customers");
		
		int choice = 5;
		
		if(choice == 1) {
			
			Customer customer = new Customer();
			System.out.println(customer.getCustomerDetails());
			
			System.out.println(">> Would You Like to Save The Customer? (yes/no)");
			
			String save = "yes";
			
			if(save.equals("yes")) {
				
				String data = customer.getCustomerDetails();
				//io.writeDataInFile(data);
				io.writeDataInFileAgain(data);
			}
		}else if (choice == 5) {
			//io.readDataFromFile();
			io.readDataFromFileAgain();
		}
	}
}

// Assignment: Source Code Analysis
//		       Try to read .java file and count the number of objects created in the file
//			   Also count number of keywords used in the .java file
//			   Are the braces OK i.e. for every opening brace { we have a closing brace }

// File Handling with Sequential Access (0 to n-1 characters)
//					  Dynamic Access (Accessing the data in between) | Seeking and Peeking in File | Explore :)
