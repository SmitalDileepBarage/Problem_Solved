/* Draw the pattern 

       #
     # #
   # # #
 # # # #
   # # #
     # # 
       #
  
  */


package Interview_basic.patterns;

public class Pattern2 {
	

	public static void main(String[] args) {
		
		System.out.println("Upper Part:\n\n");
		for(int i=1;i<=4;i++) {
			
			for (int j=4;j>=1;j--) {
				
				if(j>i) {
					System.out.print(" ");	
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\nLower Part:\n");
		for(int i=1;i<=4;i++) {
			
			for (int j=1;j<=5;j++) {
				
				if(j>i) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n\nCombine");
		
for(int i=1;i<=4;i++) {
			
			for (int j=4;j>=1;j--) {
				
				if(j>i) {
					System.out.print(" ");	
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("\t");
		}
		
		
		for(int i=1;i<=3;i++) {
			
			for (int j=1;j<=4;j++) {
				
				if(j>i) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
