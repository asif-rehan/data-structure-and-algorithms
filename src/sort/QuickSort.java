package sort;

import java.util.ArrayList;

public class QuickSort {
	/**
	 * This class implements a QuickSort algorithm using Hoare Paritioning scheme. This partitionining scheme is 
	 * slightly harder to implement but is more efficient than the Lamuto partitioning scheme. 
	 * 
	 * Avg Time-Complexity: O(nlogn)
	 * Worst Time-Complexity: O(n^2)
	 * 
	 * Space complexity: O(1)
	 * 
	 * Example:
	 * -------
	 * QuickSort qs = new QuickSort();
	 * qs.sort(testArrayList);
	 */
	public void sort(ArrayList<Integer> A){
		sort(A, 0, A.size()-1);
	}

	private void sort(ArrayList<Integer> A, int i, int j) {
		/* only recursive case is kept active by ensuring i < j only. 
		 * For base case when only one cell has to be sorted, this would do nothing. For base case, i==j, 
		 * which is avoided in this condition
		 * */
		if (i < j) { 	
			
			int p = partition(A, i, j);
			sort(A, i, p);
			sort(A, p+1, j);
			
		}
	}

	private int partition(ArrayList<Integer> A, int i, int j) {
		
		int pivot_index = i + (j-i)/2; 	/* identify the pivot index. Merely find the mid point*/
		Integer pivot_value = A.get(pivot_index);	
		
		while (i < j) {		/* conditions prevents further running the loop when mid point is reached*/
			
			while (!(A.get(i) >=  pivot_value) && (i <= pivot_index)) {	
				/*find the element from the left side of the pivot that is 
				greater or equal to the pivot value
				It keeps searching from the left tail to the right until 
				it finds one*/
				
				i++;
				
			}
			
			while (!(A.get(j) <= pivot_value) && (j >= pivot_index)) {	
				/*find the element from the right side of the pivot that is 
				smaller or equal to the pivot value
				It keeps searching from the right tail to the left until 
				it finds one*/
				
				j--;
				
			}
			
			if (i < j) {	/*now swap the elements from the two sides*/ 
				Integer temp = A.get(i);
				A.set(i, A.get(j));
				A.set(j, temp);
				
				i++;
				j--;
				
			}
		}
		
		return pivot_index;
		
	}
}
