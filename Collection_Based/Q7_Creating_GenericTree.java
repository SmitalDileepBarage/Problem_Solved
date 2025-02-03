package Interview_basic.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class Q7_Creating_GenericTree {

	
	public static class Node{
		int data;
		ArrayList<Node>children=new ArrayList<>();
		
	}
	public static void leverTraversal(Node node) {
//		remove _Print_add children
		Queue<Node>q=new ArrayDeque<>() ;
		q.add(node);
		
		while(q.size()>0) {
			node=q.remove();
			System.out.print(node.data+" ");
			
		
		for(Node child:node.children) {
			q.add(child);
		}
		
		}
		
	}

	public static void display(Node node) {
		
		String str=node.data +"-->";
		
		for(Node child:node.children) {
			
			str=str+child.data+",";
			
		}
		
		System.out.println(" "+str+".");

		
	for(Node child:node.children) {
			
			display(child);
			
		}
		
		
	}
	
	public static void zigZagTraversal(Node node) {
		Stack<Node>main=new Stack<>();
		main.push(node);
		
		Stack<Node>sub=new Stack<>();
		int level=0;
		
		
		while(main.size()>0) {
		node=main.pop();
		System.out.print(node.data+" ");
			
		
		  if(level%2==0) {
			  
			  for(int i=0;i<node.children.size();i++) {
				  Node child=node.children.get(i);
				  sub.push(child);
			  }
		  }
		  else {
			  for(int i=node.children.size()-1;i>=0;i--) {
				  Node child=node.children.get(i);
				  sub.push(child);
				  
				  
		  }
			
		}
		
		
	
		if(main.size()==0) {
			main=sub;
			sub=new Stack<>();
			level++;
			System.out.println();
		}
	}
	}
	
	public static void mirrorImage(Node node) {
		
		for(Node child:node.children) {
			mirrorImage(child);
			
		}
Collections.reverse(node.children);
		
	}
	
	
	public static void lineWisetraversal(Node node) {
		Queue<Node>main=new ArrayDeque<>() ;
		Queue<Node>sub_main=new ArrayDeque<>() ;
		
		main.add(node);
		
		
		while(main.size()>0) {
			node=main.remove();
			
			System.out.print(node.data+" ");
			
			for(Node child:node.children) {
				sub_main.add(child);
			}
			if(main.size()==0) {
				main=sub_main;
				sub_main=new ArrayDeque<>();
				
				System.out.println();
				
			}
		}

	}
	public static boolean findnumber(Node node,int data) {
		
		if(node.data==data) {
			return true;
		}
		
		for(Node child:node.children) {
			boolean fic=findnumber(child,data);
			
			if(fic) {
				return true;
			}
			
		}
		
		
		
		return false;
	}
	
	public static ArrayList<Integer> pathToChild(Node node, int data) {
		
		ArrayList<Integer>ptc= new ArrayList<>();		
		
		if(node.data==data)
		{
			ArrayList<Integer>list1=new ArrayList<>();
			list1.add(node.data);
		    return list1;
		}
			
			for(Node child:node.children)
			{			
				ptc=pathToChild(child,data);
				
				if(ptc.size()>0) {
					ptc.add(node.data);
					return ptc;
				}
		}
			return ptc;
}
	public static void main(String[] args) {

		
		System.out.println("Its creation of generic tree .\nOn the basis of array that already provided....");
		
		int []arr= {10,20,50, -1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		
//		needed to find out the nodes
		 
		Stack<Node>st=new Stack<>();
		Node root=null;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==-1) {
				st.pop();
			}
			else {
				Node t=new Node();	
				t.data=arr[i];
				
				
				if(st.size()>0) {
					
					st.peek().children.add(t);
				}else {

					root=t;
										
					
				}
				st.push(t);
			}
			
			
		}
		System.out.println("\nRoot Element:"+root.data+"\n\n");
//		____________________________
		System.out.println("Parent-->Childre Duo....!\n");
		display(root);
//		____________________________
		
		System.out.println("\n\nLevel_Order_Traversal...!\n");
		leverTraversal(root);
//		____________________________
		
		System.out.println("\n\nLinewise_...!\n");
		lineWisetraversal(root);
//		____________________________
	
		System.out.println("\n\nZigZag...!\n");
		zigZagTraversal(root);
//		____________________________

		System.out.println("\n\nMirror _ Image:");
		mirrorImage(root);
//	______________________________	
		
		boolean re=findnumber(root,110);
		System.out.println("\n\n Data Present:"+re);
//		___________________
		System.out.println("\n\nPath to Child:");
		ArrayList<Integer>list= pathToChild(root,110);
		System.out.println(list);
	}

}
