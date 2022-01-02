package BitwiseOperator;

import java.util.Scanner;

public class CountsetBits_1 {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
 int k =0 ; 	
while(n>0) {
	if((n&1)==1)
		k++;
	n=(n>>1);
}

System.out.println(k);
}
}
