
package org.ds.stacks;

import org.ds.linkedlist.*;

public class StackOperations {
	LL ll = new LL();

	void push(int data) {
		ll.insertAtBegin(data);
	}

	void pop() {
		ll.deleteAtBegin();

	}

	void print() {
		ll.print();
	}

	public static void main(String[] args) {
		StackOperations stack = new StackOperations();

		for (int i = 1; i <= 10; i++)
			stack.push(i);

		stack.print();
		stack.pop();
		stack.print();
	}
}
