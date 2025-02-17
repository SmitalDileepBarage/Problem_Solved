package Interview_basic.dsa.trees;

public class Avl_Tree {
	
public class Node{
		
		private int height;
		private int value;
		private Node right;
		private Node left;
		
		
		
		public Node(int value) {
			this.value=value;
			
		}
		public int getValue() {
			return value;
		}
		
		
	}
	private Node root;
	
	public Avl_Tree() {
		
	}
	
//	find the height
	public int height() {
		return height(root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		
		return node.height;
		
		
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	
//	insertion of elements in trees
	public void insert(int value) {
		root=insert(root,value);
	}
	
	private Node insert (Node node,int value) {
		if(node==null) {
			node=new Node(value);
			return node;
		}
		
		if(value>node.value) {
			node.right=insert(node.right,value);
			
		}
		if(value<node.value) {
			node.left=insert(node.left,value);
			
		}
		node.height=Math.max(height(node.left), height(node.right))+1;
		
		return rotate(node);
	}
	
	private Node rotate(Node node) {
//		when left side is unbalanced
		if(height(node.left)-height(node.right)>1) {
			if(height(node.left.left)-height(node.left.right)>0) {
				return rightRotate(node);
			}
		}
		
		
			if(height(node.left.left)-height(node.left.right)<0) {
				node.left=leftRotate(node.left);
				return rightRotate(node);
			}
		
			
			
//			when right side is unbalanced
			if(height(node.left)-height(node.right)<-1) {
				if(height(node.right.left)-height(node.right.right)<0) {
					return leftRotate(node);
				}
			}
			
			
				if(height(node.right.left)-height(node.right.right)>0) {
					node.right=rightRotate(node.right);
					return leftRotate(node);
				}
				
				return node;
	}
	
	public Node rightRotate(Node p) {
		
		Node c=p.left;
		Node t=c.right;
		
		c.right=p;
		p.left=t;
		
		
		p.height=Math.max(height(p.left), height(p.right))+1;
		c.height=Math.max(height(c.left), height(c.right))+1;
		return c;
	}
	
	
public Node leftRotate(Node c) {
		
		Node p=c.left;
		Node t=p.right;
		
		p.left=c;
		c.right=t;
		
		
		p.height=Math.max(height(p.left), height(p.right))+1;
		c.height=Math.max(height(c.left), height(c.right))+1;  
		
		return p;
	}
	public void display() {
		display(root,"Root Node:");
	}
	private void display(Node node,String detail) {
		if(node==null) {
			return;
		}
		
		System.out.println(detail+node.value);
		
		display(node.left,"Left Child of "+node.getValue()+" is :");
		display(node.right,"Right Child of "+node.getValue()+" is :");
	}
	
public boolean balanced() {
		
		return balanced(root);
		
	}
	private boolean balanced(Node node) {
		if(node==null) {
			return true;
		}
		
		return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&&balanced(node.right);
		
	}
}
