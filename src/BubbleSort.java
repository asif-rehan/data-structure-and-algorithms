import java.util.Random;

public class BubbleSort {
	
	
	public static void main(String[] args){
		/* randomly initiates an array of length below 10 and values between 1 to 9 
		 * and sorts it from the smallest to largest
		
		pseudo code
		------------
		for element from the left towards the right
			for each element 
			find the minimum out of everything to its right
			swap the smallest at the current position
		move to the next towards right
		*/
		
		int[] arr = initializeRandomArray();
		System.out.println("");
		printElements(arr);
		
		sortArray(arr);
		System.out.println("sorted");
		printElements(arr);
	}

	private static int[] initializeRandomArray() {
		Random rand = new Random();
		Integer len = rand.nextInt(10);
		int[] arr = rand.ints(len, 0, len).toArray();
		System.out.print("len" + String.valueOf(len));
		return arr;
	}

	private static void sortArray(int[] arr) {
		//sort the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]){
					int min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}		
		}
	}

	private static void printElements(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
