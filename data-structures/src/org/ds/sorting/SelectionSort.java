package org.ds.sorting;

public class SelectionSort {

	int arr[] = new int[10];	
	
	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}

	public void addElements() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
	}

	public void selectSort() {
		addElements();
		printArray();
		for(int i = 0; i < arr.length; i ++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArray();
	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		sort.selectSort();

	}

}
