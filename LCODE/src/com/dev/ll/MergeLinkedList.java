package com.dev.ll;

public class MergeLinkedList {
	
	public static void main(String[] args) {

		
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		
		list1.insert(1);
		list1.insert(3);
		list1.insert(5);
		list1.insert(6);
		
		list2.insert(2);
		list2.insert(4);
		list2.insert(7);
		
	
		
	
		
		list1.display();
		System.out.println();
		list2.display();
		System.out.println();
		
	  Node node1=list1.mergeLists(list1.top,list2.top);
      list1.display1(node1);
	
	}

}
