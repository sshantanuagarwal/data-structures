package org.ds.stacks;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String infix = new String();
		infix = "A+B*C-D/E+F*G/H";
		String postfix = ""; 
		// A+BC*-DE/+FG*H/
		// ABC*+DE/-FG*H/+
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put( "+", 1 );
		h.put( "-", 1 );
		h.put( "*", 2 );
		h.put( "/", 2 );
		h.put( "(", 3 );
		
		Stack<String> s = new Stack<String>();
		
		int inLen = infix.length();
		for( int i = 0; i < inLen; i++ ) {
			String e = Character.toString( infix.charAt( i ) );
			if( e == ")" ) {
				while( s.peek() != ")" )
					postfix += s.pop();
				s.pop();
			} else if( h.containsKey( e ) ) {
				int prec = h.get( e );
				if( s.isEmpty() || prec > h.get( s.peek() ) ) {
					s.push( e );
				} else {
					while( true ) {
						if( s.isEmpty() || ( prec > h.get( s.peek() ) ) )
							break;
						
						postfix += s.pop();
					}
				}
			} else {
				postfix += e;
			}
			System.out.println(infix + "      " + s + "     " + postfix );
		}
		System.out.println( "Infix   : " + infix );
		System.out.println( "Postfix : " + postfix );
	}
}
