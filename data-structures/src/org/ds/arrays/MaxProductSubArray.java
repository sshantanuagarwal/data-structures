package org.ds.arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for( int i = 0; i < 10; i++ )
			arr[ i ] = (int)(Math.random() * 100 - 50 );
		for( int i = 0; i < 10; i++ )
			System.out.print( arr[i] + " ");

		System.out.println();

		int maxProduct = Integer.MIN_VALUE;
		for( int i = 0; i < 10; i++ ) {
			for( int j = i + 1; j < 10; j++ ) {
				int product = arr[ i ] * arr[ j ];
				if( maxProduct < product )
					maxProduct = product;
			}
		}
		System.out.println( "Max Product: " + maxProduct );

		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		for( int i = 0; i < 10; i++ ) {
			int e = arr[ i ];
			if( e < 0 ) {
				if( e < min1 && e < min2 ) {
					min2 = min1;
					min1 = e;
				} else if( e < min2 ) {
					min2 = e;
				}
			} else {
				if( e > max1 && e > max2 ) {
					max2 = max1;
					max1 = e;
				} else if( e > max2 ) {
					max2 = e;
				}
			}
		}
		System.out.println( "Max Product: " + (((min1*min2) > (max1*max2)) ? (min1*min2) : (max1*max2)) );

	}


}
