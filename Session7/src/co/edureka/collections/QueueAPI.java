package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String[] args) {
		
		// PriorityQueue<int> queue = new PriorityQueue<int>(); We dont use int | error
		// For every Primitive Data Type we Have a Wrapper Class i.e. Object Representation of Primtives
		
		// PrimitiveType -> Wrapper Class (Primitives can be represented as References)
		// int -> Integer
		// char -> Character
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// (Head)10 9 8 7 6 5 4 3 2 1(Tail)
		
		// PriorityQueue Sorts the Data within
		// (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		
		int head = queue.peek(); // peek will give head of queue
		System.out.println(">> Head of Queue is: "+head);
		System.out.println(">> Size of Queue is: "+queue.size());
		
		// BEFORE: (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		System.out.println("REMOVE HEAD OF QUEUE");
		queue.poll(); // Removes the Head of Queue
		// AFTER: (Head)2 3 4 5 6 7 8 9 10(Tail)	
		
		head = queue.peek();
		System.out.println(">> New Head of Queue is: "+head);
		System.out.println(">> Size of Queue is: "+queue.size());
		

	}

}
