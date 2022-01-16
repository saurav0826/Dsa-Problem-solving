package tree;


public class HeightOfBt {
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
		     
		     printpostorder(root);
		     System.out.println();
		     System.out.println(height(root));

		 }
		  static int height(Node root) {
			// TODO Auto-generated method stub
			if(root==null)
				return 0;
			return Math.max(height(root.left), height(root.right))+1;
		}
		static void printpostorder(Node root) {
			// TODO Auto-generated method stub
			if(root==null) {
				return ;
			}
			
			printpostorder(root.left);
			printpostorder(root.right);
			System.out.println(root.key);

			 
		}

}

}

