package org.ds.Trie;

public class TrieUtil {

	class Node {
		char data;
		Node[] next;
		boolean endOfString;
	}

	Node head = null;

	Node newNode( char s ) {
		Node n = new Node();
		n.data = s;
		n.next = new Node[26];
		for( int i = 0; i < n.next.length; i++ ) {
			n.next[ i ] = null;
		}	
		n.endOfString = false;
		return n;
	}

	void insert( String s ) {
		int len = s.length();
		Node iter = head;
		for( int i = 0; i < len; i++ ) {
			char c = s.charAt( i ); 
			int index = c - 'a';
			if( iter.next[ index ] == null ) {
				iter.next[ index ] = newNode( c );
			}
			if( i != len - 1 )
				iter = iter.next[ index ];
		}
		iter.endOfString = true;
	}

	void search( String s ) {
		int len = s.length();
		Node iter = head;
		for( int i = 0; i < len; i++ ) {
			char c = s.charAt( i ); 
			int index = c - 'a';
			if( iter.next[ index ] == null ) {
				break;
			}
			if( i != len - 1 )
				iter = iter.next[ index ];
		}
		if( iter.endOfString == true ) {
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
		t.search( "shiva" );
		System.out.println( "Done" );
	}
}
