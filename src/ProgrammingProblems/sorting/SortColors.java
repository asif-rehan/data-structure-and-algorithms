package ProgrammingProblems.sorting;

import java.util.Arrays;

public class SortColors{
    public void sortColors(int[] nums, int a, int b) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while(i<=r){
            if (nums[i]<=a) {
                swap(nums, i++, l++);
            } else if (nums[i]>=b){
                swap(nums, i, r--);
            } else {
                i++;
            }
        
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums, 0, 2);
        System.out.println(Arrays.toString(nums));


        nums = new int[]{3,2,0,2,1,1,0,-1};
        sortColors.sortColors(nums, 0, 2);
        System.out.println(Arrays.toString(nums));

    }
}