package org.ds.arrays;


public class ZigZagIteratorNArrays {
	
	int[][] v;
	int[] vsizes;
	int runUntil;
	int maxLength;
	public ZigZagIteratorNArrays( int[] vsizes ) {
		this.v = new int[ vsizes.length ][];

		for( int i = 0 ;i < vsizes.length; i++ ) {
			this.v[ i ] = new int[ vsizes[i ] ];
			for(int j = 0; j < vsizes[ i ]; j++ ) {
				this.v[ i ][ j ] = (int)(Math.random() * 100);
			}
		}
		for( int i = 0 ;i < vsizes.length; i++ ) {
			System.out.print( "Array " + i + ":");
			for( int j = 0; j < vsizes[ i ]; j++ ) {
				System.out.print( "\t" + this.v[i][j]);
			}
			System.out.println("\n");
		}
		this.maxLength = this.max(vsizes);
		this.runUntil = vsizes.length * this.maxLength;
		this.vsizes = vsizes;
	}
	
	public int max(int[] t) {
	    int maximum = t[0];   // start with the first value
	    for (int i = 
	    		1; i<t.length; i++) {
	        if (t[ i ] > maximum) {
	            maximum = t[i];   // new maximum
	        }
	    }
	    return maximum;
	}//end method max
	
	int i = 0;
	boolean hasNext() {
		// 1-15
		return runUntil > i;
	}

	int next() {
		int row = i % vsizes.length, col = i / vsizes.length;
		i++;
		if( col < vsizes[ row ] ) {
			return v[row][col];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] vsizes = { 4, 10 };
		ZigZagIteratorNArrays iterator = new ZigZagIteratorNArrays( vsizes );
		System.out.print( "Array Z: ");
		while( iterator.hasNext() ) {
			int val = iterator.next();
			if( val != -1 )
				System.out.print("\t" + val + "");
		}
	}
}