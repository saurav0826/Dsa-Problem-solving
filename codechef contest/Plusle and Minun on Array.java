/* package codechef; // don't place package name! */

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
           long [] arr = new long [n];
           for(int i = 0;i < n;i++){
               arr[i]=sc.nextInt();
           }
           long sum =0 ;
           for(int i = 0;i < n;i++){
               if(i%2==0)
               sum+=Math.abs(arr[i]);
               if(i%2==1)
               sum+=-Math.abs(arr[i]);
           }

          long min=Math.abs(arr[0]);
          for(int i = 0; i< n;i+=2){
              if(Math.abs(arr[i])<min)
              min=Math.abs(arr[i]);
          }
            long max=Math.abs(arr[1]);
          for(int i = 1; i< n;i+=2){
              if(Math.abs(arr[i])>max)
              max=Math.abs(arr[i]);
          }
        if(max>min)
         sum =sum+(2*max) - (2*min);
        System.out.println(sum);
                }
	}            
}