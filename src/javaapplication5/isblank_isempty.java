
package javaapplication5;
import com.sun.xml.internal.ws.util.StringUtils;
import java.util.*;
//Charcter.isWhitespace();---return boolean value----check spaces chr in string 
public class isblank_isempty {
    
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter string");
   String s=sc.nextLine();
   String str=sc.nextLine();
  //isBlank() method is only used with java 11 or higher versions of java
   /*boolean b=s.isEmpty();  
   System.out.println(b);*/
   if(s.equals('a')){
       s.replace("a","");
        System.out.println("string is"+s);}
   
   for(int i=0;i<str.length();i++)
   {
     if(Character.isWhitespace(str.charAt(i)))
     {
        System.out.println(str.charAt(i)+" = yessss");
     }
     else{
     System.out.println(str.charAt(i)+" =noooo");
     
     }
    
   } 
}
}
