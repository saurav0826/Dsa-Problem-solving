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
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    if(a==p&&b==q){
	        System.out.println("0");
	    }
	    else{
	    int x = (a+b)%2;
	    int y = (p +q)%2;
	    
	    if(x==y){
	        System.out.println("2");
	        
	    }
	    else 
	    System.out.println("1");
	}
	}
	}
}