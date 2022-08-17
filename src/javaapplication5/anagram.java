
package javaapplication5;
import java.util.*;

public class anagram {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string 1");    //ramju
    String s1=sc.nextLine();
    int size1=s1.length();
    char c[]=s1.toCharArray();
    
     System.out.println("enter string 2");  //amruj
     String s2=sc.nextLine();
     int size2=s2.length();
     char ccc[]=s2.toCharArray();
     
     System.out.println("check whether  string s2 is anagram of string s1");
     
     for(int i=0;i<size1;i++)    //ramju    //uamjr   both strngs are of same length even having same no. of repeating chrs
     { Arrays.sort(c);}         //both of strngs are anagram
     String c1=String.valueOf(c);
     System.out.println("after sorting  array 1 as  "+c1);
     for(int i=0;i<size2;i++)
     { Arrays.sort(ccc);}
     String c2=String.valueOf(ccc);
     System.out.println("after sorting  array 2 as  "+c2);
     
     
if(c1.equals(c2))
  {System.out.println("yes anagram");}
  else{System.out.println("noooooo");}
  
  
    }
}
