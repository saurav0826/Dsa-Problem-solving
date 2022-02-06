import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      String num = sc.nextLine();
      int digitSum = 0;
      int l=num.length()-1;
     
      for(int i = 0; i<num.length(); i++) {
         digitSum = digitSum + num.charAt(i)-'0';
      }
      if(digitSum % 3 == 0) {
          if(num.charAt(l)=='0')
         System.out.println("1");
         else
         System.out.println("0");
      } else {
         System.out.println("0");
      }
   }
}