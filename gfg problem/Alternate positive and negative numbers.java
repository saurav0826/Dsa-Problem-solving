// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> s1 = new ArrayDeque<>();
        Queue<Integer> s2 = new ArrayDeque<>();
        for(int i  = 0 ; i < n ; i ++) {
            if(arr[i]<0)
            s1.offer(arr[i]);
            else
            s2.offer(arr[i]);
        }
        int k =0;
        while(k<n){
             while(!s1.isEmpty()&&!s2.isEmpty()){
                 if(k%2==0){
                 arr[k]=s2.poll();
                 k++;}
                 else{
                 arr[k]=s1.poll();
             k++;
                 }
                 }
         if(!s2.isEmpty()){
             arr[k]=s2.poll();
             k++;
         }
         if(!s1.isEmpty()){
          arr[k]=s1.poll();
         k++;
         }
        }
        
    }
}