
package javaapplication5;

import java.util.Scanner;



public class display_all_categories_separetely {
    int character=0;
    int sp=0;
    int digits=0;
    display_all_categories_separetely()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enten string");
       String str=sc.nextLine();
     //  char ch[]=str.toCharArray();  no need to write this line
       
       StringBuffer chars=new StringBuffer();
        StringBuffer dgts=new StringBuffer();
         StringBuffer spec=new StringBuffer();
       
     for(int i=0;i<str.length();i++)
     {
     if( ((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z')) )
             {
                 chars.append(str.charAt(i));          
                 character++;
             }
     else if((str.charAt(i)>='0')&&(str.charAt(i)<='9'))
     {
          dgts.append(str.charAt(i));
          digits++;
     }  
     else{
      spec.append(str.charAt(i));
          sp++;
     
     }
    
    }
      System.out.println("charcters is"+chars);
       System.out.println("digits is"+dgts);
        System.out.println("special chrs are"+spec);
      System.out.println("no. of characters is = "+character);
       System.out.println("no. of digits is = "+digits);
       System.out.println("no. of special characters is = "+sp);
    }
      
     
public static void main(String args[])
        {
         display_all_categories_separetely d=new display_all_categories_separetely();
        }
}
