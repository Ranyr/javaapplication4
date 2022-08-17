
package patterns;
import java.util.*;

public class soucefuse {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter n :");
      int n=sc.nextInt();
                             //32*
                             //3*1
                             //*21 
      for(int i=1;i<=n;i++)  
       {
        for(int j=n;j>=1;j--)
        {
           if(j!=i)
            System.out.print(j); 
           else
               System.out.print("*");
        }
        System.out.println(" ");
       }
   
   
   
   
   
   
   } 
}
