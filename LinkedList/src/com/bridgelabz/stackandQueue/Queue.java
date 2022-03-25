package com.bridgelabz.stackandQueue;

import com.bridgelabz.LinkedList;
public class Queue {
	public static void main(String[] args) {
		System.out.println("Welcome to Queue program");
		LinkedList queue = new LinkedList();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.print();
		queue.dequeue();
		queue.dequeue();

		queue.dequeue();

		queue.print();
	}
}
