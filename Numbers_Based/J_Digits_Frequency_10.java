package Interview_basic.numbers;

import java.util.Scanner;

public class J_Digits_Frequency_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
	long num=sc.nextInt();
	   
		 System.out.println("Number to be count:");
		int n=sc.nextInt();
		
		int count=0;
		
		while(num!=0) {
			int digit=(int)num%10;
			
			if(digit==n) {
				count++;
				
			}
			num=num/10;
		}
		System.out.println("Frequency of"+ n+" :"+count);
	
		sc.close();

	}

}
