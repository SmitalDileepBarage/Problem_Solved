/*
 
	#				#
		#		#
    		        #
		#		#
	#           	                 #
	
 
 */


package Interview_basic.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

Scanner sc=new Scanner (System.in);

System.out.println("Enter Number:");
int n=sc.nextInt();

for(int  i=1;i<=n;i++) {
	
	for(int j=1;j<=n;j++) {
		
		if((j==i)||(j==n-i+1)||(i+j==n+1)) {
			System.out.print("#\t");
			
		} 
		else {
			System.out.print("\t");
		}
		
	}System.out.println("\n");
}
sc.close();
	}

}
