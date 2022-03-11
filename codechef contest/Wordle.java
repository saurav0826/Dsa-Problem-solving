
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
	    String s = sc.next();
	    String T = sc.next();
	    StringBuilder ans = new StringBuilder();
	    for(int i =0 ;i < 5;i++){
	        if(s.charAt(i)==T.charAt(i)){
	            ans.append("G");
	        }
	            else
	            ans.append("B");
	        }
	       System.out.println(ans);
	    }

                }
	}            
