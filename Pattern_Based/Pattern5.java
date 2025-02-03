/*
      #
    #   #
  #   #   #
#   #   #   #            
  




				#
			#	#
		#   #	#
	#   #	#	#
#	#	#	#	#






*/
package Interview_basic.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		

		
		 for (int i=1;i<=4;i++) {
			 
			 for (int j=4;j>=i;j--) {
				 System.out.print("-");
				 			 	
				 }
			 for (int k=1;k<=i;k++) {
				 System.out.print(" #");
			 }
			 System.out.println();
		 }
		 
		 
		 
//		 for 2nd pattren
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("\n\n\nEnter rows:");
		 int row=sc.nextInt();
		 int space=row-1;
		 int hash=1;
		 
		 for(int i=1;i<=row;i++) {
			 
			 for(int j=1;j<=space;j++) {
				 System.out.print("\t");
			 }
			 for(int j=1;j<=hash;j++) {
				 System.out.print("#\t");
			 }
			space--;
			 hash++;
			 System.out.println();
		 }
		System.out.println();
		sc.close();
	}
	

}
