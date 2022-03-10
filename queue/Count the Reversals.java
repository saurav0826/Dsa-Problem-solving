// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ;i<s.length();i++){
                if(st.isEmpty())
                st.push(s.charAt(i));
                else if((st.peek()=='{')&&(s.charAt(i)=='}'))
                st.pop();
                else
                st.push(s.charAt(i));
            }
            int ans =0;
            if((st.size()%2)==1)
            return -1;
            while(!st.empty()){
                char t1=st.peek();
                st.pop();
                char t2=st.peek();
                st.pop();
                if(t1==t2)
                ans+=1;
                else
                ans+=2;
            }
            return ans;
        }
    }

