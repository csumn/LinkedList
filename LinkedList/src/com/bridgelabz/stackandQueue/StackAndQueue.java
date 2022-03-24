package com.bridgelabz.stackandQueue;

import com.bridgelabz.LinkedList;

public class StackAndQueue {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue program");
		LinkedList stack = new LinkedList();
		stack.enqueue(56);
		stack.enqueue(30);
		stack.enqueue(70);
		stack.print();
	}
}
