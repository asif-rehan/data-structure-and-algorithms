package sort;

import java.util.ArrayList;

public class Heap2 {
	
	ArrayList<Integer> heap;
	
	public Heap2(ArrayList<Integer> arr){
		heap = buildMinHeap(arr, arr.size());
	}
	
	public void heapSort() {
		for (int i = heap.size()-1; i >= 0; i++) {
			int temp = heap.get(0);
			heap.set(0, heap.get(i));
			heap.set(i, temp);
			minHeapify(heap, 0, i-1);
			
		}
	}
	
	public ArrayList<Integer> buildMinHeap(ArrayList<Integer> arr, int len){
		for (int i = arr.size() / 2; i>=0; i--) {
			minHeapify(arr, i, len);
		}
		return arr;
	}
	
	private void minHeapify(ArrayList<Integer> arr, int i, int len) {
		int l = getLeft(i);
		int r = getRight(i);
		int min = arr.get(i);
		
		if (l < arr.size() && arr.get(l) < arr.get(i)) {
			min = l;
		}
		
		if (l < arr.size() && arr.get(r) < arr.get(i)) {
			min = r;
		}
		
		if (min != i) {
			int minVal = arr.get(min);
			arr.set(min, arr.get(i));
			arr.set(i, minVal);
		}
		
	}
	
	private int getLeft(int i){
		return 2 * i + 1;
	}
	
	private int getRight(int i){
		return 2 * i + 2;
	}

}
