package com.java.string;

import java.util.Scanner;

public class FindVowelAndConsonant {

	public static boolean isVowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str1=sc.next();
		int vowel=0,cont=0;
		int symbol=0;
		for(int i=0;i<str1.length();i++) {
			str1=str1.toLowerCase();
			char ch=str1.charAt(i);	
			if(isVowel(ch)==true) {
				vowel++;
			}
			else if(ch >='a' && ch<='z' && isVowel(ch) == false){
				
				cont++;
			}
			/*
			 * else if(ch >'Z' && ch<'a' && ch >'A' && isVowel(ch) == false){
			 * 
			 * symbol++; }
			 */
		}
			
			System.out.println("Number of Vowels in String "+str1+" is :"+ vowel + "\n Number of Symbol is:"+cont);
			
			System.out.println("Number of symbols in String "+str1+" is:"+(str1.length()-(vowel+cont)));
			//System.out.println(symbol);
			
		}

}
