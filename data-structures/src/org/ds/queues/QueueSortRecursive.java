package org.ds.queues;

import java.util.*;
public class QueueSortRecursive {

	static void insert( Queue<Integer> q, int num ) {
		if( q.isEmpty() || num > q.peek() ) {
			q.add( num );
		} else {
			num = q.remove();
			insert( q, num );
			q.add( num );
		}
	}

	static void sort( Queue<Integer> q ) {
		if( q.isEmpty() )
			return;
		int num = q.remove();
		sort( q );
		insert( q, num );
	}
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList();

		for( int i = 0; i < 10; i++ )
			q.add( (int)( Math.random() * 100 ) );

		System.out.println(q);

		sort( q );

		System.out.println(q);

	}
}