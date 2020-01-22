package org.ds.arrays;

import java.util.HashMap;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		int[] arr = new int[ 10 ];
		HashMap< Integer, Integer > map = new HashMap<>();
		for( int i = 0; i < 10; i++ ) {
			arr[ i ]  = (int)( Math.random() * 20 - 5 );
		}
		
		for( int i = 0; i < 10; i++ ) {
			System.out.print( arr[ i ] + " " );
		}
		System.out.println();
		
		int sum = 0;
		boolean found = false;
		int i = 0;
		map.put( 0, 0 );
		for( ; i < 10; i++ ) {
			sum += arr[ i ];
			if( map.containsKey( sum ) ) {
				found = true;
				break;
			}
			map.put( sum, i );
		}
		if( found ) {
			System.out.println( "SubArray found at " + 
								(map.get( sum ) + 1) + " to " + i );
		} else {
			System.out.println( "No subarray exists.");
		}
	}
}
