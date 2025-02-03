// addition of two numbers whose base are same


package Interview_basic.numbers;

import java.util.Scanner;

public class M_AnyBase_Addition_14 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2=sc.nextInt();
		System.out.println("Enter base of both number:");
		int b=sc.nextInt();
		int que=0;
		int p=1;
		int sum=0;
		
		int max=n1>n2?n1:n2;
		while(max!=0 || (que!=0) ) {
		
		int d1=n1%10;
		int d2=n2%10;
		
		int add=d1+d2+que;
		
	     que=add/b;
		int rem=add%b;
		
		 sum=sum+rem*p;
		 p=p*10;
		 max=max/10;
		 n1=n1/10;
		 n2=n2/10;
		 
		}
		sc.close();
		System.out.println("Sum:"+sum);
	}

}
