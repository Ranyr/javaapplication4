
package javaapplication5;
import java.util.*;

public class nonrepeating_num_count {
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter number");
  long num=sc.nextLong();
  int count=0;
  boolean flag=false;
  //String s=Integer.toString(num);
  String s=String.valueOf(num);
  Map<Character,Integer>hs=new HashMap<>();
  System.out.println("length of whole string = "+s.length());
   System.out.println("map containing non repeation chrs ");
  for(int i=0;i<s.length();i++)
  {     
        if(!hs.containsKey(s.charAt(i)))    
          {  hs.put(s.charAt(i),1);   }
          else
          {
          hs.put(s.charAt(i),hs.get(s.charAt(i))+1 );    //key,value 
          } 
    
  
  }
  //In order to have non repeating number count, get values from map having value=1
   for(Map.Entry<Character,Integer>ent:hs.entrySet())
    {       if(ent.getValue()==1)
            {System.out.println(ent.getKey()+" "+ent.getValue());  //e 2,  o-3, i-1
                   count++;
            }
    }
  
  System.out.println("count of non repeating chrs = "+count);
  }  
}
