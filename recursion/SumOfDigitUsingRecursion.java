package recursion;

import java.util.Scanner;

public class SumOfDigitUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumofdigit(n));
	}
	static int sumofdigit(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0 ;
		}
		return n%10+sumofdigit(n/10);
		
	}
}
