package oop;

import java.util.Arrays;

public class Live {
	public static void main(String[] args) {
		System.out.println("main() is much needed..!");
		System.out.println("main is automatically invoked");
		
		String[]names= {"smital","raj","arihant"};
		
	live(names);

	}
	public static void live(String []args) {
		System.out.println();
		System.out.println("main() is not needed here..in live()!");
		System.out.println("live() is not automatically invoked");
		System.out.println();
		System.out.println("This is passed to live(String[]names) to invoke:\n"+Arrays.toString(args));

	}
}
