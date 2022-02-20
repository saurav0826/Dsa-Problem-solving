// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.kthDiff(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long kthDiff(long arr[], long n, long k)
    {
          Arrays.sort(arr);
        long l = 0;
        long  h = arr[arr.length - 1]-arr[0];
        while (l < h) {
            long m = (l + h) / 2;
            int  c = 0 , p =0 ;
            for (int r = 0; r < arr.length; ++r) {
                while (arr[r] - arr[p] > m) p++;
                c += r - p;
            }
            if (c >= k) h = m;
            else l = m + 1;
        }
        return l;
    }
    }
