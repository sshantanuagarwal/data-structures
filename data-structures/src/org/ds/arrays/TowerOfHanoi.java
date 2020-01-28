package org.ds.arrays;

public class TowerOfHanoi {
	void toh( char a, char b, char c, int n ) {
		if( n == 1 ) {
			System.out.println( "Move disk 1 from " + a + " to " + b );
			return;
		}
		
		toh( a, c, b, n-1);
		System.out.println( "Move disk " + n + " from " + a + " to " + c );
		toh( c, b, a, n-1 );
	}
	public static void main(String[] args) {
		TowerOfHanoi hot = new TowerOfHanoi();
		hot.toh( 'A', 'C', 'B', 2 );
	}
}
