package stack;

public class MyStackusingArray{
	public static void main(String[] args) {
		mystack s = new mystack(5);
		s.peek();
		s.pop();
		System.out.println(s.isEmpty());
		s.push(19);
		s.push(5319);
		s.push(355);
		s.push(5351);
		s.push(13);
		s.push(1);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		
	}
}
 class mystack{
	int a[];
	int top=-1;
	int cap;
mystack(int n){
	cap=n;
	a=new int[n];
}
public void push(int x) {
	if(top==cap-1) {
		System.out.println("Stack is full(Overflow)");
		return;
		
	}
	top++;
	a[top]=x;
}
int peek () {
	if(top==-1) {
		System.out.println("(underflow)");
		return Integer.MIN_VALUE;
		
	}
	return a[top];
}
int pop() {
	if(top==-1) {
		System.out.println("(underflow)");
		return Integer.MIN_VALUE;
		
	}
	int res = a[top];
	top--;
	return res;
}
int size() {
	return top+1;
}
boolean isEmpty() {
	return top==-1;
}

	}
