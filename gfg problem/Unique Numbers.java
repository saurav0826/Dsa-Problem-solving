// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}
// } Driver Code Ends


class Solution{

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=L;i<=R;i++){
            if(con(i))
            l.add(i);
        }
        return l;
    }
    static boolean con(int i){
        Set<Integer> s = new HashSet<>();
        while(i>0){
            int k = i%10;
            if(s.contains(k))
            return false;
            s.add(k);
            i=i/10;
        }
        return  true;
    }
}