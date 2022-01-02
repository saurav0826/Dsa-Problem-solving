package BitwiseOperator;

import java.util.Scanner;

public class PowersetusingBit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(s);
		int k = (int)Math.pow(2, n);
		System.out.println(k);
		for(int i =0 ; i < k ; i++) {
			for(int j =0 ; j < n ;j++) {
				if((i&(1<<j))!=0) {
				System.out.print(s.charAt(j));
				}
			}
			System.out.println(" ");
		}
	}
	
}
