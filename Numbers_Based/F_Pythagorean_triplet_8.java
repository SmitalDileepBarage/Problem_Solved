package Interview_basic.numbers;

import java.util.Scanner;

public class F_Pythagorean_triplet_8{

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the side of triangle:");
	System.out.println("A:");
	int a=sc.nextInt();
	System.out.println("B:");
	int b=sc.nextInt();
	System.out.println("C:");
	int c=sc.nextInt();
	
	int max =a;
	
	if(b>max) {
		max=b;
		
	}if(c>max) {
		max=c;
	}

//	we did find out max number 
//later we need to find out pythagorus therom
	
	if(max==a) {
		boolean flag=((a*a)==(b*b+c*c));
		System.out.println("Pythagorean Triplet :"+flag);
	}
	if(max==b) {
		boolean flag=((b*b)==(a*a+c*c));
		System.out.println("Pythagorean Triplet :"+flag);
	}
	if(max==c) {
		boolean flag=((c*c)==(b*b+a*a));
		System.out.println("Pythagorean Triplet :"+flag);
	}
	sc.close();
	}
	
	
	}


