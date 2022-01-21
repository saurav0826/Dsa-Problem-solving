// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long[] ans = new long [n];
        long m=1;
        int k = 0 ;
        for(int i =0 ; i < n ; i++){
            if(arr[i]==0){
                k++;
                continue;
            }
            m=m*arr[i];
        }
      if(k==0){
        for(int i = 0 ; i < n; i++){
            ans[i]=m/arr[i];
        }
        }
        else if(k==1){
             for(int i = 0 ; i < n; i++){
            ans[i]=0;
            if(arr[i]==0)
            ans[i]+=m;
        }
        }
       else {
             for(int i = 0 ; i < n; i++){
            ans[i]=0;
             }
        }
        return ans;
	} 
} 