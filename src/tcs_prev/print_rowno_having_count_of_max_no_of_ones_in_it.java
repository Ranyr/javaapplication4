
package tcs_prev;

import java.util.*;
public class print_rowno_having_count_of_max_no_of_ones_in_it {
  public static void main(String args[]) 
  {
   Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();
  int arr[][]=new int[n][n];

   for(int i=0;i<n;i++)
   {    
     for(int j=0;j<n;j++)
     {
       arr[i][j]=sc.nextInt();
     
     }
   }
   int row_no=0,max=0;
   for(int i=0;i<n;i++)
   {   int count=0;
      for(int j=0;j<n;j++)
      {
         if(arr[i][j]==1) 
           count++;
         if(count>max)
         {
             max=count;
             row_no=i+1;
         }
      }
   
   }
   System.out.print(row_no);
   
   
   
  }
}
