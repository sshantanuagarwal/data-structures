package org.ds.linkedlist;

public class DeleteMiddle {
	class Node {
		int data;
		Node next;
	}

	Node head = null;

	Node newNode( int data ) {
		Node tmp = new Node();
		tmp.data = data;
		tmp.next = null;
		return tmp;
	}

	void insert( int data ) {
		Node tmp = newNode( data );
		if( head == null )
			head = tmp;
		else {
			Node iter = head;
			while( iter.next != null )
				iter = iter.next;
			iter.next = tmp;
		}
	}

	void print(){
		System.out.print( "LL:" );
		if(head == null)
			return;
		Node temp = head;
		while(temp.next != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	void deleteMiddle() {
		Node slow = head, fast = head.next;
		Node prev = slow;
		while( slow != null && fast != null && fast.next != null ) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = prev.next.next;
	}
	public static void main(String[] args) {
		DeleteMiddle m = new DeleteMiddle();
		for(int i = 0; i < 6; i++)
			m.insert( (int)(Math.random() * 100) );
		m.print();

		m.deleteMiddle();
		m.print();

	}
}