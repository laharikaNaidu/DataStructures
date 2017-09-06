package com.dev.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayList1 {
	int id;
	String name;
	
	public static void main(String[] args) {

		
	  Map<Integer,String> map=new HashMap<Integer,String>();
	  map.put(1, "sam");
	  map.put(2, "ken");
	  map.put(3, "john");
	  
	  Iterator keyIterator=map.keySet().iterator();
	  
	  Iterator valueIterator=map.values().iterator();
	  
	  Set<Entry<Integer,String>> set1=map.entrySet();
	  for(Entry<Integer, String> set:set1){
		  System.out.println(set.getKey()+" "+set.getValue());
	  }
	  System.out.println(map.get(1));
	
				
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayList1 other = (ArrayList1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
