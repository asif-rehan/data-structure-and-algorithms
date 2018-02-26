package graph_search;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args){
		Node n0 = new Node(0, "A");
		Node n1 = new Node(1, "B");
		Node n2 = new Node(2, "C");
		Node n5 = new Node(5, "F");
		Node n6 = new Node(6, "G");
		Node n11 = new Node(11, "L");
		Node n12 = new Node(12, "M");
		n0.addChild(n1);
		n0.addChild(n2);
		n2.addChild(n5);
		n2.addChild(n6);
		n5.addChild(n11);
		n5.addChild(n12);
		System.out.println("BFS traversal");
		BreadthFirstSearch bfs = new BreadthFirstSearch(n0);
		ArrayList<Node> paths = bfs.traverse();
		for (Node node : paths) {
			System.out.println(String.valueOf(node.getNodeId()) + " " + node.getNodeName());
		}
		System.out.println("DFS traversal");
		DepthFirstSearch dfs = new DepthFirstSearch(n0);
		paths = dfs.traverse();
		for (Node node : paths) {
			System.out.println(String.valueOf(node.getNodeId()) + " " + node.getNodeName());
		}
	}
}
