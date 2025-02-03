//find prime number in range
package Interview_basic.dsa;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int num=50;
        boolean[]arr=new boolean[num+1];
        
        find(num,arr);
//        int Sieve=
//        System.out.println(Sieve+" ");
//        
 
		
	}

	static void find(int num, boolean []arr) {
		for(int i=2;i*i<num;i++) {
			if(!arr[i]) {
				for(int j=i*2;j<=num;j=j+i) {
					arr[j]=true;
				}
			}
			
		}
		
		for(int i=2;i<=num;i++) {
			if(!arr[i]) {
				System.out.printf(i+" ");
			}
		}
		
		
		
	}
}
