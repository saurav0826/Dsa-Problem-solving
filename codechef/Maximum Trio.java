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
	    int[] arr = new int[n];
	    for(int i =0 ;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	   // Arrays.sort(a);
	   // long ans = (long)Math.max( (a[n-1]-a[0])*a[n-2],(a[n-2]-a[0])*a[n-1] ) ;
	   // System.out.println(ans);
	    
	    Arrays.sort(arr);
	        long ans =(long) (arr[n-1]-arr[0])*arr[n-2];
	        System.out.println(ans);
	    
	}
	
	}
}