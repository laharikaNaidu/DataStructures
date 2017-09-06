package com.dev.ll;


public class CompareLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		
	
		
		list1.insert(1);
		list1.insert(3);
		list1.insert(5);
		list1.insert(7);
		
	
		list2.insert(1);
		list2.insert(3);
		list2.insert(5);
		list2.insert(7);
		list2.insert(4);
		
		list1.display();
		System.out.println();
		list2.display();
		System.out.println();
//		int i= list1.compare(list1,list2);
//		System.out.println(i);
		int j=list1.CompareLists(list1.top, list2.top);
		System.out.println(j);
		
	}
	


}
