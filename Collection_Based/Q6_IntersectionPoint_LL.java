package Interview_basic.collection;

import java.util.LinkedList;

public class Q6_IntersectionPoint_LL {

	public static void main(String[] args) {

  LinkedList<Integer>one=new LinkedList<>();
 
  
  one.add(1);
  one.add(2);
  one.add(3);
  one.add(4);
  one.add(5);
  one.add(6);
  one.add(7);
  one.add(8);
  one.add(9);
  one.add(10);
  
  LinkedList<Integer>two=new LinkedList<>();
  two.add(4);
  two.add(5);
  two.add(7);
  two.add(6);
  two.add(8);
  two.add(9);
  two.add(10);
  
  
  System.out.println(one);
  System.out.println(two);

  int delta=Math.abs(one.size()-two.size());
  System.out.println("\nDifference between two linkedList:"+delta);
int intersection= 0;
  
  if(one.size()<two.size()) {
	
	  for(int i=0;i<delta;i++) {
		  intersection=one.get(i+1);
		  
	  }
  }
	  else {
	  for(int i=0;i<delta;i++) {
		  intersection=one.get(i+1);
		  
	  }
	  
  }
  
  
  
  System.out.println("\nIntersection element:"+intersection);
  
  	}

}
