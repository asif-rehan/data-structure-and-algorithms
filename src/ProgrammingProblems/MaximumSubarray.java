package practiceJava;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
	    
	        if (nums.length == 0) return 0;
	        if (nums.length == 1) return nums[0];
	        nums[1] = nums[1] > nums[0] ? nums[1] : nums[0];
	        for (int i=2; i < nums.length; i++){
	            
	            nums[i] = Math.max(nums[i], nums[i] + nums[i-2]);
	            
	        }
	        int maxSum = Integer.MIN_VALUE;
	            for (int i=0; i<nums.length; i++){
	                maxSum = Math.max(maxSum, nums[i]);
	            }
	            return maxSum;
	        	}
	
	public static void main(String[] args) {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		System.out.println(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(maximumSubarray.maxSubArray(new int[] {-2, 1}));
		System.out.println(maximumSubarray.maxSubArray(new int[] {2, 1, 1, 2}));
	}
}
