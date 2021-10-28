package intro;

import java.util.Scanner;

class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
	   int n = sc.nextInt();
	   int d = sc.nextInt();
	    int nr = n ;
	    int rem ;
	    int ans = 0;
	     int c =0 ; 
	     while(nr>0){
	        rem=nr%10;
	        nr=nr/10;
	        c++;
	        if(rem==d){
	           nr=(int) ((nr*Math.pow(10,c))+((rem+1)*Math.pow(10,c-1)));
	           ans=nr-n;
	           c=0;
	        }
	        
	     }
	     System.out.println(ans);
	}
	
	}
}

