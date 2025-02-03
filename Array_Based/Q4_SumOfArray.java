package Interview_basic.arrays;

import java.util.Scanner;

public class Q4_SumOfArray {
public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size of a1:");
	
	  int n1=sc.nextInt();
	  int a1[]=new int[n1];
      for(int i=0;i<n1;i++)
      {
//    	  System.out.println(i+1+" Element:");
    	  a1[i]=sc.nextInt();
      } 
      
      System.out.print("\n\nEnter Size of a2:"); 
      int n2=sc.nextInt();
  	  int a2[]=new int[n2];
      for(int i=0;i<n2;i++) 
      {
//    	  System.out.println(i+1+" Element:");
    	  a2[i]=sc.nextInt();
      } 
      
      int [] sum=new int[n1>n2?n1:n2];
       
      int i=a1.length-1;
      int j=a2.length-1;
      int k=sum.length-1;
      
      int car=0;
      while(k>=0) {
    	  
    	  int d=car;
    	  
    	  if(i>=0) {
    		  d=d+a1[i];
    		  
    	  }
    	  if(j>=0) {
    		  d=d+a2[j];
    		  
    	  }
    	  car=d/10;
    	  d=d%10;
    	  
    	  sum[k]=d;
    	  
    	  i--;
    	  j--;
    	  k--;
    	  
      }
   System.out.println("Sum");
      if(car!=0 ) {
    	  if(i==-1||j==-1) {
    		  System.out.print(car);  
    	  }else if(i==-1||i!=-1)
    	  System.out.print(car+j);
      }else {
    	  System.out.print(car+i); 
      }
      for(int val:sum) {
    	  System.out.println(val);
      }
      sc.close();
}
}
