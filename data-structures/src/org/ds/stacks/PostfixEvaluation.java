package org.ds.stacks;

import java.util.*;

public class PostfixEvaluation {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String exp = "1234+-*";

		Stack<Integer> s = new Stack();
		int len = exp.length();
		for( int i = 0; i < len; i++ ) {
			char c = exp.charAt(i);
			if( c >= '0' && c <= '9' ) {
				s.push( (int)(c-'0') );
			} else {
				int b = s.pop();
				int a = s.pop();
				if( c == '+' ) {
					s.push( a+b );
				}
				else if( c == '-' ) {
					s.push( a-b );
				}
				else if( c == '*' ) {
					s.push( a*b );
				}
				else if( c == '/' ) {
					s.push( a/b );
				}

			}
		}
		System.out.println( "ans:" + s.peek() );

	}
}
