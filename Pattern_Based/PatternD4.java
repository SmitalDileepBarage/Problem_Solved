/*
   X*1=x;
   x*10=10x;
 */
package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
	  for(int i=1;i<=10;i++) {
		  int v=n*i;
		  
		  System.out.println(n+" * "+i+" = "+v);
	  }
	  sc.close();

	}

}
