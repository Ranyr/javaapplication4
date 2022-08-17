
package tcs_prev;
import java.util.*;

public class print_count_of_longest_word_in_sentence {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine(); //radhika is gone
       String words[]=str.split(" "); //radhika    //is    //gone
       HashMap <String,Integer>hs=new HashMap<>();
       
       /*for(int i=0;i<words.length;i++)    //this for loop method is not applicable here because here we can't calculate l of the word 
       { int l=s.length        // here error= we can't calculate length of a variable 
         hs.put(words[i],l);
       }*/
       
       for(String s:words)
       {
        int l=s.length();
        hs.put(s,l);
       
       }
     int vv=  Collections.max(hs.values());
       for(Map.Entry<String,Integer>ent:hs.entrySet())
       {
          if(ent.getValue()==vv)
         System.out.println(ent.getKey()+"   "+vv);
       }
       
       
       
       // approach 2
       
       /*
       
       String str=sc.nextLine(); //radhika is gone
       String words[]=str.split(" "); //radhika    //is    //gone
       int max=0;
       for(int i=0;i<words.length();i++)
       {
       max=Math.max(max,words[i].length());
       }
       System.out.println(max);
       */
    }
}
