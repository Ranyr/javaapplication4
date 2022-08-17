
package tcs_prev;
import java.util.*;
public class mysterious_tcs15set_slot1 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n"); //enter any no=12345
       int n=sc.nextInt();
       System.out.println("enter r");// r=2, r = no.of this u want to print the sum of digits of a number n
       int r=sc.nextInt();
      
       if(r==0)
       {System.out.println("0");}
       else
       {
         int res=sumofdigits(n)*r;//12345=15*2=30   //123456=21*9=189
         int sum=0;
     while(true)
     {
         while(res>0) //30>0                            189>0               18>0          1>0           18>0          1>0
         {
          sum=sum+res%10;  //0+3=3                     sum=0+9=9         sum=9+8=17      sum=17+1=18   sum=0+8      sum=8+1=9
          res=res/10;     //res=3/10=0                 res= 189/10=18     res=18/10=1    res=1/10=0    res=18/10=1  res=1/10=0
         }
          if((sum/10)==0)  //  3/10==0                 18/10=1                                                        9/10==0 
                break;                                                                                                //break
          else
               res=sum;                                 //res= 18(sum)     

     } 
     System.out.println(sum);  //3                                                                                    //sum=9    
       }
    }
    
    public static int sumofdigits(int n)
    {
      int sum=0;
    while(n>0)
    {
     int rem=n%10;
     sum=sum+rem;
     n=n/10;
    }
    return sum;
    }      
}
