package sort;

public class BubbleSort {
	
	public int[] Sort(int[] arr){
		/*pseudo code
		------------
		for element from the left towards the right
			for each element 
			find the minimum out of everything to its right
			swap the smallest at the current position
		move to the next towards right
			 */
		//sort the array using Bubble Sort algo
	
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
