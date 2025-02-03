package Interview_basic.dsa;

public class PrintNumberRecursion {
public static void main(String[] args) {
	
	int num=10;
	
	System.out.println("from num To One:");
	Num_to_one(num);
	
//	System.out.println("\nfrom One To num:");
//	one_to_num(num,1);
	
	System.out.println("\n\nfrom One To num:");
	one_to_num(num);
	
	
	System.out.println("\n\n\nfrom Num-One-Num:");
	one_num_One(num);
}

static void Num_to_one(int n) {
	
	if(n==1) {
		System.out.printf(n+" ");
		return;
	}
	System.out.printf(n+" ");
	Num_to_one(n-1);
	
}


//static void one_to_num(int n,int c) {
//
//	if(c==n) {
//		System.out.println(n+" ");
//		return;
//	}
//	System.out.printf(c+" ");
//	one_to_num(n,c+1);
//	
//}


static void one_to_num(int n) {

	if(n==1) {
	System.out.printf(n+" ");
		return;
	}
	one_to_num(n-1);
	System.out.printf(n+" ");
	
	
}

static void one_num_One(int n) {
	
	if(n==1) {
		System.out.printf("{"+n+"}"+" ");
		
		return;
	}
	System.out.printf(n+" ");
	one_num_One(n-1);
	System.out.printf(n+" ");
//	Num_to_one(n-1);
//	one_to_num(n);
//     System.out.printf(n+" ");
//	Num_to_one(n+1);
//	
}
}
