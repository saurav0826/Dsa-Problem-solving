package mystack;

public class mystack {
	int a[];
	int top=-1;
	int cap;
mystack(int n){
	cap=n;
	a=new int[n];
}
public void push(int x) {
	top++;
	a[top]=x;
}
int peek () {
	return a[top];
}
int pop() {
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
