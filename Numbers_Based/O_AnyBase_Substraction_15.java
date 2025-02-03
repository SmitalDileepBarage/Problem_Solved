package Interview_basic.numbers;

import java.util.Scanner;

public class O_AnyBase_Substraction_15 {

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
		int sum=0,sub=0;
		int max,min;
		
	if(n1>n2) {
	    max=n1;
	    min=n2;
	    System.out.println( "max="+max+" \tmin="+min);
	}else {
		max=n2;
		min=n1;
		System.out.println( "max="+max+" \tmin="+min);
	}
	
while(max!=0 || que!=0 ) {
		
		int d1=max%10;
		int d2=min%10+que;
		
		if(d1<d2) {
		  sub=d1+b-d2;
			que=1;
		}else {
		 sub=d1-(d2);
		 que=0;
		}
	    
		 sum=sum+sub*p;
		 p=p*10;
		 max=max/10;
	     min=min/10;
	  	     
		}
		System.out.println("\nSub:"+sum);
		sc.close();
	}
}
