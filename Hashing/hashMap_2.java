package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashMap_2 {
	 public static void main(String[] args) {
		 HashMap<Integer,String> hm1 = new HashMap<>();
		 
		 hm1.put(1, "one");
	     hm1.put(2, "two");
	     hm1.put(3, "three");
	     hm1.put(3, "three_1");
	     System.out.println(hm1);
    
	     hm1.put(4, "two");
	     System.out.println(hm1);
	     System.out.println(hm1.containsKey(3));
	     System.out.println(hm1.containsValue("two"));
	     
	     System.out.println(hm1.get(3));
	     System.out.println(hm1.hashCode());
	     System.out.println(hm1.replace(3, "jgu"));
	     System.out.println(hm1);
	     
	     
	     for (Entry<Integer, String> e : hm1.entrySet())
	            System.out.println("Key: " + e.getKey()
	                               + " Value: " + e.getValue());
	 }
	 
}
