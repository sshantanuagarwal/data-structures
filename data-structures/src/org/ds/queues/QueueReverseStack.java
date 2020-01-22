package org.ds.queues;

import java.util.*;

public class QueueReverseStack {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Stack<Integer> s = new Stack();
		Queue<Integer> q = new LinkedList();
		
		for( int index = 0; index < 10; index ++ )
		    q.add( (int)( Math.random() * 100 ) );
		
		
		System.out.println( q );
		
		while( !q.isEmpty() ) {
		    s.push( q.remove() );
		}
		while(!s.isEmpty() ) {
		    q.add( s.pop() );
		}
		
		System.out.println( q );
		    
	}
}
