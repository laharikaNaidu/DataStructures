package com.dev.bstree;
import java.util.ArrayList;
import java.util.Collections;

public class PrintPathRootToNode {

	public static ArrayList path;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Node1 root = new Node1(1);
		root.left = new Node1 (2);
		root.right = new Node1 (3);
		Node1 n1 = new Node1 (4);
		root.left.left = n1;
		root.left.right = new Node1 (5);
		Node1 n2 = new Node1 (8);
		root.left.right.right = n2;
		root.left.right.left = new Node1 (7);

		PrintPathRootToNode i = new PrintPathRootToNode();
		path = new ArrayList();
		Collections.reverse(path);
		System.out.println(" Path " + path);
	}
}

class Node1{
	int data;
	Node1 left;
	Node1 right;
	public Node1 (int data){
		this.data = data;
		left = null;
		right = null;
	}
}
