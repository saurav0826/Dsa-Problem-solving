package string;

public class stringspilt {

	

		  public static void main(String[] args) {
		    String text = "Saurav shankar shinde";

		    String[] result = text.split(" ");


		    System.out.print("result = ");
		    for (String str : result) {
		      System.out.print(str + ", ");
		    }
		  }
}
