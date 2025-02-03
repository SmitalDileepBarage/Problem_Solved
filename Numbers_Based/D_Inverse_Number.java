package Interview_basic.numbers;

import java.util.Scanner;

public class D_Inverse_Number {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Reversing the Numbers..........\n \nEnter Number:");
		
		int num=sc.nextInt();
		
		int o_pos=1;
		int inver=0;
		
		while(num!=0) {
			
			int o_dig =num%10;
			
			int inver_pos=o_dig;
			int inver_dig=o_pos;
			
			inver=inver+inver_dig*(int)Math.pow(10, inver_pos-1);
			
			o_pos++;
			num=num/10;
			
			
			
		}
		
		System.out.println("\nIeverse Number:\n"+inver);
		
		sc.close();
	}
	

}
