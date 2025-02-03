package com.java.string;

import java.util.Scanner;

public class FindASCIINumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter The aplhabet:");
	char s=sc.next().charAt(0);
	
	
	int S=s;
	
	System.out.println("Ascii of Given Character is:"+S);
}
}
