
package javaapplication5;
import java.util.*;

public class panagram 
{
  public static void main(String args[]) 
  { //String s="def ghijklmnopqrstuvwx" ;
     String s="abcdefghijklmnopqrstuvwxy";//"The quick brown fox jumps over the lazy ";
      boolean []mark=new boolean[26];  //mark[ ] -------------------indexes(0---------25)
      boolean panagram=true;
      int index=0;
      for(int i=0;i<s.length();i++)
      {
      char ch=s.charAt(i);
      if(ch>='A'&& ch<='Z')
              {
                 index = ch-'A';     // A(65)-65=0  here we are at 0 index in mark array 
                 mark[index]=true;   // mark[0]=true;
              }
      else if(ch>='a'&& ch<='z')
      {
        index=ch-'a';       // h(104)- a(97)=8  here we are at 8th index of mark array 
        mark[index]=true;   // here we r marking true at 8th position of mark[8]=true; because we have a chr at 8th position
      }
     
       
     }
         String res="";
         //char v;
       for(int i=0;i<mark.length;i++)
       {
       if(mark[i]==false)
       {
         panagram=false;
         
       } 
       
       } 
  
 if(panagram)
       {System.out.println("yes panagram");}
 else
       {
       System.out.println("not panagram");   //if it is not an palindrome then find the chrs that needed to  make that string palindrome
       System.out.println("required chrs to make the string as panagram");
       for(int i=0;i<mark.length;i++)
       {
         if(mark[i]==false)
          {
            
               System.out.println("character "+(char)(i+'a')+" at index "+ i);   //0+65=65-------a whenever we find false at particular index in mark array, wrt to that particular index we will find an char i.e missing 
          }
       }
       
       
       }
  
}
}