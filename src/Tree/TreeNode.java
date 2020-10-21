package practiceJava;

public class TreeNode {
	Integer val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {

	}

	public TreeNode(int val) {
		this.val = val;
	}


	public int getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}