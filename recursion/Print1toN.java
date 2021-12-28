package recursion;

import java.util.Scanner;

public class Print1toN {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printno(n);
}

static void printno(int n) {
	if(n<=0) {
		return ;
	}
	printno(n-1);
	System.out.print(n+" ");
	
}
}