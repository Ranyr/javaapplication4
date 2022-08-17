
package Matricies;
import java.util.*;
import java.lang.Math.*;
public class Two_matrix_opr {
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter matrix size n = ");
     int n=sc.nextInt();
     System.out.println("enter 1  matrix elements");
     int arr[][]=new int[n][n]; 
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
           arr[i][j]=sc.nextInt();
   
        }
     
     }
   System.out.println("enter 2  matrix elements");
  int arrs[][]=new int[n][n];
  for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
           arrs[i][j]=sc.nextInt();
   
        }
     
     }
  
  
  
  sum(arr,arrs);
 
 sub(arr,arrs);
 
 //mutiplication program statrs --------------------------------------------------------------------
  System.out.println("enter r1,c1,r2,c2 for multiplication of matrices:");
  int r1=sc.nextInt();
    int c1=sc.nextInt();
      int r2=sc.nextInt();
        int c2=sc.nextInt();
 

   if(c2==r1)
   {     
       int c[][]=new int [r1][c1];
       int d[][]=new int[r2][c2];
        int res[][]=new int [r1][c2];
        
        System.out.println("enter 1 matrix ");
        for(int i=0;i<r1;i++)
        {
        for(int j=0;j<c1;j++)
        {
        c[i][j]=sc.nextInt();
        }
        
        }
        System.out.println("enter 2 matrix ");
        for(int i=0;i<r2;i++)
        {
        for(int j=0;j<c2;j++)
        {
        d[i][j]=sc.nextInt();
        }
        
        }
     //multiplication of matrix logic   
   for(int i=0;i<r1;i++)
   {
      for(int j=0;j<c2;j++) 
      {  
          int sum=0;
         for(int k=0;k<r2;k++)   // k<r1 or k<c2
         {
           sum=sum+c[i][k]*d[k][j]; 
         }
        res[i][j]=sum;
      
      }
   
   }
   System.out.println(" after multiplication");
   for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c2;j++)
     {
      System.out.print(c[i][j]+" ");
     
     }
    System.out.println("");
  }
   }
   
   else{
   
   System.out.println("multiplication not possible");
   
   
   }
  }
   private static void sum(int arr[][],int arrs[][])
 {   
      System.out.println("after addition of 2 matrices");
      int n=arr[0].length, s=0;
      int c[][]=new int[n][n];
     for(int i=0;i<n;i++)
     {
       for(int j=0;j<n;j++)
       {
       c[i][j]=c[i][j]+arr[i][j]+arrs[i][j];
       
       }
     
     }
     for(int i=0;i<n;i++)
     {
     for(int j=0;j<n;j++)
     {
      System.out.print(c[i][j]+" ");
     
     
     }
     System.out.println("");
     }
    
 }
   
   private static void sub(int arr[][],int arrs[][])
   {  
        System.out.println("after subtraction of 2 matrices");
    int sb=0,n=arr[0].length;
    int c[][]=new int[n][n];
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     { 
       c[i][j]=c[i][j]+arr[i][j]-arrs[i][j];
     }
  
   }
   
   for(int i=0;i<n;i++)
   {
   for(int j=0;j<n;j++)
   {
     System.out.print(c[i][j]+" ") ; 
   }
    System.out.println("");
   }
    
 
   }
   
   
   
   
   }
          

