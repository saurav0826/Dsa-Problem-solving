package string;

public class StringbuliderConconcatenation {
   public static void  main (String[] args) {
	  
	   
//	   StringBuilder is the most popular and fastet way to concatenate strings in Java. 
//	   It is mutable class which means values stored in StringBuilder 
//	   objects can be updated or changed.
	   
	   StringBuilder s1 = new StringBuilder("Hello");    //String 1  
       StringBuilder s2 = new StringBuilder(" World");    //String 2  
       StringBuilder s = s1.append(s2);   //String 3 to store the result  
           System.out.println(s.toString());  //Displays result  
   }
}
