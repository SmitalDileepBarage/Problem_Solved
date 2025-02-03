package Interview_basic.dsa;


import java.util.Scanner;
import java.util.Stack;

public class Minimum_Stack {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int n=sc.nextInt();
   	 int []arr=new int[n];
   	 
	    System.out.println("Enter The Elements to push into Stack:");
	
	 for(int i=n-1;i>=0;i--) {
	  arr[i]=sc.nextInt();
	 }
	 
	 Stack<Integer>Mindata=new Stack<>();
	 Stack<Integer>Alldata=new Stack<>();
	 
//	  Entering the elements into stack
	 for(int i=0;i<n;i++) {
		 
		 if(i==0 || Alldata.size()==0) {
			 
			 Alldata.push(arr[i]);
			 Mindata.push(arr[i]);
		 }
		 else {
			 Alldata.push(arr[i]);
			 if(arr[i]<=Mindata.peek()) {
				 Mindata.push(arr[i]);
				 
			 }
		 }
	 }
	 System.out.println("Printing Elements from Stack and its relative small Elements:");
//	 printing elements 
	 System.out.println();
	 System.out.println("Stack Elements"+"\t"+"Min Elements");
	 while(Alldata.size()!=0) {
		 if(Alldata.peek()!=Mindata.peek()) {
			 System.out.println("\t"+Alldata.pop()+"\t\t"+ Mindata.peek());
		 }
		 else {
			 System.out.println("\t"+Alldata.pop()+"\t\t"+ Mindata.pop());
		 }
		 
	 }
	 
	
	
	}

}
