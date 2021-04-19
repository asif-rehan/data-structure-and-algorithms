package practiceJava;

import java.util.Stack;

public class MinStack {
	Stack<Integer> minStack = new Stack<>();
	Stack<Integer> minVal = new Stack<>();
	
	public void push(int x) {
		int newMin;
		
		if (minVal.size() > 0) {
			int prevMin = minVal.peek();
			newMin = Math.min(x, prevMin);
			
		} else {
			newMin = x; 
		}
		minStack.push(x);
		minVal.push(newMin);
	}
	public void pop() {
		minStack.pop();
		minVal.pop();
	}
	public int top() {
		int topVal = minStack.peek();
		return topVal;
	}
	public int getMin() {
		int currentMin = minVal.peek();
		return currentMin;
	}

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);

		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		System.out.println();
		
		obj.push(-2);
		obj.push(0);
		obj.push(-1);
		System.out.println(obj.getMin());
		System.out.println(obj.top());
		obj.pop();
		System.out.println(obj.getMin());
		
	}
}
