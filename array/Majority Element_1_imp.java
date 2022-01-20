import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int findMajority(int nums[])
    {
    int res = 0 ;
        int count =1;
        for(int i =1 ;i <nums.length;i++){
            if(nums[res]==nums[i])
              count++;
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
                
            }
        return nums[res];
    }


    public static void main(String args[]) 
    { 
       int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;

       System.out.println(findMajority(arr));

    } 

}