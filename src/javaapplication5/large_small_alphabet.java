
package javaapplication5;
import java.util.*;
public class large_small_alphabet {
    public static void main(String args[])
    {
       large_small_alphabet k=new large_small_alphabet(); 
  
    }
    
   static char maximum(String st,int l)
    {
    char max='A';            //consider smaller one as max
       for(int i=0;i<l;i++)
       {
             if(st.charAt(i)>max)
                max=st.charAt(i);

        }
        return max;
    }
    static char minimum(String st,int lp){
        char min='z';       //consider higher one as min
        for(int i=0;i<lp;i++){
          if(st.charAt(i)<min)
          { min=st.charAt(i);}
        
        }
      
       return min;
    }
    large_small_alphabet()
    {
          
       Scanner sc=new Scanner(System.in);
      
       System.out.println("enten string");
       String str=sc.nextLine();
       String str1=  str.replace(" ","");
       int ln=str1.length();
     
      System.out.println("max chr is = "+maximum(str1,ln));
      System.out.println("min char is = "+minimum(str1,ln)); 
    
    }
    
    
}
