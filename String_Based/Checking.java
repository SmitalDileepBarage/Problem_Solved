package com.java.string;

public class Checking {

	public static void main(String[] args) {
		
		
		System.out.println("__________using new Opeartor___________");
		String one=new String("smital");
		String two=new String("smital");
		
		System.out.println("1.Comparing based on hashcode:\n");
		System.out.println("HashCode of String one :"+one.hashCode());

		System.out.println("HashCode of String two :"+two.hashCode());
		
		
		System.out.println("\n2.Comparing based on == Operator:\n");
		if(one==two) {
			
			System.out.println("they Are same");
		}
		else {
			
			System.out.println("they are not same");
			
			
		}
		
		System.out.println("\n\n__________using literals___________");
		
		
		String three="raj";
		String four="raj";
		System.out.println("1.Comparing based on hashcode:\n");
		System.out.println("HashCode of String three :"+three.hashCode());

		System.out.println("HashCode of String four :"+four.hashCode());

		System.out.println("\n2.Comparing based on == Operator:\n");
		if(three==four) {
			
			System.out.println("they Are same");
		}
		else {
			
			System.out.println("they are not same");
			
			
		}
		
		
	}
}
