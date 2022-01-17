package tree;

import tree.SizeofBinaryTree.Node;

public class PrintLeftViewofBinaryTree_1 {

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
		     root.right.left= new Node (90);
		     root.right.left.left= new Node (100);
		     
		    	printleft(root);
		     }
	
		 static void printleft(Node root) {
			// TODO Auto-generated method stub
			printleftp(root,1);
		}

		static int maxlevel=0;
		 static void printleftp(Node root,int i ) {
			// TODO Auto-generated method stub
			if(root==null)
				return ;
			if(maxlevel<i) {
				System.out.println(root.key);
				maxlevel=i;
			}
		
				printleftp(root.left,i+1);
				printleftp(root.right,i+1);
			
		    
		 }
		     
	}
	}
