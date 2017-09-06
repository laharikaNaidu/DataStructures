package com.dev.pract;

import java.util.Stack;

public class StackR {
	
	public static void main(String[] args) {
		
		String str="laharika";
		
		Stack s1=new Stack();
		String s2=new String();
		
		for(int i=0;i<str.length();i++){
			s1.push(str.charAt(i));
		}
		
		for(int j=0;j<str.length();j++){
			 s2+=s1.pop();
		}
		System.out.println(s2);
		//Character.isAlphabetic(arg0)
		
	}

}
