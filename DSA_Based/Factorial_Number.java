package Interview_basic.dsa;

public class Factorial_Number {

	public static void main(String[] args) {
	int num=6;
	int number=12345;
	
	System.out.println("\nFactorial :"+fact(num)+"\n\n");
	System.out.println("\nSum :"+sum(num));
	System.out.println("\nDigits of "+number+":"+digit(number,0));
	
	System.out.println("\nSum of Digits :"+digit_sum(number));
	System.out.println("\nProduct of Digits :"+digit_prod(number));
	
	
	}

//1.	finding Factorial
	public static int fact(int n) {
		if(n<=1) {
		System.out.printf(n+"");
			return 1;
		}	
		
		System.out.printf(n+"*");
		 return (n*fact(n-1));
		
		 
	}
	
//2.	Finding Sum of Number
	public static int sum(int n) {
		if(n<=1) {
			System.out.printf(n+"");
			return 1;
		}	
		System.out.printf(n+"+");
		 return (n+sum(n-1));
		
		 
	}
	
//3.	Finding Number Of Digits
	public static int digit(int n ,int count) {
		if(n==1) {
//			System.out.printf(n+"");
			return count+1;
		}	
		 count=count+1;
		
		
		 return (digit(n/10,count));
		
		 
	}
//4.	Finding sum of digits in number
	public static int digit_sum(int n ) {
		if(n==0) {
//			System.out.printf(n+"");
			return 0;
		}	
		 
		
		
		 return n%10+(digit_sum(n/10));
		
		 
	}
//5.  products of digits
	public static int digit_prod(int n ) {
		if(n==1) {
//			System.out.printf(n+"");
			return 1;
		}	
		 
		
		
		 return n%10*(digit_prod(n/10));
		
		 
	}
	
//	6. Reverse the number
	
	public static void digit_Reverse(int n ) {
		if(n==0) {
//			System.out.printf(n+"");
			return ;
		}	
		 
		
		
		 
		 
	}
}
