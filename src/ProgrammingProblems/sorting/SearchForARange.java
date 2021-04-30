package ProgrammingProblems.sorting;

import java.beans.Transient;
import java.util.Arrays;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if (nums.length==0) return res;
        res[0] = binarySearchLeft(nums, target, 0, nums.length-1);
        if (res[0]>=0) {
            res[1] = binarySearchRight(nums, target, res[0], nums.length-1);
        }    
        return res;
    }

    private int binarySearchLeft(int[] nums, int target, int l, int r) {
        int result = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if (nums[mid] == target){
                result = mid;
                r = mid-1;

            } else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        } 
        return result;
    }

    private int binarySearchRight(int[] nums, int target, int l, int r) {
        int result = -1;
        while (l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                result = mid;
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }
    public int binarySearch(int[] nums, int target, int l, int r) {
        int result = -1;
        while (l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SearchForARange searchForARange = new SearchForARange();
        int[] res = searchForARange.searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(Arrays.toString(res));
        res = searchForARange.searchRange(new int[]{5,7,7,8,8,10}, 6);
        System.out.println(Arrays.toString(res));
        res = searchForARange.searchRange(new int[]{5,7,7,8,8,10}, 0);
        System.out.println(Arrays.toString(res));
        res = searchForARange.searchRange(new int[]{1}, 6);
        System.out.println(Arrays.toString(res));
        res = searchForARange.searchRange(new int[]{1}, 1);
        System.out.println(Arrays.toString(res));

        int[] arr = new int[]{5,7,7,8,8,10};
        int bs = searchForARange.binarySearch(arr, 5, 0, arr.length-1);
        System.out.println(bs);
    }
}
