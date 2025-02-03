/*
   -	-	1
   -	2	3	2
   3	4	5	4	3
   	2	3	2
   		1
   			
 
 
 */

package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int os=n/2;
		int is=1;
		int val=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=os;j++) {
				System.out.print("\t");
			}
			int cval=val;
			
			for(int j=1;j<=is;j++) {
				System.out.print(cval+"\t");
				if(j<=is/2) {
					cval++;
				}else {
					cval--;
				}
			}
			if(i>1 && i<n) {
				System.out.print("\t");
			}
			if(i<=n/2) {
				os--;
				is+=2;
				val++;
				
			}else {
				os++;
				is-=2;
				val--;
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
		sc.close();
	}

}
