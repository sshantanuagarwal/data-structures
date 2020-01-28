package org.ds.arrays;

public class CharToInt {
	public static void main(String[] args) {
		String data = new String();
		data = "-88297 248252140B12 37";
		int len = data.length();
		boolean neg = false;
		int start = 0;
		if( data.charAt( 0 ) == '-' ) {
			neg = true;
			start++;
		} else if( data.charAt( 0 ) == '+' ) {
			neg = false;
			start++;
		}
		int result = 0;
		for( int i = start; i < len; i++ ) {
			char c = data.charAt( i );
			if( c >= '0' && c <= '9' ) {
				result = result * 10 + (int)( c-'0');
			} else {
				break;
			}
		}
		System.out.println( neg ? -1*result : result );
		
	}
}