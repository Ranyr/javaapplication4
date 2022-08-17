
package javaapplication5;
import java.util.*;
import java.lang.Math ;//////////////////////////import this package to use impliment maths fun///////////////////////
public class Angstrome {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num to find its agstrome");
    int num=sc.nextInt();  //153
    int temp=num;
    String s=Integer.toString(num);   //153  as a string
   // String s1=String.valueOf(num);
    int n=s.length();
    double sum=0,rem=0;
    while(num>0)
    {
    rem=num%10;
    //double p=Math.pow(rem,n); 
    sum=sum+Math.pow(rem,n);
    num=num/10;
       /*int mul=1;
       for(int k=1;k<=n;k++)  //aproach 2 without using Math.pow()
        {mul=mul*rem;}
        sum=sum+mul;
        num=num/10;
        */ 
    } 
   int sum1=(int)sum;
  // for(int i=0;i<n;i++){  sum=sum+Math.pow(s.charAt(i),n); }
    System.out.println("sum is"+sum1);
    if(temp==sum1)
    {System.out.println("yes  "+temp+"argstrome");}
    else
    {System.out.println("no "+temp +" is not argstrome");}
    }
}
