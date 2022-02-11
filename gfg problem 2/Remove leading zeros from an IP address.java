// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String s)
    {
   String result = "";
        String[] arr = s.split("\\.");
          for(int i  = 0 ; i<arr.length;i++){
                     if(i>0&&i<arr.length)
                     result+=".";
                     
              String a = arr[i]; 
               for(int j = 0; j < a.length(); j++) {
                 // access each character
                 char c = a.charAt(j);
                 if(c != '0'){
                     result += a.substring(j,a.length()) ;
                     break;
                 }
                 if(j == a.length()-1){
                   result+= "0" ;
                 }
               } 
            
          }
               
    
        return result;
        
    }
}