package recursion;

import java.util.Scanner;

public class PrintNto1 {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printno(n);
}

static void printno(int n) {
	if(n<=0) {
		return ;
	}
	System.out.print(n+" ");
	printno(n-1);
}
}
