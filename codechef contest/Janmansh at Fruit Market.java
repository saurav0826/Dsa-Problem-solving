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
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c =sc.nextInt();
           int [] f = {a,b,c};
           Arrays.sort(f);
           int ans = 0;
           ans+=(f[0]*(n-1));
           ans+=f[1];
           System.out.println(ans);
                }
	}            
}