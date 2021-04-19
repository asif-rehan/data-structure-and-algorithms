package practiceJava;

public class MIrrorBinaryTreeLoop {
	public static void main(String[] args) {
		System.out.println(isSymmetric(new int[] {1,2,2,3,4,4,3}));
		int[] failCase = new int[7];
		failCase[0] = 1;
		failCase[1] = 2;
		failCase[2] = 2;
		//failCase[3] = null;
		failCase[4] = 3;
		//failCase[5] = null;
		failCase[6] = 3;
		System.out.println(isSymmetric(failCase));
	}

	public static boolean isSymmetric(int[] tree) {
		int height = (int) (1 + Math.floor(Math.log(tree.length) / Math.log(2)));
		int start = 0;
		boolean isSymmetric = true;
		
		if (tree.length == 0)
			return true;
		
		for (int h = 0; h < height; h++) {
			int end = start + (int) Math.pow(2, h)-1;
			int i = start;
			int j = end;
			
			while (i < j) {
				if (tree[i++] != tree[j--]) {
					isSymmetric = false;
				}
			}
			start = end + 1;
		}
		return isSymmetric;
	}

}
