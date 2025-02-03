/*
  1
  1             2                       
  1		2         3               
  1		2	  3         4
  1		2	  3	    4	      5
  */




package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int str=1;
		int spc=2*n-3;

		
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=i;j++) {
				
				System.out.print(val+"\t");
				val++;
			}
			for(int j=1;j<=spc;j++) {
				System.out.print("\t");
			}
			if(i==n) {
				str--;
				val--;
			}
			for(int j=1;j<=str;j++) {
				val--;
				System.out.print(val+"\t");
			}
			spc-=2;
			str++;
			
			System.out.println();
			sc.close();
		}
	
		
	}

}
