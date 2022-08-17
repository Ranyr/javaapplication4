
package javaapplication5;

import java.util.*;


public class removeduplicates_displayremainingstrng {
  
    
    //using      SET     interface--------------------------------------------------------------------------
 /*   removeduplicates_displayremainingstrng()
   {       
       Scanner sc=new Scanner(System.in);
        System.out.println("old string::");
        String str=sc.nextLine();
         System.out.println("after removel of duplicate chrs");
   Set<Character>st=new HashSet<>();
   StringBuffer bf=new StringBuffer();
   for(int i=0;i<str.length();i++)
   { 
       Character ch=str.charAt(i);
       if(!st.contains(ch))
       {
       st.add(ch);
       bf.append(ch);
       }
   }
     System.out.println("new string is::"+bf);
   
   }
     
    public static void main(String args[])
    {
   
    removeduplicates_displayremainingstrng rs=new removeduplicates_displayremainingstrng();
    
    }*/
    
   // without using any predefined fun ============================================================================================ 
   removeduplicates_displayremainingstrng()
   {
       String ns=" ";
       Scanner sc=new Scanner(System.in);
        System.out.println("old string::");
        String str=sc.nextLine();
         System.out.println("after removal of duplicate chrs::");
         for(int i=0;i<str.length();i++)
         { 
             char ch=str.charAt(i);
              if(ns.indexOf(ch)== -1)
              { ns=ns+ch ;   } 
         }
    System.out.println(ns);
   
   
   } 
    
    
    public static void main(String args[])
    {
   
    removeduplicates_displayremainingstrng rs=new removeduplicates_displayremainingstrng();
    
    } 
    
}
