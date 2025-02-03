//program to find string's lengthh without using strlen()
package com.java.string;

import java.util.Scanner;

public class FindLengthOfString {
public static void main(String[] args) {
	
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter the String :");
  String words=Sc.nextLine();
  
  int count=0;
  char []ch=words.toCharArray();
  
  for(int i=0;i<ch.length;i++) {
	  
	  count=count+1;
  }
  
  System.out.println("Length of given String is:"+count);
  
}
}
