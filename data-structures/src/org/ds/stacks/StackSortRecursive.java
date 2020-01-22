package org.ds.stacks;
import java.util.*;
public class StackSortRecursive {
	Stack<Integer> s = new Stack();
	
	void pushToBottom( int n ) {
	    if( s.isEmpty() || n > s.peek() ) {
	        s.push( n );
	    } else {
	        int num = s.pop();
	        pushToBottom( n );
	        s.push( num );
	    }
	}
	
	void sort() {
	    if( s.isEmpty() ) 
	        return;
	    int num = s.pop();
	    sort();
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
		StackSortRecursive s = new StackSortRecursive();
	    
		System.out.println("Hello World");
		for( int i = 0; i < 10; i++ )
		    s.s.push( (int)( Math.random() * 100 ) );
		
		s.print();
		s.sort();
		s.print();
	}
}
