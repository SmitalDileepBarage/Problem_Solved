package Interview_basic.arrays;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Q5_NextGreaterElementInRight {

	public static void main(String[] args)  {

		Scanner sc= new Scanner(System.in);
//		taking size of array
		System.out.println("Enter the no.of Element:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
//		entering elements in array
		for(int i=0;i<n;i++) 
		{			
			System.out.println(i+1+" Element:");
			arr[i]=sc.nextInt();
				     
  		}
		
		int [] arr2=new int[arr.length];
		Stack<Integer>st=new Stack<>();
		
		
		
		
		st.push(arr[arr.length-1]);
		arr2[arr2.length-1]=-1;
		
		for(int i=arr.length-2;i>=0;i--) {
			
		while(st.size()>=0 && arr[i]>=st.peek()) {
			st.pop();
		}
		
		
			
			if(st.size()==0) {
				arr2[i]=-1;
					
			}
			else {
				arr2[i]=st.peek();
			}
			 st.push(arr[i]);
      sc.close();

		}
	}
}
	
