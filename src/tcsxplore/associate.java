
package tcsxplore;

import java.util.*;
import java.lang.*;
class associate{
       
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
  
   Map<Character,Integer> hs=new HashMap<Character,Integer>();
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(!hs.containsKey(str.charAt(i)))
      {
      hs.put(str.charAt(i),1);  
      }
      else
      {
       // hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
        int c=hs.get(ch);
        hs.put(ch,c+1 );   
      }
    }
      Set<Character> hss=new HashSet<Character>();
    
   
 }     
   
 }
 
 