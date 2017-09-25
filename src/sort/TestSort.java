package sort;

import java.util.ArrayList;
import java.util.Random;
import sort.BubbleSort;

public class TestSort {
	
	
	public static void main(String[] args){
		/* randomly initiates an array of length below 10 and values between 1 to 9 
		 * and sorts it from the smallest to largest
		
		*/
		
		int[] unsortedTestArray;
		int[] sortedArray;
		ArrayList<Integer> unsortedTestArrayList;
		ArrayList<Integer> sortedArrayList;
		
		unsortedTestArray = initializeRandomArray(11);

		System.out.println("===========Unsorted Array=======");
		printElements(unsortedTestArray);
		
		System.out.println("\n=====Selection Sort=======");
		sortedArray = new SelectionSort().sort(unsortedTestArray);
		printElements(sortedArray);

		unsortedTestArray = initializeRandomArray(11);
		System.out.println("\n===========Unsorted Array=======");
		printElements(unsortedTestArray);
		
		System.out.println("\n=====Bubble Sort=======");
		sortedArray = new BubbleSort().sort(unsortedTestArray);
		printElements(sortedArray);
		
		unsortedTestArrayList = initializeRandomArrayList(20);		
		System.out.println("\n\n====Unsorted ArrayList====");
		printElements(unsortedTestArrayList);
		
		System.out.println("\n=====Insertion Sort=======");
		sortedArrayList = new InsertionSort().sort(unsortedTestArrayList);
		printElements(sortedArrayList);
		
		System.out.println("\n\n=====Heap Sort=======");
		
		unsortedTestArrayList = initializeRandomArrayList(11);
		System.out.println("\n\n====Unsorted Array====");
		printElements(unsortedTestArrayList);
		
		Heap heap = new Heap(unsortedTestArrayList);
		System.out.println("\n===== Min-Heap structure =======");
		printElements(heap.heapArray);
		ArrayList<Integer> sortedHeap = heap.sort();
		System.out.println("\n===== sorted =======");
		printElements(sortedHeap);
		
		System.out.println("\n\n=====Heap Sort2=======");
		
		Heap2 heap2 = new Heap2(unsortedTestArrayList);
		System.out.println("\n===== Min-Heap structure =======");
		printElements(heap2.heap);
		heap2.heapSort();
		System.out.println("\n===== sorted =======");
		printElements(heap2.heap);
	}

	private static int[] initializeRandomArray(int max) {
		Random rand = new Random(123);
		int[] arr = rand.ints(max, 1, max).toArray();
		return arr;
	}
	private static ArrayList<Integer> initializeRandomArrayList(int max) {
		Random rand = new Random(123456789);
		ArrayList<Integer> arrL = new ArrayList<Integer>(max);
		int[] arr = rand.ints(max, 1, max).toArray();
		for (int i : arr) {
			arrL.add(i);
			
		}
		return arrL;
	}


	private static void printElements(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	private static void printElements(ArrayList<Integer> arr) {
		for (Integer j: arr) {
			System.out.print(j + " ");
		}
	}
	
}
