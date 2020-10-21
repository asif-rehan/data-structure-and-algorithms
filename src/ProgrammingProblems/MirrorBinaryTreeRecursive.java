package practiceJava;

import java.util.ArrayList;

public class MirrorBinaryTreeRecursive {

	public static void main(String[] args) {
		MirrorBinaryTreeRecursive mirrorBinaryTreeRecursive = new MirrorBinaryTreeRecursive();

		int[] arr = new int[] {1,2,2,3,4,4,3};
		
		ArrayList arr2 = new ArrayList(); 
		for (int i : arr) {
			arr2.add(i);
		}
		Tree tree = new Tree(arr2);
		System.out.println(mirrorBinaryTreeRecursive.isSymmetric(tree.rootNode));
	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean isSymmetric;
		isSymmetric = isSymmetric(root.left, root.right);

		return isSymmetric;
	}

	public boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
		boolean isSymmetric = false;

		if (leftNode == null && rightNode == null) {
			isSymmetric = true;
		} else if (leftNode == null ^ rightNode == null) {
			isSymmetric = false;
		} else if (leftNode.val != rightNode.val) {
			isSymmetric = false;
		} else {
			isSymmetric = isSymmetric(leftNode.right, rightNode.left) && isSymmetric(leftNode.left, rightNode.right);
		}

		return isSymmetric;
	}

}
