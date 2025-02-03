/*
 * write a program to draw this pattern
 
 
1]  
     
     #
     # #
     # # #
     # # # #                          
     # # # 
     # # 
     # 
  
 * */
package Interview_basic.patterns;

public class Pattern1 {

	public static void main(String[] args) {

// for upper part		
		System.out.println("1.Single upper Side\n");
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//	for lower Part	
		System.out.println("\n\n2.Single lower Side\n");
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
// final design ..collection of both		
		System.out.println("\n\n3.Collectively...final Design");
		
for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		
		for(int i=1;i<=4;i++) {
			
			for(int j=3;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//kunal kushwaha