package com.bridgelabz.stackandQueue;

import com.bridgelabz.LinkedList;
public class Queue {
	public static void main(String[] args) {
		System.out.println("Welcome to Queue program");
		LinkedList Queue = new LinkedList();
		Queue.enqueue(56);
		Queue.enqueue(30);
		Queue.enqueue(70);
		Queue.print();
	}
}
