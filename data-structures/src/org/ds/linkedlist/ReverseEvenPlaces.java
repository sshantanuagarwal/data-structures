package org.ds.linkedlist;

public class ReverseEvenPlaces {
	public static void main(String[] args) {
		LL ll = new LL();
		for( int i = 0; i < 10; i++ ) {
			ll.insertAtBegin((int)(Math.random() * 100 ));
			
		}
		ll.print();
		
		LL llEven = new LL();
		
		while( ll.next != null ) {
			ll.Node tmp = ll.next;
			ll.next = ll.next.next;
		}
	}
}
