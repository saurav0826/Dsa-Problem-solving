package BitwiseOperator;

import java.util.Scanner;

public class CheckingKthsetbit_1 {

	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n&(1<<(k-1)))!=0) {
			System.out.println("true");
		}
		else 
			System.out.println("false");	
		}
}
