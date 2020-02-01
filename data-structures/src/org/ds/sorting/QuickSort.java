package org.ds.sorting;

public class QuickSort {
	int[] arr =  new int[10];
	void enterArray() {
		for( int i = 0; i < 10; i++ ) {
			arr[i] = (int)( Math.random() * 100 );
		}
	}
	void printArray() {
		for( int i = 0; i < 10; i++ ) {
			System.out.print( arr[ i ] + "\t " );
		}
		System.out.println();
	}
	
	int partition( int  low, int high, int[] arr ) {
		int pivot = arr[high];  
		int i = (low-1); 
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] < pivot) 
			{ 
				i++; 

				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
        int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	}

	void quickSort(  int start, int end, int[ ]  arr ) {
		if( start >= end )
			return;

		int pivot = partition( start, end, arr );
		
		
		quickSort(start, pivot -1, arr);
		quickSort(pivot + 1, end, arr);
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		qs.enterArray();
		qs.printArray();

		qs.quickSort( 0, qs.arr.length - 1, qs.arr );
		qs.printArray();
	}
}
