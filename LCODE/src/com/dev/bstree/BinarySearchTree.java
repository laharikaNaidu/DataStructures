package com.dev.bstree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BinarySearchTree {
	final String str1="abc";
	private Node root=null;

	
	
	public void insert(int data){
		String str;
		
		
		Node node=new Node(data);
		if(root==null){
			
			root =node;
			return;
		}
		
		Node current=root;
		Node parent=null;
		
		
		while(true){
			
			parent=current;
			if(data<current.data){
				current=current.left;
				if(current==null){
					parent.left=node;
					return;
				}
			}else{
				current=current.right;
				if(current==null){
					parent.right=node;
					return;
				}
				
			}
			
			}
		}
	
	public void find(int data){
		
	Node current=root;
		while(current!=null){
			if(current.data==data){
				System.out.println("true");
				return;
			}
			if(data<current.data){
				current=current.left;
			}else if(data>current.data){
				current=current.right;
			}
		}
		System.out.println("false");
		}
	
	public void delete(int data){
		
		Node current=root;
		Node parent=null;
		boolean isLeft=false;
		
		while(current.data!=data){
			parent=current;
			
			if(data<current.data){
				current=current.left;
				isLeft=true;
			}
			if(data>current.data){
				current=current.right;
				isLeft=false;
			}
		}
		//leaf node
		if(current.left==null && current.right==null){
			if(current== root){
				root= null;
			}
			if(isLeft==true){
				parent.left=null;
				
			}
			if(isLeft==false){
				parent.right=null;
			}
		}
		//one child
		else if(current.left==null){
			if(current==root){
				root=current.right;
			}
			if(isLeft){
			parent.left=current.right;
			}else{
				parent.right=current.right;
				
			}
		}
		else if(current.right==null){
			if(current==root){
				root=current.left;
			}
			if(isLeft){
			parent.left=current.left;
			}else{
				parent.right=current.left;
			}
			
		}
		
		else if(current.right!=null && current.left!=null){
			
			Node successor=getSuccessor(current);
			if(current==root){
				root=successor;
				
			}else if(isLeft){
				parent.left=successor;
			}else{
				parent.right=successor;
				
			}
			successor.left=current.left;
			
		}
		
		
	}
	public 	Node getSuccessor(Node deleteNode){
			Node successor=null;
			Node successorParent=null;
			Node currentNode=deleteNode.right;
			while(currentNode!=null){
				successorParent=successor;
				successor=currentNode;
				currentNode=deleteNode.left;
			}
			//successor has right node
			if(successor!=deleteNode.right){
				successorParent.left=successor.right;
				successor.right=deleteNode.right;
			}
			return successor;
			
		}
		
		int height(Node root){
			
			Node rightNode=root;
			int i=0;
			if(root!=null){
				rightNode=rightNode.right;
				i++;
				return i+height(rightNode);
			}
			return i;
			
		}
		
		public Node minValue(Node root){
			Node node;
			Node parent=null;
			Node current=root;
			
			while(current!=null){
				parent=current;
				current=current.left;
				
			}
			node=parent;
			
			return node;
		}
//		
//		public int minValueRec(Node root){
//			
//			while(root!=null){
//				if(root.left==null){
//					return root.data;
//				}
//				
//				minValueRec(root.left);
//				
//			}
//			return root.data;
//			
//		}
		
//		public void levelOrder(Node root){
//			Queue queue=new LinkedList();
//			if(root==null){return ;}
//		
//				queue.add(root);
//				int levelNodes=0;
//			
//			while(!queue.isEmpty()){
//				levelNodes=queue.size();
//				while(levelNodes>0){
//					Node node=(Node) queue.remove();
//					if(node.left!=null){
//						queue.add(root.left);
//					}
//					if(node.right!=null){
//						queue.add(root.right);
//					}
//					levelNodes--;
//				}
//				queue.add(root.left);
//				
//			}
//			
//		}
		
		public int lowestCommonAncestor(int n1,int n2,Node root){
			int i=0;
			Node leftNode =root.left
					,rightNode=root.right;;
			
			if(n1<root.data && n2<root.data){
				
				while(leftNode!=null &&n1<leftNode.data && n2< leftNode.data &&leftNode.left.data!= n1){
				
					leftNode=leftNode.left;
					
				}
				return leftNode.data;
				
			}
			if(n1>root.data && n2>root.data){
				while(leftNode!=null &&n1<leftNode.data && n2< leftNode.data){
					leftNode=leftNode.left;
					
				}
				return leftNode.data;
				
			}
			else{
				return root.data;
			}
			
		}
		
		
		
		public int rootToGivenNode(Node root,int data){
			int count=0;
			if(root.data<data){
				
				count++;
			}
			return count;
		}
		
		public void levelOrder(Node root){
			if(root==null){
				System.out.println("no element exists");
			}
			
			Queue queue=new LinkedList<>();
			queue.add(root);
			
			while(!queue.isEmpty()){
				
				Node node=(Node) queue.poll();
				System.out.print(node.data+" ");
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}
				
				
			}
			
		}
	
		

		
	
	
	public static void main(String[] args) {
	
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(10);
		tree.insert(11);
		tree.insert(9);
		tree.insert(13);
		tree.insert(16);
		tree.insert(5);
		tree.insert(7);
		tree.insert(8);
		tree.insert(2);
		
		tree.find(13);
		tree.find(2);
		tree.delete(16);
		int i=tree.height(tree.root);
		System.out.println(i);
		
		Node node1=tree.minValue(tree.root);
		System.out.println(node1.data);
		
//		int j=tree.minValueRec(tree.root);
//		System.out.println(j);
		
//		int k=tree.lowestCommonAncestor(5, 7, tree.root);
//		System.out.println(k);
//		
//		int k1=tree.lowestCommonAncestor(9, 11, tree.root);
//		System.out.println(k1);
//		
//		int k2=tree.lowestCommonAncestor(2, 16, tree.root);
//		System.out.println(k2);
		
//		tree.levelOrder(tree.root);
//		System.out.println();
	}
	
	

}
