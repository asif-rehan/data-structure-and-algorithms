package sort;

import java.util.Random;
import sort.BubbleSort;

public class TestSort {
	
	
	public static void main(String[] args){
		/* randomly initiates an array of length below 10 and values between 1 to 9 
		 * and sorts it from the smallest to largest
		
		*/
		
		int[] unsortedTestArray = initializeRandomArray(11);
		System.out.println("Unsorted Array=======");
		printElements(unsortedTestArray);
		
		int[] sortedArray = new SelectionSort().sort(unsortedTestArray);
		System.out.println("sorted");
		printElements(sortedArray);
	}

	private static int[] initializeRandomArray(int max) {
		Random rand = new Random();
		Integer len = rand.nextInt(max);
		int[] arr = rand.ints(len, 1, len).toArray();
		System.out.print("len" + String.valueOf(len));
		return arr;
	}

	private static void printElements(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
