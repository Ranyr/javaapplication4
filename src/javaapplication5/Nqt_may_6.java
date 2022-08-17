
package javaapplication5;
import java.util.*;
import java.lang.Math;

public class Nqt_may_6 {
  
   public static void main(String args[])
   { 
   Scanner sc=new Scanner(System.in);
 /*  
//program 1----reaarange two strings if two strings are equal then print 1 otherwise 0  
   String str1=sc.nextLine();
   String str2=sc.nextLine();
   
   char ch1[]=str1.toCharArray();
   char ch2[]=str2.toCharArray();
   
  Arrays.sort(ch1);
   Arrays.sort(ch2);
   
//plz remember-------converting char[ ]-------into--------------- string-----------String.valueOf()method is used------------   
   String s3=String.valueOf(ch1);
   String s4=String.valueOf(ch2);
   
   if(s3.equals(s4))
   {
   System.out.println("s3= "+s3);
   System.out.println("s4= "+s4);
   System.out.println("1");
   }
   else
   {System.out.println("0");}   */
 
 
 
 System.out.println("enter string");
 //program 2----------if fistchar=lastchar then count occurence of a given chr .else print 0. i/p=strng,chr 0/p=either count or 0  
 String str=sc.nextLine();
 System.out.println("enter chr");
 char ch=sc.next().charAt(0);
 int N=str.length();
 if((N>=2)&&(N<=100))
   { 
       String s3="";
       String s4="";
     
   for(int i=0;i<N;i++)  
     { char ch1=str.charAt(0);  //first chr in str 
       char ch2=str.charAt(N-1);//last chr in strng
       //if(Character.compare(ch1,ch2)==0){check(str,ch);}
     ///plz remember the  concept to convert char----------into-----------string
        s3=Character.toString(ch1); //here  String s3=s1.toCharArray()is wrong
        s4=Character.toString(ch2);
     }
       if(s3.equals(s4)){
       check(str,ch);
       
       }
       else{System.out.println("0");}
     
     
   }
  
   }

public static void check(String str,char ch){    //rember how to declare function
int count=0;
for(int i=0;i<str.length();i++){
char c=str.charAt(i);
//plz remember concept------how to compare------two chars------Character.compare(ch1,ch2)
int x=Character.compare(c, ch); //it will return=0 (if both of these 2 chrs are same),-ve=if 2nd strng is larger , +ve=if ist string is larger
//System.out.println("x="+x);
if(x==0)
{  count++;      }

}
System.out.println("count = "+count);

}   
}