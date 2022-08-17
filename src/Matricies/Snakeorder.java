
package Matricies;

import java.util.*;
public class Snakeorder {
    
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n");
       int n=sc.nextInt();
       int arr[][]=new int[n][n];
       System.out.println("enter matrix elements");
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
              arr[i][j]=sc.nextInt();
           
           }
       }
       
       System.out.println(" print matrix in snake order");
       for(int i=0;i<n;i++)
       {
          if(i%2==0)
          {
             for(int j=0;j<n;j++)
             {
                System.out.print(arr[i][j]+" ");
             }
          System.out.println("");
          }
          else
          {
            for(int j=n-1;j>=0;j--)
            {
             System.out.print(arr[i][j]+" ");
            
            }
             System.out.println("");
          }
       
       }
    }
    
}
