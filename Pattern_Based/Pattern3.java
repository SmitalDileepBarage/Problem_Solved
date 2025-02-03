/*
  draw  the pattern
  # # # #
  # # #
  # #
  #
  # #
  # # #
  # # # #





*/
package Interview_basic.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Upper half part:\n");

		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\nLower half part:\n");

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\nCombine:\n\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		for(int i=2;i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

