/*
     
     
     
           #
       #   #   #
   #   #   #   #   #
       #   #   #
           #




		#	#	#		#	#	#
		#	#				#	#
		#                       #
		#	#				#	#
		#	#	#		#	#	#
		

 */
package Interview_basic.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		 System.out.println("Enter the Number:");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 
		 int space=num/2;
		 int star=1;
		 
		 for(int i=1;i<=num;i++) {
			 
			 for(int j=1;j<=space;j++) {
				 System.out.print("\t");
			 }
			 for(int j=1;j<=star;j++) {
				 System.out.print("#\t");
			 }
		if(i<=num/2) {
			space--;
			 star+=2;
		}else {
			space++;
			star-=2;
		}
			 
		 System.out.println();
		 }
		
		 
//		 for second pattern
		 System.out.println("\n\nEnter the Number(for second pattern):");
		
		 int num2=sc.nextInt();
		 
		 int str=num2/2+1;
		 int sp=1;
		 
		 for(int i=1;i<=num2;i++){
			 
			for(int j=1;j<=str;j++) {
				System.out.print("#\t");
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=str;j++) {
				System.out.print("#\t");
			}
			
			
			 if(i<=str) {
				 str--;
				 sp+=2;
				 
			 }else {
				 str++;
				 sp-=2;
			 }
			System.out.println(); 
		 }
		 
		 
		 
		 
		 
		 sc.close();

	}

}
