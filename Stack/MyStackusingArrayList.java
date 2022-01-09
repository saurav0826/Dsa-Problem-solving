package stack;

import java.util.ArrayList;

public class MyStackusingArrayList {

	public static void main(String[] args) {
		
		mystacklist al = new mystacklist();
		al.peek();
		al.pop();
		System.out.println(al.isEmpty());
		al.push(19);
		al.push(5319);
		al.push(355);
		al.push(5351);
		al.push(13);
		al.push(1);
		System.out.println(al.peek());
		System.out.println(al.pop());
		System.out.println(al.peek());
		System.out.println(al.isEmpty());

	}

	static class mystacklist {
		ArrayList<Integer> al = new ArrayList<>();

		void push(int x) {

			al.add(x);
		}

		int peek() {
			if (al.size() == 0) {
				System.out.println("(underflow)");
				return Integer.MIN_VALUE;

			}
			return al.get(al.size() - 1);
		}

		int pop() {
			if (al.size() == 0) {
				System.out.println("(underflow)");
				return Integer.MIN_VALUE;

			}
			int res = al.get(al.size() - 1);
			al.remove(al.size() - 1);
			return res;
		}

		int size() {
			return al.size();
		}

		boolean isEmpty() {
			return al.size() == 0;
		}

	}
}
