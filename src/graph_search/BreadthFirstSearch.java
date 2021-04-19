/**
 * adapted from: https://tutorialedge.net/artificial-intelligence/breadth-first-search-java/
 */
package graph_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Asif Rehan
 *
 */
public class BreadthFirstSearch {
	/*
	 * traverses the subtree given the root node of the tree
	 */
	Node startNode;

	public BreadthFirstSearch(Node startNode) {
		this.startNode = startNode;
	}

	public ArrayList<Node> traverse(){
		ArrayList<Node> closed = new ArrayList<>();
		Queue<Node> open = new LinkedList<Node>();
		open.add(this.startNode);
		while (open.isEmpty() == false) {
			Node currentNode = open.poll();
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
