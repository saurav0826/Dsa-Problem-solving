// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        for(int i =0 ; i < n ;i++){
            if(arr[i]==0)
            arr[i]=-1;
        }
             HashMap<Integer , Integer> m= new HashMap<>();
        m.put(0,1);
        int ans = 0 ;
        int cp=0;
        for(int i =0 ; i < n ;i++){
            ans+=arr[i];
            if(m.containsKey(ans))
            cp+=m.get(ans);
            m.put(ans, m.getOrDefault(ans, 0)+1);

        }
        return cp;
        
            
    }
}
