package main;

import java.awt.Point;

public class Node {
	public float g;
	public float f;
	public float c;
	public Point position;
	public Node parent;
	
	public Node (Point position) {
		this.position = position;
		
	}
	

}
