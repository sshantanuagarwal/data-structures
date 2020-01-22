package org.ds.stacks;
import java.util.*;
public class PrefixToInfix {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String postfix = "++*+ABD/CD*MK";
		String infix = "";
		Stack<String> s = new Stack<>();
		for( int i = postfix.length(); i >= 0; i-- ) {
		    if( postfix.charAt(i) == '+' || postfix.charAt(i) == '-' || postfix.charAt(i) == '*' ||
		        postfix.charAt(i) == '/' ) {
		        String b = s.pop();
		        String a = s.pop();
		        infix = a + postfix.charAt(i) + b;
		        s.push( infix );
		    } else {
		        String data = String.valueOf( postfix.charAt(i) );
		        s.push( data );
		    }
		    System.out.println( infix );
		}
		System.out.println( "Pofix:" + postfix);
		System.out.println( "Infix:" + infix);
		
	}
}
