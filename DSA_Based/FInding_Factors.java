package Interview_basic.dsa;

import java.util.ArrayList;
import java.util.List;

public class FInding_Factors {

	public static void main(String[] args) {
		
		int num=20;
		
       findFactors1(20);
       System.out.println("\n\nUsing sqrt as parameter:");
       findFactors2(20);
       
       System.out.println("\n\nUsing list to make ascending order in factors:");
       findFactors3(20);
	}
//	time complexity is high
	static void findFactors1(int n) 
	{
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				System.out.printf(i+" ");
			}
		}
	}
	static void findFactors2(int n) 
	{
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
			
			if(n%i==0) {
				System.out.printf(i+" "+n/i+" ");
			}
		}
	}
	
	static void findFactors3(int n) 
	{
		
		List<Integer>list=new ArrayList<>();
		
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
			
			if(n%i==0) {
				System.out.printf(i+" ");
				list.add(n/i);
			}
			
			
		}
		for(int i=list.size();i>0;i--) {
			
			System.out.printf(list.get(i-1)+" ");
			
			
		}
	}
	
	

}
