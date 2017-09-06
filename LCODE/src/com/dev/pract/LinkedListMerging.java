package com.dev.pract;

import java.util.List;
import java.util.LinkedList;

public class LinkedListMerging {
	public static void main(String[] args) {
	
		     List<Integer> l1=new LinkedList<Integer>();
		     List<Integer> l2=new LinkedList<Integer>();
		     
		     l1.add(11); l1.add(13); l1.add(16); l1.add(19); l1.add(22); l1.add(23);
		                         l2.add(12); l2.add(14); l2.add(19); l2.add(22); l2.add(23);
		                         
		    twoListsAreMergingOrNot(l1,l2);
	}

	private static void twoListsAreMergingOrNot(List<Integer> l1, List<Integer> l2) {
	    int sizeofList1=l1.size();
	    int sizeoflist2=l2.size();
	    for (int i=0;i<sizeofList1;i++){
	    	for(int j=0;j<sizeoflist2;j++){
	    		if(l1.get(i).equals(l2.get(j))){
	    			
	    		}
	    	}
	    }
	    
		
		
	}

}
