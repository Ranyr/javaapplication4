
package javaapplication5;
import java.util.*;

public class Strrotatedemo {
    Scanner sc=new Scanner(System.in);
    //input and spliting strng from comma
    Strrotatedemo (){
         System.out.println("enter string");
         String str[]=sc.nextLine().split(",");  // str[0]=infyt:123      ,  str[1]=radhu:234
        for(String obj:str)   //infyt:123    //case2 radhu:234  
        {
           String ar[]=obj.split(":"); // word=infyt       number=234  
           String s=ar[0];   // it means s=infyt 
           int number=Integer.parseInt(ar[1]);  //number=123
            int digitsqsum=0;
 //sum of square of digits-------------------------------------------------------------------------------------
           while(number!=0){                //123%10             12%10          1%10           0!=0(false)hence loop break
           int rem=number%10;               //rem=3              rem=2          rem=1
           digitsqsum=digitsqsum+(rem*rem); //0+(3*3)=9,         9+4=13,        13+1=14
           number=number/10;                // 123/10=12(que)   12/10=1(q)     1/10=0 
           }
           System.out.println("sum of sq "+digitsqsum);
           if(digitsqsum%2==0)
           {
            System.out.println(digitsqsum +"is even");
            rotateleft(s);
           }
           else
           {
               System.out.println(digitsqsum +"is odd");
               rotateright(s);
           }
        }
     
    
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    public void rotateleft(String ab)
    {
          
         
          
          int size=ab.length(); //size=5
          char ch[]=ab.toCharArray(); 
          for(int rot=1;rot<=2;rot++)
          {     char first=ch[0];
               for(int i=0;i<size-1;i++)  //don't use = sign here  size-1=4  i<4 means 
                   {
                           ch[i]=ch[i+1]; 
                   }
               ch[size-1]=first;   //ch[4]=first
          }
        //printing strng after rotation-------------------  
     StringBuffer sb=new StringBuffer();
      for(char x:ch)
      {
         sb.append(x);
      
      }
      System.out.println("after 2 left rotation of string is = "+sb);
  }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void rotateright(String vv)
    {
       int sizee=vv.length();          // 7
       char []c=vv.toCharArray();
       
      for (int rot=0;rot<2;rot++)   //here we have to tell that we have to shift or rotate  a chr how many times like we have to rotate a strng by 3 positions rgt
       {
       char last=c[sizee-1];
       for(int i=sizee-1;i>0;i--)    //// here we r stating with last chr i.e. i=n-1 because we have to rotate a strng in rgt direction
       {
       c[i]=c[i-1];  
       }
       c[0]=last;
       }
       StringBuffer sbb=new StringBuffer();
       for(char p:c)
       {
           sbb.append(p);
      
       }
        System.out.println("after rotation of strng by 3 rgt  positions = "+sbb);
    }

    
   //////////////////////////main method--------------------------------------------- 
 public static void main(String args[]){    
     Strrotatedemo l=new Strrotatedemo();   
 }}
