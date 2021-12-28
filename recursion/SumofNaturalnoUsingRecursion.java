package recursion;

import java.util.Scanner;

public class SumofNaturalnoUsingRecursion {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sumN(n));
		
		
	}

	 static int sumN(int n) {
		if(n==0)
			return 0;
		return n+sumN(n-1);
		
	}
}
