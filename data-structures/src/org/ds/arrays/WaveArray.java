package org.ds.arrays;

public class WaveArray {
	int generateRandom( int min, int max ) {
		return( min + (int)( Math.random() * (max - min) ) );
	}
	public static void main(String[] args) {
		WaveArray wa = new WaveArray();
		int[] arr =  new int[10];
		int min = 0, max = 100;
		for( int i = 0; i < 10; i++ ) {
			if( i == 0 )
				arr[ i ] = wa.generateRandom( min, max );
			else if( i % 2 == 1 )
				arr[ i ] = wa.generateRandom(min, arr[i-1]);
			else
				arr[i] = wa.generateRandom(arr[i-1], max);
		}
		for( int i = 0; i < 10; i++ ) 
			System.out.print( arr[ i ] + " " );
	}
}
