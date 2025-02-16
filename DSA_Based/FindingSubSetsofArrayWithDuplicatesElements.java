//not added on github
package Interview_basic.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindingSubSetsofArrayWithDuplicatesElements {

	public static void main(String[] args) {
int[]arr= {1,2,2,3};
		
		System.out.println("\nSubsets of array:\n");
		List<List<Integer>>ans=findSubSetsofDuplicates(arr);
		
		for(List<Integer> a:ans) {
			System.out.printf(" "+a);
		}
	}

static List<List<Integer>>findSubSetsofDuplicates(int[]arr){
		

		List<List<Integer>>outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		
		int start=0;
		int end=0;
		
		for(int i=0;i<arr.length;i++) {
			start=0;
			
			if(i>0 && arr[i]==arr[i-1]) {
				start=end+1;
			}
			
			end=outer.size()-1;
			int n=outer.size();//due to addition of new ArrayList it become 1;
//			initial n=1;
			for(int j=start;j<n;j++) {
//				with each iteration we are adding that ith number of element into inner list 
				List<Integer>internal=new ArrayList<>(outer.get(j));
				/*
				1. outer.get(i): Retrieves the i-th element from the outer list.
                2. new ArrayList<>(outer.get(i)): Creates a new ArrayList and initializes it with the values from outer.get(i).
                3. List<Integer> internal: Declares a list named internal that holds Integer values. 
				 */
				
				internal.add(arr[j]);
				outer.add(internal);
				
				
			}
			
			
			
			
		}
		
		
		return outer;
		
	}

}
