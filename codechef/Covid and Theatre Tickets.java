
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
	    	int a = sc.nextInt();
	int b = sc.nextInt();
// System.out.println((int)Math.ceil(a/2));
     System.out.println(get(a)*get(b));
	}
	
	}
	public static int get(int a ){
	    if(a%2==0){
	        return a/2;
	    }
	    else 
	    return a/2+1;
	}
}