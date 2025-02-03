/*
     #			    #
     #			    #
     #		#	    #
     #	  #	     #	    #
     #                      #	
 
 */




package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
		if(j==1 || j==n) {
			System.out.print("#\t");
		}
		else if(i>n/2 && (i==j || i+j==n+1)){
			System.out.print("#\t");
		}else {
			System.out.print("\t");
		}		
				
				
				
			}
			System.out.println("\t");
			System.out.println();
			sc.close();
		}
		

	}

}
