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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
     Stack<Integer> stk=new Stack<Integer>();
       stk.push(-1);
       int ans = 0;
       for (int i = 0; i < S.length(); i++) {
           if (S.charAt(i) == '(') {
               stk.push(i);
           } else {
               stk.pop();
               if (stk.empty()) {
                   stk.push(i);
               } else {
                   ans = Math.max(ans, i - stk.peek());
               }
           }
       }
       return ans;
    }
}