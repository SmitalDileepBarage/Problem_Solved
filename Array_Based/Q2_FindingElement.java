package Interview_basic.arrays;

import java.util.Scanner;

public class Q2_FindingElement {

	public static void main(String[] args) {
		System.out.println("Enter Size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
          int arr[]=new int[n];
          
          for(int i=0;i<n;i++) {
        	  
        	  System.out.println(i+1+" Element:");
        	  arr[i]=sc.nextInt();
        	  
          }
          System.out.println("Element to find:");
          int f=sc.nextInt();
          int ind=-1;
          
          for(int i=0;i<n;i++) {
        	  if(arr[i]==f) {
        		  ind=i;
        		 break;
        	  }
          }
          System.out.println("Present at index:"+ind);
          
          
  		sc.close();
	}

}
