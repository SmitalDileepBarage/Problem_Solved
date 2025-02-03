// find out the difference between largest element and smallest element
package Interview_basic.arrays;

import java.util.Scanner;

public class Q1_ArraySpan {

	public static void main(String[] args) {

		System.out.println("Enter Size of array;");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
          int arr[]=new int[n];
          
          for(int i=0;i<n;i++) {
        	  
        	  System.out.println(i+1+" Element:");
        	  arr[i]=sc.nextInt();
        	  
          }

          int max=arr[0];
          int min=arr[0];
          
          
          for(int i=0;i<n;i++) {
        	  if(max<arr[i]) {
        		  max=arr[i];
        	  }
        	  if(min>arr[i]) {
        		  min=arr[i];
        	  }
          }
          
          
        int span=max-min;
          System.out.println("Span:"+span);
sc.close();
	}

}
