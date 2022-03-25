package com.bridgelabz.stackandQueue;

import com.bridgelabz.LinkedList;

public class StackAndQueue {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue program");
		LinkedList stack = new LinkedList();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peak();
		stack.pop();
		stack.pop();
		stack.pop();
//		stack.peak();
		stack.print();	
	}
}
