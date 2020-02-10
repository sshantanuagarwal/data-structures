package org.ds.sorting;

public class Sort012 {
	public static void main(String[] args) {
		int arr[ ] = new int[10];
		
		for(int i = 0; i < arr.length; i++ )
			arr[ i ] = (int)(Math.random() * 3 );
		
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[ i ] + "\t" );
		
		System.out.println();
		int tmp, mid = 0, low  = 0, high = arr.length - 1;
		while( mid <= high ) {
			if( arr[ mid ] == 0 ) {
				tmp = arr[ low ];
				arr[ low ] = arr[ mid ];
				arr[ mid ] = tmp;
				low++;
				mid++;
			} else if( arr[ mid ] ==  1 ) {
				mid++;
			} else {
				tmp = arr[ high ];
				arr[ high ] = arr[ mid ];
				arr[ mid ] = tmp;
				high--;
			}
		}
		
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[ i ] + "\t" );
		System.out.println();
	}
}
