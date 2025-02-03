/*
			*	
			*	*	
			*	*	*	
*	*	*	*	*	*	*	
			*	*	*	
			*	*	
			*	


*/

package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD7 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		
		int sp=num/2;
		int st=1;
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=sp;j++) {
				if(i==num/2+1) {
					System.out.print("*\t");
				}else {
				System.out.print("\t");
				}
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			if(i<num/2+1) {
				st++;
				
			}else {
				st--;
			}
			System.out.println();
			sc.close();
		}
	}

}
