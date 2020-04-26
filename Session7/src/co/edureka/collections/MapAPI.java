package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapAPI {

	public static void main(String[] args) {
		
		// HashMap is a combination of Key Value Pair
		// Keys are Unique in the HashMap , but values can be duplicated
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "John");
		map.put(456, "Fionna");
		map.put(999, "Sia");
		map.put(121, "John");
		map.put(331, "Kim");
		
		map.put(456, "Shawn");	// Update Operation for the key
		
		System.out.println("map is: ");
		System.out.println(map);
		
		System.out.println(">> size of map is: "+map.size());
		System.out.println(">> Is 101 in the map? "+map.containsKey(101));
		System.out.println(">> Is Harry in the map? "+map.containsValue("Harry"));
		
		String name = map.get(121);
		System.out.println(">> name with key 121 is: "+name);
		
		map.remove(331);
		
		System.out.println(map);
		
		// Iterate in the Map
		// 1. Obtain all the keys and iterate
		System.out.println(">> Iterating in HashMap");
		Set<Integer> keys = map.keySet(); // Obtain all the keys in the Map as Set Data Structure
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		
		// 2. Use the API Entry of Map
		// Iterate on the basis of Entry which is a combination of Key Value Pair
		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		// SYNCHRONIZED or THREAD-SAFE
		// Cannot support Null Key
		// Cannot Support Null Value
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		//table.put(null, "John");	// Run Time Error
		table.put(456, "Fionna");
		table.put(999, "Sia");
		table.put(121, "John");
		//table.put(331, null);		// Run Time Error

	}

}
