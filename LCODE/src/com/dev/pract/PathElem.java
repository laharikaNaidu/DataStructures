package com.dev.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class SortByValue implements Comparator<Map.Entry<Integer,Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> arg0, Entry<Integer, Integer> arg1) {
		// TODO Auto-generated method stub
		return arg0.getValue().compareTo(arg1.getValue());
	}
	
}

public class PathElem {
	
	public int method1(int[] a,int n1,int n2){
		int count=1;
		//Map<>
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++){
			if(a[i]==n1){
				for(int j=i;j<a.length;j++){
					if(a[j]==n2){
						map.put(count, j-i);
						count++;
						break;
					}
				}
			}
			
		}
		Set<Entry<Integer,Integer>> set=map.entrySet();
		List<Entry<Integer,Integer>> list=new ArrayList<Entry<Integer,Integer>>(set);
		Collections.sort(list,new SortByValue());
		System.out.println(list);
		
		System.out.println(list.get(0).getValue());
		return list.get(0).getValue();
		
		
	}
	
	public static void main(String[] args) {
		
	
		int[] a = {1,2,3,1,3,2}; 
		int n1=1;
		int n2=3;
		PathElem path=new PathElem();
		path.method1(a, n1, n2);
		
	}

}
