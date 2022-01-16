package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal_2 {

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
		     
		    
		     
		    
		    	 printk(root);
		    	 System.out.println();
		     }
		     
		 }
		 static void printk(Node root) {
				// TODO Auto-generated method stub
			 if(root==null)
				 return;
			 
				Queue<Node> q = new LinkedList<>();
				q.add(root);
				q.add(null);
				while(q.size()>1) {
					Node cur = q.poll();
					if(cur==null) {
						System.out.println();
						q.add(null);
						continue;
						
					}
					System.out.print(cur.key+" ");
					if(cur.left!=null)
						q.add(cur.left);
					if(cur.right!=null)
						q.add(cur.right);
			}
		  
		
			 
		}

}
