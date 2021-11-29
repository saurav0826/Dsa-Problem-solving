

package oops;


public class Object {
public static void main(String[] args) {
	cat cat1 = new cat();
	cat cat2 = new cat();
	
	cat1.leg = 4 ;
	cat2.leg = 3 ;

	cat1.color = "black" ;
	cat2.color = "white" ;
	
	cat1.walk();
	cat2.walk();
	dog dog1 = new dog();
	dog dog2 = new dog();
	dog1.name="johny";
	dog2.name="tuffy";
	 
	dog1.leg=4;
	dog2.leg=3;
	
	dog1.eye=2;
	dog2.eye=1;
	
	dog1.hasfur = true  ;
	dog2.hasfur = false ;
	 dog1.eat();
	 dog1.descpition();
	 dog2.descpition();
}
}