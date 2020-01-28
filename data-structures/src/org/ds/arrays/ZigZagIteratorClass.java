package org.ds.arrays;

public class ZigZagIteratorClass {
	
	int[] v1;
	int[] v2;
	int runUntil;
	
	public ZigZagIteratorClass(int v1size, int v2size) {
		this.v1 = new int[v1size];
		this.v2 = new int[v2size];
		this.runUntil = v1.length + v2.length;
		System.out.println("v1: ==   ");
		for(int i = 0; i < v1size; i ++ ) {
			v1[i] = (int)(Math.random() * 100);
			System.out.print("\t" + v1[i]);
		}
		System.out.println();
		System.out.println("v2: ==   ");
		for(int i = 0; i < v2size; i ++ ) {
			v2[i] = (int)(Math.random() * 100);
			System.out.print("\t" + v2[i]);
		}
		System.out.println("\n");
	}



	int i = 0;

	boolean hasNext() {
		// 1-10
		return i < runUntil;
	}

	int next() {
		i++;
		int countofZigzag = Math.min(v1.length, v2.length); // 4
		int maxLength = Math.max(v1.length, v2.length); // 6
		
		if( i <= countofZigzag *2 ) {
			// 8
			if (i % 2 == 1) {
				return v1[i / 2];
			} else {
				return v2[(i / 2) - 1];
			}
			
		} else {
			// 2
			if (v1.length == maxLength) {
				// Read from v1
				return v1[i - countofZigzag -1];
			} else {
				// Read from v2
				return v2[i - countofZigzag - 1];
			}
		}

	}
	public static void main(String[] args) {
		ZigZagIteratorClass iterator = new ZigZagIteratorClass(14, 10);
		while(iterator.hasNext())
			System.out.print("\t" + iterator.next() + "");
		System.out.println("\n" + iterator.hasNext());
	}
}