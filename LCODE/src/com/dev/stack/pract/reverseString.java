package com.dev.stack.pract;

import java.util.Stack;

public class reverseString {
	public static void main(String[] args) {
		String s1="akirahal";
		String s2="";
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<s1.length();i++){
			stack.push(s1.substring(i, i+1));
			
		}
		for(int i=0;i<s1.length();i++){
			s2+=stack.pop();
			
		}
		System.out.println(s2);
	}


}
