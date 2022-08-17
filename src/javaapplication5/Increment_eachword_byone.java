
package javaapplication5;
import java.util.*;

public class Increment_eachword_byone {
   
    public static void main(String args[]){
        
        Scanner scan=new Scanner (System.in);
        System.out.println("enter string");
        String str=scan.nextLine();
        System.out.println("enter how many chrs u want to shift");
        int n=scan.nextInt();
         shift(str,n);
        
   }
    
  public static void shift(String str,int n ){  // abc,1
   int l=str.length();    //l=3
   
  char ch[]=str.toCharArray();
  char arr[]=new char[l];   //new array in which we want to store the elements
  StringBuilder sb=new StringBuilder();
   for(int i=0;i<l;i++)
   {
       
    
      if(  (str.charAt(i)>=65)&&(str.charAt(i)<=90)   )
        {  
           int index= str.charAt(i)+n;    //89+1=90    A--------B      90+1=91      Z--------A  
           char c;
           
           if(index<=90)      //index=90
           {   c=(char)index; //c=90 
                 //arr[i]=c;   
                 sb.append(c);
           }
           
           else{         //index=91                     
           
           int change=index-90; //91-90=1
           int ind=65+(change-1); //65+0=65
           c=(char)ind;   // c=A
           //arr[i]=c;     // arr[i]=A
           sb.append(c);
             }
                  
        } 
      else if( (str.charAt(i)>=97)&&(str.charAt(i)<=122)  )
      {
       
          int index= str.charAt(i)+n;
          char c;
               if (index<=122)
                { 
                     c=(char)index;
                     //arr[i]=c;    //arr[i]=y
                     sb.append(c);
      
                }
               else{         //index=91                     
           
                int change=index-122; //123-122=1
                int ind=97+(change-1); //97+0=97
                c=(char)ind;   // c=a
               // arr[i]=c;     // arr[i]=a
               sb.append(c);
             }
       
   }
      else{
      
         sb.append(str.charAt(i));
      
      }
  
  }
   System.out.println("string after changes is");
      
   System.out.println(sb);
   
}

}