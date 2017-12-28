package sort;

import java.util.ArrayList;

public class Heap2 {
	
	ArrayList<Integer> heap;
	
	public Heap2(ArrayList<Integer> arr){
		heap = buildMinHeap(arr, arr.size());
	}
	
	public void heapSort() {
		for (int i = heap.size()-1; i >= 1; i--) {
			int temp = heap.get(0);
			heap.set(0, heap.get(i));
			heap.set(i, temp);
			maxHeapify(heap, 0, i-1);
			
		}
	}
	
	public ArrayList<Integer> buildMinHeap(ArrayList<Integer> arr, int len){
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
			int minVal = arr.get(maxIndex);
			arr.set(maxIndex, arr.get(i));
			arr.set(i, minVal);
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
