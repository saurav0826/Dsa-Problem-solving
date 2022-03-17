
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
            int m = sc.nextInt();
            int arr []=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans =0 ;
            for(int i =0 ;i<n;i++){
                if(m<arr[i])
                break;
                else{
                    m-=arr[i];
                    ans++;
                }
            }
            // while(m>0){
            //     if(m<=arr[ans]){
                    
            //     }
            // }
            if(ans==n)
            System.out.println(n);
            else{
                 int k =arr[ans]/2;
                if((arr[ans]%2)==1)
                k++;
                   if(k<=m)
                   System.out.println(ans+1);
                   else
                   System.out.println(ans);
            }
                }
	}            
}
