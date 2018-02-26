package graph_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {
	/*
	 * traverses the subtree given the root node of the tree
	 */
	Node startNode;

	public DepthFirstSearch(Node startNode) {
		this.startNode = startNode;
	}

	public ArrayList<Node> traverse(){
		ArrayList<Node> closed = new ArrayList<>();
		Stack<Node> open = new Stack<>();
		open.push(this.startNode);
		while (open.isEmpty() == false) {
			Node currentNode = open.pop();
			if (currentNode != null) {
				for (Node child : currentNode.getChildren()) {
					if (child != null) open.add(child);
				} 
				closed.add(currentNode);
			}
			
		}
		return closed;
	}

}
