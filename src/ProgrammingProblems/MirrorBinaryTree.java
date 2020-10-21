package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;

public class MirrorBinaryTree {

	public static void main(String[] args) {
		MirrorBinaryTree mirrorBinaryTree = new MirrorBinaryTree();
		TreeNode testCase1 = mirrorBinaryTree
				.insertNodeFromList(new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, null, 3)), 0);
		mirrorBinaryTree.isSymmetric(testCase1);

	}

	public boolean isSymmetric(TreeNode root) {
		boolean isMirror = false;
		if (root.left == null && root.right == null) {
			isMirror = true;
		}

		return isMirror;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode insertNodeFromList(ArrayList<Integer> treeArray, int index) {

		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;

		TreeNode treeNode = null;
		if (index <= treeArray.size() && treeArray.get(index) != null) {
			treeNode = new TreeNode(treeArray.get(index));
			if (leftIndex < treeArray.size()) {
				if (treeArray.get(leftIndex) != null) {
					treeNode.left = insertNodeFromList(treeArray, leftIndex);
				}
			}
			if (rightIndex < treeArray.size()) {
				if (treeArray.get(rightIndex) != null) {
					treeNode.right = insertNodeFromList(treeArray, rightIndex);
				}
			}
		}

		return treeNode;

	}
}
