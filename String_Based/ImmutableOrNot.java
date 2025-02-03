package com.java.string;

public class ImmutableOrNot {
//mutable means  changeble
	public static void main(String[] args) {
		String name1="Smital";
		String name2=name1;
		
		
	System.out.println("Before Chnage :");
	
	if(name1==name2) {
		
		System.out.println("Strings are same ");
	}
	name1="smitalbarage";
	if(name1==name2) {
		System.out.println("after change names are same");
	}else {
		System.out.println("names are not same");
	}
	}
	
}
