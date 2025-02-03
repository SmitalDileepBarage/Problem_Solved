package Interview_basic.numbers;

import java.util.Scanner;

public class E_Prime_Factorisation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		
		System.out.println("Prime Factors are:");
		
		for(int div=2; div*div<=num;div++) {
			
			while(num%div==0) {
				num=num/div;
				
				System.out.print(div+" ");
				
			}
		}
  if(num!=1) {
	  
	  System.out.print(num);
  }
  sc.close();
	}

}
