package Interview_basic.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4_Reverse_LL_Iteratively {

	public static void main(String[] args) {
	
		
		LinkedList<Integer>list=new LinkedList<>();
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		
		
		System.out.println("1. Using normal way:");
		System.out.println(list);
		System.out.println();
		
		
		
		System.out.println("2. Using iterator:");
		Iterator<Integer> it=list.iterator();
         System.out.println();
         while(it.hasNext())
         {
	     System.out.println(it.next());
         }
         System.out.println();
         System.out.println( 
                 "3.Iterating the LinkedList using enhanced for loop : "); 
       
             for (Integer l : list) { 
                 System.out.print(l + " "); 
             } 
             
             System.out.println();
             System.out.print( 
                     "\n\n4.Iterating the LinkedList using a simple for loop : "); 
           
                 for (int i = 0; i < list.size(); i++) { 
                     System.out.print(list.get(i) + " "); 
                 } 
         
//         reversing the list
                 System.out.print( 
                         "\n\n\nR1.Reversing the list: "); 
               
                     for (int i = list.size()-1; i >= 0; i--) { 
                         System.out.print(list.get(i) + " "); 
                     } 
	}


}
