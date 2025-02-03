/*
      1
      2		3
      4		5	  6
      7		8	  9		10
 * */






package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD1 {
public static void main(String[] args) {
	int dig=1;
	System.out.println("Enter num:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(dig+"\t");
			dig++;
		}
		System.out.println();
	}
	sc.close();
}
}
