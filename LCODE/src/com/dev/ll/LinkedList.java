package com.dev.ll;

public class LinkedList {
	
	 Node top;
	//Node currentNode=top;
	
	LinkedList(){
		top=null;
	}
	
	public void insert(int data){
		Node node=new Node(data);
		Node currentNode=top;
		Node previousNode=null;
		Node nextNode=top;
		if(top==null){
			node.next=top;
			top=node;
			return;
		}
		while(nextNode!=null){
			
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		previousNode.next=node;
		node.next=nextNode;
	}
	
	public void display(){
		Node tempDisplay=top;
		while(tempDisplay!=null){
			System.out.print(tempDisplay.data+" ");
			tempDisplay=tempDisplay.next;
		}
	}
	public void display1(Node node){
		Node tempDisplay=node;
		while(tempDisplay!=null){
			System.out.print(tempDisplay.data+" ");
			tempDisplay=tempDisplay.next;
		}
	}
	public void insertFirst(int x){
		
		Node node=new Node(x);
		node.next=top;
		top=node;
		
	}
	
	public void insertNth(int x,int data){
		
		Node node=new Node(data);
		int count=0;
		Node nextNode=top;
		Node currentNode=top;
		Node previousNode=null;
		while(nextNode!=null && count!=x){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
			count++;
		}
		if(x==0){
			node.next=top;
			top=node;
			return;
		}
		previousNode.next=node;
		node.next=nextNode;
		
	}
	
	public void insertLast(int x){
		
		Node node=new Node(x);
		Node previousNode=null;
		Node currentNode=top;
		Node nextNode=top;
		while(nextNode!=null){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		
		previousNode.next=node;
		node.next=null;
	
	}
	
	
	public void reverse(){
		Node previousNode=null;
		Node currentNode=top;
		Node nextNode=top;
		while(nextNode!=null){
			nextNode=nextNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
			
			
			
		}
		top=previousNode;
		
	}
	
	public void delete(int data){
		Node previousNode=null;
		Node currentNode=top;
		Node nextNode=top;
		while(nextNode.data!=data){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
			
		}
		previousNode.next=currentNode.next;
		
		
	}
	
	public void deleteFirst(){
		Node nextNode=top;
		if(top!=null){
			nextNode=nextNode.next;
		}
		top=nextNode;
	}
	
	public Node deleteDuplicates(Node head){
		
		Node currentNode=head;
		Node nextNode=head;
		Node previousNode=null;
		
		
       while(nextNode!=null){
    	   nextNode=nextNode.next;
    	   previousNode=currentNode;
    	   currentNode=nextNode;
    	
    	   while(nextNode!=null && previousNode.data==nextNode.data){
    		  
    		  nextNode=nextNode.next;
    		   previousNode.next=nextNode;
    		  
        	   }
    	   currentNode=nextNode;

    	   
    	   
    	   }
    	   
     
		
	
		return head;
		
		
	}
	boolean hasCycle(Node head){
		
		Node slow_ptr=head;
		Node fast_ptr=head;
		while(slow_ptr!=null && fast_ptr!=null&& fast_ptr.next!=null){
			
			 slow_ptr=head.next;
			 fast_ptr=head.next.next;
			 if(slow_ptr==fast_ptr){
					return true;
				}
		}
		
		return false;
		
	}
	public void deleteLast(){
		Node previousNode=null;
		Node nextNode=top;
		Node currentNode=top;
		while(nextNode.next!=null){
			nextNode=nextNode.next;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		previousNode.next=null;
		
		
	}
	
public void deleteNth(int position){
	Node previousNode=null;
	Node currentNode=top;
	Node nextNode=top;
	int count=0;
	if(count==position){
		nextNode=nextNode.next;
		top=nextNode;
		return;
	}
	while(nextNode!=null && count!=position){
		nextNode=nextNode.next;
		previousNode=currentNode;
		currentNode=nextNode;
		count++;
	}
	if(currentNode!=null){
	previousNode.next=currentNode.next;
	}
	
}
//static public Node returnHead(){
//	Node node=top;
//	return node;
//	
//}

public  int compare(LinkedList list1,LinkedList list2){
	
	Node currentNode=list1.top;
	Node currentNode1=list2.top;
	int count=0;
	
	int listSize1=list1.size(list1);
	
	int listSize2=list2.size(list2);
	
	if(listSize1==listSize2){
		
			
			while(currentNode!=null && currentNode1!=null){
				if(currentNode.data==currentNode1.data  ){
					
		     
				currentNode=currentNode.next;
				currentNode1=currentNode1.next;
				count++; 
				}
				else if(currentNode.data!=currentNode1.data ){
					return 0;
				}
				
			}
			
			if(count==listSize1){
				return 1;
			}
			
	
		
	}return 0;
	
	
	
}
int CompareLists(Node headA, Node headB) {
    Node currentNode=headA;
	Node currentNode1=headB;

    
               while(currentNode!=null && currentNode1!=null){
				if(currentNode.data==currentNode1.data  ){
					
		        currentNode=currentNode.next;
				currentNode1=currentNode1.next;
                   
				
	        }
				else if(currentNode.data!=currentNode1.data ){
					return 0;
				}}
               if((currentNode==null&& currentNode1!=null)||(currentNode1==null&& currentNode!=null)){
	        	return 0;
	        }
				
				
				
			
			
			
			
	
		
return 1;
	
	
}
Node mergeLists(Node headA, Node headB) {
	

   Node node = null;
	
	Node currentNodeA=headA;
    Node currentNodeB=headB;
    Node previousNodeA=null;
    Node previousNodeB=null;
    
    Node nextNodeA=headA;
    Node nextNodeB=headB;
    
    while(nextNodeA!=null || nextNodeB!= null ){
   if((nextNodeA.next!=null&& nextNodeB.next!= null)){
    if(currentNodeA.data<currentNodeB.data){
    	
    	if(node==null){
    		node=new Node();
    		node.data=currentNodeA.data;
    		return node;
    	}
    	while(node.next!=null){
    		node=node.next;
    		
    	}
    	node.data=currentNodeA.data;
    	
    	//list.insert(currentNodeA.data);
    	nextNodeA=nextNodeA.next;
    	previousNodeA=currentNodeA;
    	currentNodeA=nextNodeA;
    	headA=nextNodeA;
    	
    }  if(currentNodeA.data>currentNodeB.data){
    	
    	if(node==null){
    		node=new Node();
    		node.data=currentNodeB.data;
    	}
    	while(node!=null){
    		node=node.next;
    		
    	}
    	node.data=currentNodeB.data;
    	
    	//list.insert(currentNodeB.data);
    	nextNodeB=nextNodeB.next;
    	previousNodeB=currentNodeB;
    	currentNodeB=nextNodeB;
    	headB=nextNodeB;
    	
    }
    }
   else if(nextNodeA.next==null && nextNodeB.next== null){
	   if (nextNodeA.data<nextNodeB.data) {
		   
		   	if(node==null){
	    		node=new Node();
	    		node.data=nextNodeA.data;
	    	}
	    	while(node!=null){
	    		node=node.next;
	    		
	    	}
	    	node.data=nextNodeA.data;
	    	
		   //list.insert(nextNodeA.data);
		   headA=null;
		   //list.insert(nextNodeB.data);
		   while(node!=null){
	    		node=node.next;
	    		
	    	}
	    	node.data=nextNodeB.data;
		   headB=null;
		   return node;
		   
		
	}else if(nextNodeA.data>nextNodeB.data){
		
		while(node!=null){
    		node=node.next;
    		
    	}
    	node.data=nextNodeB.data;
		//list.insert(nextNodeB.data);
	    headB=null;
	    while(node!=null){
    		node=node.next;
    		
    	}
    	node.data=nextNodeA.data;
	    //list.insert(nextNodeA.data);
		headA=null;
		   return node;
	}
	   
	   
	   
   } else if(nextNodeA.next==null && nextNodeB.next!= null){
	   
	   if (nextNodeA.data<nextNodeB.data) {
		   while(node!=null){
	    		node=node.next;
	    		
	    	}
	    	node.data=nextNodeA.data;
		   //list.insert(nextNodeA.data);
		   headA=null;
		   
		   
		
	}else if(nextNodeA.data>nextNodeB.data){
		
		//list.insert(nextNodeB.data);
		   while(node!=null){
	    		node=node.next;
	    		
	    	}
	    	node.data=nextNodeB.data;
	    nextNodeB=nextNodeB.next;
	    previousNodeB=currentNodeB;
	    currentNodeB=nextNodeB;
		
	}
	   
	   
   }
     else if(nextNodeA.next!=null && nextNodeB.next== null){
    	 
    	   if (nextNodeA.data<nextNodeB.data) {
    		   
    		   //list.insert(nextNodeA.data);
    		   while(node!=null){
   	    		node=node.next;
   	    		
   	    	}
   	    	node.data=nextNodeA.data;
    		    nextNodeA=nextNodeA.next;
    		    previousNodeA=currentNodeA;
    		    currentNodeA=nextNodeA;
    			
    		   
    		   
    		
    	}else if(nextNodeA.data>nextNodeB.data){
    		
    		  while(node!=null){
     	    		node=node.next;
     	    		
     	    	}
     	    	node.data=nextNodeB.data;
    		
    		//list.insert(nextNodeB.data);
    	    headB=null;
    		
    	}
    	 
     }
    
    }
	
	
	return node;
	
	

}

public void reversePrint(Node head){
	Node currentNode=head;
	Node previousNode=null;
	
	while(currentNode!=null){
		previousNode=currentNode;
		currentNode=currentNode.next;
	    reversePrint(currentNode);
		System.out.print(previousNode.data+" ");
		return;
	}
	
}
public int size(LinkedList list){
	
	int count=0;
	Node currentNode=list.top;
	while(currentNode.next!=null){
		currentNode=currentNode.next;
		count++;
	}
	return count;
}
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.display();
//		list.delete(13);
//		System.out.println();
//		list.display();
//		list.reverse();
//		System.out.println();
//		list.display();
//		list.insertFirst(16);
//		System.out.println();
//		list.display();
//		list.insertLast(11);
//		System.out.println();
//		list.display();
//		list.deleteFirst();
//		System.out.println();
//		list.display();
//		list.deleteLast();
//		System.out.println();
//		list.display();
//		list.insertNth(0,11);
//		System.out.println();
//		list.display();
//		list.deleteNth(0);
//		System.out.println();
//		list.display();
//		list.deleteNth(1);
//		System.out.println();
//		list.display();
		System.out.println();
		//Node node=returnHead();
		//list.reversePrint(node);
		System.out.println();
		list.display();
		
	}

}
