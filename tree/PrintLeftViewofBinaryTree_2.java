package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintLeftViewofBinaryTree_2 {
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
	
		 static void printleft(Node root ) {
			// TODO Auto-generated method stub
			if(root==null)
				return ;
		
			Queue<Node> q = new ArrayDeque<>();
				
			q.add(root);
			while(q.size()!=0) {
				int c = q.size();
				for(int i = 0; i < c ; i ++) {
					Node cur = q.poll();
					if(i==0) {
						System.out.println(cur.key);
					}
					if(cur.left!=null)
						q.add(cur.left);
					if(cur.right!=null)
						q.add(cur.right);
				}
			}
			
		    
		 }
		     
	}
	}

