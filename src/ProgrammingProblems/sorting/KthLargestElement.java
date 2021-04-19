package ProgrammingProblems.sorting;

public class KthLargestElement {
    int kSmallest;
    int[] nums;


    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        this.kSmallest = nums.length-k;
        quickSelect(0, nums.length-1);
        return nums[kSmallest];
        
        
    }

    private void quickSelect(int left, int right){
        if (left < right) {
            int p = partition(left, right);
            //if (p==kSmallest) return;
            
            if (kSmallest <= p) quickSelect(left, p);
            else {
                quickSelect(p+1, right);
            }    
        }
    }
    private int partition(int left, int right){
        if (left==right) return nums[left];
        
        int p = (left+right)/2;
        int pVal = nums[p];
        int i = left - 1;
        int j = right + 1;
        while(true){
            do {
                i++;
            } while( nums[i] < pVal);
            do {
                j--;
            } while (nums[j] > pVal);
            if(i<j){
                swap(i,j);
            } else{
                return j;
            }
        }
    }

    private void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args){
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        KthLargestElement kthLargestElement = new KthLargestElement();
        System.out.println(kthLargestElement.findKthLargest(nums, k));

        nums = new int[]{5,2,4,1,3,6,0};
        k = 4;
        kthLargestElement = new KthLargestElement();
        System.out.println(kthLargestElement.findKthLargest(nums, k));


    }
}
 