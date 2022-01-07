package stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class BasicStack {

	
		public static void main (String[] args) {
			
		    ArrayDeque<Integer> stack = new ArrayDeque<>();
		    Stack<String> s = new Stack<>();
		    s.push("Saurav");
		    s.push("nagsen");
		    s.push("tushar");
		    System.out.println(s);

		    System.out.println(s.peek());
		    s.pop();
		    System.out.println(s);

		    System.out.println(s.pop());
		    System.out.println(s);
		    System.out.println();
		    stack.push(10);
		    stack.push(20);
		    stack.push(30);
		    
		    System.out.println(stack.peek());
		    System.out.println(stack.pop());
		    System.out.println(stack.peek());
		    System.out.println(stack.size());
		  
		}
		
		
	
	

}
