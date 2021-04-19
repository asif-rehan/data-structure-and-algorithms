package practiceJava;

public class HeapSort {
	int[] heap;
	int heapSize;
	
	public HeapSort(int[] arr) {
		this.heapSize = arr.length;
		this.heap = arr;
	}
		

	private int left(int i) {
		return 2*i + 1;
	}
	private int right(int i) {
		return 2*i+2;
	}
	
	private void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		
		int largest;
		//find the biggest between current and left child
		largest = l < heapSize && heap[i] < heap[l] ? l : i;
		//now check if right child is even bigger than that
		largest = r < heapSize && heap[largest] < heap[r] ? r : largest;
		
		if (largest != i) {
			swap(largest, i);
			maxHeapify(largest);
		}
	}

	public void buildMinHeap() {
		for (int i=heap.length/2; i>=0; i--) {
			maxHeapify(i);
		}
	}

	public int[] sort() {
		buildMinHeap();
		for (int i=heap.length-1; i>=1; i--) {
			swap(0,i);	////sends the minimum value to the end of the array creating descending order sorted array 
			this.heapSize--;	  //reduce the size of the heap and do not touch the sorted values at the end of the array
			maxHeapify(0);	
		}
		return this.heap;
	}

	private void swap(int smallest, int i) {
		int temp = heap[i];
		heap[i] = heap[smallest];
		heap[smallest] = temp;
	}
	
	public int[] getHeap() {
		return this.heap;
	}

}
