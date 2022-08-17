import java.util.*;
public class Cons_vowels_ignore_vowels {
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter string");
  String input1=sc.nextLine(); // hello world
  System.out.println("press 0 to ignore vowels,press 1 ");
  int input2=sc.nextInt();    //if user enters 0-ignore vowels,  if user enters 1-count  sum of vowels also
  input1=input1.toUpperCase();   //as condition is given in ques to consider all the alphabets in uppercase
  int sum=0;        
  if(input2==0)         //as user enterd 2nd input as zero it means instead of considering values of vowels, take vowels as zero,zero     
  {
      System.out.println("sum of index values of consonents");
  for(int i=0;i<input1.length();i++)
  {
  if(input1.charAt(i)>='A'&&input1.charAt(i)<='z')
  {  if(input1.charAt(i)=='A'||input1.charAt(i)=='E'||input1.charAt(i)=='I'||input1.charAt(i)=='O'||input1.charAt(i)=='U')           
            {
                sum=sum+0; //if user enetered any vowel then instead of taking its own value like a(65) consider 0               
            }
  else     
  {
      sum=sum+input1.charAt(i)-'A'+1;  //65-65+1=1(A)
  }
    
  }
  }
System.out.println("sum = "+sum);  
}
  
  else if(input2==1)
  {   //if input2==1 means here we also have to count vowels(A=65)in sum
  
   System.out.println("sum of indexes of vowels+ consonents");
  for(int i=0;i<input1.length();i++)
  { sum=sum+input1.charAt(i)-'A'+1;} //  sum=0+(65-65+1)=1                
  
  System.out.println("sum = "+sum);
  
  } 
  
  
  
  
  
  
  
  
  }
}