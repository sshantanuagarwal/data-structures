package org.ds.arrays;

public class MinSumSubArray {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for( int i = 0; i < 10; i++ )
			arr[ i ] = (int)(Math.random() * 100 );
		for( int i = 0; i < 10; i++ )
			System.out.print( arr[i] + " ");
		System.out.println();

		int currSum = 0;
		int k = 3;
		for( int i = 0; i < k; i++ ) {
			currSum += arr[ i ];
		}
		int minSum = currSum;
		for( int i = 0; i < 10 - k - 1; i++ ) {
			currSum = currSum - arr[ i ] + arr[ i + k ];
			if( minSum > currSum )
				minSum = currSum;
		}
		System.out.println( "Minium Sum " + minSum );
	}




}
