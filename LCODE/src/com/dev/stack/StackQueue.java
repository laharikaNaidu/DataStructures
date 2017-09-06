package com.dev.stack;
import java.util.Stack;;

public class StackQueue {
	static Stack<Integer> stack1=new Stack<Integer>();
	static Stack<Integer> stack2=new Stack<Integer>();
	
	public void add(int data){
		
	stack1.push(data);
	
	
	}
	
	public int  dequeue(){
		if(stack2.isEmpty()){
		while(!stack1.isEmpty()){
	     stack2.push(stack1.pop());
		}}
		return stack2.pop();
	
	}
	
	
	
	public static void main(String[] args) {
		
		StackQueue stack=new StackQueue();
		
		stack.add(10);
		stack.add(11);
		stack.add(12);
		
		stack.add(14);
		System.out.println(stack.dequeue());
		stack.dequeue();
		

	
		
		
		
		
	}

}
