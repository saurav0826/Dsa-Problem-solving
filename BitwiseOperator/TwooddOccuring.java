package BitwiseOperator;

import java.util.Scanner;

public class TwooddOccuring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		int res=0;
		for(int i = 0 ; i < n ;i++) {
			a[i]=sc.nextInt();
			res=res^a[i];
		}
		int k = res & ~(res-1);
		 int res1=0, res2=0;
		 for(int i = 0 ; i < n ;i++) {
				if((k&a[i])!=0) {
					res1=res1^a[i];
				}
				else
					res2=res2^a[i];
			}
		 System.out.println(res1+" "+res2);
	}
	}


