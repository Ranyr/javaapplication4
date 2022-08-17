import java.util.*;
public class concat_sumopr {
    
   public static void main(String args[])
   {
   concat_sumopr c=new concat_sumopr();
   } 
   
   concat_sumopr()
   { 
       Scanner scan=new Scanner(System.in);
           
       System.out.println("enter string separated by commas  ");
       String s=scan.nextLine();         // 3,2,6,   5,1,4,8,     10
       String str[]=s.split(",");
       int n=str.length;
       int numbers[]= new int[n];
       int id5=0,id8=0,num1=0,num2=0;    //id8=4 8     id5=15
  /* for(String sp:str){
   System.out.print(sp);      //32661489
   
   } */ 
 
  for(int i=0;i<n;i++){
       numbers[i]=Integer.parseInt(str[i]);
      if(numbers[i]==5)
      {id5=i;       System.out.println("id5 is at index="+id5);}
      if(numbers[i]==8)
      {id8=i;  System.out.println("id8 is at index="+id8);}
   }
  for(int i=0;i<n;i++)
   {
      if(i>=id5 && i<=id8)    //5 1 4 8
      {
      num1=num1*10+numbers[i];  // 0+5=5     // 5*10+1=51(num2)  //51*10+4=514  //514*10+8=5148(num 1)
      
      }
      else{
         num2=num2+numbers[i]; //all elements before 5 ----0+3=3  3+2=5  5+6=11 after 8 we have  11+10=21 (num 2) 
      
      }
 
   }
  System.out.println("num1="+num1);
   System.out.println("num2="+num2);
  System.out.println("num1+num2= "+(int)(num1+num2));
  
}
   
}