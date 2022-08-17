
package tcs_prev;

import java.util.*;
public class procduct_of_digits {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
    int no=sc.nextInt(); //543
    int pro=1;
    while(no>0)
    {
    
      int rem=no%10;
      pro=pro*rem;
      no=no/10;
                    
    }
    System.out.println(no);
    }
}
