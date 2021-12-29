package recursion;

import java.util.Scanner;

public class IspalindromeUsinRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(checkpalindrome(s,0,n-1));
	}

	 static boolean checkpalindrome(String s, int i, int n) {
	
		if(i>=n) {
			return true ;
		}
		else if(s.charAt(i)!=s.charAt(n))
			return false;
		return (s.charAt(i)==s.charAt(n))&&checkpalindrome(s,i+1,n-1);
		
					
	}

}
