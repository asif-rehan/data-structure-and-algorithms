package sort;

import java.util.ArrayList;

public class InsertionSort {
	
	/* Insertion sort requires shifting the values and inserting at particular location
	 * So ArrayList is a better option for implementation than Arrays in Java
	 * Complexity: O(n)
	 * 
	 * Pseudo-code:
	 * ==========
	 * for each element from index i such that 1<=i< size of array
	 * 		search backwards for an index, j such that   0 <= j < i
	 * 			if the value at index j < less than the value at i
	 * 				store j+1 as the stop index where the value at index i should be inserted
	 * 		if the stop index != i the insertion is earlier than the current location, then
	 * 			remove the value at index i
	 * 			insert the value at index
	 * 
	 * return the sorted array
	 */
	
	public ArrayList<Integer> sort(ArrayList<Integer> array){

		for (int i = 1; i < array.size(); i++) {
			// pick any number at index i, such that 1<=i<len, skip the 0-th index
			int stop = 0;
			for (int j = i-1; j >= 0; j--) {
				// find an index j where value is less than the value at index, i
				// else it will search to index 0
				if (array.get(j) < array.get(i)) {	
					// check if the value at index j is less than the value at index, i
						stop = j+1;
						break;
					}
				} 
			if (stop != i) {	// stop location is actually the current index, then value at i > value at i-1
								// so don't do anything
				Integer val = array.get(i);
				array.remove(i);
				array.add(stop, val);
			}
			}
			
		return array;
	}
}
