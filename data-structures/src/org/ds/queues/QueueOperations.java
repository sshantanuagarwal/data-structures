package org.ds.queues;

import org.ds.linkedlist.*;

public class QueueOperations {
	
	LL ll = new LL();
	
	void enque( int data ) {
		ll.insertAtBegin( data );
	}
	
	void deque() {
		ll.deleteAtEnd();
	}
	
	void print() {
		ll.print();
	}
	
	public static void main(String[] args) {
		
		QueueOperations queue = new QueueOperations();
		for( int i = 1; i <= 10; i++ ) {
			queue.enque( i );
		}
		
		queue.print();
		queue.deque();
		queue.print();
		
		
	}
}
