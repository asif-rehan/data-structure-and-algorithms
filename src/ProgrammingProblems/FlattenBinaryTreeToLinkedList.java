package practiceJava;

import java.util.ArrayList;

public class FlattenBinaryTreeToLinkedList {

	public void flatten(TreeNode root) {
		if (root == null) return;
		TreeNode l = root.left;
		TreeNode r = root.right;
		flatten(l);
		flatten(r);
		root.left = null;
		root.right = l;
		while(root.right != null) root = root.right;
		root.right = r;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(4);
		arr.add(null);
		arr.add(6);

		TreeNode t1 = (new Tree(arr)).rootNode;
		FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();
		flattenBinaryTreeToLinkedList.flatten(t1);
	}
}
