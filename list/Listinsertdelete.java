package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listinsertdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new LinkedList<>();
    
        while(n>0) {
            int t = sc.nextInt();
            li.add(t);
            n--;
        }
        int k = sc.nextInt();
        while(k-->0) {
            String s = sc.next();
            if(s.equals("Insert")) {
                int o = sc.nextInt();
        int l = sc.nextInt();
        li.add(o,l);
   
            }
            else {
        int r = sc.nextInt();
              li.remove(r);
        
        
            }
        }
        for(int ab:li) {
        	System.out.print(ab+" ");
        }
        
        
        

    }

}

