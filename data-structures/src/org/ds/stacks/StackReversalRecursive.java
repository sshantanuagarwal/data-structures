package org.ds.stacks;
import java.util.*;
public class StackReversalRecursive {
	Stack<Integer> s = new Stack();

	void pushToBottom( int n ) {
		if( s.isEmpty() ) {
			s.push( n );
			return;
		}

		int num = s.pop();
		pushToBottom( n );
		s.push( num );
	}

	void reverse() {
		if( s.isEmpty() ) 
			return;
		int num = s.pop();
		reverse();
		pushToBottom( num );
	}

	void print() {
		Iterator i = s.iterator();
		while( i.hasNext() ) {
			System.out.print( i.next() + " " );

		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackReversalRecursive s = new StackReversalRecursive();

		System.out.println("Hello World");
		for( int i = 0; i < 10; i++ )
			s.s.push( (int)( Math.random() * 100 ) );

		s.print();
		s.reverse();
		s.print();
	}
}
