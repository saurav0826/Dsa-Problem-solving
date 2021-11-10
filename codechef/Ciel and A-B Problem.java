import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int First = sc.nextInt();
int Second = sc.nextInt();
 int Sum=First-Second;
        if((Sum%10)<9)
        Sum=Sum+1;
        else
        Sum=Sum-1;
        System.out.println(Sum);
	}
}