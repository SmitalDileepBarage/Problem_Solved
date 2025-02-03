package com.java.string;

import java.util.Scanner;

public class DropVowel {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter String :");
	String name=sc.nextLine();
	
   String name1=name.replaceAll("[aeiouAIEOU]","");
   
   System.out.println("String After Drop the Vowel:"+name1);
}
}
