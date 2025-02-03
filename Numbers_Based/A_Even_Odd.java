package Interview_basic.numbers;

import java.util.Scanner;

public class A_Even_Odd {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number;");
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			
			System.out.println("Number is Even.");
			
			
		}
		else {
			
			System.out.println("Number is odd");
		}
		
		sc.close();
	}
}
