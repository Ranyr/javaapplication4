import java.util.*;
//program to find digits occuring max no. of times
//if 5 occurs 3 times, as well as 4 ocuurs 3 times ,so output should be an highest number=5
public class Morefrequent_digit_from_fourstrngs 
{
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("plz enter 4 differnt numbers to check whick number is occuring more times");
   System.out.println(" if more than one digits occurs more time than,out of those digits maximum digit will be returned");
   
  int i1=sc.nextInt(); //take 4 inputs from user
  int i2=sc.nextInt();
  int i3=sc.nextInt();
  int i4=sc.nextInt();
   
   int a[]=new int[10]; //create an array(0---9)
    int r,max,x=0;
   
   do{     //153                  15                     1
   r=i1%10;    //r=3             r=5                   r=1
   a[r]++;     //a[3]=1          a[5]=1                a[1]=1
   i1=i1/10;    //15             1                      0      
  }while(i1!=0);
   
     do{        //532              53                    5
   r=i2%10;      //r=2            r=3                    r=5
   a[r]++;        //a[2]=1        a[3]=2                 a[5]=2
   i2=i2/10;      //53             5                     /5/10=0(ques)
  }while(i2!=0);
     
       do{
   r=i3%10;
   a[r]++;
   i3=i3/10;
  }while(i3!=0);
       
       
         do{
   r=i4%10;
   a[r]++;
   i4=i4/10;
  }while(i4!=0);
   
         
         max=a[0];
         for(int i=0;i<10;i++)
         {
         if(a[i]>=max)
         {
         max=a[i];
         x=i;
         }
         }
      System.out.println(x);   
}
}