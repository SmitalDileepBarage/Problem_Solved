package Interview_basic.collection;

import java.util.Scanner;

public class Q3_Create_LinkedLIst {
  public static class Node{
	  
	  int data;
	  Node next;
	  
	  
	  Node(int data){
		  this.data=data;
		  this.next=null;
		  
	  }
		  
		  
  }
  
  
  public static void main(String[] args) {
	
	  
	  
	  Node head=null;
	  
	  Scanner Sc=new Scanner(System.in);
	  
	  System.out.println("Enter The total node in list:");
	  int node=Sc.nextInt();
	  
	  
//	  taking data and creating node
	  for(int i=0;i<node;i++) {
		  
		  System.out.println(i+1+" Node:");
		  int data=Sc.nextInt();
		  
//		  creating node
		  Node new_node=new Node(data);
		  
//		  either list is empty or already have some nodes
		  
		  if(head==null) {
			  
			  head=new_node;
			  
			  
		  }else {
			
//		 list has node..reach at end ..then add
//	     to reach the end
			  
			  Node temp=head;
			  
			  while(temp.next!=null)
			  {
				    temp=temp.next;
			  }
//				when you reach the end and wanted to add new node into list  
			  temp.next=new_node;
			  
		  }
		  
		  
		  
		  
	  }
	 Node temp=head;
	  while(temp!=null) {
		  System.out.print(temp.data+",");
		  
		  temp=temp.next;
	  }
	  Sc.close();
  }
  }  
	  