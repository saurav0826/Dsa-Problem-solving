/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int ans = 0;
                if((x1+y1)%2==(x2+y2)%2)
                ans =3;
                else
                ans =2;
            if(ans==2){
                for(int i = 1; i<=n;i++){
                    for(int j =1 ; j <=m;j++){
                        if((x1+y1)%2==0){
                            if((i+j)%2==0){
                                System.out.print("1 ");
                            }
                            else
                            System.out.print("2 ");
                        }
                        else{
                            if((i+j)%2==0){
                                System.out.print("2 ");
                            }
                            else
                            System.out.print("1 ");
                        }
                    }
                    System.out.println();
                }
            }    
            else{
                 for(int i = 1; i<=n;i++){
                    for(int j =1 ; j <=m;j++){
                    if((x2+y2)%2==0){
                         if(i==x1&&j==y1){
                             System.out.print("1 ");
                             continue;
                         }
                         if((i+j)%2==0){
                                System.out.print("2 ");
                            }
                            else
                            System.out.print("4 ");
                    }
                    else{
                         if(i==x1&&j==y1){
                             System.out.print("1 ");
                             continue;
                         }
                            if((i+j)%2==0){
                                System.out.print("4 ");
                            }
                            else
                            System.out.print("2 ");
                    }
                    }
                    System.out.println();
                }
            }
	} 
	}            
}
