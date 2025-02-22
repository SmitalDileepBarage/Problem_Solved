package oop;


//java is all about pass by value
//when object is passed.Its pass by reference

class A{
	
	int num=10;
	String name;
	
	
	
	A(){
		
	}
	
	A(String name){
		this.name=name;
	}
	
	
}
public class WrapperClass_example1 {

	public static void main(String[] args) {
		
		final A smital=new A();
		System.out.println(smital.name);
		
		smital.name="Smital Dileep Barage";
		System.out.println(smital.name);
		
//		A smital=new A(" Dileep Barage");
//	    gives u error bcz..final variable cannot be reassigned;
		
//		but variables that are not final...can be re-assigned

		
	A raj=new A("Raj Dileep Barage");
	System.out.println(raj.name);
		
	
	raj=new A ("Vaishali Dileep Barage");
	System.out.println(raj.name);
	
	
	
	raj=new A ("Dileep Barage");
	System.out.println(raj.name);
	
	
		int a=10;
		int b=20;
		
		int[]arr= {a,b};
		
		swap(arr);
		System.out.println("By pass refernce:"+arr[0]+" "+arr[1]);
//		in java ,there is no pass b reference,there is pass by value
		
		
		System.out.println("Inside the main ():Original");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		a=20;b=10;
		System.out.println("Inside the main ():a=20,b=10");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		swap(a,b);
		System.out.println("Inside the main ():After swap(20,10)");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
	}
	static void swap(int a,int b) {
		
		int temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("Inside the swap():");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
static int[] swap(int []arr) {
		
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
		return arr;

	}
}
