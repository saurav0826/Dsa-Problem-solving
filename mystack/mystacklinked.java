package mystack;

public class mystacklinked {
	Node head;
	int size;
mystacklinked(){
	head=null;
	size=0;
	}
public void push(int x) {
Node temp = new Node(x);
temp.next=head;
head=temp;
size++;
}
int peek () {
	return head.data;
}
int pop() {
	int res =head.data;
	head=head.next;
	size--;
	return res;
}
int size() {
	return size;
	
}
boolean isEmpty() {
	if(head==null)
		return true ;
	return false;
}

	}
