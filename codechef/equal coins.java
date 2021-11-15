#include <bits/stdc++.h> 

using namespace std; 

#define ll long long 


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
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    if((y%2)==1&&x==0){
	        System.out.println("NO");
	    }
	    else if((x+2*y)%2==0){
	        System.out.println("yes");
	    }
	    
	    else
	    System.out.println("NO");
	}
	
	}
}