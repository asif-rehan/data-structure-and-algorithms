package ProgrammingProblems.sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x,y)->Integer.compare(x[0], y[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] range: intervals){
            if (merged.isEmpty() || merged.getLast()[1] < range[0] ){
                merged.add(range);
            } else {
                merged.getLast()[1] = Math.max(range[1], merged.getLast()[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
    public static void main(String[] args) {
        int[][] intervals = new int[4][];
        intervals[0] = new int[]{1,3};
        intervals[1] = new int[]{2,6};
        intervals[2] = new int[]{8,10};
        intervals[3] = new int[]{15,18};
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] res = mergeIntervals.merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}
