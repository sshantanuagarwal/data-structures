package org.ds.arrays;

public class MinSumSub {

	int arr[] = new int[10];
	void insert() {
		for( int i = 0; i< arr.length; i++ )
			arr[ i ] = ( int ) ( Math.random() * 10 );
	}
	
	void print() {
		System.out.println();
		for( int i = 0; i< arr.length; i++ )
			System.out.print( arr[ i ] + "\t " );
		System.out.println();
		for( int i = 0; i< arr.length; i++ )
			System.out.print( i + "\t " );
		System.out.println();
	}
	
	void minSubArr( int minSum ) {
		int minIndex = 0, maxIndex = 0;
		for( int i  = 0; i < arr.length; i++ ) {
			minIndex = i;
			int sum = 0, j = i;
			while( j < arr.length && sum < minSum ) {
			
				sum += arr[ j ];
				j++;
				if( sum <= 0 ) {
					i = j+1;
					break;
				}
			}
			maxIndex = j;
			if( sum < minSum ) {
				System.out.println( "No subarray exists" );
				return;
			}
			System.out.println( "MinIndex: " + minIndex + " MaxIndex: " + (maxIndex-1) + " Diff: " + (maxIndex - minIndex) + " Sum: "  + sum );
		}
	}
	
	public static void main(String[] args) {
		MinSumSub m = new MinSumSub();
		m.insert();
		m.print();
		m.minSubArr( 15 );
	}
}
