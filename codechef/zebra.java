/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t>0){
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    sc.nextLine();  
	    String s = sc.nextLine();
	
    char res = s.charAt(0);
    int cnt =0;
    for(int i=1;i<n;i++) {
        if(res != s.charAt(i)) {
            cnt++;
            res = s.charAt(i);
        }
    }
    if(cnt<k) {
       System.out.println("-1");
    }
    else if(s.charAt(0)=='0') {
        if(k%2==0) {
            for(int i=s.length()-1; i>=0; i--) {
                if(s.charAt(i) == '0') {
                System.out.println(i+1);
                break;
                }
            }
        }
        else {
            for(int i=s.length()-1; i>=0; i--) {
                if(s.charAt(i) == '1') {
                   System.out.println(i+1);
                   break;
                }
            }
        }
    }
    else if(s.charAt(0)=='1') {
        if(k%2==0) {
            for(int i=s.length()-1; i>=0; i--) {
                if(s.charAt(i) == '1') {
                   System.out.println(i+1);
                   break;
                }
            }
        }
        else {
            for(int i=s.length()-1; i>=0; i--) {
                if(s.charAt(i) == '0') {
                   System.out.println(i+1);
                   break;
                }
            }
        }
    }
	    
	    
	    t--;
	}
	}
}
