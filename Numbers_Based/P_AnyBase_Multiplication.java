package Interview_basic.numbers;

import java.util.Scanner;

public class P_AnyBase_Multiplication {

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
	      max=n1>n2?n1:n2;

	      if(n1>n2) {
	  	    max=n1;
	  	    min=n2;
	  	    System.out.println( "max="+max+" \tmin="+min);
	  	}else {
	  		max=n2;
	  		min=n1;
	  		System.out.println( "max="+max+" \tmin="+min);
	  	}
	      while(min!=0) {
     	  int dig=1;
	    	  min=min%10;
	    	  
	    	  
	      }
	      
		while(max!=0 || (que!=0) ) {
		
		int d1=max%10;
		int d2=min%10;
		
		int mult=d1*d2+que;
		
	     que=mult/b;
		int rem=mult%b;
		
		 sum=sum+rem*p;
//		1212*256= 345014 of base 8
		 p=p*10;
// 	int digit_sum=sum;
	sum=0;
		
		 
		}
		min=min/10;
		System.out.println("Multiplication:"+sum);
		
		sc.close();

	}

}
