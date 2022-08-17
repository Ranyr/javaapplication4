
package javaapplication5;
//-------------------------TCS  NINJA----------------------------------------------------------------------
       //1- Character.isUpperCase(str.charAt(i)) returns booleean value
       //2- Character.isLowerCase()
       //3- Character.isLetter('h'); ---true    5,6----false                    
       //4- Character.isDigit('5');---true      a,b,c---false                                      
       //5- Character.isWhitespace('\t');--true
       //6- Character.toLowerCase('G');---false
       //7- Character.toUpperCase('A');---true
       //8- Character.toString('S');
import java.util.*;
import java.lang.*;
public class Coversions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 different strings");
    //char input
  //  char c1=sc.next().charAt(0); 
   //char c2=sc.next().charAt(0);
   System.out.println(" enter string 1");
       String s1= sc.next();
       char c1[]=s1.toCharArray();
   System.out.println("enter string 2");
       String s2= sc.next();
       char c2[]=s2.toCharArray();  
   System.out.println(" enter string 3");
       String s3= sc.next();  
       
      char abc[]=s3.toCharArray();
    System.out.println(" enter UPPERCASE_string 4");
       String s4= sc.next();
       char c4[]=s4.toCharArray();   
       
   System.out.println("after changes in s1 ");
    //replace vowels present in the string with *---------------------------------------
        for(int i=0;i<c1.length;i++)
        { 
           if(c1[i]=='a'|| c1[i]=='e' || c1[i]=='i' || c1[i]=='o' || c1[i]=='u')
           c1[i]='*';
        }

    //printing 1 string after changes
        for(char xyz:c1){
             System.out.println(xyz);
            }
     //------------------------------------------------------------------------------------------   
     System.out.println("after changes in s2 ");   
     for(int p=0;p<c2.length;p++){
        if(c2[p]=='a' || c2[p]=='e' || c2[p]=='i' || c2[p]=='o' || c2[p]=='u')
             c2[p]='+';
        }
        for(char uwy:c2){
        System.out.println(uwy);
        }
      //search for lowercase character in strng and convert it into uppercase string in string s3 ------------------------------------
       System.out.println("after changes in s3");
          for(int a=0;a<abc.length;a++)
        {   //a=97,z=122      A=65,Z=91
            if(abc[a] >= 97 && abc[a]<=122 )  
            {    abc[a]-= 32;}  //her we converting  a-------to-----------A ,c--------C
           
        } 
            for(char c:abc){
             System.out.print(c);
            }  
      /*
          for(int i=0;i<s3.length();i++)
       {
            if(Character.isLowerCase(s3.charAt(i)))
            {
            
            System.out.println(s3.charAt(i)+" =yes");
             System.out.println( Character.toUpperCase(s3.charAt(i)));
           
            }
            else{
          
              System.out.println("no its already in upper case "+s3.charAt(i) );
            }
       
       } 
         
     */
            
      //convert UPPERCASE chrs into LOWERCASE chrs 
         System.out.println("");
         System.out.println("after changes in s4"); 
         for(int x=0; x<s4.length(); x++)
         {  if(c4[x]>=65 && c4[x]<=90) 
              { c4[x]+=32;        }
             
         }
         for(char c44:c4){
          System.out.print(c44);
         }   
    }
}
