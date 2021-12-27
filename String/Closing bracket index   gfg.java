
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
            String s = sc.next();
            int pos = sc.nextInt();
    		System.out.println (new Sol().closing (s, pos));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int closing (String S, int pos)
    {
      int k = 1;
      int ans =0;
      for(int i = pos+1 ; i <S.length() ; i++){
          if(S.charAt(i)=='[')
          k++;
          else if(S.charAt(i)==']'){
          k--;
          if(k==0){
              ans=i;
              break;
          }
          }
      }
            return ans; 
    }
}
