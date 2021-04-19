package practiceJava;

public class TargetNumber {
	public static void main(String[] args) {
		int countPaths = countPaths(new int[] {1,1,1,1,1}, 3, 0, 0);
		System.out.println(countPaths);
	}
	public static int countPaths(int[] array, int target, int start, int count) {
		if (target==0) return count++;
		else {
			int countLeft = countPaths(array, target - array[start], start+1, count);
			int countRight = countPaths(array, target + array[start], start+1, count);
			return countLeft + countRight;
			}
	}

}
