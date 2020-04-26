package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Song{ //extends Object{ Any Class/Type in Java is the Child of Object
	
	String title;
	String artist;
	double duration;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, double duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	// If we do not wish to see the HashCodes when we print references
	// Override toString and put the data what you wish to see in return statement
	public String toString() {
		return title+","+artist+","+duration;
	}
}

public class ListAPI {

	public static void main(String[] args) {
		
		// Array is Fixed in Size, whereas ArrayList is a dynamic data structure, no size limitation
		ArrayList list1 = new ArrayList();						// Can Store Any Type of Data i.e. any Object -> Hetro
		ArrayList<String> list2 = new ArrayList<String>();		// Can Store Only String Objects -> Homo
		ArrayList<Song> list3 = new ArrayList<Song>();			// Can Store Only Song Objects -> Homo

		// Generics in Java -> <String>
		// TypeSafety :)
		
		//	class ArrayList implements List {}
		// List list = new ArrayList(); 	// Polymorphic Statement
		
		Song song1 = new Song("abc.mp3", "harry", 3.3);
		Song song2 = new Song("pqr.mp3", "bob", 5.3);
		Song song3 = new Song("xyz.mp3", "fionna", 13.0);
		Song song4 = new Song("hello.mp3", "leo", 2.5);
		
		
		// 1. Add Data in ArrayList
		list1.add(100);			// 0th index
		list1.add(22.22);
		list1.add("John");
		list1.add("Jennie");
		list1.add("Dan");
		list1.add(song1);		// n-1 index
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(100);	// err
		//list2.add(song1);	// err
		
		list3.add(song1);
		list3.add(song2);
		list3.add(song3);
		
		// 2. View the Data from the List
		System.out.println(list1.get(0));
		System.out.println(list2.get(1));
		System.out.println(list3.get(2));
		
		// 3. View the List Completely
		System.out.println("==list1==");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("==list2==");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("==list3==");
		System.out.println(list3);
		System.out.println();
		
		// 4. Size of list
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		// 5. Check for Containment
		System.out.println("Is song3 in the list1: "+list1.contains(song3));
		System.out.println("Is John in the list2: "+list2.contains("John"));
		System.out.println("Is song1 in the list3: "+list3.contains(song1));
		
		// 6. Update the Data in List
		list1.set(1, "Kim");
		list2.set(2, "Kia");
		list3.set(2, song4);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println("===REMOVING DATA===");
		
		// 7. Remove the Element from the List
		list1.remove(1);	// on the basis of index
		list2.remove(1);
		list3.remove(1);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//list1.clear(); // removes all the elements
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sia");
		names.add("George");
		names.add("Nate");
		
		// 8. Add All the Elements from 1 list to another
		names.addAll(list2); // We can add all the elements from 1 list into another
		System.out.println("NAMES:");
		System.out.println(names);
		
		// 9. Index Of the Element
		int idx = names.indexOf("Nate");
		System.out.println(">> idx is: "+idx);
		
		// Lot Of Other APIs also in the same Class :)
		
		// 10. Iterate in the List (Put a Loop and access elements 1 by 1)
		System.out.println("Iterating with Basic For Loop");
		for(int i=0;i<list1.size();i++) {

			// Since, list1 is hetro and we dont know the type of data we will use Object
			// Object is parent class for the types in Java and we can use it with RTP Technique
			Object o = list1.get(i);
			System.out.println(o);

		}
		System.out.println();
		for(int i=0;i<list2.size();i++) {
			String str = list2.get(i);
			System.out.println(str);
		}
		System.out.println();
		for(int i=0;i<list3.size();i++) {
			Song song = list3.get(i);
			// toString will be automatically executed upon printing of reference variable
			System.out.println(song);	// Printing the reference variable will now, not show the HashCode as toString is overrided in Song class
		}
		
		System.out.println();
		System.out.println("Iterating with Enhanced For Loop");
		for(Object o : list1) {
			System.out.println(o);
		}
		
		System.out.println();
		for(String str : list2) {
			System.out.println(str);
		}
		
		System.out.println();
		for(Song song : list3) {
			System.out.println(song);
		}
		
		System.out.println();
		System.out.println("Iterating with Iterator");
		Iterator itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Song> itr3 = list3.iterator();
		
		//System.out.println(itr1.next());
		//System.out.println(itr1.next());
		
		while(itr1.hasNext()) {
			Object o = itr1.next();
			System.out.println(o);
		}
		
		System.out.println();
		while(itr2.hasNext()) {
			String str = itr2.next();
			System.out.println(str);
			
			if(str.equals("John")) {
				itr2.remove(); // With iterator while iterating we can use remove method to delete the element from list directly
			}
		}
		
		System.out.println();
		while(itr3.hasNext()) {
			Song song = itr3.next();
			System.out.println(song);
		}
		
		System.out.println();
		System.out.println("Iterating with ListIterator");
		ListIterator<String> listItr = list2.listIterator();
		
		while(listItr.hasNext()) {
			String name = listItr.next();
			System.out.println(name);
		}
		System.out.println("~~~~~~~~");
		while(listItr.hasPrevious()) {
			String name = listItr.previous();
			System.out.println(name);
		}
		
		// Iterator -> from 0 to n-1
		// ListIterator -> from 0 to n-1 and n-1 to 0
		
		System.out.println();
		System.out.println("Iterating with Enumeration");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()) {
			String name = enm.nextElement();
			System.out.println(name);
		}
		// With Enumeration we can only read the List and cannot remove the elements
		
	}
	
	// Assignment : Explore how to Sort the data in List
	//				Explore the API Collections.sort | Comparable and Comparator APIs

}
