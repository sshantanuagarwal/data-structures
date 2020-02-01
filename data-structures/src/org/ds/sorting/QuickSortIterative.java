package org.ds.sorting;

public class QuickSortIterative {
	int[] arr =  new int[10];

	void insert() {
		for( int i = 0; i < 10; i++ ) 
			arr[i ] = (int)( Math.random() * 100 );
	}
	
	void print() {
		for( int i = 0; i < 10; i++ ) 
			System.out.print( arr[ i ] + "\t" );
		System.out.println();
	}
	int partition( int[] arr, int low, int high ) {
		int pivot = arr[ high ];
		int i = low;
		for( int j = low; j < high; j++ ) {
			if( arr[ j ] < pivot ) {
				int tmp = arr[ j ];
				arr[ j ] = arr[ i ];
				arr[ i ] = tmp;
				
				i++;
			}
		}
		int tmp = arr[ i ];
		arr[ i ] = arr[ high];
		arr[ high ] = tmp;
		return i;
	}
	
	void quickSort( int[] arr, int low, int high ) {
		if( low >= high )
			return;
		int pivot = partition( arr, low, high );
		quickSort(arr, low, pivot - 1 );
		quickSort(arr, pivot + 1, high );
	}
	
	void quickSortI( int[] arr, int low, int high ) {

		int pivot = partition( arr, low, high );
		while( low < high ) {
			high = partition( arr, low, high ) - 1;
		}
		while( low < high ) {
			low = partition( arr, low, high ) + 1;
		}
	}
	public static void main(String[] args) {
		QuickSortIterative qs = new QuickSortIterative();
		qs.insert();
		qs.print();
		qs.quickSortI( qs.arr, 0, qs.arr.length - 1 );
		qs.print();
		
	}
}
