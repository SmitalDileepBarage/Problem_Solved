package Interview_basic.numbers;

import java.util.Scanner;

public class H_Rotation_Number {

	public static void main(String[] args) {

		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter The Number:");
		   int num=sc.nextInt();
		  
		   System.out.println("Rotation time:");
           int rot=sc.nextInt();
         int temp=num;
         int mult=1;
         int div=1;
         
         
         
     //  find the digits present in num
         int digit_count=0;
         while(num>0) {
        	 
        	 digit_count++;
        	 num=num/10;
        	 
         }
//   System.out.println("digits="+digit_count);
        
//   finding out no of rotations for positive & negative rotations
         if(rot>0) 
         {
           rot=rot%digit_count;
         }
        if(rot<0)
         {
	   	    rot=digit_count+rot;
	   	 }
//    finding real mult and divisor  for further
        
        for(int i=1;i<=digit_count;i++) {
        	
        	if(i<=rot) {
        		div=div*10;
        	}
        	else {
        		mult=mult*10;
        	}
        	
        	     	
        }
   int remaining= temp % div;
//   System.out.println(remaining+"___Remaining");
   int add=temp/div;
   int rotational=remaining*mult +add;
   
   System.out.println("Rotational number : "+rotational);
         
         
         
        sc.close(); 
	}

}
/*  How to solve
 * 
 * number is given
 * rotation number is given
 * need to find out digit numbers in number
 * find module''''int first=num % 10^rotational no.
 * got number ...which is at the end of numbers
 * divide the number...by 10^(total digits in number-rotational no)
 * you got number to add
 * 
 * rotational number =first
 * 

 * */
