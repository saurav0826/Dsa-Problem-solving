package sorting;

import java.util.Scanner;

public class InsertionSort {
       public static void main(String[] args) {
    
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a [] = new int [n];
		 
			for(int i = 0 ; i<n ; i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i =1;i < n  ; i++) {
				int j = i -1 ;
				int temp = a[i];
				
				while(j>=0&&a[j]>temp) {
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=temp;
			}
			
			
			for(int i = 0 ; i<n ; i++) {
				System.out.println(a[i]);
			}
			
		}

	}
