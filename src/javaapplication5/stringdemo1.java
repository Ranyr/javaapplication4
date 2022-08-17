 
package javaapplication5;


public class stringdemo1 {
    public static void main(String args[]){
    String s="radhu bhuaaaa";
    String s1="is raDhuis";
    String s2="Getuu";
     char ch1='a';
     char ch2='a';
     char ch3='c';
     char ch4='d';
    
     System.out.println("s= "+s);
     System.out.println("s1= "+s1);
     System.out.println("s2= "+s2);
     
     System.out.println("length method");   //returns integer value
     System.out.println(s.length());
    System.out.println(s.isEmpty());    //returns boolean  (!s.isEmpty();)
    System.out.println(s.trim()); //it will remove spaces before and after the strng,in b/w spaces willn't be removed ------ returns string 
 
     System.out.println("character compare");
     int x= Character.compare(ch1,ch2);  ///////////////////////////////////////////////////////////
     System.out.println("a=a   "+x);     //when both chrs are equal output will be=0
     
     int x1=Character.compare(ch2,ch3);
     System.out.println("a<c =  "+x1); //here first_char<second_char hence o/p= 1-3= -2(differnce between two chrsor strings)
     
     int x2=Character.compare(ch4, ch3);   //here fist_chr>secondchr hence o/p= 1
     System.out.println("d>c  = "+x2);
     
    System.out.println(" string compare");//**********************string compAre methods**********
 
    System.out.println(s2.equals(s1));  //method  equals returns boolean 
     System.out.println("compare methods"); //is also used to compre two chrs ,it return=0 if two chrs are equal
     System.out.println("compare string s=s1, compareToIgnoreCase=  "+s.compareToIgnoreCase(s1));
     System.out.println(String.join("...",s,s1,s2));
      System.out.println(" 1---7 subsequence= "+s.subSequence(1,7)); //output is in the form char sequence
      System.out.println("1 to 7 substring=  "+s.substring(1,7));     //output is in the form of string
      System.out.println(" here only beging index is mentioned ,start getting  substring from 5= "+s.substring(5));      //return from 5th  chr till end
       System.out.println("s==s1      "+s.compareTo(s1));//it will give difference in two strings if these two strings are not equal
              
              
       System.out.println("replacement methods");//-------------------------------------------------------------------------------
      System.out.println(s.replace("u","ika"));   //u is replaced with ika
      System.out.println(s.replaceFirst("aa","m")); //aa is replaced with m
      System.out.println(s.replaceAll("aa","m"));
      s.replaceAll("[aeious]","*");//remember to use[] for replacing all vowels
      System.out.println(s1.replaceAll("is(.)","m")); //only first "is" will be replaced by "m" internal spaces are deleted
      System.out.println(s.replaceAll("aa(.*)","m"));  // all "aa" will be replaced by "m"
      
      System.out.println("searching methods");
       System.out.println(s2.indexOf("u"));   //-1 if u doesnot exist in the string ,otherwise index of u will return
            System.out.println(s2.lastIndexOf("u"));
     
      System.out.println(s2.toUpperCase());
      System.out.println("string to character conversion");
      
      char cx[]=s1.toCharArray(); //space is also considered as charcter
      for(int i=0;i<cx.length;i++)  
      {System.out.println(cx[i]);}
     
}
}