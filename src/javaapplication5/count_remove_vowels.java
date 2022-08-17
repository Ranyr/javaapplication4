
package javaapplication5;
import java.util.*;

public class count_remove_vowels {

     /*  int flag=0;
       String str2;
    
    count_remove_vowels()
    {
           Scanner scan=new Scanner(System.in);
           System.out.println("enter string");
           String str=scan.nextLine();  //welcome good  o-3,e-2
           int l=str.length();
       
       //checking is string entered by user is empty(not having any chr even not having space)
       if(str.isEmpty())
       { 
           flag=2;
          System.out.println("blank");
       }

      ///checking for vowels present in string---------------------------enter those vowels into hashmap
       
       Map <Character,Integer>mp=new HashMap <Character,Integer> ();
       for(int i=0;i<l;i++)
       {    
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
       {     flag=1;
          if(!mp.containsKey(str.charAt(i)))    
          {   mp.put(str.charAt(i),1);   }
          else
          {
          mp.put(str.charAt(i),mp.get(str.charAt(i))+1 );    //key,value 
          }
       
       }
        
     }    
       //printing vowels + count of vowels-----------------------------------------------
    for(Map.Entry<Character,Integer>ent:mp.entrySet())
    {
        System.out.println(ent.getKey()+" "+ent.getValue());  //e 2,  o-3, i-1
    }
    
    
    
    
    ////////////////remove vowels and print updated string after removal of vowels
     if(flag==1){
       System.out.println("after   vowels removal");
        str2=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str2);
     }
    
    
   /// in case if no vowel present in the list then print 0-------------------------- 
   if(flag==0)
   { 
       System.out.println("0");
   }
   
    
  } */
    
  public static void main(String args[])
  {
  //count_remove_vowels s=new count_remove_vowels();
      Scanner sc=new Scanner(System.in);
      String str= sc.nextLine();
      Map <Character,Integer>mp=new HashMap<>();
      for(int i=0;i<str.length();i++)
      {
        if(mp.containsKey(str.charAt(i)))
        {   //System.out.println(str.charAt(i)+"  "+mp.get(str.charAt(i)));
            mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
          // System.out.println mp.get(str.charAt(i));
        }
        else{mp.put(str.charAt(i), 1);}
      }
  System.out.println(mp.keySet());  
}
}
