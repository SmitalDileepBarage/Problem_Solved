package com.java.string;

import java.util.Scanner;

public class CountOfVowelAndConsonant {
 public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter String :");
	String name=Sc.nextLine();
	int countspace=0;
	int countVowel=0,countConso=0;
	name.toLowerCase();
	
	char ch[]=name.toCharArray();
	for(int i=0;i<name.length();i++) {
		
		
		
		
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='u'||ch[i]=='o'){
			
			countVowel++;
		}
		else {
			if(ch[i]==' ') {
				countspace++;
			}
			countConso++;
		}
		
	}
	System.out.println("Number of Vowels:"+countVowel);
	System.out.println("Number of Consonant:"+(countConso-countspace));
	
	
}
}
