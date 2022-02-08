// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
   boolean isprime(int k ){
       if(k == 0 || k == 1){
            return false;
        }
        for(int i = 2;i<=(int)Math.sqrt(k);i++){
            if(k%i==0)
            return false;
        }
        return true;
    }
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = M ; i <=N ; i++){
            if(isprime(i)){
                al.add(i);
            }
        }
        return al ;
    }
}