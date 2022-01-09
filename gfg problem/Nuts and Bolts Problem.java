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
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
  char [] arr = {'!','#','$','%','&','*','@','^','~'};
    //   int k = 0 ;
    //   for(int i = ; i < n; i++){
    //       if()
    //   }
    // Set<Character> set =('!','#','$','%','&','*','@','^','~');
    // Set<Character> a = new HashSet<Character>();

    //  a.addAll(Arrays.asList(
    //         new Character[] { '!','#','$','%','&','*','@','^','~' }));
    //         System.out.println(a

    for(int i=0 ; i<n-1; i++ ){
        for(int j =i+1; j <n; j++){
             int k = 0 ;
             int l =0 ;
            while(nuts[i]!=arr[k]){
                k++;
            }
             while(nuts[j]!=arr[l]){
                l++;
            }
            if(l<k){
                char t = nuts[i];
                nuts[i]=nuts[j];
                nuts[j]=t;
            }
        }
    }
     for(int i=0 ; i<n-1; i++ ){
        for(int j =i+1; j <n; j++){
             int k = 0 ;
             int l =0 ;
            while(bolts[i]!=arr[k]){
                k++;
            }
             while(bolts[j]!=arr[l]){
                l++;
            }
            if(l<k){
                char t = bolts[i];
                bolts[i]=bolts[j];
                bolts[j]=t;
            }
        }
    }

}}