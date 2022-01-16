package tree;


public class MaximumBinaryTree {

	static class Node{
		 int key ;
		 Node left;
		 Node right;
		 Node(int i ){
			 key=i;
		 }
		 public static void main(String [] args) {
			 Node root = new Node (30);
			 root.left= new Node (25);
			 root.left.left= new Node (10);
			 root.left.right= new Node (20);
		     root.right= new Node (40);
		     root.right.right= new Node (50);
		     
		    
		     
		    
		    	System.out.println(printsize(root));
		     }
		 static int printsize(Node root) {
			// TODO Auto-generated method stub
			if(root==null)
				return Integer.MIN_VALUE;
		return Math.max(root.key, Math.max(printsize(root.left), printsize(root.right)));
		 }
		     
	}
	}
