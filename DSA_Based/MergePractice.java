package Interview_basic.dsa;

import java.util.Arrays;

public class MergePractice {
	public static void main(String[] args) {
		int []arr= {9,7,6,3,1};
		
		 int []ans=mergeSort(arr);/* if you dont want to change the original array*/
		System.out.println(Arrays.toString(ans));
		
		
		/*if you want to make change in original array then */
//		  arr=mergeSort(arr);
//		System.out.println(Arrays.toString(arr));
	}
//*******Sorting through merging*******
	
//find the mid of array to divide it in equal manner 
//then make sure that if only 1 element is remain in array then return that single element 
//	consider above condition is base condition 
//then create 2 arrays 1.contain 0--to--mid, 2.contain mid--to--end...through recursion	


	private static int[]mergeSort(int[]arr){
		if(arr.length==1) {
			return arr;
		}
				
		int mid=arr.length/2;
		
		int []left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		System.out.println("left after:"+Arrays.toString(left));
		
		System.out.println("-------------------");
		int[]right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		System.out.println("right:"+Arrays.toString(right));
		
//		System.out.println("left:"+Arrays.toString(left));
//		System.out.println("right:"+Arrays.toString(right));
	   return mergeBothLeftAndRight(left,right);
					
	}
	
	
	
	private static int[]mergeBothLeftAndRight(int[]first,int[]second){
		while(first.length>second.length) 
		 {
			return first;
		}
		return second;
	}
	}
