package Hashing;

import java.util.HashSet;

public class hashsetbasic_1 {
 public static void main (String[] args) {
	 HashSet<Integer> s = new HashSet<>();
	 System.out.println(s.isEmpty());
	 s.add(12);
	 s.add(89);
	 s.add(67);
	 System.out.println(s.size());
	 System.out.println(s.remove(89));
	 System.out.println(s.size());
	 s.add(90);
	 System.out.println(s);
	 System.out.println(s.contains(90));
	 
 }
}
