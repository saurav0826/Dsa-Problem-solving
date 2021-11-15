
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t>0){
          
          int n = sc.nextInt();
          int m = sc.nextInt();
          int q = sc.nextInt();
          int [] a = new int [m];
          char [] c = new char [q];
          int [] arr =new int [q];
          int ans = 1 ; 
          for(int i = 0 ; i <q;i++){
             c[i] = sc.next().charAt(0);   
             arr[i]=sc.nextInt();
          }
          for(int j=0;j<q;j++){
              if(c[j]=='+'){
                  int temp=-1;
                  for(int i =0;i<m;i++ ){
                      if(a[i]==0){
                          temp=i;
                          break;
                      }
                  }
                  if(temp==-1){
                      System.out.println("Inconsistent");
                      ans=0;
                      break;
                  }
                  else{
                      a[temp]=arr[j];
                  }
                  
              }
              
               else{
                  int temp2=-1;
                  for(int z =0;z<m;z++ ){
                      if(arr[j]==a[z]){
                          temp2=z;
                          break;
                      }
                  }
                  if(temp2==-1){
                      System.out.println("Inconsistent");
                      ans=0;
                      break;
                  }
                  else{
                      a[temp2]=0;
                  }
                  
              }
              
              
              
              
          }
          if(ans==1){
              System.out.println("Consistent");
          }
          
          
          t--;
      }

	}
}