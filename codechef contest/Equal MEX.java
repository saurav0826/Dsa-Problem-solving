
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
	    
            int n =sc.nextInt();
            if(n==0){
            System.out.println("no");
            break;
            }
            int [] a = new int[2*n];
            for(int i =0;i<2*n;i++){
                a[i]=sc.nextInt();
            }
            
             if(n==1){
                if(a[0]==a[1])
                System.out.println("yes");
                else
                System.out.println("no");
            }
            
            else{
            Arrays.sort(a);
            int arr [] = new int [n+1];
            
             for(int i =0;i<2*n;i++){
                 arr[a[i]]++;
            }
            int count=1;
            for(int i =0;i<n+1;i++){
                if(arr[i]!=0&&arr[i]==1){
                    count=0;
                    break;
                }
                if(arr[i]==0)
                break;
            }
            if(count==0)
            System.out.println("NO");
            else
            System.out.println("Yes");
                }
	}
	}            
}