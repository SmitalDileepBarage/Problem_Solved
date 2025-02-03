package Interview_basic.dsa;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		
		System.out.println("Array is Sorted:"+sorted(arr,0));

	}

	static boolean sorted(int [] arr,int index) {
		
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr,index+1);
		
	}
}
