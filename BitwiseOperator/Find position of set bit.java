// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        if((N&(N-1))==0)
        return findbitset(N);
        else
        return -1;
    }
    static int findbitset(int N){
        int ans =1;
        while(N>0){
        if((N%2)!=0)
        return ans ;
        else{
        N=N>>1;
        ans++;
        }
    }
    return -1;
    }
};
 