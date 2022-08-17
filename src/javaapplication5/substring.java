
package javaapplication5;
import java.util.*;
import java.util.Collection.*;

public class substring 
{
    public static void main(String args[])
    {
   ArrayList<Integer> al =new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter String"); //radhika
    
   String str=sc.nextLine();
   System.out.println("all substrings are");
    for(int i=0;i<str.length();i++)   //r ---all combinations with r,-----------all combinations with a,
    {
      for(int j=i+1;j<=str.length();j++) //a,d,h,i,k,a
      {     
        char ch[]= str.substring(i,j).toCharArray();
        int l= str.substring(i,j).length();
        al.add(l);
   
           System.out.println("length = "+l);
          
          System.out.println(str.substring(i,j));   
      }
    
    }
        System.out.println("list is"+al);
     int max=Collections.max(al);
     System.out.println("mx length is = "+max);
    
    }
}
