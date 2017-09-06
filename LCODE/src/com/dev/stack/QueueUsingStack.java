package com.dev.stack;
import java.util.Stack;

public class QueueUsingStack {
	
	static Stack<Integer> stack1=new Stack<Integer>();
    static Stack<Integer> stack2=new Stack<Integer>();
    
    private int[] arr=new int[10];
    
    public void enqueue(int data){
    	
    	if(stack2.isEmpty()){
    		stack1.push(data);
    	}else{
    		while(!stack2.isEmpty()){
    			stack2.pop();
    		}
    		stack1.push(data);
    	}
    	 
    	
    		
    			
    }	
    	
    public int dequeue(){
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	
    	return stack2.pop();
    }

	
	public static void main(String[] args) {
		
		QueueUsingStack stack=new QueueUsingStack();
		stack.enqueue(10);
		stack.enqueue(12);
		stack.enqueue(13);
		stack.enqueue(11);
		stack.enqueue(14);
		stack.dequeue();
		stack.enqueue(16);
		stack.enqueue(17);
		stack.dequeue();
		
		
		
		
	}
}
