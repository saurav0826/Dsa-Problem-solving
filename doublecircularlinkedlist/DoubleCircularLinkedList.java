package doubleCircularLinkedList;

public class DoubleCircularLinkedList {
	 static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.next=temp2;
    	temp2.next=head;
    	temp2.prev=temp1;
    	temp1.prev=head;
    	head.prev=temp2;
    	printlist(head);
    	
    } 
    
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
}
}
