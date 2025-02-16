package Interview_basic.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindingArraySubSets {

	public static void main(String[] args) {
		
		int[]arr= {1,2,3};
		
		System.out.println("\nSubsets of array:\n");
		List<List<Integer>>ans=findSubSets(arr);
		
		for(List<Integer> a:ans) {
			System.out.printf(" "+a);
		}
		
		
//		List<List<Integer>>Learning=new ArrayList<>();
//		Learning.add(new ArrayList<>());
//		
//		System.out.println(Learning.size());

	}
	
	static List<List<Integer>>findSubSets(int[]arr){
		
//		create List(aka outer) which  contains other  lists of type Integer 
		List<List<Integer>>outer=new ArrayList<>();
//		size of initialized list is 0
//		Add first (empty)ArrayList into (empty) outerList(0+ArrayList=1)
		outer.add(new ArrayList<>());
		
		for(int num:arr) {
			
			int n=outer.size();//due to addition of new ArrayList it become 1;
//			initial n=1;
			for(int i=0;i<n;i++) {
//				with each iteration we are adding that ith number of element into inner list 
				List<Integer>internal=new ArrayList<>(outer.get(i));
				/*
				1. outer.get(i): Retrieves the i-th element from the outer list.
                2. new ArrayList<>(outer.get(i)): Creates a new ArrayList and initializes it with the values from outer.get(i).
                3. List<Integer> internal: Declares a list named internal that holds Integer values. 
				 */
				
				internal.add(num);
				outer.add(internal);
				
				
			}
			
			
			
			
		}
		
		
		return outer;
		
	}

}
