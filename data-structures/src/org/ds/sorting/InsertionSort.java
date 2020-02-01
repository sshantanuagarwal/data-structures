package org.ds.sorting;

public class InsertionSort {
	int arr[] = new int[10];	

	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + "\t");
		}
		System.out.println();
	}

	public void addElements() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
	}

	public void insertSort() {
		addElements();
		printArray();
		for( int i = 1; i < arr.length; i++ ) {
			int j = i - 1;
			while( j >= 0 && arr[ j ] > arr[ j+1 ] ) {
					//swap 
				int tmp = arr[ j ];
				arr[ j ] = arr[ j + 1 ];
				arr[ j + 1 ] = tmp;

				j--;
			}
		}	
		printArray();
	}

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		sort.insertSort();
	}

}
