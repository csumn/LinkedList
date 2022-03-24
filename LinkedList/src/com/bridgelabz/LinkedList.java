package com.bridgelabz;

public class LinkedList {
private Node head;
	
	private class Node{
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	public boolean add(int data) {
		boolean isAdded = false;
		
		Node node = new Node(data);
		if(head == null) {
			head = node;
			isAdded = true;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
		
	public void print() {
		Node temp = head;
		System.out.println("Linked List :");
		
		while(temp != null) {
			System.out.print(temp.key + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}