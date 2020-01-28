package org.ds.arrays;

public class WaveArray {
	int generateRandom( int min, int max ) {
		return( min + ( int )( Math.random() * ( max - min ) ) );
	}
	public static void main(String[] args) {
		WaveArray wa = new WaveArray();
		int[] arr =  new int[10];
		int min = 0, max = 10;

		arr[ 0 ] = wa.generateRandom( min, max ); // Index 0
		
		for( int i = 1; i < 10; i++ ) {
			if( i % 2 == 1 )
				arr[ i ] = wa.generateRandom( min, arr[ i - 1 ] ); // LOW
			else
				arr[ i ] = wa.generateRandom( arr[ i - 1 ], max); // HIGH
		}
		for( int i = 0; i < 10; i++ ) 
			System.out.print( arr[ i ] + " " );
	}
} 
