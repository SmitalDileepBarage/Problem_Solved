package Interview_basic.numbers;

import java.util.Scanner;

public class L_AnyBase_to_Decimal_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		System.out.println("Enter base of number:");
		int b=sc.nextInt();
		
		int p=1;
		int sum=0;
		
		while(n!=0) {
			int rem=n%10;
			
			sum=sum+rem*p;
			p=p*b;
			
			n=n/10;
			
		}
		System.out.println("Converted Decimal Value:"+sum);
		sc.close();

	}

}
