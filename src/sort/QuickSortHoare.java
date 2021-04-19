package sort;

import java.util.Arrays;

public class QuickSortHoare{

    int[] arr;
    public QuickSortHoare(int[] arr){
        this.arr = arr;
    }

    private void sort(int i, int j) {
		if (i < j) { 	
			int p = partition(i, j);
			sort(i, p);
			sort(p+1, j);
		}
	}
    private void sort(){
        sort(0, arr.length-1);
    }
    
    private int partition(int left, int right) {
        int pivot = (left+right)/2;
        int pivotValue = arr[pivot];
        int i = left-1;
        int j = right+1;
        System.out.println("p="+String.valueOf(pivot)+" pVal="+String.valueOf(pivotValue));
        while(true){
            do {
                i++;
            } while( arr[i] < pivotValue);
            do {
                j--;
            } while( arr[j] > pivotValue );

            if (i<j) {
                swap(i, j);
                for(int t=0;t<arr.length;t++){
                    System.out.println(String.valueOf(t)+"="+ String.valueOf(arr[t])+" ");
                }
                System.out.println("\n");
            } else {
                
                for(int t=0;t<arr.length;t++){
                    System.out.println(String.valueOf(t)+"="+ String.valueOf(arr[t])+" ");
                }
                System.out.println("\n");
                System.out.println("i"+String.valueOf(i)+" j="+String.valueOf(j));
                return j;
            }
        }
    }
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = new int[]{0,1,-3,2,-4,3,4,5,6,-7,7,7,-8, 9};
        QuickSortHoare sorter = new QuickSortHoare(arr);
        sorter.sort();
        for(int n: arr) {
            System.out.print(String.valueOf(n)+", ");
            
        }
    }

}