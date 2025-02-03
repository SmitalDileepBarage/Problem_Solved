package com.java.string;

import java.util.Scanner;

public class PalindromeOrNot {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the String:");
	String str1=sc.next();
	
	String rev="";
	
	for(int i=str1.length()-1;i>=0;i--) {
		
		rev=rev+str1.charAt(i);
	}
	
	if(rev.equals(str1)) {
		System.out.println("String is Palindrome...!");
	}
	else {
		System.out.println("String is Not Palindrome...!");
	}
}
}
