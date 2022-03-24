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

	public boolean enqueue(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public boolean append(int data) {
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

	public void insertAtPos(int pos, int data) {
		if(pos < 1) {
			System.out.println("Invalid pos");
			return;
		}

		if(pos == 1) {
			push(data);
		}
		else {
			Node node = new Node(data);
			Node temp = head;
			int count = 2;
			while(count < pos) {
				temp = temp.next;
				count++;
			}
			Node curr = temp.next;
			temp.next = node;
			node.next = curr;
		}
	}
	public int pop() {
		if(head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.key;
	}

	public void peak() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println("Peak element is " + temp.key);
		}
	}

	public boolean search(int elememt) {
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isFound = false;
		while(temp != null) {

			if(temp.key == elememt) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		System.out.println(isFound);
		return isFound;
	}

	public void insertNextToElement(int elememt, int data) {
		Node node = new Node(data);
		if(head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while(temp != null) {

			if(temp.key == elememt) {
				//				System.out.println("Element added");
				Node newNode = temp.next;
				temp.next = node;
				node.next = newNode;
				break;
			}
			temp = temp.next;
		}
	}

	public int popLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		if(head.next == null) {
			Node temp = head;
			head = null;
			return temp.key;
		}
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.key;
		temp.next = null;
		return data;
	}

	public boolean remove(int element) {
		if(!search(element)) {
			System.out.println("Element which need to be removed is not present");
			return false;
		}
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.key == element) {
			head = temp.next;
			return true;
		}

		while(temp != null) {
			if(temp.key == element ) {
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		return false;
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

	public void sort() {
		System.out.println("\n ----Sorted---- \n");
		Node temp1 = head;
		Node temp2;
		while(temp1.next != null) {
			temp2 = temp1.next;
			while(temp2 != null) {
				if(temp1.key > temp2.key) {
					int temp = temp1.key;
					temp1.key= temp2.key;
					temp2.key = temp;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}
}
