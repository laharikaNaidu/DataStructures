package com.dev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student{
	
	 int id;
	
	 String name;
	
	 String grade;
	
	 Student(int id,String name,String grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}

class compareId implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		
		return obj1.id-obj2.id;
	}
	
}
class compareName implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.name.compareTo(arg1.name);
	}
	
}
class compareGrade implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.grade.compareTo(arg1.grade);
	}
	
}

public class ComparatorTest {
	
	public static void main(String[] args) {
		
		Student student=new Student(1,"ken","A");
		Student student1=new Student(12,"john","B");
		Student student2=new Student(111,"ben","A");
		Student student3=new Student(10,"messi","D");
		
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Collections.sort(list, new compareId());
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		Collections.sort(list, new compareName());
		Iterator it1=list.iterator();
		while(it1.hasNext()){
			System.out.print(it1.next());
		}
		System.out.println();
		Collections.sort(list, new compareGrade());
		Iterator it2=list.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next());
		}
	}

}
