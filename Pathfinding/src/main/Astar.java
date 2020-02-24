package main;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Astar {

	public static Node[][] maze;
	
	public static void main(String[] args) {
		maze = new Node[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		
		Node start = new Node(new Point(0, 0));
		Node end = new Node(new Point(maze.length-1, maze.length-1));
		
		AstarPath(start, end);
	}
	
	public static List<Node> openSet;
	
	public static void AstarPath(Node start, Node end) {
		openSet = new ArrayList<>();
		
		openSet.add(start);
		
		Node currentNode;
		
		start.g = 0;
		start.f = H(start.position, end.position);
		
		while (openSet.size() > 0) {
			currentNode = getBestNode();
			
			
		}
	}
	
	public static Node getBestNode() {
		Node bestNode = openSet.get(0);
		
		for (Node node : openSet) {
			if (node.f < bestNode.f) 
				bestNode = node;
		}
		
		return bestNode;
	}
	
	public static float H(Point start, Point end) {
		return (float) Math.sqrt(Math.pow(end.x-start.x, 2) + Math.pow(end.y-start.y, 2));
	}
	
}
