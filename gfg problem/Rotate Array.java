
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int d = sc.nextInt();
		    int [] a = new int[n];
		    for(int i =0 ; i < n; i++){
		        a[i]=sc.nextInt();
		    }
		        rotatearray(d,a,n);
		    for(int item:a){
		        System.out.print(item+" ");
		    }
		    		        System.out.println();

		}
	}
	static void rotatearray(int d, int [] a,int n){
	    int [] t= new int[d];
	    for(int i = 0 ; i <d ;i ++){
	        t[i]=a[i];
	    }
	    int k =0;
	    for(int i=0 ; i < n;i++){
	       if(i<n-d){
	           a[i]=a[i+d];
	       } 
	       else{
	           a[i]=t[k];
	           k++;
	       }
	    }
	    
	}
}