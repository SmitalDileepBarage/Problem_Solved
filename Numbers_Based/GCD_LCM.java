package Interview_basic.numbers;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2=sc.nextInt();
		
		int on1=n1;
		int on2=n2;
		
		int sn1=n1;
		int sn2=n2;
		
//2 ways of finding GCD
		
//		1 st way------>
		
		while(n1%n2!=0) {
			int rem=n1%n2;
			
			n1=n2;
			n2=rem;
			
			
		}
		int cgd1=n2;
		System.out.println("------------------------------");
		System.out.println("\n1 st way:\n\nGCD:"+cgd1);
		
		int lcm=on1*on2/cgd1;
		System.out.println("LCM:"+lcm);
		
		//second way to find out GCD
		int cgd2= findCGD(sn1,sn2);
		System.out.println("------------------------------");
		
		System.out.println("\n2nd way:\n\nGCD:"+cgd2);
		sc.close();
	}
	
	
	public static int findCGD(int n1, int n2){
		if(n1==n2) {
			return n1;
		}
		else if(n1==0) {
			return n2;
		}
		else if(n2==0) {	
			return n1;
		}
	
		else if(n1>n2) {
		return findCGD(n1-n2,n2);
			
			
		}
		return findCGD(n1,n2-n1);
	
	}

}
