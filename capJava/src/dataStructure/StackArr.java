package dataStructure;

import java.util.EmptyStackException;

public class StackArr {
	private int[] stack;
	private int top;

	public StackArr(int size) {
		stack = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int data) {
		if (top == stack.length - 1) {
			throw new StackOutOfMemory();
		}
		stack[++top] = data;
	}

	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print("|| " + stack[i] + " ||");
			System.out.println();
		}
		System.out.println("================");
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top];
	}
	
	public int currentSize() {
		return top == -1 ? 0 : top + 1;
	}
}

class StackOutOfMemory extends Error {
	public StackOutOfMemory() {
		super("Stak is full");
	}
}