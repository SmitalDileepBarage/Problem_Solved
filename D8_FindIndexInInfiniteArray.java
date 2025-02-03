//find the given target element in infinite array..
//cannot use arr.length as its infinite

package Interview_basic.arrays;

public class D8_FindIndexInInfiniteArray {

	public static void main(String[] args) {
		
    int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,31,41,51,61,71,81,91,100,211};
    
	int target=15;
	
	
	int ans=findRangeOfBox(arr,target);
	
		
		System.out.println("Target found At index :" +ans);
		
	}
	
	
	static int findRangeOfBox(int []arr,int target) {
		
		int start=0;
		int end=1;
		
		while(target>arr[end]) {
			
			int newStart=end+1;
			
			end=end+(end-start+1)*2;
			start=newStart;
			
				
			
		}
		
		return binarySearch(arr,target,start,end);
		
		
		
	}

	
	 static int binarySearch(int []arr,int target,int start,int end) {
		
		 while(start<=end) {
			 
			 int mid=start+(end-start)/2;
			 
			 if(target<arr[mid]) {
				 end=mid-1;
			 }
			 else if(target>arr[mid]) { 
				 start=mid+1;
			 }
			 else {
				return mid;
				 
			 }
		}
		 
		 	
		return -1;
		
	}
}
