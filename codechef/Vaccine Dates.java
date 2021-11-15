#include <bits/stdc++.h> 

using namespace std; 

#define ll long long 

void solve(); 

int main() 

{ 

    ios_base::sync_with_stdio(false); 

    cin.tie(NULL); 

   

#ifndef ONLINE_JUDGE 

    freopen("input.txt", "r", stdin); 

    freopen("error.txt", "w", stderr); 

    freopen("output.txt", "w", stdout); 

#endif 

   

    ll int t=1; 

    /*is Single Test case?*/ 

     

    cin >> t; 

     

    // t=1;  

    //@cpsolutions 

    //single test case  -= Delete if t testCases =- 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		  int n = sc.nextInt();

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();
		if(b>=n){
		    if(a+c>=n){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		else{
		    System.out.println("NO");
		}

		}
	}
}
