package practiceJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MergeTrees {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		ArrayList<Integer> values1 = bfs(t1);
		ArrayList<Integer> values2 = bfs(t2);
		ArrayList<Integer> mergedNodeValues = mergeNodeValues(values1, values2);

		TreeNode root = new TreeNode();
		root = levelOrderInsert(mergedNodeValues, 0, root);
		
		return root;

	}

	private ArrayList<Integer> bfs(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		ArrayList<Integer> nodeValues = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node != null) {
				nodeValues.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

			} else {
				nodeValues.add(null);
			}
		}

		return nodeValues;
	}

	private ArrayList<Integer> mergeNodeValues(ArrayList<Integer> values1, ArrayList<Integer> values2) {
		if (values1.size() > values2.size()) {
			ArrayList<Integer> temp = values1;
			values1 = values2;
			values1 = temp;
		}

		for (int i = 0; i < values1.size(); i++) {
			Integer v = 0;
			if (values1.get(i) != null)
				v += values1.get(i);
			if (values2.get(i) != null)
				v += values2.get(i);
			values2.set(i, v);
		}
		return values2;
	}

	
	public TreeNode levelOrderInsert(ArrayList<Integer> arr, int i, TreeNode treeNode) {
		System.out.println("level" + i);

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

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(5);
		TreeNode t1 = (new Tree(arr)).rootNode;

		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(2);
		arr2.add(1);
		arr2.add(3);
		arr2.add(null);
		arr2.add(4);
		arr2.add(null);
		arr2.add(7);
		TreeNode t2 = (new Tree(arr2)).rootNode;

		MergeTrees mergeTrees = new MergeTrees();
		mergeTrees.mergeTrees(t1, t2);
	}

}
