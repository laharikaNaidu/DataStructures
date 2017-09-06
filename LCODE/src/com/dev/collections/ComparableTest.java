package com.dev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	
	
	private int id;
	
	private String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}
	public String toString(){
		return id+"  "+name;
	}
}


public class ComparableTest  {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee(1,"john");
		Employee emp1=new Employee(11,"ken");
		Employee emp2=new Employee(13,"vicky");
		Employee emp3=new Employee(14,"marie");
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
//		Iterator it=list.iterator();
//		while(it.hasNext()){
//			System.out.print(it.next());
//		}
//		System.out.println();
		Collections.sort(list);
		Iterator it1=list.iterator();
		while(it1.hasNext()){
			System.out.print(it1.next());
		}
		
	}



}
