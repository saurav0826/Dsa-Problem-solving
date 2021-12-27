import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}// } Driver Code Ends


class Solution{
    
    
    public static String printMinIndexChar(String S, String patt){
        
         Set<Character> s = new HashSet<Character>();
         for(int i = 0 ; i < patt.length();i++){
             s.add(patt.charAt(i));
         }
         for(int i = 0; i <S.length();i++){
             if(s.contains(S.charAt(i))){
                 String ans = Character.toString(S.charAt(i));
                 return ans;
             }
         }
         return "$";
    
    }
    
}
