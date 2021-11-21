import java.util.Scanner;

public class Mergetwoarray {
	
	public static void printarray(int []c , int  p) {
		for(int i = 0; i<p;i++) {
		System.out.print(c[i]+" ");
		}
	}
    
	public static void sortarray(int n , int m, int [] a , int [] b) {
		int [] c =new int [n+m];
		int i = 0 ;
		int j = 0 ;
		int k=0;
		while(i<n && j <m) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			c[k]=a[i];
			k++;
			i++;
			
		}
		while(j<m) {
			c[k]=b[j];
			k++;
			j++;
		}
		printarray(c,n+m);
	}
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		
		int m = sc.nextInt();
		int a [] = new int [n];
		int b [] = new int [m];
		for(int i = 0 ; i < n ; i ++) {
			a[i]=sc.nextInt();
		}
		for(int i = 0 ; i < m ; i ++) {
			b[i]=sc.nextInt();
		}
		
		
		sortarray(n,m,a,b);
	}
}
