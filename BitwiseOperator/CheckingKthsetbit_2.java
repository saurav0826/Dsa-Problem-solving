package BitwiseOperator;

import java.util.Scanner;

public class CheckingKthsetbit_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(((n>>(k-1))&1)!=0) {
			System.out.println("true");
		}
		else 
			System.out.println("false");	


	}

}
