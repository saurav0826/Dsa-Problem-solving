package BitwiseOperator;

import java.util.Scanner;

public class OneoddOccuring {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [] a = new int [n];
	int res=0;
	for(int i = 0 ; i < n ;i++) {
		a[i]=sc.nextInt();
		res=res^a[i];
	}
	System.out.println(res);
}
}