package oops;

public class Methods1 {

	static int maxof(int a , int b) {
		return a<b ? b:a;
	} 
	
	static int maxof(int a , float b) {
		float c = a;
		return (int) (c<b ? b:c);
	}
	static void maxof(int a  ) {
		System.out.println("hiii");
	}
	public static void main (String[] args) {
		int a = 1 ;
		int b =4 ;
		float c = 4.7f ;
		System.out.println(maxof(a,c));
		maxof(a);
		System.out.println(maxof(a,b));
	}
}
