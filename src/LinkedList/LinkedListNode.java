package practiceJava;

public class LinkedListNode {
	LinkedListNode next = null;
	int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	void appedToEnd(int data) {
		LinkedListNode current = this;
		while(current.next != null) {
			current = current.next; 
		}
		current.next = new LinkedListNode(data);
	}
	LinkedListNode deleteNode(int d) {
		LinkedListNode current = this;
		if (current.data == d) {
			return current.next;
		}
		while(current.next != null) {
			if (current.next.data != d) {
				current = current.next;
			} else {
				current.next = current.next.next;
				break;
			}
		}
		return current;
	}
	
	public static void main(String[] args) {

	}
}
