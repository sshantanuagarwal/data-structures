package org.ds.arrays;

public class ZigZagIterator {

	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 4 };
		int[] v2 = { 5, 6, 7, 8, 9, 10 };
		// 1 5 2 6 3 7 4 8 9 10

		int countofZigzag = Math.min(v1.length, v2.length);
		int maxLength = Math.max(v1.length, v2.length);

		for (int i = 0; i < countofZigzag * 2; i++) {
			if (i % 2 == 0) {
				System.out.print("\t " + v1[i / 2]);
			} else {
				System.out.print("\t " + v2[i / 2]);
			}
		}

		if (v1.length == maxLength) {
			// Read from v1
			for (int i = countofZigzag; i < maxLength; i++) {
				System.out.print("\t " + v1[i]);
			}
		} else {
			// Read from v2
			for (int i = countofZigzag; i < maxLength; i++) {
				System.out.print("\t " + v2[i]);
			}
		}
	}
}

