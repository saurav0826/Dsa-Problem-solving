package Hashing;

import java.util.HashMap;

public class hashMap {
 public static void main(String[] args) {
	 HashMap<Integer,String> hm1 = new HashMap<>();
	 
	 hm1.put(1, "one");
     hm1.put(2, "two");
     hm1.put(3, "three");
     System.out.println(hm1);
     System.out.println(hm1.size());
     hm1.put(2, "Two");
     System.out.println(hm1);
     hm1.remove(1);
     System.out.println(hm1);
     System.out.println(hm1);
 }
}
