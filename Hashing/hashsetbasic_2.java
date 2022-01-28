package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetbasic_2 {
	public static void main (String[] args) {
		 HashSet<Integer> s = new HashSet<>();
		 System.out.println(s.isEmpty());
		 s.add(12);
		 s.add(89);
		 s.add(67);
		 s.add(34);

		 System.out.println(s.hashCode());
		 Iterator r =s.iterator();
		 while(r.hasNext()) {
			 System.out.print(r.next()+" ");
		 }
		 System.out.println();
		
		 Object[] arr = s.toArray();
		 
	        System.out.println("The array is:");
	        for (int j = 0; j < arr.length; j++)
	            System.out.println(arr[j]);
	}
}
