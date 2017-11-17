package com.org.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class Queue {

	public static void main(String args[]){
		
		PriorityQueue pq = new PriorityQueue();
		pq.add("Murugan");
		pq.add("Mathi");
		pq.add("Jeeva");
		pq.add("Arun");
		//pq.add(33);
		pq.add("Bala");
		pq.peek();
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println("************");
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq);
	}
}
