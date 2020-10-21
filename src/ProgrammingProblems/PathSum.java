package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;

public class PathSum {

	public static void main(String[] args) {

		/*int[] arr = new int[11];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = -3;
		arr[3] = 3;
		arr[4] = 2;
		//arr[5] = null;
		arr[6] = 11;
		arr[7] = 3;
		arr[8] = -2;
		//arr[9] = null;
		arr[10] = 1;*/
		int[] arr = new int[] {0,1,1};
		ArrayList arr2 = new ArrayList(Arrays.asList(arr));
		Tree tree = new Tree(arr2);
		tree.printLevelOrder(tree.rootNode);
		PathSum pathSum = new PathSum();
		System.out.println("\n" + pathSum.pathSum(tree.rootNode, 1));
	}

	public int pathSum(TreeNode root, int sum) {
		int pathSum = pathSum(root, sum, new ArrayList<Integer>());
		return pathSum;
	}

	public int pathSum(TreeNode node, int sum, ArrayList<Integer> values) {
		if (node == null) {
			return 0;
		}
		
		int v = node.val;
		ArrayList<Integer> updatedValues = new ArrayList<>();
		updatedValues.add(node.val);
		int pathFound = node.val==sum ? 1 : 0; 
		for (int i=0; i < values.size(); i++) {
			int v2 = values.get(i) + v;
			updatedValues.add(v2);
			if (v2 == sum) {
				pathFound++;
			}
			
		}
		
		int count = pathFound + pathSum(node.left, sum, updatedValues) + pathSum(node.right, sum, updatedValues);
		
		return count;
	}
}
