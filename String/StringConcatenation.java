package string;

public class StringConcatenation {

	public static void main(String[] args) {

		
		String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar
		   
		   System.out.println();
		   
		   
		   String s1=50+30+"Sachin"+40+40;  
		   System.out.println(s1);//80Sachin4040
		   
//		   Note: After a string literal, all the + will be treated as string concatenation operator.
		   
		   
		   System.out.println();

		   String s11="Sachin ";  
		   String s12="Tendulkar";  
		   String s13=s11.concat(s12);  
		   System.out.println(s13);//Sachin Tendulkar  
		   System.out.println(s11.concat(s12));
	}

}
