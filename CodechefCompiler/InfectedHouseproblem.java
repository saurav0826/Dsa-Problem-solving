import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
	    
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int [] arr = new int [m];
	    for(int i = 0 ;i < m;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    boolean [] visited = new boolean[n];
	    Queue<Integer> q = new LinkedList<>();
				
				for(int i = 0 ;i < m;i++){
				    q.add(arr[i]);
				    visited[i]=true;
				}
		
		int ans = 1;
	
	          while(q.size()!=0) {
					int c = q.size();
					for(int i = 0 ;i<c;i++) {
						int cur = q.poll();
						if(cur+1<n&&visited[cur+1]==false){
							q.add(cur+1);
							visited[cur+1]=true;
						}
					    if(cur-1>=0&&visited[cur-1]==false){
							q.add(cur-1);
							visited[cur-1]=true;
					    }
					            }
				        int k=q.size();
				        ans=ans*fact(k);

				}
				System.out.println(ans);

	}
	
	}
	              static int fact(int n){
                                      
                            int res = 1, i;
                         for (i=2; i<=n; i++)
                           res *= i;
                           return res;
	                                   } 
}
