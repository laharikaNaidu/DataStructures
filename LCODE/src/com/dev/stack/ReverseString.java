package com.dev.stack;
import java.util.Stack;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="akirahal";
		String str1="";
		int length=0;
		
		Stack stack=new Stack();
	
		for(int i=0;i<str.length();i++){
			stack.push(str.charAt(i));
		}
		while(length<str.length()){
		 str1+= ""+stack.pop();
		length++;
		}
		
		System.out.println(str1);
		
	}

}
