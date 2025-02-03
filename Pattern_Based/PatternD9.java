/*
        # 	#	#		#
         		#		#
        #	#	#	# 	#
        #		#
        #		#	#	#
        
        
        we divide the row into 5 parts...1}i==1  2]i>=n/2  3}i==n/2+1 4}i<n 5}i==n
 */



package Interview_basic.patterns;

import java.util.Scanner;

public class PatternD9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
				
		for(int i=1;i<=n;i++) {
		    for(int j=1;j<=n;j++){
				
		    	if(i==1) {
		    		if(j==n || j<=n/2+1) {
		    			System.out.print("#\t");
		    		}else 
		    		{
		    			System.out.print("\t");
		    		}
		    	}
		    	else if(i<=n/2) {
		    		if(j==n/2+1 || j==n) {
		    			System.out.print("#\t");
		    		}
		    		else {
		    			System.out.print("\t");
		    		}
		    	}
		    	else if(i==n/2+1) {
		    		System.out.print("#\t");
		    	}
		    	else if(i<n) {
		    		if(j==n/2+1 || j==1) {
		    			System.out.print("#\t");
		    		}
		    		else {
		    			System.out.print("\t");
		    		}
		    	}
		    	else {
		    		if(j>=n/2+1 || j==1) {
		    			System.out.print("#\t");
		    		}
		    		else {
		    			System.out.print("\t");
		    		}
		    		
		    	}
		    	
		    	
		    	sc.close();
			}
		    System.out.println("\t");
		    System.out.println("\t");
		}
	}

}
