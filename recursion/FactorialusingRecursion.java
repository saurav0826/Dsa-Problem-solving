package recursion;

import java.util.Scanner;

public class FactorialusingRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(printfac(n));
		
		
	}

	 static int printfac(int n) {
		if(n==1)
			return 1;
		return n*printfac(n-1);
		
	}

}
