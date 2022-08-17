

package Matricies;

import java.util.*;
public class Add_sub_within_1_matrix {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter matrix size n = ");
     int n=sc.nextInt();
     System.out.println("enter matrix elements");
     int arr[][]=new int[n][n]; 
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
           arr[i][j]=sc.nextInt();
   
        }
     
     }
     System.out.println("print  matrix ");
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n;j++)
         {
          
         System.out.print(arr[i][j]+" ");
         
         }
         System.out.println(""); //println is used for enetering in next line after completing one row
     
     }
    int su= sum(arr);
    System.out.println("sum of elements present in matrix = "+su);
   int sb=sub(arr);
     System.out.println("addition of subtraction of rows of a matrix   = "+sb);
    }
    private static int sum(int arr[][])
    {
    
    int s=0,n=arr[0].length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {s=s+arr[i][j];}  
    }
    return s ;
    }
    
    private static int  sub(int arr[][])
    {  
     int n=arr[0].length,sb=0;
     for(int i=0;i<n;i++)
     {
      for(int j=0;j<n;j++)
      {
         sb=arr[i][j]-sb;     
      }
     
     }
    
    return sb;
    }
    
}
