package com.java.string;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String string = sc.nextLine();

		System.out.println("Word to drop:");
		String s1 = sc.nextLine();

		System.out.println("Did you want to add something at that place:");
		String answ = sc.next();
		String result = "";
		if (answ.equalsIgnoreCase("yes") || answ.equalsIgnoreCase("s") || answ.equalsIgnoreCase("y")) {
			
			System.out.println("Enter string that you wanted to add:");
			do{
				
				String add = sc.nextLine();
				
				if(!add.isEmpty()) {
				result = result+string.replace(s1, add);
				answ = null;
				}
				
			}while (answ!=null);
			
			System.out.println("Aftrer Add:" + result);

		} else {
			result = string.replaceAll(s1, "");
			System.out.println("Aftrer drop :" + result);
		}

	}

}
