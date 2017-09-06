package com.dev.queue;

public class Queue {
	
	private int size=0;
	
	private int[] arr;
	
	private int top;
	
	Queue(int qSize){
		
		arr=new int[qSize];
		top=-1;
		
	}
	
	public void enqueue(int data){
		if(top< arr.length-1)
		{
		arr[++top]=data;
		}else{
		System.out.println("stack over flow error !!!! cant insert ");}
	}
	
	public int dequeue(){
		if(size<arr.length){
		return arr[size++];}
		return -1;
	}
	
	public static void main(String[] args) {
		Queue queue=new Queue(10);
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(10);
		queue.enqueue(11); 
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		
	}

}
