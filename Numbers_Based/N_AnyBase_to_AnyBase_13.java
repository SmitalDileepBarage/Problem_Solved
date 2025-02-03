package Interview_basic.numbers;

import java.util.Scanner;

public class N_AnyBase_to_AnyBase_13 {
// any base to decimal
// decimal to any base
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("Enter a base :");
		int b1 =sc.nextInt();
		
		System.out.println("Desired base:");
		int b2=sc.nextInt();
		
	int decimal_no=anyToDecimal(n,b1);
	int toany=decimalToAny(decimal_no,b2);
	System.out.println("Converted VAlue:"+toany);
	sc.close();
	
	
	}
	
		public static int anyToDecimal(int n, int b1) {
			int p=1;
			int sum=0;
		
		
		while(n!=0) {
			int rem=n%10;
			
			sum=sum+rem*p;
			p=p*b1;
			
			n=n/10;
			
		}
		System.out.println("Converted Decimal Value:"+sum);
		return sum;
		
		
		}
		
		public static int decimalToAny(int decimal_no,int b2) {
			int p=1;
			
			int sum=0;
			
			
			while(decimal_no!=0) {
				int rem=decimal_no%b2;
				sum=sum+rem*p;
				
				p=p*10;
				decimal_no=decimal_no/b2;
			}
			
			return sum;
			
		}
		
  

}
