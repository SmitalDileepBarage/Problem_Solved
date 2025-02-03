package Interview_basic.numbers;

import java.util.Scanner;

public class I_Benjamin_Bulb_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		for(int i=1 ;i*i<=num;i++) {
			
			System.out.print(i*i+" ");
		}
sc.close();
	}

}
