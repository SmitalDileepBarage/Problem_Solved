package Interview_basic.dsa;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchFindingNumberInArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,19,18,20,21,23};
		int target=18;
		int [] arr1= {1,2,3,4,5,6,19,18,18,18,20,21,23};
		List<Integer>list=new ArrayList<>();
		System.out.println("Is Target present:"+targetPresentOrNot(arr,target,0));
		System.out.println("At Index:"+findIndexOfTarget(arr,target,0));
		
		System.out.println("Search from End:"+findIndexOfTargetfromEnd(arr,target,arr.length-1));
		System.out.println("Index of all targets:"+findIndexAllOfTarget(arr1,target,0,list));
	}
	static boolean targetPresentOrNot(int []arr,int target,int index) {
		
		if(index==arr.length) {
			return false;
		}
		if(arr[index]==target) {
			return true;
		}
		return targetPresentOrNot(arr,target,index+1);
	}

static int findIndexOfTarget(int []arr,int target,int index) {
		
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return findIndexOfTarget(arr,target,index+1);
	}

static int findIndexOfTargetfromEnd(int []arr,int target,int index) {
	
	if(index==-1) {
		return -1;
	}
	if(arr[index]==target) {
		return index;
	}
	return findIndexOfTargetfromEnd(arr,target,index-1);
}

static List<Integer> findIndexAllOfTarget(int []arr1,int target,int index,List<Integer>list) {
	
	
	
	
	if(index==arr1.length) {
//		list.add(-1);
		return list;
	}
	if(arr1[index]==target) {
		list.add(index);
		
	}
	 findIndexAllOfTarget(arr1,target,index+1,list);
	 return list;
}
}
