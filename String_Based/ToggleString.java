package com.java.string;

import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :");
		String accept=sc.nextLine();
		StringBuilder result=new StringBuilder(" ");
		for(int i=0;i<accept.length();i++) {
			
			char ch=accept.charAt(i);
			
			if(ch >='A' && ch <='Z') {
			result.append((char)(ch +32));
				
			}
			else if(ch>='a'&& ch<='z') {
				
				result.append((char)(ch-32));
			}
			else if(ch>(97+26)||ch>91||ch<65||ch<97) {
				
				result.append((char)ch);
			}
		}
		
		System.out.println("After toggling the String:"+result);
	}
	

	

}
