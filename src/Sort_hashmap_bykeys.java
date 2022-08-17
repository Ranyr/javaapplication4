import java.util.*;
import java.lang.Math.*;
public class Sort_hashmap_bykeys {
   public static void main(String args[])
   {
  // Scanner sc=new Scanner(System.in);
  // String str=sc.nextLine();
   Map <Integer,Integer>mp=new HashMap<Integer,Integer>();
   mp.put(3,1);
   mp.put(2,3);
   mp.put(1,4);
   mp.put(4,2);
   
   TreeMap <Integer,Integer> tm=new TreeMap<Integer,Integer>(mp);
   {
   Iterator itr=tm.keySet().iterator();
   while(itr.hasNext())
   {
     int key=(int)itr.next();
   System.out.println(" first = "+key+"  second = "+mp.get(key));
   
   }
   
   }
   
  
   }
   }
   
 

