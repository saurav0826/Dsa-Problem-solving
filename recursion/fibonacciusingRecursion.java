package recursion;

import java.util.Scanner;

public class fibonacciusingRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("0 1 ");
		for(int i = 2 ; i<n ; i++) {
			System.out.print(fib(i)+" ");
		}
		
		
	}

	static int  fib(int n) {
		if(n==1)
			return 1 ;
		
		if(n==0)
			return 0 ;
		
		return fib(n-1)+fib(n-2) ;
	}

}
