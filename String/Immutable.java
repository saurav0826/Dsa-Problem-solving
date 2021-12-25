package string;

public class Immutable {
 public static void main(String [] args) {
	 String s="Sachin"; 
	 
	   s.concat(" Tendulkar");
	   System.out.println(s);
	   
	

	   String t = s.concat(" Tendulkar");
	   System.out.println(t);
	   
	   s= s.concat(" Tendulkar");
	   System.out.println(s);
 }
}
