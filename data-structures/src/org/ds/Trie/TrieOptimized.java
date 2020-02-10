package org.ds.Trie;

public class TrieOptimized {

	class Node {
		char data;
		Node left;
		Node next;
		Node right;
		boolean endOfString;
	}

	Node head = null;

	Node newNode( char s ) {
		Node n = new Node();
		n.data = s;
		n.left = null;
		n.right = null;
		n.next = null;

		n.endOfString = false;
		return n;
	}

	void insert( String s ) {
		int len = s.length();
		Node iter = head;
		for( int i = 0; i < len; i++ ) {
			char c = s.charAt( i ); 
			if( iter.next == null ) {
				iter.next = newNode( c );
				iter = iter.next;
			} else {
				if( c < iter.next.data ) {
					iter.next.left = newNode( c );
					iter = iter.next.left;
				} else {
					iter.next.right = newNode( c );
					iter = iter.next.right;
				}
			}
		}
		//iter.endOfString = true;
	}

	void search( String s ) {
		int len = s.length();
		Node iter = head;
		boolean found = true;
		for( int i = 0; i < len; i++ ) {
			char c = s.charAt( i ); 
			if( iter.next == null ) {
				found = false;
				break;
			}
			if( iter.next.data == c ) {
				iter = iter.next;
			} else {
				if( c < iter.next.data ) {
					iter = iter.next.left;
				} else {
					iter = iter.next.right;
				}
			}
		}
		if( found == true ) {
			System.out.println( " FOUND: " + s );
		} else {
			System.out.println( "!FOUND: " + s );
		}
	}

	public static void main(String[] args) {
		String[] strings = { "shukla", "shubham", "shantanu", "shiv", "shivam" };
		TrieUtil t = new TrieUtil();
		t.head = t.newNode( ' ' );
		for( int i = 0; i < strings.length; i++ ) {
			t.insert( strings[ i ] );	
		}
		for( int i = 0; i < strings.length; i++ ) {
			t.search( strings[ i ] );
		}
		t.search( "vicky" );
		t.search("shiva");
		System.out.println( "Done" );
	}
}
