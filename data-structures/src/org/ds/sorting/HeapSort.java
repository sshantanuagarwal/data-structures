package org.ds.sorting;

public class HeapSort {
	int arr[] =  new int[ 7 ];
	int top = arr.length - 1;
	int arrS[] = new int[ arr.length ];
	
	void insert() {
		for( int i = 0; i < arr.length; i++ ) {
			arr[ i ] = (int)( Math.random() * 100 );
			swimUp( i );
		}
	}
	
	void swimUp( int i ) {
		int p;
		while( arr[ i ] > arr[ (i-1)/2 ] ) {
			p = (i-1)/2;
			int tmp = arr[ i ];
			arr[ i ]  = arr[ p ];
			arr[ p ] = tmp;
			i = p;
		}
	}
	
	void swimDown() {
		int i = 0;
		int c1 = 2 * i +1;
		int c2 = c1 + 1;
		while( ( c1 < top && arr[ i ] < arr[ c1 ] ) || 
			   ( c2 < top && arr[ i ] < arr[ c2 ] ) ) {
			int c = (arr[ c1 ] > arr[ c2 ]) ? ( c1 ) : ( c2 );
			int tmp = arr[ c ];
			arr[ c ] = arr[ i ];
			arr[ i ] = tmp;
			i = c;
			c1 = 2 * i + 1;
			c2 = c1 + 1;
		}
	}
	
	void heapSort() {
		for( int i = 0; i < arr.length - 1; i++ ) {
			arr[ top ] = arr[ 0 ];
			arr[ 0 ] = arr[ top - 1 ];
			top--;
			
 			swimDown();
		}
	}
	
	void printHeap() {
		System.out.println("Heap:");
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[ i ] + "\t" );
		System.out.println();
	}
	
	void printSorted() {
		System.out.println("Sort:");
		for( int i = 0; i < arr.length; i++ )
			System.out.print( arr[ i ] + "\t" );
		System.out.println();
	}

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		hs.insert();
		hs.printHeap();
		hs.heapSort();
		hs.printSorted();
	}
}
