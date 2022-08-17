
package javaapplication5;
import java.util.*;

public class stringdemo{
    public static void main(String args[]){   
       // string declaration with new keyword---------------------------
       /*  String s1=new String("radhu");
         System.out.println("string is"+s1);*/
                   
       
       
      //string declaration with literals-----------------------------   
   /*  String s="radhika nayyar mca",  rev="";
     System.out.println("string is "+s);  */
   
   
   
   
   //string input from user-------------------------------------------
    Scanner sc=new Scanner(System.in);                       //radhika nayyar
    /* String rev="";      //don't provide space here otherwise equals method for checking palandrome willn't work
    String s=sc.nextLine();
    System.out.println("length="+s.length()); */
    
   
    // reverse a string----------------------------------//reverse method is only present in string buffer class
/*    
String str=sc.nextLine();

StringBuffer sb=new StringBuffer(str);
StringBuffer sb1=new StringBuffer(sb);
sb.reverse();
  System.out.println("given string is"+sb1); // before making any changes to sb we already converted sb into sb1 so inital string value is stored in sb1
  System.out.println("reverse string is"+sb);//we had mde changes to sb as sb.reverse();
  if(String.valueOf(sb).compareTo(String.valueOf(sb1))==0)
   {
    System.out.println("yes palandrome");
   } 
  else
  { System.out.println("nooooooooooooooo");
  }    */

 String str=sc.nextLine();
 StringBuffer sb=new StringBuffer(str);
 String rev="";         //don't provide space here otherwise equals method for checking palandrome doesn't work
 rev=sb.reverse().toString();
 if(str.equals(rev))
 {
 System.out.println("yes palandrome");
 } 
 else{
  System.out.println("nooooooooooooooo");
 } 
 // just reverse a words in string---------------------------------------------------------
 /*String output="" ;
  String words[]=s.split(" ");  // array           we will play        here string is splitted from space and array will contain only words
  for(String abc:words)                      // ew lliw yalp   now here word by word reverse process will continue 1--just word-we is considered nd reversed
  {                                         //next word---will is considered and reversed    //next word---play is considered and reverse
     String reverse=""; 
     for(int i=abc.length()-1;i>=0;i--)
     {     reverse=reverse+abc.charAt(i);  }  // ew          //lliw           //yalp
    
     output=output+reverse+" ";      // ew              //ew lliw            // ew lliw yalp
  }
 System.out.println("just words are reversed "+output); 
*/
 
 
}
}