package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

class hash{
	int c;
	ArrayList<LinkedList<Integer>> al ;
	int size ;
	hash(int k){
		c=k;
		size=0;
		al = new ArrayList<LinkedList<Integer>>();
		for(int i =0;i<k;i++) {
			al.add(new LinkedList<Integer>());
		}
	}
	void insert (Integer i ) {
		int k=i%c;
		al.get(k).add(i);
		size++;
	}
	void delete(Integer k)
    {
        Integer i = k % c;
        if(al.get(i).contains(k)) {
        al.get(i).remove(k);
        size--;
    }
        else 
        	return ;
    }
	
	boolean search (Integer i) {
		int k = i%c;
		return al.get(k).contains(i);
	}
	int size() {
		return size;
	}
		
	
}
public class ImplementationOfChaining {

	public static void main(String[] args) {
       
		 hash mh = new hash(7);
		  
		 System.out.println(mh.size());
		    mh.insert(10);
		    mh.insert(20);
		    mh.insert(15);
		    mh.insert(7);
		    System.out.println(mh.size());
		    System.out.println(mh.search(10));
		    System.out.println(mh.search(55));
		    mh.delete(15);
		    System.out.println(mh.search(15));
		    System.out.println(mh.size());
		
	}
}
	