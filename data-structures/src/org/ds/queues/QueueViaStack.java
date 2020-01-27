package org.ds.queues;

import java.util.*;
public class QueueViaStack {
	
	Stack<Integer> s = new Stack<Integer>();
	
	void add( int data ) {
		s.push( data );
	}
	
	void remove() {
		if( !s.isEmpty() ) {
			int num = s.pop();
			s.push( num );
		}
	}
	
	void print() {
		Iterator<Integer> i = s.iterator();
		System.out.print( "Queue: " );
		while( i.hasNext() )
			System.out.print( i.next() + " " );
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		QueueViaStack q = new QueueViaStack();
		for( int i = 0; i < 10; i++ )
			q.add( (int)( Math.random() * 100 ) );
		q.print();
		
		q.remove();
		
		q.print();
	}
}
