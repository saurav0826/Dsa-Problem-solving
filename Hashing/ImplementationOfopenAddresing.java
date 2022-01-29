package Hashing;

import java.util.Arrays;

class myhash{
	int arr[] ;
	int c ;
	int cap;
	int size;
	myhash(int k , int i){
		cap=k;
		arr=new int[cap];
		c=i;
		size=0;
		Arrays.fill(arr, -1);
	}
	boolean insert(int k){
		if(size==cap)
			return false ;
		int a=k%c;
		
		while(arr[a]!=-1) {
			a=(a+1)%c;
		}
		arr[a]=k;
		size++;
		return true;
	}
	boolean search(int k ) {
        int a=k%c;
        int x=a;
		while(arr[a]!=-1) {
			a=(a+1)%c;
			if(x==a)
				return false;
			if(arr[a]==k)
				return true;
		}
		return false;
		
	}
	boolean erase(int k) {
		int a = k%c;
		int x=a;
		while(arr[a]!=-1) {
			a=(a+1)%c;
			if(arr[a]==k) {
			    size--;
			    arr[a]=-2;
				return true;
			}
			if(x==a)
				return false;
		}
		return false;
	}
}
public class ImplementationOfopenAddresing {
	public static void main(String[] args) 
	{ 
	    myhash mh = new myhash(7,7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.erase(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	} 
}
