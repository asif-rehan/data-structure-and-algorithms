package graph_search;

import java.util.ArrayList;

/*
 * adapted from: https://tutorialedge.net/artificial-intelligence/breadth-first-search-java/
 */
public class Node {
	public int nodeId;
	public String nodeName;
	Node leftChild;
	Node rightChild;

	public Node(int nodeId, String nodeName, Node leftChild, Node rightChild) {
		this.nodeId = nodeId;
		this.nodeName = nodeName;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Node(int nodeId, String nodeName) {
		this.nodeId = nodeId;
		this.nodeName = nodeName;
		this.leftChild = null;
		this.rightChild = null;

	}

	public ArrayList<Node> getChildren() {
		ArrayList<Node> children = new ArrayList<Node>();
		children.add(this.getLeftChild());
		children.add(this.getRightChild());
		return children;
	}
	
	private Node getLeftChild() {
		// TODO Auto-generated method stub
		return this.leftChild;
	}

	private Node getRightChild() {
		// TODO Auto-generated method stub
		return this.rightChild;
	}

}
