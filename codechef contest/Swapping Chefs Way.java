/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ans = new StringBuilder(s);
            // System.out.println(ans);
            int l = 0 ;
            n = n-1;
            while(l<=n){
                if(ans.charAt(l)>ans.charAt(n)){
                 char a = s.charAt(l);
                  ans.setCharAt(l,ans.charAt(n));
                  ans.setCharAt(n,a);
                 }
                  l++;
                  n--;
                    }
                    // System.out.println(ans);
                    char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String sort = new String(arr);
            // System.out.println(sort);
           if(sort.equals(ans.toString())){
               System.out.println("yes");
           }
           else
           System.out.println("no");
                }
	}            
}
