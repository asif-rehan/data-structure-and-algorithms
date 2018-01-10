package sort;

import java.util.ArrayList;

public class MergeSort{
	
	public void sort(ArrayList<Integer> A){
		sort(A, 0, A.size()-1); 
	}

	private void sort(ArrayList<Integer> a, int i, int j) {
		if (i < j) {
			int pivot_point = i + (j-1)/2;
			sort(a, i, pivot_point);
			sort(a, pivot_point+1, j);
			merge(a, i, j, pivot_point);
		}
		
		
	}

	private void merge(ArrayList<Integer> a, int i, int j, int pivot_point) {
		
		
	}
}
