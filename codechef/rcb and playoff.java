
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-->0){
		    int x  = sc.nextInt();
		    int y  = sc.nextInt();
		    int z  = sc.nextInt();
		    if(z*2+x>=y){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}