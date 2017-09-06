package com.dev.pract;

import java.util.Scanner;

public class Stack2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			
		String str=sc.next();
		
		int size=str.length();
		//System.out.println(size%2);
		if(size%2 == 0){
			for(int i=0;i<=size;i++){
				for(int j=size;j<=0;j--){
				if((str.substring(i,i+1).equals(str.substring(size-1, size)))|| (str.substring(i,i+1).equals(str.substring(i+1, i+2)))){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
				
			}}
			
		}else{
			System.out.println("No");
			
		}
		
		
	}sc.close();
		
		
	}
	
	
	

}
