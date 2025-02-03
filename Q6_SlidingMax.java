package Interview_basic.arrays;

public class Q6_SlidingMax {

	public static void main(String[] args)  {
    int [] arr= {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6}; 
    int k=4;
    for(int i=0;i<arr.length-k;i++) {
    	
    	int max=arr[i];
    	for(int j=i+1;j<i+k;j++) {
    		
    		if(max<arr[j]) {
    			
    			max=arr[j];
    		}
    	}
        System.out.print(max+" ");

    }
    
}

}
