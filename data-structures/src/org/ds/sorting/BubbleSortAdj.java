package org.ds.sorting;

public class BubbleSortAdj {
	private int[] arr;

	BubbleSortAdj() {
		
	}
	
	BubbleSortAdj( int arr[] ) {
		this.arr = arr;
		addElements();
	}

	private void bubbleSort() {
		printArray();
		for(int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray();
	}

	private void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}

	private void addElements() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		BubbleSortAdj sort = new BubbleSortAdj( arr );
		sort.bubbleSort();
		sort.printArray();	
	}
}

class c1 extends BubbleSortAdj{
	
	public c1() {
		super();
	}

}