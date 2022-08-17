
package javaapplication5;
import java.util.*;
import java.lang.Math.*;
public class max_substring {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
       String str=sc.nextLine();
       StringBuffer bf=new StringBuffer();
       for(int i=0;i<str.length();i++)
       {
          char ch=str.charAt(i);
          if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
          {
          
             bf.append(str.replace(ch,'*'));
          
          }
       }
       System.out.println("output : "+bf);
  //  System.out.println("longest substring = "+longest(str));
   
   
   } 
  /* public static  String longest(String st)
   {
      HashSet <Character> hs=new HashSet<>(); 
       String longestoverall="";
       String longesttillnow="";
       for(int i=0;i<st.length();i++)
       {
           char c=st.charAt(i);
           if(hs.contains(c))
           {
            longesttillnow="";
            hs.clear();  
           }
          longesttillnow=longesttillnow+c;
          hs.add(c);
          
          
          if(longesttillnow.length()>longestoverall.length()){
          longestoverall=longesttillnow;
          
          }
       }
       return longestoverall;}   */
}
