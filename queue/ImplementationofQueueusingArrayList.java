package queue;

import java.util.LinkedList;

public class ImplementationofQueueusingArrayList {
	static class Node{
	int data ;
	Node next;
	Node(int i ){
		data=i;
		next=null;
	}
	}
	public static void main(String[] args) 
	{ 
		Queue queue = new Queue();
		System.out.println(queue.isEmpty());
		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 
		queue.enqueue(50); 
		queue.enqueue(60);
		System.out.println(queue.isEmpty());
		

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());

		queue.enqueue(70); 
		queue.enqueue(80);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	
	} 
  static class Queue{
	 LinkedList<Integer> al = new LinkedList<>() ;
	  Node front=null ;
	  Node rear=null;
	  int size;
    
	  void enqueue(int i) {
    		Node temp = new Node(i); 

    		
    		if (rear == null) { 
    			front = rear = temp; 
    			return; 
    		} 

    		
    		rear.next = temp; 
    		rear = temp; 
    	 
    	 
    }
   
    
	boolean isEmpty() 
	{ 
		return rear==null; 
	} 
	int dequeue() 
	{ 
		if(front==null&rear==null)
			return -1;
		int x = front.data;
		front=front.next;
		
		if (front == null) 
			rear = null; 
		return x;
		
		 
	} 
  }
 } 

