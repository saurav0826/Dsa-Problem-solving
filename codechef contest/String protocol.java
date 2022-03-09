import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
	    int n = sc.nextInt();
            String s = sc.next();
            int ans = n-1; 
        
            for(int i =0 ;i < n-1;){
               if(s.charAt(i)==s.charAt(i+1)){
                   ans--;
                 i+=2;   
               }
               else
               i++;

                
            }
       
            System.out.println(ans+1);
                }
	}            
}
