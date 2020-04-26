package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		// must know what is HashTable Data Structure :) Explore in case you are unaware !!
		
		ArrayList<String> list = new ArrayList<String>();
		
		//HashSet<String> set = new HashSet<String>();
		//Set<String> set = new HashSet<String>();
		
		// TreeSet is the Sorted Version of HashSet
		TreeSet<String> set = new TreeSet<String>(); // TreeSet will also Sort the Data for Us

		// Redundant Elements are supported by the list
		list.add("John");
		list.add("Jennie");
		list.add("John");
		list.add("Jim");
		list.add("Sia");
		list.add("Kim");
		list.add("Jim");
		
		// Redundant Elements are not supported by the set due to Hashing technique
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Sia");
		set.add("Kim");
		set.add("Jim");
		
		System.out.println("list is:");
		System.out.println(list);
		
		System.out.println();
		
		System.out.println("set is:");
		System.out.println(set);// output of set is unordered due to Hashing
		
		// Further we can't read single element as we don't have the indexes here
		
		set.remove("Jim");
		System.out.println("Is Jim in the set "+set.contains("Jim"));
		System.out.println("Set Size is: "+set.size());
		
		// We cannot iterate on Set with indexes as we have HashCodes 
		// So, we cannot use for loops, but can use API like Iterator and Enumeration
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
				
		
		// PS: List supports duplicates
		//     Set focuses on UNIQUENESS :)
		
		//HashSet set1 = new HashSet();
		//HashSet<Song> set2 = new HashSet<Song>();
		
		
	}

}
