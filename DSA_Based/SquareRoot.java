package Interview_basic.dsa;

public class SquareRoot {
public static void main(String[] args) {
	
	int n=40;
	int p=3;
	double ans=findSquareRoot(n,p);
	System.out.printf("%.3f",ans);
	
	
}

 static double  findSquareRoot(int n,int p) {
	
	int s=0;
	int e=n;
	
	double root=0.0;
	
	while (s <= e) {
		int m= s + (e - s) / 2;
			
		if(m*m==n) 
		{
								
			return m;
		}
		if(m * m > n) {
			e = m - 1;
		}else {
			s = m + 1;
			root = m;
		}
		
		
	}
	
	double incr= 0.1;
	for(int i = 1; i < p; i++) {
		
		while(root * root <= n)
		{
			root+=incr;
		}
		root-=incr;
		 incr/=10;
		
	}
	
	return root;
}
}





