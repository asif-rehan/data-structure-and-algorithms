package sort;

public class BubbleSort {
	
	public int[] sort(int[] arr){
		/*Bubble Sort algorithm: 
		 * Complexity: O(n^2) 
		 * pseudo code
		------------
		for element from the left towards the right
			for each element 
			if it is smaller than the current value
			swap the smallest at the current position
		move to the next towards right
			 */
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]){
					int min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}		
		}
	return arr;
	}

}
