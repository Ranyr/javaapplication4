
package tcs_prev;
import java.util.*;

public class Count_no_of_elements_greater_than_itsall_previous_elements_12sep_slot2 {
    public static void main(String args[])
    {   // 56 67 54 34 here count=2(as no num present behind 56 hence 56 is greater than its previous num)
        // 67 is greater then its itsm previous num(56) 
        Scanner sc=new Scanner(System.in);
       System.out.println("enter array size");
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       for(int i=0;i<n;i++)
       {arr[i]=sc.nextInt();}
       
       int max= Integer.MIN_VALUE;
      
       int count=0;
       
       for(int i=0;i<n;i++)
       {
          if(arr[i]>max)
          {
              max=arr[i];
              count++;
          }
       }
       System.out.println("count= "+count);
    }
    
    
}