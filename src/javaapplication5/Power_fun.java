
package javaapplication5;
import java.util.*;
import java.lang.Math;
public class Power_fun {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 
  int a=5;
  int p=3;
  double str1;
  
  str1=Math.pow(a,p);
  System.out.println("5^3 is = "+str1);
 
  int c=175, d=-184, e=0 ;
  int res,res1,res2;
  res=Math.abs(c);
  res1=Math.abs(d);
 res2= Math.abs(e);
 System.out.println("res = "+res);
 System.out.println("res1 = "+res1);
 System.out.println("res2 = "+res2);
 
 
 int f=4, g=6;
 int diff=f-g;
 System.out.println("diff= "+diff);
 
 System.out.print("abs diff= "+Math.abs(diff));
  }  
}
