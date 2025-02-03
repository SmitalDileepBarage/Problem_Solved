/*
      1
      1 	1
      1 	2	  1
      1		3	  3	    1
      1     5     10    10    1
      
      its pattern of CnK series{CnK=CnC-k}
 * */

package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD3 {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);

System.out.println("Enter Number:");
int n=sc.nextInt();

for(int i=0;i<=n;i++) {
	int icj=1;
	for(int j=0;j<=i;j++) {
		System.out.print(icj+"\t");
		
	
		int icjp1=icj*(i-j)/(j+1);
		icj=icjp1;
	
		
	}
	
	System.out.println();
}

sc.close();
	}

}
