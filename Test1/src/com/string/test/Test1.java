package com.string.test;

public class Test1 {

	public static void main(String[] args) {
	
			
			String name = "manoj deshmukh";
			int length = name.length();
			int a = 0;
			
			for(int i=0; i<length ; i++) {
				if (name.charAt(i)!=' ') {
					a++;
					
					}
				
				}
			
			System.out.println("Number Of Character is :- " + a);
			

		}


	}


