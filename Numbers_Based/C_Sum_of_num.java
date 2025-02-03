package Interview_basic.numbers;

import java.util.Scanner;

public class C_Sum_of_num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number:");
	int first=sc.nextInt();
	
	System.out.println("Enter last nummber:");
	int last=sc.nextInt();
	
	int sum=last*(last+1)/2- first*(first+1)/2+first;
	System.out.println("Sum:"+sum);
	sc.close();

}
}
