package tree;


public class PrintNodesAtKdistance {


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
		     
		     printpreorder(root);
	         System.out.println();
	         printk(root,2);
	         System.out.println();
	         printk(root,3);
	         System.out.println();
	         printk(root,4);
	         System.out.println();
	         printk(root,1);
	         System.out.println();
	         printk(root,0);

		 }
		  static void printk(Node root, int k) {
			// TODO Auto-generated method stub
			if(root==null)
				return ;
			if(k==0) {
				System.out.println(root.key);
			return ;
					}
			printk(root.left,k-1);
			printk(root.right,k-1);
		}
		static void printpreorder(Node root) {
			// TODO Auto-generated method stub
			if(root==null) {
				return ;
			}
			
			System.out.println(root.key);
			printpreorder(root.left);
			printpreorder(root.right);

			 
		}

}

}
