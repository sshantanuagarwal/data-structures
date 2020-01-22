package org.ds.queues;

import java.util.*;

public class QueueReverseRecursive {

	Queue<Integer> q = new LinkedList();

	void reverse() {
		if( q.isEmpty() )
			return;
		int num = q.remove();
		reverse();
		q.add( num );
	}

	public static void main(String[] args) {
		QueueReverseRecursive m = new QueueReverseRecursive();

		for( int i = 0; i < 10; i++ )
			m.q.add( (int)( Math.random() * 100 ) );

		System.out.println(m.q);

		m.reverse();

		System.out.println(m.q);

	}
}
