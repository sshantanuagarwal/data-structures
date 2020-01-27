package org.ds.stacks;

import java.util.*;

public class StackViaQueue {
	Queue<Integer> q = new LinkedList();
	
	void push( int data ) {
		q.add( data );
	}
	
	void pop() {
		int length = q.size();
		for( int i = 0; i < length - 1; i++ )
			q.add( q.remove() );
		q.remove();
	}
	
	void print() {
		Iterator<Integer> i = q.iterator();
		System.out.print( "Stack: ");
		while( i.hasNext() ) {
			System.out.print( i.next() + " " );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackViaQueue s = new StackViaQueue();
		for( int i = 0; i < 10; i++ )
			s.push( (int)( Math.random() * 100 ) );
			
		s.print();
		
		for( int i = 0; i < 10; i++ ) {
			s.pop();
		
			s.print();
		}
	}
	
}
