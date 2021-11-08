package mystack;

public class stack1 {

	public static <Mystack> void main(String[] args) {
		// TODO Auto-generated method stub
		mystacklinked s1 = new mystacklinked();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.peek();
		s1.size();
		System.out.println(s1.size());
		s1.pop();
		s1.pop();
		System.out.println(s1.peek());
		System.out.println(s1.size());
		s1.pop();
		System.out.println(s1.peek());
		System.out.println(s1.size());
		s1.pop();
		System.out.println(s1.pop());
		System.out.println(s1.size());
		s1.pop();
		System.out.println(s1.pop());
		System.out.println(s1.size());
		
		
		
		
		

	}

}
