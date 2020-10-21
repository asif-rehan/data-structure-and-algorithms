package practiceJava;

import java.util.ArrayList;

public class DiameterBinaryTree {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(null);
		arr.add(4);
		arr.add(5);
		arr.add(null);
		arr.add(null);
		arr.add(6);
		arr.add(null);
		arr.add(null);
		arr.add(7);
		arr.add(null);
		arr.add(null);
		arr.add(null);
		arr.add(null);
		arr.add(8);

		// int[] arr = new int[]
		// {100,75,125,50,87,112,150,25,null,null,null,null,null,null,175};

		Tree tree = new Tree(arr);
		tree.printLevelOrder(tree.rootNode);
		DiameterBinaryTree dia = new DiameterBinaryTree();
		System.out.println();
		System.out.println(dia.diameterOfBinaryTree(tree.rootNode));
	}

	public int diameterOfBinaryTree(TreeNode root) {
		return diameter(root)[1];
	}

	public int[] diameter(TreeNode node) {
		int[] diameter = new int[] { 0, 0 };
		if (node == null || (node.left == null && node.right == null))
			return diameter;

		int l = 0;
		int r = 0;

		int[] diameterLeft = diameter(node.left);
		l = 1 + diameterLeft[0];

		int[] diameterRight = diameter(node.right);
		r = 1 + diameterRight[0];

		int maxDepthBelow = l < r ? r : l;
		diameter[0] = maxDepthBelow;		//maxdepth
		int maxDiameterBelow = diameterLeft[1] > diameterRight[1] ? diameterLeft[1] : diameterRight[1];
		diameter[1] = l + r > maxDiameterBelow ? l + r : maxDiameterBelow;		//max diameter

		return diameter;
	}
}
