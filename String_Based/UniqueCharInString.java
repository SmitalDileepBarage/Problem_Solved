package com.java.string;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharInString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("Unique character are:");
		int i;
		HashSet<Character>unique=new HashSet<>();
		
	  for(i=0;i<str.length();i++) {
		  
		  char ch=str.charAt(i);
		
		  if(unique.contains(ch)==true) {
			 unique.remove(ch);
			 unique.remove(ch);
		  }
		  else {
			  unique.add(ch);
		  }
	  }
		
		if(unique.size()==0) {
			System.out.println("There is no unique Character");
			
		}		
		else {
			
			for(Character c:unique) {
				
					
				
				System.out.print(c +" ");
			}
		}
		
		
		
	}
	
	
	
	
	
}
