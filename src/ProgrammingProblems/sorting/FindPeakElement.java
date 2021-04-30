package ProgrammingProblems.sorting;

import java.util.Arrays;

public class FindPeakElement {
    int[] nums;
    public int findPeakElement(int[] nums){
        this.nums = nums;
        return searchIterative(0, this.nums.length-1);

    }
    private int searchRecursive(int l, int r) {
        if(l==r) return l;
        int mid = (l+r)/2;
        if (nums[mid]>nums[mid+1]){
            return searchRecursive(l, mid);
        } else return searchRecursive(mid+1, r);
    }
    private int searchIterative(int l, int r){
        
        while(l<r){
            int mid = (l+r)/2;
            if (nums[mid]>nums[mid+1]){
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return l;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,3,5,6,4};
        FindPeakElement peakElement = new FindPeakElement();
        int res = peakElement.findPeakElement(arr);
        System.out.println(res);
    }
}
