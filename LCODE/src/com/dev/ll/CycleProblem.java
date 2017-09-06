package com.dev.ll;

public class CycleProblem {
	public static void main(String[] args) {
		//1 -> 1 -> 3 -> 3 -> 5 -> 6 -> NULL
		
		LinkedList list=new LinkedList();
		list.insert(1);
		list.insert(1);
		list.insert(3);
		list.insert(3);
		list.insert(5);
		list.insert(6);
		list.top.next=list.top.next.next;
		
		list.display();
		
		boolean b=list.hasCycle(list.top);
		System.out.println(b);
	}

}
