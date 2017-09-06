package com.dev.pract;

public class NextGreater {
	
	public static void main(String[] args) {
		
		int[] ar=new int[4];
		ar[0]=4;
		ar[1]=5;
		ar[2]=2;
		ar[3]=25;
		int temp,greatest,initial;
		initial=0;
			for(int i=0;i<ar.length;i++){
				
				while(ar[i+1]>ar[initial]){
					greatest=ar[i+1];
					initial++;
					System.out.println(greatest);
					System.out.println(initial);
				}
				
				
				
			}
		}
		
	}


