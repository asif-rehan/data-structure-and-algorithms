package practiceJava;

import java.util.EmptyStackException;

public class StackImplementation<T> {
	
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public T pop() {
		if (this.top == null) throw new EmptyStackException();
		T currentTop = top.data;
		top = top.next;
		return currentTop;
	}
	
	public void push(T data) {
		StackNode<T> node = new StackNode<T>(data);
		top.next = node;
		top = node;
	}
	
	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
}
