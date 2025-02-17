package Interview_basic.dsa.trees;

import java.util.Scanner;

public class Binary_Tree {

	public Binary_Tree() {
		
	}
	
	
	
private	static class Node
{
	
	private int value;
	private Node left;
	private Node right;
	
	
	public Node(int value) 
	{
		this.value=value;
	}
	
	
//	public Node() {
//		
//	 }
//	Node class ended here
}

// binary tree contains root node
      private Node root;

     
//      insert Nodes in binary tree
      
      public void populate(Scanner scanner) {
    	  
    	  System.out.println("Enter root Node:");
    	  int value=scanner.nextInt();
    	  
    	 root=new Node(value);
    	 
    	 populate(scanner,root);
    	 
    	  
      }

private  void populate(Scanner scanner,Node node)
{
//	 Asking for left node of root node and take it from user
	
	System.out.println("Want left node of "+node.value+" :");
	boolean left=scanner.nextBoolean();
	
	
	if(left) {
		System.out.println("left of "+node.value+":");
		int value=scanner.nextInt();
		node.left=new Node(value);
		
		populate(scanner,node.left);
	         }
	// Asking for right node of root node and take it from user		
	System.out.println("Want right node of "+node.value+" :");
	boolean right=scanner.nextBoolean();
	
	
	if(right) {
		System.out.println("right of "+node.value+":");
		int value=scanner.nextInt();
		node.right=new Node(value);
		
		populate(scanner,node.right);
	          }
			
//	Ending of insertion
}
	
//display the nodes

public  void display() {
	display(this.root ,"");
}
	

private  void display(Node node,String indent) {
	
	if(node==null) 
	{
		return;
		
	}
	System.out.println(indent+node.value);
	display(node.left, indent+"\t");
	display(node.right, indent+"\t");
	
}





	
public void prettyDisplay() {
	prettyDisplay(root,0);
}
private void prettyDisplay(Node node,int level) {
	if(node==null) {
		return ;
	}
	prettyDisplay(node.right,level+1);
	if(level!=0) {
		for(int i=0;i<level-1;i++) {
			System.out.println("|\t\t");
		}
		System.out.println("-------->"+node.value);
	}
	else {
		System.out.println(node.value);
	}
	
	prettyDisplay(node.left,level+1);
	
}










public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
  Binary_Tree tree=new Binary_Tree(); 
	tree.populate(scanner);
//	this method only gives display
//	tree.display();
	
//	this method will gives u good look
	tree.prettyDisplay();
}







	
}
	
	
	
