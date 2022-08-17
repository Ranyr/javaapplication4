/**/
package javaapplication5;
import java.util.*;
import java.util.Collection.*;
 class lets {
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter string");
  String str=sc.nextLine();
  HashMap<Character,Integer>hs=new HashMap<Character,Integer>();
  for(int i=0;i<str.length();i++)
  {
    if(!hs.containsKey(str.charAt(i)))
    {
           hs.put(str.charAt(i),1);
    }
    else{
        hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
       }
  }
  int value=2;
  Character Ke='a';
for(Map.Entry<Character,Integer>ent:hs.entrySet())  //radhika
{
   /*if(ent.getValue()==value){System.out.println("key= "+ent.getKey());}
    //if(ent.getKey().compareTo(Ke)==0)
    if(Character.compare(ent.getKey(),Ke)==0)
   {System.out.println(ent.getValue());}  */
  if(ent.getValue()==1)
  {hs.put(ent.getKey(),9);}  
   
}
  System.out.println(hs);  //{a=2,r=9,h=9,i=9,k=9}
  
 /* int l=str.length();
  HashMap<Character,Integer>hs=new HashMap<Character,Integer>();
  for(int i=0;i<l;i++)
  {
      if(!hs.containsKey(str.charAt(i)))
      hs.put(str.charAt(i),1);
      else
      {hs.put(str.charAt(i),hs.get(str.charAt(i))+1);} 
  }

  //************hs.get(key)********** will return value present at this key*****************
  //************ent.getValue()==value*********************
  //*************ent.getKey().compareTo(key)==0*********************


  /* System.out.println("printing all keys using hs.keyset() method");//****return type set of particular type 
   // System.out.println(hs.KeySet());
   Set<Character> kk=hs.keySet();
     System.out.println(kk);
    
   System.out.println("printing all values using hs.values()");//*****return type collection of particular type
   Collection kv=hs.values();
    System.out.println(kv);
    
  System.out.println("sort elements according to keys present in hashmap");
  
  TreeMap<Character,Integer>tm=new TreeMap<>(hs);
  Iterator itr=tm.keySet().iterator();
  while(itr.hasNext()){
    char key= (char)itr.next();
        System.out.println(key+"  "+hs.get(key));
  }
*/
}
  }
  
 

