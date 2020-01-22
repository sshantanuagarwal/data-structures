package org.ds.arrays;
import java.util.*;
public class DuplicatesInArray {
	public static void main(String[] args) {
		HashMap<Integer, Integer > map = new HashMap<>();
		
		int[] arr = new int[10];
		for( int i = 0; i < 10; i++ ) {
			arr[i] = (int)( Math.random() * 10 );
		}
		for( int i = 0; i < 10; i++ ) {
			System.out.print( arr[i] + " " );
		}
		System.out.println();
		
		for( int i = 0; i < 10; i++ ) {
			if( map.containsKey( arr[i] ) ) {
				int count = map.get(arr[ i ] );
				if( count == 1 )
					System.out.print( arr[ i ] + " " );
				map.replace( arr[ i ], count, count+1 );
			} else {
				map.put( arr[i], 1 );
			}
		}
		
	}
}
