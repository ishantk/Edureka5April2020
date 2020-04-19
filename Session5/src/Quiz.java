class FoodItem{
	
	String name;
	
	int count=1;
	static int scount=1;
	
	FoodItem(){
		name = "NA";
	}
	
	FoodItem(String name){
		this.name = name;
	}
	
	void incrementItem() {
		count++;
		scount++;
	}
	
	void decrementItem() {
		count--;
		scount--;
	}
	
	void showFoodItemCounts() {
		System.out.println(">> "+name+" | "+count+" | "+scount);
	}
	
}


public class Quiz {

	public static void main(String[] args) {
		
		FoodItem item1 = new FoodItem("Burger");	// 1st Object Construction
		FoodItem item2 = new FoodItem("Pizza");		// 2nd Object Construction
		FoodItem item3 = item1;						// Reference Copy
		
		// Default count : 1
		// Default scount: 1
		
		// 1. How many Objects did we create 2
		
		item1.incrementItem();	// i1/i3 count: 2	| FoodItem Class scount: 2
		item2.incrementItem();  // i2 count: 2	    | FoodItem Class scount: 3
		item3.incrementItem();  // i1/i3 count: 3	| FoodItem Class scount: 4
		
		item1.incrementItem();	// i1/i3 count: 4	| FoodItem Class scount: 5
		item2.decrementItem();  // i2 count: 1	    | FoodItem Class scount: 4
		item3.decrementItem();  // i1/i3 count: 3	| FoodItem Class scount: 3
		
		item1.decrementItem();	// i1/i3 count: 2	| FoodItem Class scount: 2
		item2.incrementItem();  // i2 count: 2	    | FoodItem Class scount: 3
		
		item1.showFoodItemCounts();	// Burger |  2	| 	3
		item2.showFoodItemCounts();	// Pizza  |  2	| 	3
		item3.showFoodItemCounts(); // Burger |  2	| 	3
		
		// 1. -> 2 objects, 3 objects
		// 2. -> Burger | n1 | n2 : 54
		// 3. -> Item   | n1 | n2 : 55
		// 4. -> Item   | n1 | n2 : 56
		
	}

}
