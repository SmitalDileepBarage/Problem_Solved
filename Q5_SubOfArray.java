package Interview_basic.arrays;

import java.util.Scanner;

public class Q5_SubOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of a1:");
		
		  int n1=sc.nextInt();
		  int a1[]=new int[n1];
	      for(int i=0;i<n1;i++)
	      {
	    	 
	    	  a1[i]=sc.nextInt();
	      } 
	      
	      System.out.print("\n\nEnter Size of a2:"); 
	      int n2=sc.nextInt();
	  	  int a2[]=new int[n2];
	      for(int i=0;i<n2;i++) 
	      {    	 
	    	  a2[i]=sc.nextInt();
	      } 
	      int [] max; 
	      int[] min;
	      
	      if(a1.length>a2.length) {
	         max=a1;
	    	 min=a2;
	      }else {
	    	 max=a2;
	    	 min=a1;  
	      }
	      int [] sub=new int[max.length];
	      
	      
	      int i=max.length-1;
	      int j=min.length-1;
	      int k=sub.length-1;
	      
	      int car=0;
	      while(k>=0) {
	    	  
	    	  int d=car;
	    	  
	    	  if(i>=0 ||j>=0) {
	    		  d=d-(max[i]-min[j]);
	    		  
	    	  }
//	    	  if(j>=0) {
//	    		  d=d-a2[j];
//	    		  
//	    	  }
	    	  car=d/10;
	    	  d=d%10;
	    	  
	    	  sub[k]=d;
	    	  
	    	  i--;
	    	  j--;
	    	  k--;
	    	  
	}
	      System.out.println("\t\tSub");
	      if(car!=0 ) {
	    	  if(i==-1||j==-1) {
	    		  System.out.print(car);  
	    	  }else if(i==-1||i!=-1)
	    	  System.out.print(car+j);
	      }
	      else {
	    	  
	      }
	      for(int val:sub) {
	    	  System.out.println(val);
	      }
	      sc.close();
   }
}
