package sort;

public class SelectionSort {

	public int[] sort(int[] arr) {
		/* Selection Sort algorithm: 
		 * Complexity: O(n^2) 
		 * pseudo code
		------------
		for element from the left towards the right
			for each element 
			find the minimum out of everything to its right
			swap the smallest at the current position
		move to the next towards right
			 */
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
		
		return arr;
	}

}
