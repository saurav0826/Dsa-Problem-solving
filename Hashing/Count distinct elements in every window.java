// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<Integer>();
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++ ){
            if(i<k){
                  map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                if(i==k-1)
                            al.add(map.size());

            }
            else{
                if(map.get(arr[i-k])==1)
                map.remove(arr[i-k]);
                else{
                map.put(arr[i-k],map.get(arr[i-k])-1);
                }
                map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
                
                al.add(map.size());
            }
        }
        return al;
    }
}

