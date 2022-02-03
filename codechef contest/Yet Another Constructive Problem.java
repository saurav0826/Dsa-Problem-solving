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
	    int a = 0;
	
	    int b = n;
        int k =0 ;
        int count = 0;
        while(k<n){
            k+=Math.pow(2,count);
            count++;
        }
        
        
	    int c = (int)Math.pow(2,count)+n;
	    
	    System.out.println(a+" "+b+" "+c);
	}
	
	}
}
