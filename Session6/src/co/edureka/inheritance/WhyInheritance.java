package co.edureka.inheritance;

// In eCommerce Web App we have n number of Products
// Shoe -> id, name, color, price, shoeSize, category
// TV -> id, name, color, price, screenSize, technology
// Mobile -> id, name, color, price, screenSize, os, ram, memory

// For n-number of products we have some common attributes

/*
class Shoe{
	
	int id;
	String name;
	String color;
	int price;
	int shoeSize;
	String category;
		
	public Shoe() {
	}

	public Shoe(int id, String name, String color, int price, int shoeSize, String category) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.shoeSize = shoeSize;
		this.category = category;
	}
	
	public void showShoeDetails() {
		System.out.println("====SHOE DETAILS====");
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("COLOR:"+color);
		System.out.println("PRICE:"+price);
		System.out.println("SIZE:"+shoeSize);
		System.out.println("CATEGORY:"+category);
		System.out.println("====================");
		
	}
}

class TV{
	
	int id;
	String name;
	String color;
	int price;
	int screenSize;
	String technology;
		
	public TV() {
	}

	
	public TV(int id, String name, String color, int price, int screenSize, String technology) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.screenSize = screenSize;
		this.technology = technology;
	}

	public void showTVDetails() {
		System.out.println("====TV DETAILS====");
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("COLOR:"+color);
		System.out.println("PRICE:"+price);
		System.out.println("SIZE:"+screenSize);
		System.out.println("TECH:"+technology);
		System.out.println("====================");
		
	}
}


class Mobile{
	
	int id;
	String name;
	String color;
	int price;
	int screenSize;
	String os;
	int ram;
	int memory;
		
	public Mobile() {
	}

	public Mobile(int id, String name, String color, int price, int screenSize, String os, int ram, int memory) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.screenSize = screenSize;
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}

	public void showMobileDetails() {
		System.out.println("====MOBILE DETAILS====");
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("COLOR:"+color);
		System.out.println("PRICE:"+price);
		System.out.println("SIZE:"+screenSize);
		System.out.println("OS:"+os);
		System.out.println("RAM:"+ram);
		System.out.println("MEMORY:"+memory);
		System.out.println("====================");
		
	}
}

*/
/*
 	CHALLENGE:
 	To have n-number of products we cannot code so much of classes
 	We may write many classes, but cannot write the similar code again and again
 	
 	SOLUTION:
 	We Generalize the common properties and do it with INHERITANCE
 	
 	FOCUS -> SAVING DEVELOPMENT TIME :)
 */

// We have taken common attributes and formed the object: Product
class Product{

	int id;
	String name;
	String color;
	int price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String color, int price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void showProductDetails() {
		System.out.println("*****PRODUCT DETAILS*****");
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("COLOR:"+color);
		System.out.println("PRICE:"+price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}

class Shoe extends Product{
	
	int shoeSize;
	String category;
		
	public Shoe() {
	}

	public Shoe(int id, String name, String color, int price, int shoeSize, String category) {
		super(id, name, color, price);
		this.shoeSize = shoeSize;
		this.category = category;
	}
	
	public void showShoeDetails() {
		showProductDetails();
		System.out.println("====SHOE DETAILS====");
		System.out.println("SIZE:"+shoeSize);
		System.out.println("CATEGORY:"+category);
		System.out.println("====================");
		
	}
}

class TV extends Product{
	
	int screenSize;
	String technology;
		
	public TV() {
	}

	
	public TV(int id, String name, String color, int price, int screenSize, String technology) {
		super(id, name, color, price);
		this.screenSize = screenSize;
		this.technology = technology;
	}

	public void showTVDetails() {
		showProductDetails();
		System.out.println("====TV DETAILS====");
		System.out.println("SIZE:"+screenSize);
		System.out.println("TECH:"+technology);
		System.out.println("====================");
		
	}
}


class Mobile extends Product{
	
	int screenSize;
	String os;
	int ram;
	int memory;
		
	public Mobile() {
	}

	public Mobile(int id, String name, String color, int price, int screenSize, String os, int ram, int memory) {
		super(id, name, color, price);
		this.screenSize = screenSize;
		this.os = os;
		this.ram = ram;
		this.memory = memory;
	}

	public void showMobileDetails() {
		showProductDetails();
		System.out.println("====MOBILE DETAILS====");
		System.out.println("SIZE:"+screenSize);
		System.out.println("OS:"+os);
		System.out.println("RAM:"+ram);
		System.out.println("MEMORY:"+memory);
		System.out.println("====================");
		
	}
}



public class WhyInheritance {

	public static void main(String[] args) {
		
		Shoe sRef = new Shoe(101, "AlphaBounce", "black", 8000, 9, "Sports");
		TV tRef = new TV(201, "Bravia", "silver", 60000, 50, "OLED");
		Mobile mRef = new Mobile(301, "iPhone", "Green", 80000, 5, "iOS", 4, 256);
		
		sRef.showShoeDetails();
		tRef.showTVDetails();
		mRef.showMobileDetails();		
	}

}
