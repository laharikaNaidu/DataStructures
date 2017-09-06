package com.dev.pract;

import java.util.HashMap;
import java.util.Map;


public class DuplicateStrings {
	public static void main(String[] args) {
		
		String[] str={"i am harry","i am am","i i yy","u belong me me"};
		String[] string1=str[0].split(" ");
		String[] string2=str[1].split(" ");
		String[] string3=str[2].split(" ");
		String[] string4=str[3].split(" ");

		HashMap<String, Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<string1.length;i++){
        if(map.containsKey(string1[i])){
		  map.put(string1[i], map.get(string1[i])+1);
		}
		else{
			map.put(string1[i], 1);
				
			}
		}
		
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		for(int i=0;i<string2.length;i++){
        if(map1.containsKey(string2[i])){
		  map1.put(string2[i], map1.get(string2[i])+1);
		}
		else{
			map1.put(string2[i], 1);
				
			}
		}
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		for(int i=0;i<string3.length;i++){
        if(map2.containsKey(string3[i])){
		  map2.put(string3[i], map2.get(string3[i])+1);
		}
		else{
			map2.put(string3[i], 1);
				
			}
		}
		HashMap<String,Integer> map3=new HashMap<String,Integer>();
		for(int i=0;i<string4.length;i++){
        if(map3.containsKey(string4[i])){
		  map3.put(string4[i], map3.get(string4[i])+1);
		}
		else{
			map3.put(string4[i], 1);
				
			}
		}
//		System.out.println(map);
//		System.out.println(map1);
//		System.out.println(map2);
//		System.out.println(map3);
		Map<HashMap<String,Integer>,Integer> maps=new HashMap<HashMap<String,Integer>,Integer>();
		maps.put(map, 1);
		maps.put(map1, 2);
		maps.put(map2, 3);
		maps.put(map3, 4);
		System.out.println(maps);
	}

}
