package Interview_basic.dsa;

import java.util.Arrays;

public class MergeSort {

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
			System.out.println("only 1 element there: \n so if block return as it is");
			return arr;
		}
				
		int mid=arr.length/2;
		System.out.println("mid:"+mid+" __ "+arr[mid]);
		
		System.out.println("In left:    arr[0]:"+arr[0]+" to "+"arr[mid]:"+arr[mid]+"\n function call for left\n");
		int []left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		System.out.println("left after:"+Arrays.toString(left));
		
		System.out.println("-------------------");
		System.out.println("right is going to call:");
		int[]right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		System.out.println("right:"+ Arrays.toString(right));
		
//		int []left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
//		int[]right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
//		
		
	   return mergeBothLeftAndRight(left,right);
					
	}
	private static int[]mergeBothLeftAndRight(int[]first,int[]second){
		
		int i=0;/* iteration for first array*/
		int j=0;/* iteration for second array*/
		int k=0;/* iteration for mix array*/
		
		int []mix=new int[first.length+second.length];
		
		
		while(i<first.length && j<second.length)/*this loop will  break when one of array reach at end */
		{
			if(first[i]<second[j]) 
			{
				mix[k]=first[i];
				i++;				
			}
			else
			{			
				mix[k]=second[j];
				j++;
			}
			k++;
			
		}
		while(j<second.length)
		{
			mix[k]=second[j];
			j++;
			k++;
		}
		while(i<first.length)
		{
			mix[k]=first[i];
			i++;
			k++;
		}
		System.out.println("Mixed is returning :"+Arrays.toString(mix));
		return mix;
	}
		
}
