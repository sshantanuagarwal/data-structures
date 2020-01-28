package org.ds.arrays;

public class SpiralPrint {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] arr = new int[8][8];//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rows = arr.length, cols = arr[0].length;

		System.out.println(rows + " " + cols );

		for( int i = 0; i < rows; i++ ) {
			for( int j = 0; j < cols; j++ )
				arr[i][j] = (int)(Math.random() * 10 );
		}
		
		
		for( int i = 0; i < rows; i++ ) {
			for( int j = 0; j < cols; j++ )
				System.out.print( arr[ i ][ j ] + "\t" );
			System.out.println();
		}
		
		System.out.println();
		
		int num = Math.min(rows, cols) + 1 / 2;
		for( int j = 0; j < num; j++) {
            for( int i = j; i < cols - j; i++ )
                System.out.print( arr[j][i] + " " );
            for( int i = j + 1; i < rows - j; i++ )
                System.out.print( arr[i][cols - j - 1] + " " );
            for( int i = cols - j - 2; i >= j; i-- )
                System.out.print( arr[rows - j - 1][i] + " " );
            for( int i = rows - j - 2; i > j; i-- )
                System.out.print( arr[i][j] + " " );
                
            System.out.println();
            
		}
	}
}
