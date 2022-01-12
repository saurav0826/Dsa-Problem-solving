// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new Solution().removeConsecutiveDuplicates(str));
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        StringBuilder sb= new StringBuilder();
        ArrayDeque<Character> s = new ArrayDeque<>();
        s.push(str.charAt(0));
        char c = str.charAt(0);
        sb.append(c);
        for(int i = 1 ; i < str.length();i++){
            if(str.charAt(i)!=s.peek()){
                s.push(str.charAt(i));
                char d = str.charAt(i);
                sb.append(d);
            }
        }
                    return sb.toString();

    }
}