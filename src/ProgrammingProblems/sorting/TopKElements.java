package ProgrammingProblems.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class TopKElements {
    int kSmallest;
    Map<Integer, Integer> counts = new HashMap<>();
    int[] unique;

    private void swap(int i, int j){
        int temp = unique[i];
        unique[i] = unique[j];
        unique[j] = temp;
        System.out.println(Arrays.toString(unique));
    }
    
    private int partition(int left, int right) {
        int pivot = (left+right)/2;
        int pivotValue = counts.get(unique[pivot]);
        System.out.println(pivotValue);
        int i = left-1;
        int j = right+1;
        while(true){
            do {
                i++;
            } while( counts.get(unique[i]) < pivotValue);
            do {
                j--;
            } while( counts.get(unique[j]) > pivotValue );

            if (i<j) {
                swap(i, j);
            } else {
                System.out.print("i="+String.valueOf(i));
                System.out.println(" j="+String.valueOf(j)+"\n\n");
                for (int k=0; k<unique.length;k++){
                    System.out.println(String.valueOf(k)+" "+
                                    String.valueOf(unique[k]) + " "+
                                    String.valueOf(counts.get(unique[k])));
                }
                return j;
            }
        }
    }

    private void quickSelect(int left, int right) {
        System.out.println("\n\nleft="+ String.valueOf(left)+" right="+ String.valueOf(right));
        if (left<right) {
            int p = partition(left, right);
            System.out.println("p="+ String.valueOf(p) + " kSmallet=" + String.valueOf(kSmallest));
            if (p <= kSmallest) quickSelect(left, p);
            else quickSelect(p+1, right);
            
        }
    
    }

    public int[] topKFrequent(int[] nums, int k) {
        
        for (int i: nums){
            counts.put(i, counts.getOrDefault(i, 0)+1);
        }
        unique = new int[counts.keySet().size()];
        int i = 0;
        for(int n: counts.keySet()){
            unique[i] = n;
            i++;
            System.out.print(String.valueOf(n)+",");
        }
        this.kSmallest = unique.length-k;
        quickSelect(0, unique.length-1);
        

        return Arrays.copyOfRange(unique, unique.length-k, unique.length);
    }
    public static void main(String[] args) {
        TopKElements topk = new TopKElements();
        int[] res = topk.topKFrequent(new int[]{2,3,4,1,4,0,4,-1,-2,-1}, 2);
        
        System.out.println(Arrays.toString(res));
    }
}