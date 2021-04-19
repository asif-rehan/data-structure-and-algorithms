package practiceJava;

import java.util.NoSuchElementException;

public class QueueImplementation<T> {
	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public void addToQueue(T data) {
		QueueNode<T> node = new QueueNode<T>(data);
		//add to end of queue
		if (this.last != null) {
			this.last.next = node;
		}
		last = node; //update last pointer
		//now check if queue was empty so this is the first one 
		if (first == null) {
			first = last;
		}
	}

	public T removeFromFirst() {
		if (first == null) throw new NoSuchElementException();
		T firstData = this.first.data;	//return from first for FIFO
		//fix the first
		first = first.next;
		//now also fix the last pointer
		if (first==null) {
			this.last = null;
		}
		return firstData;	
	}
	
	public T peek() {
		if (this.first == null) throw new NoSuchElementException();
		return first.data;
	}

}
