package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	TreeNode rootNode;

	public Tree(ArrayList<Integer> arr) {
		rootNode = new TreeNode();
		TreeNode root = levelOrderInsert(arr, 0, rootNode);

	}
	
	public static void main(String[] args) {
		Tree tree = new Tree(new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7)));		
	}

	public TreeNode levelOrderInsert(ArrayList<Integer> arr, int i, TreeNode treeNode) {
		System.out.println("index" + i);

		if (arr.get(i) == null) {
			treeNode.setVal(null);
			return treeNode;
		}

		treeNode.setVal(arr.get(i));
		int leftIndex = 2 * i + 1;
		int rightIndex = 2 * i + 2;

		if (leftIndex < arr.size()) {
			TreeNode left = new TreeNode();
			levelOrderInsert(arr, leftIndex, left);
			treeNode.setLeft(left);
		}
		if (rightIndex < arr.size()) {
			TreeNode right = new TreeNode();
			levelOrderInsert(arr, rightIndex, right);
			treeNode.setRight(right);
		}
		return treeNode;
	}

	public ArrayList<Integer> levelOrderTraversal(TreeNode root) {
		ArrayList<Integer> nodes = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();

			if (treeNode != null) {
				nodes.add(treeNode.val);
				if (treeNode.left != null) {
					queue.add(treeNode.left);
				}
				if (treeNode.right != null) {
					queue.add(treeNode.right);
				}
			} else {
				nodes.add(null);
			}

		}
		return nodes;
	}

	public void printLevelOrder(TreeNode root) {
		ArrayList<Integer> nodes = levelOrderTraversal(root);
		Iterator iterator2 = nodes.iterator();
		while (iterator2.hasNext()) {
			Object next = iterator2.next();
			if (next != null) {
				System.out.print(next + ",");
			} else {
				System.out.print("_");

			}

		}
	}
}
