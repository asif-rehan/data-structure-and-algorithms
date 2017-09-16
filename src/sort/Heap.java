package sort;
import java.lang.Math;
import java.util.ArrayList;

public class Heap {
	/*
	 implements a min-heap with implicit representation using array*/
	
	public ArrayList<Integer> heapArray;
	public ArrayList<Integer> sorted;
	
	public Heap(ArrayList<Integer> arr){
		this.heapArray = new ArrayList<Integer>();
		this.sorted = new ArrayList<Integer>();
		heapify(arr);
	}
	
	private void heapify(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			insert(arr.get(i));
		}
	}

	private int getParent(int i) {
		int parent = 0; 
		
		if (i > 0) parent = (int)Math.floor(( i - 1 ) / 2); 
	
		return parent;
	}
	
	public int popMin() {
		int minValue = heapArray.get(0);
		if (heapSize() > 1) rebalance();
		return minValue;
	}

	private void rebalance(){
		int last = heapArray.get(heapSize()-1);	//grab the last 
		heapArray.set(0, last);					//and replace the heap root with it
		heapArray.remove(heapSize()-1);			//then remove the last one
		siftDown(0);						//now swap with the minimum of the children recursively
	}

	private void siftDown(int i){
		//checkout the children's values first
		int minIndex = i;
		int minVal = heapArray.get(i);
		for (int j = 1; j <= 2; j++) {
			int childIndex = 2*i + j;
			if (childIndex < heapSize()){
				Integer childVal = heapArray.get(childIndex);
				if (minVal > childVal){
					minIndex = childIndex;
					minVal = childVal;
				}
			}
	}
		
		if (minIndex != i) {	//minIndex != i ensures it swaps only if needed
			//then swap with the one with minimum value
			int current = heapArray.get(i);
			heapArray.set(i, heapArray.get(minIndex));
			heapArray.set(minIndex, current);
			
			//and repeat for the current child node as well
			siftDown(minIndex);
		}
	}

	public void insert(int newKey){
		heapArray.add(newKey);
		if (heapSize() > 1) siftUp(heapSize()-1);
	}
	
	public void siftUp(int i){
		Integer val = heapArray.get(i);
		int par = getParent(i);
		Integer parentVal = heapArray.get(par);
		if (parentVal > val) {
			heapArray.set(par, val);
			heapArray.set(i, parentVal);
			siftUp(par);
		}
		
	}
	
	public ArrayList<Integer> sort() {
		int size = heapSize();
		for (int i = 0; i < size; i++) {
			int min = popMin();
			sorted.add(min);
		}
		return sorted;
	}
	
	public void replace() {
		// TODO
	}
	
	
	public Heap merge(Heap other) {
		// TODO
		return other;
	}
	
	public int heapSize() {
		return heapArray.size();
	}
}

