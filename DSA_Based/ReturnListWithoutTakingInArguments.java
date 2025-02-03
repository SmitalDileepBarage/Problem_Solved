package Interview_basic.dsa;

import java.util.ArrayList;
import java.util.List;

public class ReturnListWithoutTakingInArguments {

	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5,6,6,6,6,6,7,7,7,7,8,8,8,8,8};
		int target=6;
		
		System.out.println("Lets See:"+find(arr,0,target));

	}
	static List<Integer> find(int[]arr,int index,int target) {
//	creating new list every time as of function get call 
//		Firstly it checks for index=0 
		List<Integer>list=new ArrayList<>();
		
		if(index==arr.length) {
			return list;
		}
//		if you found the target in this function call just put its index in list
		if(arr[index]==target) {
			list.add(index);
		}
		
//       create another list which also stores the return of this function "List"   	
		List<Integer>ansBelow= find(arr,index+1,target);
          
           list.addAll(ansBelow);
           
           return list;

	}

}
