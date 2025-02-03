package Interview_basic.dsa;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		
		
		int []arr= {4,5,1,2,3};
		
		selectionSort(arr);
		
		System.out.println("Selection Sort:\n\n"+ Arrays.toString(arr));
		
	}
	
	static void selectionSort(int []arr) {
//		find the maximum element with each iteration of "i" and swap it with end index
//		decreases the last elements position (end index )as per i increases
		
		for(int i=0;i<arr.length;i++) {
			
			int last=arr.length-i-1;
//			i th iteration - end or last position ....0-4, 1-3, 2-2 ,3-1 ,4-0
			
			int largest= findBigElementIndex(arr,0,last);
			
			swapping( arr,largest,last);
			
			
			
			
		}
	}
	
	static void swapping(int []arr,int first ,int second) {
		
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
		
		
		
		
	}
		static int findBigElementIndex(int[]arr,int start,int last)
		{
			
			int max=start;
			
			for(int i=start;i<=last;i++)
			{
				
				if(arr[max]<arr[i]) 
				{
					
					max=i;
					
				}
						
			}
			
			return max;
			
		}
		
		
		
		
		
		
	}

