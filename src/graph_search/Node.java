package graph_search;

import java.util.ArrayList;

/*
 * adapted from: https://tutorialedge.net/artificial-intelligence/breadth-first-search-java/
 */
public class Node {
	private int nodeId;
	private String nodeName;
	private Node leftChild;
	private Node rightChild;

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
	
	public void addChild(Node child){
		if (this.getLeftChild() == null) {
			this.leftChild = child;
		}else if (this.rightChild == null) {
			this.rightChild = child;
		}else {
			System.out.println("Cannot add more children to this node. Already has two children!");
		}
	}

	public ArrayList<Node> getChildren() {
		ArrayList<Node> children = new ArrayList<Node>();
		children.add(this.getLeftChild());
		children.add(this.getRightChild());
		return children;
	}
	
	public Node getLeftChild() {
		// TODO Auto-generated method stub
		return this.leftChild;
	}

	public Node getRightChild() {
		// TODO Auto-generated method stub
		return this.rightChild;
	}
	public int getNodeId(){
		return this.nodeId;
	}
	public String getNodeName(){
		return this.nodeName;
	}

}
