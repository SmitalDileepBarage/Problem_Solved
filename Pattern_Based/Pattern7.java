/*
 1 st Pattern
#
 	#
 		#
 			#
 				#
 				
 				
 				
 				
 2 nd Pattern				
 				#
			#
		#
	#
#
*/

package Interview_basic.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
int num=sc.nextInt();
System.out.println("First Pattern:");
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		
		if(i==j) {
			System.out.println("#");
		}
		else {
			System.out.print("\t");
		}
		
	}
}



//for second pattern
System.out.println("\n\n\nSecond Pattern:\n\n");
for(int i=num;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		
		if(i==j) {
			System.out.println("#");
		}
		else {
			System.out.print("\t");
		}
		
	}
}
// 2 nd way
System.out.println("\n\n\nSecond Way:\n\n");
for(int i=1;i<=num;i++) {
	for(int j=1;j<=num;j++) {
		
		if(i+j== num+1) {
			System.out.print("#\t");
		}
		else {
			System.out.print("\t");
		}
		
	}
	System.out.println();
}







sc.close();
	}

}
