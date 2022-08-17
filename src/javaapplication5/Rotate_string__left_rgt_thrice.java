
package javaapplication5;

import java.util.Scanner;


public class Rotate_string__left_rgt_thrice {
   
       Rotate_string__left_rgt_thrice ()
       {
  
       Scanner sc=new Scanner(System.in);
      
       System.out.println("enter string for rgt rotation");  //abcdefg    gfeabcd
       String str=sc.nextLine();
       int size=str.length();          // 7
       char []c=str.toCharArray();//['a','b'-----]
       
       
       
  // 3 rgt rotation-----------------------------------------------------------------------
       for (int rot=0;rot<3;rot++)   //here we have to tell that we have to shift or rotate  a chr how many times like we have to rotate a strng by 3 positions rgt
       {
       char last=c[size-1];
       for(int i=size-1;i>0;i--) //// here we r stating with last chr i.e. i=n-1 because we have to rotate a strng in rgt direction
       {
       c[i]=c[i-1];  
       }
       c[0]=last;
       }
       StringBuffer sb=new StringBuffer();
       for(char p:c)
       {
           sb.append(p);
      
       }
        System.out.println("after rotation of strng by 3 rgt  positions = "+sb);
        
       
  // 2 left rotation--------------------------------------------------------------
      System.out.println("enten string for left rotation");  //abcdefg    gfeabcd
       String str1=sc.nextLine();
       int size1=str1.length();          // 7
       char []ca=str1.toCharArray();//['a','b'-----]
       
      for(int rot=0;rot<=1;rot++)
      {
      char first=ca[0];
      for(int i=0;i<size1-1;i++) // don't use = sign here otherwise  c[size]=c[size+1]  is not possible
      {
        ca[i]=ca[i+1]; 
      }
      ca[size-1]=first;
      
      } 
       
       StringBuffer sb1=new StringBuffer();
       for(char x:ca)
       {
           sb1.append(x);
      
       }
        System.out.println("after rotation of strng by 2 left  positions = "+sb1);
       } 
       
     //-------------------------------------------------------------------  
     public static void main(String[] args) {
       Rotate_string__left_rgt_thrice r=new Rotate_string__left_rgt_thrice();
    }
 
     
}
