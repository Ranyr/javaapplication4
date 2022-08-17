
package javaapplication5;

import java.util.*;
import java.lang.Math;
public class Search_for_chr_present_instr_ornot 
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter strng");
  String str=sc.nextLine();
  int l=str.length();
  // StringBuffer sb=new StringBuffer();
 // char ch[]= str.toCharArray();
 System.out.println("enter chr that we want to remove ");
 char c=sc.next().charAt(0);
  //int size=ch.length;
int flag=0;
for(int i=0;i<l;i++)
{
  // if(str.charAt(i)== c)
    if(Character.compare(str.charAt(i),c)==0)
    {
     flag=1;
      //str.replace(,""); 
    }
}
 if(flag==1)
 {    System.out.print("yes");   
     
 }
 else
 {    System.out.print("no");    }
  /* int n=45;
   String s= String.valueOf(n);
   String s1=Integer.toString(n);
   
   String s2="123";
   int k=Integer.parseInt(s2);
   int k1=Integer.valueOf(s2);*/


}
}