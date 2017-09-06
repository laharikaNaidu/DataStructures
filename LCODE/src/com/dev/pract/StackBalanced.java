package com.dev.pract;

import java.util.Stack;

public class StackBalanced {
	
	public static void main(String[] args) {
		
		String str="[()]{}{[()()]()}";
		if(paranthesis(str)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
	
			
	}
	
	static boolean mismatchingPair(String character1,String character2){
		
		if(character1=="("&& character2==")"){
			return true;
		}
		if(character1=="["&& character2=="]"){
			return true;
		}
		if(character1=="{"&& character2=="}"){
			return true;
		}
		return false;
		
	}
	
	static boolean paranthesis(String str){
	
	Stack<String> stack=new Stack<String>();
		
		for(int i=0;i<str.length();i++){
			if(str.substring(i,i+1).equals("[")||str.substring(i,i+1).equals("(")||str.substring(i,i+1).equals("{")){
				stack.push(str.substring(i,i+1));
				
			}else if(str.substring(i,i+1).equals(")")||str.substring(i,i+1).equals("]")||str.substring(i,i+1).equals("}")){
				
				if(stack.isEmpty()){
					return false;
				}
				//char c=stack.pop();
				else if(!mismatchingPair(stack.pop(),str.substring(i,i+1))){
					return false;
				}
			}
		}
		if(str.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
