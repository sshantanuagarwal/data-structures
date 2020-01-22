package org.ds.linkedlist;

public class LLReverse {

	/*
	 * 1. Insert at Begining 2. Insert at End 3. Search by Value 4. Search By Index
	 * 5. Delete by Value 6. Delete By Index. 7. Sort 8. Reverse using recursion 9.
	 * Reverse using iteration. 10. Size of linkedList.
	 */
	class Node {
		int data;
		Node next;
	}

	Node head = null;

	Node newNode(int data) {
		Node tmp = new Node();
		tmp.data = data;
		tmp.next = null;
		return tmp;
	}

	void insertAtBegin(int data) {
		Node tmp = newNode(data);
		if (head == null)
			head = tmp;
		else {
			tmp.next = head;
			head = tmp;
		}
	}

	void insertAtEnd(int data) {
		Node tmp = newNode(data);
		if (head == null)
			head = tmp;
		else {
			Node iter = head;
			while (iter.next != null)
				iter = iter.next;
			iter.next = tmp;
		}
	}

	boolean searchByValue(int data) {
		if (head == null)
			return false;
		else {
			Node iter = head;
			while (iter != null) {
				if (iter.data == data)
					return true;
				iter = iter.next;
			}
			return false;
		}
	}

	int size() {
		Node iter = head;
		int count = 0;
		while (iter != null) {
			count++;
			iter = iter.next;
		}
		return count;
	}

	int searchByIndex(int index) {
		if (index > size()) {
			return -1;
		} else {
			Node iter = head;
			for (int i = 0; i < index; i++)
				iter = iter.next;
			return iter.data;
		}
	}

	void deleteByValue(int data) {
		if (head == null)
			return;
		if (searchByValue(data) == false)
			return;
		if (head.data == data)
			head = head.next;
		else {
			Node iter = head;
			while (iter.next != null) {
				if (iter.next.data == data)
					break;
				iter = iter.next;
			}
			iter.next = iter.next.next;
		}
	}

	void deleteByIndex(int index) {
		if (index > size())
			return;
		else {
			if (index == 1) {
				head = head.next;
			}
			Node iter = head;
			for (int i = 1; i < index - 1; i++) {
				iter = iter.next;
			}
			iter.next = iter.next.next;
		}

	}

	void print() {
		System.out.print("LL:");
		if (head == null)
			return;
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	void reverse() {
		if (head == null || head.next == null)
			return;

		Node tmp = head;
		while (tmp.next != null) {
			Node tmpNext = tmp.next;
			tmp.next = tmp.next.next;
			tmpNext.next = head;
			head = tmpNext;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		LLReverse m = new LLReverse();
		for (int i = 0; i < 5; i++)
			m.insertAtBegin((int) (Math.random() * 100));
		m.print();

		for (int i = 0; i < 5; i++)
			m.insertAtEnd((int) (Math.random() * 100));
		m.print();

		m.reverse();
		m.print();

		for (int i = 0; i < 100; i++)
			m.deleteByValue(i + 1);
		m.print();

	}

}
