
package javaapplication5;
import java.util.*;
public class Vowelreplacewithspclchr {
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 String s2="";
 for(int i=0;i<str.length();i++)
 {
       char ch=str.charAt(i);
   if((str.charAt(i)=='a')||(str.charAt(i)== 'e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u') ) 
   {
  
  s2=str.replaceAll("[AEIOUaeiou]","=");

   }
   
 
 }
  for(int i=0;i<s2.length();i++)
  {System.out.print(s2.charAt(i));}
}
}