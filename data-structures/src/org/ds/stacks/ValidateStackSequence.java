package org.ds.stacks;
import java.util.Stack;
public class ValidateStackSequence {
    boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack();
        int j = 0;
        for( int i = 0; i < pushed.length; i++ ) {
            s.push( pushed[ i ] );
            while( j < popped.length && !s.isEmpty() && popped[ j ] == s.peek() ) {
                s.pop();
                j += 1;
            }
        }
        for( int i = j; i < popped.length; i++ ) {
            if( s.pop() != popped[ i ] )
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
		int[] pushed = {1,2,3,4,5};
		int[] popped = {4,5,3,2,1};
		ValidateStackSequence o = new ValidateStackSequence();
		System.out.println(o.validateStackSequences( pushed, popped ));
	}
}
