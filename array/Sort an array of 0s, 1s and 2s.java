// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends
class Solution
{
    public:
    void sort012(int a[], int n)
    {
        // coode here 
         int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i =0;i<n;i++){
            if (a[i] == 0) c1+=1;
            else if (a[i] == 1) c2+=1;
            else{
                c3+=1;
            }
        }
        int k = 0;
        for(int i =0;i<c1;i++){
            a[k] = 0;
            k+=1;
        }
        for(int j =0;j<c2;j++){
            a[k] = 1;
            k+=1;
        }
        for(int x=0;x<c3;x++){
            a[k] = 2;
            k+=1;
        }
       
    }
    
};

// { Driver Code Starts.
int main() {

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }

        Solution ob;
        ob.sort012(a, n);

        for(int i=0;i<n;i++){
            cout << a[i]  << " ";
        }

        cout << endl;
        
        
    }
    return 0;
}

  // } Driver Code Ends