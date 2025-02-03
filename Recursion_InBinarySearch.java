package Interview_basic.arrays;

public class Recursion_InBinarySearch {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,8,9,13,15,17,19};
		int target=17;
		int start=0,end=arr.length-1;
		int ans=binarySearch(arr,target,start,end);
		System.out.printf("Index no. of %d is :%d",target,ans);
	}
	
	static int binarySearch(int []arr,int target,int start,int end) {
		
			
		while(start<=end) {
			
		int mid=start+(end-start)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		
		if(target>arr[mid])
		{
			return binarySearch(arr,target,mid+1,end);
		}
		if(target<arr[mid])
		{
			return binarySearch(arr,target,start,mid-1);
		}
	}
		
		return -1;
	}
	
	
	

}
