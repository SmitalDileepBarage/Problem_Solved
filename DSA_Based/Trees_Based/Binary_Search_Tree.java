package Interview_basic.dsa.trees;

public class Binary_Search_Tree {

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
	
	public Binary_Search_Tree() {
		
	}
	
//	find the height
	
	public int height(Node node) {
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
		
		return node;
	}
	public void populate(int[]nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			this.insert(nums[i]);
		}
	}
	
	
//	what if array is in sorted manner{1,2,3,4,5,6,7}
//	then make middle element as root and divide array into right and left
//	             4
//	         2        6
//	      1    3    5    7
	
	public void populatedSorted(int[]nums) {
		populatedSorted(nums,0,nums.length);
	}
	private void populatedSorted(int[]nums,int start,int end) {
		if(start>=end) {
			return;
			
		}
		int mid=(end+start)/2;
		this.insert(nums[mid]);//this create middle as root
		populatedSorted(nums,0,mid);
		populatedSorted(nums,mid+1,end);
		
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
	
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node node) {
		if(node==null) {
			return ;
		}
		inOrder(node.left);
		System.out.println(node.getValue());
		inOrder(node.right);
	}
	
	public void preOrder() {
		inOrder(root);
	}
	private void preOrder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.println(node.getValue());
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		inOrder(root);
	}
	private void postOrder(Node node) {
		if(node==null) {
			return ;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.getValue());
	}
	
	
	
	
	
	
	
}
