package com.dev.pract;



class Node{
	public int data;
	public Node next;
	
	Node(int data){
		this.data=data;
	}
	public void displayData(){
		System.out.print(data+" ");
	}
 }

class LinkedList{
	Node first;
	
	LinkedList(){
		first=null;
	}
	
	public void insertFirst(int data){
		Node node=new Node(data);
		node.next=first;
		first=node;
	}
	public void displayLinkedList(){
		System.out.println("displaying linked list");
		Node tempDisplay=first;
		while(tempDisplay!=null){
			tempDisplay.displayData();
			tempDisplay=tempDisplay.next;
		}
		System.out.println();
	}
	
	public void reverseLinkedList(){
		
		Node previousNode=null;
		Node currentNode =first;
		Node nextNode= first;
		while(nextNode!=null){
			nextNode=nextNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		first=previousNode;
		
	}
	public void deleteNode(int data){
		
		Node previousNode1 = null;
		Node currentNode1 =first;
		Node nextNode1=first;
		while(currentNode1.data!=data && nextNode1 !=null){
			nextNode1=nextNode1.next;
			previousNode1=currentNode1;
			currentNode1=nextNode1;
			
		}
		if(currentNode1.data== data){
			previousNode1.next=currentNode1.next;
		}
		
		
		
	}
	
	public void add(int index,int data){
		int count=0;
		Node previousNode2=null;
		Node currentNode2 =first;
		Node nextNode2=first;
		while(count!=index){
			nextNode2=nextNode2.next;
			previousNode2=currentNode2;
			currentNode2=nextNode2;
			count++;
		}
		if(count==index && count >0){
			Node node1=new Node(data);
			node1.next=nextNode2;
			previousNode2.next=node1;
		}else{
			Node node2=new Node(data);
			node2.next=currentNode2;
			first=node2;
			
		}
	}
	public void add(int data){
		Node previousNode=null;
		Node currentNode=first;
		Node nextNode=first;
		while(nextNode!=null){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		if(nextNode==null){
			Node node=new Node(data);
			previousNode.next=node;
			node.next=null;
		}
		
	}
	public void addFirst(int data){
		
		Node node=new Node(data);
		node.next=first;
		first=node;
		
	}
	public void deleteFirst(){
	Node nextNode=first;
		if(nextNode!=null){
			nextNode=nextNode.next;
			first=nextNode;
		}
	}
	
	public void deleteLast(){
		
		Node previousNode=null;
		Node nextNode=first;
		Node currentNode=first;
	
	while(nextNode.next!=null){
		nextNode=nextNode.next;
		previousNode=currentNode;
		currentNode=nextNode;
	  }
	if(nextNode.next== null){
		previousNode.next=null;
	}
			
		}
	
	public void middleElement(){
		Node slow_pointer=first;
		Node fast_pointer=first;
		while(fast_pointer!=null &&fast_pointer.next!=null){
			
			slow_pointer=slow_pointer.next;
			fast_pointer=fast_pointer.next.next;
			
		}
		System.out.println("slow pointer is  "+slow_pointer.data);
	}
	
	public void detectLoop(){
		Node slow_ptr=first;
		Node fast_ptr=first;
		while(slow_ptr!=null && fast_ptr!= null && fast_ptr.next!=null){
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr == fast_ptr){
				System.out.println("loop found");
				return;
			}
			
		}
	}
	
	public void insertSorted(int data){
		
		Node previousNode=null;
		Node currentNode=first;
		Node nextNode=first;
		while(nextNode!=null && nextNode.data< data){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		Node node=new Node(data);
		previousNode.next=node;
		node.next=nextNode;
		
		
	}
	
	public void occurences(int data){
		int count=0;
		Node previousNode=null;
		Node currentNode=first;
		Node nextNode=first;
		
		while(nextNode!=null){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
			if(previousNode.data==data){
				count++;
			}
			
		}
		System.out.println("occurence of "+ data + "number of times is  "+count);
	}
		
	
	
}
	


public class LinkedListReverse {
	
	public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.insertFirst(40);
    list.insertFirst(30);
    list.insertFirst(20);
    list.insertFirst(10);
    list.displayLinkedList();
    list.insertSorted(25);
    list.displayLinkedList();
    list.insertFirst(10);
    list.occurences(10);
    list.insertSorted(41);
    list.displayLinkedList();
    
    
//    list.displayLinkedList();
//    list.reverseLinkedList();
//    list.displayLinkedList();
//    list.deleteNode(30);
//    list.displayLinkedList();
//    list.add(2, 66);
//    list.displayLinkedList();
//    list.add(3, 12);
//    list.displayLinkedList();
//    list.add(0, 100);
//    list.displayLinkedList();
//    list.add(2);
//    list.displayLinkedList();
//    list.deleteFirst();
//    list.displayLinkedList();
//    list.deleteLast();
//    list.displayLinkedList();
//    list.middleElement();
//    list.first.next.next=list.first;
//    list.detectLoop();
    
	}

}
