package com.dev.pract;

public class Polindrome {
	
	public static void main(String[] args) {
		
		String str="aacecaaa";
		
		int total=str.length()%2;
		
		System.out.println(total);
		
		String a=str.substring(str.length()-1, str.length());
		System.out.println(a);
		
		for(int i=0;i<str.length();i++){
			
			for(int j=str.length();j<=0;j--){
			
			if(str.substring(i,i+1).equals(str.substring(j-i,j))){
				
				System.out.println();
			}
			else{
				System.out.println(str.substring(i,i+1));
			}
		}
		}
	}

}
