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
	    
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	    arr[i]= sc.nextInt();
	    }
	    int arr2[]= new int [32];
	 
	    for(int i=0;i<n;i++){
	       
	                        for(int j=0;j<32;j++)
	                        {
	                              int k=arr[i]>>j;
	                              if((k&1)==1)
	                              {
	                                    arr2[j]++;
	                              }
	                        }
	    }
	    long ans = 0;
	    for(int i=0;i<32;i++){
	        if(arr2[i]>1){
	            ans+= Math.pow(2,i);
	        }
	    }
System.out.println(ans);
	}
	
	}
}
