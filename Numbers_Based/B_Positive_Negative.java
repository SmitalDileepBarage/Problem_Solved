package Interview_basic.numbers;

import java.util.Scanner;

public class B_Positive_Negative {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number;");
		
		int num=sc.nextInt();
		
		if(num>0) {
			
			System.out.println("Number is Positive.");
			
			
		}
		else {
			
			System.out.println("Number is Negative");
		}
		
		sc.close();
	}
}
