package oops;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 8 ;
		int b =10 ;
		swap(a,b);
		System.out.println(a+" "+b);
		dogs tuffy = new dogs();
		tuffy.legs=6;
		System.out.println(tuffy.legs);
		
	}

	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp =a ;
		a=b;
		b=temp;
		
	}

}
class dogs {
	int legs = 4 ;
}