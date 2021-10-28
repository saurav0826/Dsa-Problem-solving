package array;

import java.util.Scanner;

public class palindromicArray {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				System.out.println("enter no");
				int t = sc.nextInt();
				while(t-->0)
				{
					int n = sc.nextInt();
					int[] a = new int[n];
					for(int i = 0 ;i < n; i++)
						a[i]=sc.nextInt();
					System.out.println(GfG.palinArray(a , n));
				}
			}
		}

		class GfG
		{
		    public static boolean checkpalinArray(int x){
		    
		String temp =""+x;
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}

		int low = 0  ; 
		int high = temp.length()-1;
		while(low<high){
		    if(numbers[low]!=numbers[high])
		    return false;
		    low++;
		    high--;
		}
		return true ;
		    }
			public static int palinArray(int[] a, int n)
		           {
		                  //add code here
		                  int ans = 1 ;
		                  for(int i = 0 ; i < n ; i++){
		                      if(!(checkpalinArray(a[i]))){
		                      ans =  0;
		                      }
		                     }
		                     return ans ;
		                  
		           }
		
	}


