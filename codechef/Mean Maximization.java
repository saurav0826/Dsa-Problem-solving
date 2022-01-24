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
	    int a[] = new int[n];
	    for(int i =0 ; i< n;i++){
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    double sum = 0;
	     for(int i =0 ; i< n-1;i++){
	        sum+=a[i];
	    }
	    System.out.println(String.format("%.6f",((sum/(n-1))+a[n-1])));
	}
	
	}
}