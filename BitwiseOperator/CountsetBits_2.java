package BitwiseOperator;

import java.util.Scanner;

public class CountsetBits_2 {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 int k =0 ; 	
	while(n>0) {
		n&=(n-1);
		k++;
	}

	System.out.println(k);
}
}
