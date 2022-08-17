
package javaapplication5;
import java.util.*;
//take any number from user,add that number into its reverse and check whether result is same as num,if no then repeat then repeat this process until we get our required result
public class Complex_palandrome {
    
    public static void main(String args[])
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter number");   //123
    
    int num=scan.nextInt();
    while(true)
    {
         num=num+reverse(num);   // 123+321=444            444+444=888       888+888=1776
         if(ispalindrome(num))   ///444 == 123  nooooo    888==444  nooo     1776==888 noooo
         {System.out.println("number is = "+num); break;}
         
    }
   }  
     
    public static int reverse(int num)
    {
        
    StringBuilder sb=new  StringBuilder(Integer.toString(num));
    sb.reverse();
    return Integer.parseInt(sb.toString()); //sb is converted into string then string is coverted into int
    }
    
    public static boolean ispalindrome(int num){
    return num==reverse(num);
    
    }
   
}
