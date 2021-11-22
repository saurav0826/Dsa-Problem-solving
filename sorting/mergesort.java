import java.util.Scanner;

public class Mergesort {
	
	public static void sortarray( int [] arr , int  l , int  m , int r) {
	
		 
			
			int n1 = m-l+1;
			int n2 = r-m;
			int [] a = new int [n1];
			int []  b = new int [n2];
			
			for(int i=0;i<n1;i++)
	            a[i]=arr[i+l];
	        for(int j=0;j<n2;j++)
	            b[j]=arr[m+1+j];
	        
	        int i=0,j=0,k=l;
	        while(i<n1 && j<n2){
	            if(a[i]<=b[j])
	                arr[k++]=a[i++];
	            else
	                arr[k++]=b[j++];
	        }
	        while(i<n1)
	            arr[k++]=a[i++];
	        while(j<n2)
	            arr[k++]=b[j++];    
	    }
	
	public static void merge(int [] a , int l , int r) {
		if(l<r) {
			int m = l + (r-l)/2;
			merge(a,l,m);
			merge(a,m+1,r);
		sortarray(a,l,m,r);
			
		}
	}
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		
		for(int i = 0 ; i < n ; i ++) {
			arr[i]=sc.nextInt();
		}
		merge(arr,0,n-1);
		
		
		for(int i = 0 ; i< n ;i ++) {
			System.out.print(arr[i]+" ");
		}
	}
}