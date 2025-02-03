package Interview_basic.arrays;

import java.util.Arrays;

public class FindIn2DArray {
	
	public static void main(String[] args) {
		
		int [][]arr= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50},
				};
		
		
		int target=450;
		
		int []ans=findIndex(arr,target);
		
		System.out.println(Arrays.toString(ans));
		
		
	}
	
	
	


   static int [] findIndex(int [][]matrix,int target) {
	
	int r=0;
	int c=matrix.length-1;
//	its n*n array........if its n*m then c=m-1;
	
	while(r<matrix.length && c>=0) {
		
		
		if(target==matrix[r][c]) {
			return new int[] {r,c};
		}
		else if(target<matrix[r][c]) {
			
			c--;
		}
		else {
			r++;
		}
		
		
	}
	
	
	
	
	
	return new int[] {-1,-1};
}
	
	
	
	
	
	

}
