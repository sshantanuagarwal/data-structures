package org.ds.arrays;

public class SpiralPrint {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rows = arr.length, cols = arr[0].length;

		for( int j = 0; j < rows/2; j++) {
            for( int i = j; i < rows - j; i++ )
                System.out.print( arr[j][i] + " " );
            for( int i = j + 1; i < cols - j; i++ )
                System.out.print( arr[i][cols - j - 1] + " " );
            for( int i = cols - j - 2; i >= j; i-- )
                System.out.print( arr[rows - j - 1][i] + " " );
            for( int i = rows - j - 2; i > j; i-- )
                System.out.print( arr[i][j] + " " );
                
            System.out.println();
            
		}
	}
}
