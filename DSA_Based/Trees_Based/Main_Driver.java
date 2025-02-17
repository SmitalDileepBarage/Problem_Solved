package Interview_basic.dsa.trees;

public class Main_Driver {


	public static void main(String[] args) {
//		int[]nums= {1,2,3,4,5,6,7,8,9,10};
//		Binary_Search_Tree tree=new Binary_Search_Tree();
//		
//      	tree.populatedSorted(nums);
////		tree.insert(15);
//		tree.display();
//		
		
		
//		Avl_Tree tree=new Avl_Tree();
//		for(int i=0;i<1000;i++) {
//			
//			tree.insert(i);
//		}
//		
//		System.out.println(tree.height());
//		
		
		
		 int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
		    SegmentTree tree = new SegmentTree(arr);
		    tree.display();

		    System.out.println(tree.query(1, 6));
		  
	}
}
