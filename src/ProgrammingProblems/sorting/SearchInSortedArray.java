package ProgrammingProblems.sorting;

public class SearchInSortedArray {
    public int search(int[] nums, int target) {

    }
    private int findShift(int[] nums){
        int l = 0;
        int r = nums.length -1 ;
        while(l<r){
            int mid = (l+r)/2;
            if (nums[mid-1] > nums[mid]) {
                return mid;
            } else if (nums[mid-1]<nums[mid]){
                l = mid + 1;    
            } else {
                
            }
        }
    }
    
}
