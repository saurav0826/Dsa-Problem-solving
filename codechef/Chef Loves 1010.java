
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
	
	    int k =0;
	    for(int i = 0 ; i<n;i++){
	        if(s.charAt(i)=='1'){
	            k++;
	        }
	     
	       
	    }
	    if(Math.min(k,n-k)==0){
	        System.out.println("0");
	    }
	    else
	        System.out.println((Math.min(k,n-k)-1));
	}
	
	}
}