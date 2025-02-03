package Interview_basic.arrays;

import java.util.Scanner;

public class Q3_BarChart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		
		int n=sc.nextInt();
		
          int arr[]=new int[n];
          int max=arr[0];
          for(int i=0;i<n;i++) {
        	  
        	  System.out.println(i+1+" Element:");
        	  arr[i]=sc.nextInt();
        	  
        	  if(max<arr[i]) {
        		  max=arr[i];
        	  }
        	  
        	  
          }
         
          System.out.println("\t\t\t");
         
          for(int floor=max;floor>=1;floor--) {
        	  for(int i=0;i<n;i++) {
        		  if(arr[i]>=floor) {
        			  System.out.print("*\t");
        		  }else {
        			  System.out.print("\t");
        		  }
        	  }
        	  System.out.println();
          }
          
          
          
          
          sc.close();
	}

}
