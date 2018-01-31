package sort;


public class MergeSort{
	
	public void sort(int[] a){
		sort(a, 0, a.length -1); 
	}

	private void sort(int[] a, int i, int j) {
		if (i < j) {
			int pivot_point = i + (j-i)/2;
			sort(a, i, pivot_point);
			sort(a, pivot_point+1, j);
			merge(a, i, pivot_point, j);
		}
		
		
	}

	private void merge(int[] a, int leftStart, int leftEnd, int rightEnd) {
		//Arrays merged =new ArrayList<Integer>();
		int leftIndex = leftStart;
		int rightIndex = leftEnd+1;
		int tempIndex = 0;
		int[] temp = new int[rightEnd-leftStart+1]; 
		while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
			if (a[leftIndex] <= a[rightIndex]) {
				temp[tempIndex++] = a[leftIndex++];
			} else {
				temp[tempIndex++] = a[rightIndex++];
			}
		}
		while (leftIndex <= leftEnd) {
			temp[tempIndex++] = a[leftIndex++];
		}
		while (rightIndex <= rightEnd) {
			temp[tempIndex++] = a[rightIndex++];
		}
		for (int i = 0; i < temp.length; i++) {
			a[leftStart++] = temp[i]; 
		}
			
		
		
				
	}
}
