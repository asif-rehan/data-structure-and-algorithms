package sort;

import java.util.ArrayList;

public class Heap {
	/*
	 	• O(n lg n) worst case.
			– Like merge sort.
		• Sorts in place.
			– Like insertion sort.
		• Combines the best of both algorithms.
	*/
	
	ArrayList<Integer> heap;
	
	public Heap(ArrayList<Integer> arr){
		heap = buildMaxHeap(arr, arr.size());
	}
	
	public void heapSort() {
		for (int i = heap.size()-1; i >= 1; i--) {
			int temp = heap.get(0);
			heap.set(0, heap.get(i));
			heap.set(i, temp);
			maxHeapify(heap, 0, i-1);
			
		}
	}
	
	public ArrayList<Integer> buildMaxHeap(ArrayList<Integer> arr, int len){
		for (int i = arr.size() / 2; i>=0; i--) {
			maxHeapify(arr, i, len);
		}
		return arr;
	}
	
	private void maxHeapify(ArrayList<Integer> arr, int i, int len) {
		int l = getLeftIndex(i);
		int r = getRightIndex(i);
		int maxIndex = i;
		
		if (l < len && arr.get(l) > arr.get(maxIndex)) {
			maxIndex = l;
		}
		
		if (l < len && arr.get(r) > arr.get(maxIndex)) {
			maxIndex = r;
		}
		
		if (maxIndex != i) {
			int maxVal = arr.get(maxIndex);
			arr.set(maxIndex, arr.get(i));
			arr.set(i, maxVal);
			maxHeapify(arr, maxIndex, len);
		}
		
	}
	
	private int getLeftIndex(int i){
		return 2 * i + 1;
	}
	
	private int getRightIndex(int i){
		return 2 * i + 2;
	}

}
