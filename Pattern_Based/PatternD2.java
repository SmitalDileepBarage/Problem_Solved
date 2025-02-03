/*
      0
      1 	1
      2 	3	  5
      8		13	  21	34
      
      its pattern of fibonacci series
 * */

package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD2 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int n1=0;
		int n2=1;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++ ) {
				
				int n3=n1+n2;
				System.out.print(n1+"\t");
				n1=n2;
				n2=n3;
			
		}
		System.out.println();
		}
		sc.close();

	}

}
