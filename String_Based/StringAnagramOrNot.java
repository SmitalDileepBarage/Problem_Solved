package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 1St String:");
	String str1=sc.next();
	
	System.out.println("Enter 2nd String:");
	String str2=sc.next();
	
	boolean answer=findAnagram(str1,str2);
	if(answer==true) {
		System.out.println("Given Strings are Anagram..!");}
	else {
	System.out.println("Given Strings are not Anagram..!");
	}
}

public static boolean findAnagram(String str1,String str2) {
	int count=0;
	char[]s1=str1.toCharArray();
	Arrays.sort(s1);
	
	char[]s2=str2.toCharArray();
	Arrays.sort(s2);
	
	for(int i=0;i<str2.length();i++) {
		
		if(s1[i]==s2[i]) {
			count++;
		}
		
	}
	if(count==str1.length())
	{
		return true;
	}
	return false;
}
}
