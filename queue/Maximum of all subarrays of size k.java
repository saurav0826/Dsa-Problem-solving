// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.HashMap; 
import java.util.HashSet; 

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}

			Solution x = new Solution();
			if (x.ValidCorner(matrix)) 
				System.out.println("Yes"); 
			else
				System.out.println("No"); 
			t--;
		}
	} 
}
	


// } Driver Code Ends


//User function Template for Java

public class Solution { 
	static boolean ValidCorner(int m[][]) 
	{ 
	    // Your code goes here
	    for(int i = 0 ; i< m.length ;i ++){
	        for(int j = 0; j<m[0].length;j++){
	            for(int k = i+1;k<m.length;k++){
	                for(int l=j+1;l<m[0].length;l++){
	                    if(m[i][j]==1&&m[i][l]==1&&m[k][j]==1&&m[k][l]==1)
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}
}