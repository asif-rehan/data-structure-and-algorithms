package sort;

import java.util.Random;
import sort.BubbleSort;

public class TestSort {
	
	
	public static void main(String[] args){
		/* randomly initiates an array of length below 10 and values between 1 to 9 
		 * and sorts it from the smallest to largest
		
		*/
		
		int[] unsortedTestArray = initializeRandomArray();
		System.out.println("Unsorted Array=======");
		printElements(unsortedTestArray);
		
		int[] sortedArray = new BubbleSort().Sort(unsortedTestArray);
		System.out.println("sorted");
		printElements(sortedArray);
	}

	private static int[] initializeRandomArray() {
		Random rand = new Random();
		Integer len = rand.nextInt(10);
		int[] arr = rand.ints(len, 0, len).toArray();
		System.out.print("len" + String.valueOf(len));
		return arr;
	}

	private static void printElements(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
