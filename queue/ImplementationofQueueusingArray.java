package queue;

public class ImplementationofQueueusingArray
 { 
	public static void main(String[] args) 
	{ 
		Queue queue = new Queue(5);
		System.out.println(queue.isEmpty());
		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 
		queue.enqueue(50); 
		queue.enqueue(60);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());

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
	  int [] array ;
	  int front ;
	  int rear;
	  int size;
    public Queue(int n) {
	   array = new int [n];
	   front = 0 ;
	   size =0;
	   rear=n;
   }
    void enqueue(int i) {
    	if(size==rear) {
    		System.out.println("overflow");
    		return;
    	}
    	array[front]=i;
    	front++;
    	size ++;
    	return;
    }
    int peek() {
    	if(size==0) {
    		return -1;
    	}
    	return array[0];
    }
    boolean isFull() 
	{ 
		return (size == rear); 
	} 

	
	boolean isEmpty() 
	{ 
		return (size == 0); 
	} 
	int dequeue() 
	{ 
		if (size==0) 
			return -1; 

		int item =array[0]; 
		for(int i =0; i<size-1;i++) {
			array[i]=array[i+1];
		}
		size =size - 1;
		front--;
		return item; 
	} 
  }
 } 

