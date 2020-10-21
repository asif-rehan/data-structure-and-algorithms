package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Rob3x {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3,4,5,1,3,0,1};
		//int[] arr = new int[] {3,2,3,0,3,0,1};
		ArrayList arr2 = new ArrayList(Arrays.asList(arr));
		Tree tree = new Tree(arr2);
		tree.printLevelOrder(tree.rootNode);
		Rob3x rob = new Rob3x();
		System.out.println();
		System.out.println(rob.rob(tree.rootNode));
	}

	public int rob(TreeNode root) {
		int maxWealth = robNode(root, 0);
		return maxWealth;
	}

	public int robNode(TreeNode node, int cumSum) {
		int wealth = Math.max(robNode(node, true), robNode(node, false));
		return wealth;
	}

	public int robNode(TreeNode node, boolean flag) {

		if (node == null)
			return 0;
		int cumSum;
		if (flag == true) {
			cumSum = node.val + robNode(node.left, !flag) + robNode(node.right, !flag);
		} else {
			cumSum = Math.max(robNode(node.left, true), 	//left node included 
											robNode(node.left, false))			 	//left node excluded	
								 + Math.max(robNode(node.right, true),	//right node included  
											robNode(node.right, false));				//right node excluded
		}
		
		return cumSum;
	}
}
