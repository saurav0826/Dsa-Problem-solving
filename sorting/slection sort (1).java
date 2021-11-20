package sorting;

import java.util.Scanner;

public class SlectionSORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int [n];
       
        for(int i = 0 ; i < n ;i ++) {
        	a[i]= sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++) {
        	int temp =i;
        	for(int j = i ; j <n-1 ; j ++) {
        		if(a[j+1]<a[j])
        			temp=j+1;
        	}
        	int k = a[i] ;
        	a[i]=a[temp];
        	a[temp]=k;
        	
        }
        for(int i = 0 ; i < n ;i ++) {
         System.out.print(a[i]+" ");
        }
	}

}
