package practiceJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllNumbersDisapprearedInArray{
	public static void main(String[] args) {
		findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		
	}
	public static List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> disappeared = new ArrayList<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			disappeared.add(0);
		}
		for(int i=0; i< nums.length; i++) {
			int val = nums[i];
			System.out.println(val);
			Integer currentCount = (Integer) disappeared.get(val-1);
			disappeared.set(val-1, currentCount+1);
		}
		for(int i=0; i<disappeared.size(); i++) {
			if (disappeared.get(i) == 0) disappeared.set(i,i+1);
			else disappeared.set(i, 0);
		}
		Iterator<Integer> iter = disappeared.iterator();
		while(iter.hasNext()) {
			Integer count = iter.next();
			if (count == 0) {
				iter.remove();
			}
		}
		System.out.println(disappeared);
		return disappeared;
	}
}