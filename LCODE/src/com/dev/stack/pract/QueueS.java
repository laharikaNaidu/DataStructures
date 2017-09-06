package com.dev.stack.pract;

import java.util.Stack;

public class QueueS {
	
	static Stack<Integer> input=new Stack<Integer>();
	static Stack<Integer> output=new Stack<Integer>();
	
	public void enqueue(int data){
		input.push(data);
		
	}
	
	public int dequeue(){
		Integer temp=null;
		if(output.isEmpty()){
			while(!input.isEmpty()){
				output.push(input.pop());
				
			}
			
		}else if(!output.isEmpty()){
			temp=output.pop();
			return temp;
		}
		return output.pop();
		
		
	}
	public static void main(String[] args) {
		QueueS queue=new QueueS();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}

}
