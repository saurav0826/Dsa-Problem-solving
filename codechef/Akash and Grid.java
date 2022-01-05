
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
int	res=Math.abs((n/2)-a)+Math.abs((n/2)-b);
if(res%2==0)
System.out.println("0");
else
System.out.println("1");
	}
	
	}
}