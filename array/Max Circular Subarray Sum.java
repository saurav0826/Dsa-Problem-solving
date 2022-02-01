// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        int ans=0;
        // Your code here
      int min = minsubarraysum(a,n);
      int max =maxsubarraysum(a,n);
      for(int i =0 ; i< n;i++){
      ans+=a[i];
           
      }
      if(ans==min)
      return max;
      else
      return Math.max(max,ans-min);
       
    }
    static int minsubarraysum(int a[], int n) {
    
    int minsum=Integer.MAX_VALUE;
    int cur=0;
    for(int i =0 ; i< n;i++){
        cur=Math.min(cur+a[i],a[i]);
        if(minsum>cur)
        minsum=cur;
        if(cur>0)
        cur=0;
    }
    return minsum;
        
    }
    static int maxsubarraysum(int a[], int n) {
    
    int maxsum=Integer.MIN_VALUE;
    int cur1=0;
    for(int i =0 ; i< n;i++){
        cur1=Math.max(cur1+a[i],a[i]);
        if(maxsum<cur1)
        maxsum=cur1;
        if(cur1<0)
        cur1=0;
    }
    return maxsum;
        
    }
}
  
 