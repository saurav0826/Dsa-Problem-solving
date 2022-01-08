package circularLinkedList;

public class BasicCircularLinkedList {
public static void main(String[] args) {

	Node head = new Node(10);
	Node temp=new Node(20);
	Node temp2 = new Node(30);
	head.next=temp;
	temp.next=temp2;
	temp2.next=head;
	
//creating 1 Circular Linked List in Java
	Node head1 =new Node(1);
	head1.next=head;
	
}
 static class Node{
	int data;
	Node next;
	Node(int i){
		data=i;
		next=null;
	}
}
}
