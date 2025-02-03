package Interview_basic.numbers;

import java.util.Scanner;

public class K_Decimal_to_AnyBase_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter decimal number:");
		int n=sc.nextInt();
		System.out.println("Enter desired base:");
		int b=sc.nextInt();
		int p=1;
		int sum=0;
		
		while(n!=0) {
			int rem=n%b;
			sum=sum+rem*p;
			p=p*10;
			n=n/b;
			
		}
 System.out.println("Converted Value:"+sum);
 sc.close();
	}

}
