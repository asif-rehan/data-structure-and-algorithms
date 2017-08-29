package sort;
import java.lang.Math;

public class Heap {
	public int[] heapArray;
	
	public Heap(int[] arr){
		this.heapArray = heapify(arr);
	}
	
	private int[] heapify(int[] arr) {
		for (int i = arr.length-1; i > 0; i--) {
			int par = getParent(i);
			if (arr[par] > arr[i]) {
				int temp = arr[par];
				arr[par] = arr[i];
				arr[i] =  temp;
			}
		}
		return arr;
	}

	private int getParent(int i) {
		int parent; 
		if (i%2==0) {
			parent = (int)Math.floor(( i -2 ) / 2); 
		}else{
			parent = (int)Math.floor(( i -1 ) / 2);
		}
		return parent;
	}
	
	private void balance(){
		//TODO
	}
	public int findMax() {
		int max = 0;
		return max;
	}
	public void insert(){
		
	}
	public void pop() {
		
	}
	public void replace() {
		// TODO
	}
	
	public int[] createEmptyHeap() {
		int[] emptyHeap = {};
		return emptyHeap;
	}
	public Heap merge(Heap other) {
		// TODO
		return other;
	}
	public int heapSize() {
		return heapArray.length;
	}
}
