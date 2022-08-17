
package javaapplication5;

import java.util.*;
import java.util.Map.*;
import static javax.swing.UIManager.get;


public class display_chr_with_no_oftime_itrepeats {
    
    display_chr_with_no_oftime_itrepeats()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string::");
        String str=sc.nextLine();
        
    Map<Character,Integer> mp = new HashMap<Character,Integer>();
    char ch[]=str.toCharArray();   
    for(char c:ch)
    {
        if(!mp.containsKey(c))
        {mp.put(c,1);}
        
        else
        {mp.put(c,mp.get(c)+1);} 
    }
     int maxvalue=(Collections.max(mp.values()));//-------------------------max
    Set<Map.Entry<Character,Integer>> et=mp.entrySet();///---------------------display 1 a
  //  for(Map.Entry<Character,Integer>ent:mp.entrySet())        //---------------------just use display 2
  for(  Map.Entry<Character,Integer> ent:et) ///////////////////////////////display 1b
    {
       if(ent.getValue()>1)
       {
            
           System.out.println(ent.getKey()+" "+ent.getValue()); 
            
       }
       
       
       if(ent.getValue()==maxvalue)
       {   // ent.getKey();
            System.out.println("max repeating chr is " +ent.getKey()+"  and it is repeating "+ent.getValue()+"times");
       }
   }
      
    
    }
  
    

public static void main(String args[])
    {
   display_chr_with_no_oftime_itrepeats   rs=new display_chr_with_no_oftime_itrepeats();
    
    } 
}