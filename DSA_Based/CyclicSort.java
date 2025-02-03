package Interview_basic.dsa;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		
		int []arr= {3,5,6,2,1,4};
	
		cyclicSort(arr);
		
		System.out.println("Cyclic Sort:\n\n"+Arrays.toString(arr));
		
	}
	
	static void cyclicSort(int[]arr) {
		
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			swap(arr,0,arr[0]-1);
//		}
//		
		
		
		
		
		
		int i = 0;
	    while (i < arr.length) {
	        int correctIndex = arr[i] - 1; // Calculate the correct index for the current number
	        if (arr[i] != arr[correctIndex]) {
//	        	System.out.println("if"+i);

	            swap(arr, i, correctIndex); // Swap the current number to its correct position
	        } else {
//	        	System.out.println("else"+i);
	            i++; // Move to the next index
	        }
	    }
	}

	static void swap(int[]arr, int first,int second) {
		
		
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
}
