package Interview_basic.collection;

import java.util.LinkedList;

public class Q5_OddEven_Adjustment {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println("Before Adjustment:");
		System.out.println(list);
		
		LinkedList<Integer>even=new LinkedList<>() ;
		LinkedList<Integer>odd=new LinkedList<>() ;
		
		
		while(list.size()>0) {
			int num=list.getFirst();
			list.removeFirst();
			
			
			if(num%2==0) {
				even.addLast(num);
			}else {
				odd.addLast(num);
			}
			
			
			
		}
		System.out.println("\n\n After Adjustment:");
		odd.addAll(even);
		System.out.println(odd); 
	}

}
