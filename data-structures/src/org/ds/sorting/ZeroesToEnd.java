package org.ds.sorting;

public class ZeroesToEnd {
	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i = 0; i< arr.length; i++ )
			arr[i] = (int)( Math.random() + 0.5 );
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + "\t" );
		System.out.println();
		int low = 0, high = arr.length - 1;
		while( low < high ) {
			if( arr[ low ] == 1 )
				low++;
			else if( arr[high] == 0 )
				high--;
			else {
				int tmp = arr[ low ];
				arr[low] = arr[high];
				arr[high] = tmp;
			}
		}
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + "\t" );
		System.out.println();
	}
}
