/*
 
 # # # #
   # # #
     # #
       #
     # #
   # # #
 # # # #
 
 */

package Interview_basic.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("Upper Half part:n\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
				System.out.print("#");
				}
			}
			
			System.out.println();
		}

		
System.out.println("\n\nLower Half part:\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(j<=i) {
					System.out.print("#");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\nCombine:\n\n");
  
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
				System.out.print("#");
				}
			}
			System.out.println();
		}

		

		
		for(int i=2;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(j<=i) {
					System.out.print("#");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
