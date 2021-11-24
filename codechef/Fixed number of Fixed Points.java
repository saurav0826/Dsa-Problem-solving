
#include<bits/stdc++.h>
using namespace std;
 
int main()
{
 
    int t; 
    cin>>t;
 
    for (int l = 0; l < t; l++)
    {
        int x, y; 
        cin>>x>>y;
 
        if (x == 1 && y == 0) { 
            cout<<-1<<endl; 
            continue; 
        }
 
        if (x - y  == 1) { 
            cout<<-1<<endl; 
            continue; 
        }
 
        if (y == 0){
            for (int i = 1; i < x; i++)
            {
                cout<<(i+1)<<" ";
            }
            cout<<1;
        }
        else if ( x == y ) 
        { 
            for (int i = 1; i <= x; i++) cout<<i<<" ";
        }
        else
        {
            for (int i = 1; i <= y; i++) cout<<i<<" ";
            for (int i = y+1; i < x; i++) cout<<i+1<<" ";
            cout<<y+1;
        }
        cout<<endl;
 
    }    
 
    return 0;
}