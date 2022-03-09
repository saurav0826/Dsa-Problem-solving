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
               int x = sc.nextInt();
               int [] arr = new int [n];
               for(int i = 0 ; i< n;i++){
                   arr[i]=sc.nextInt();
               }
          int ans = 0 ;
               for(int i =n-1 ;i>=0;i--){
                   if(arr[i]<x){
                       ans=i+1;
                       break;
                   }
                   
                   
                }
                System.out.println(ans);
	}            
}
}