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
	    int a[] =new int[n];
	    int o =3;
	    int e =2;
	    for(int i = 0 ;i <n ;i++){
	        if(i%2==1){
	            a[i]=e;
	            e+=2;
	        }
	        else{
	            a[i]=o;
	            o+=2;
	        }
	        
	    }
	    for(int i = 0 ;i <n ;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
	
	}
}