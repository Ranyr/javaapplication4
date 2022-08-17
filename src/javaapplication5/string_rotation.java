
package javaapplication5;

import java.util.Scanner;

//is STRING ENTERED BY USER is a ROTATION OF ANOTHER STRING OR NOT
public class string_rotation {
 
    public static void main(String args[]){
    
    string_rotation rt=new string_rotation();
    
    }
    
    string_rotation(){
        
       Scanner sc=new Scanner(System.in);
      
       System.out.println("enten original string");
       String orgstr=sc.nextLine();
       System.out.println("enten chck string ");
       String chkstr=sc.nextLine();
        System.out.println("enter another chck string ");
       String chkstr1=sc.nextLine();
       
       String newstr=orgstr.concat(orgstr);
        if((newstr.contains(chkstr))&&(newstr.contains(chkstr1)))
        {
        System.out.println(" yes both chckstrngs are rotations of original string");
        
        }
        else
        {
         System.out.println("no rotation");
        }
    
    }
}
