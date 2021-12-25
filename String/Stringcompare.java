package string;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		There are three ways to compare String in Java:

//			1.  By Using equals() Method
//			2. By Using == Operator
//			3. By compareTo() Method
		
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   
		   System.out.println("");
		   
		   String s11="Sachin";  
		   String s12="SACHIN";  
		  
		   System.out.println(s11.equals(s12));//false  
		   System.out.println(s11.equalsIgnoreCase(s12));//true
		   
		   System.out.println("");
		   
		   
		   String s21="Sachin";  
		   String s22="Sachin";  
		   String s23=new String("Sachin");  
		   System.out.println(s21==s22);//true (because both refer to same instance)  
		   System.out.println(s21==s23);//false(because s3 refers to instance created in nonpool)
		   
		   
		   System.out.println("");

		   String s31="Sachin";  
		   String s32="Sachin";  
		   String s33="Ratan";  
		   System.out.println(" "+ s31.compareTo(s32));//0  
		   System.out.println(" "+s31.compareTo(s33));//1(because s1>s3)  
		   System.out.println(s33.compareTo(s31));//-1(because s3 < s1 )  

	}

}
