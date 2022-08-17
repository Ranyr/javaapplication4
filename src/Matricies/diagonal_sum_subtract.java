
package Matricies;

import java.util.Scanner;


public class diagonal_sum_subtract {
     public static void main(String args[]){
 
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
       
       System.out.println(" print subtaction of sum of diagonals matrix ");
         int sum1=0,sum2=0,sum=0;
       
        /*  for(int i=0;i<n;i++)
          {
             for(int j=0;j<n;j++)    //this logic will count center cell only once
             {          
                if(i==j)
                {sum1=sum1+arr[i][j];}
                else if((i+j)==(n-1))
                { sum2=sum2+arr[i][j]; }
             }
          
          }*/
        
         for(int i=0;i<n;i++){
        sum1 =sum1+arr[i][i];
         }
        
        for(int i=0;i<n;i++){
        sum2=sum2+arr[i][n-1-i];
        }
        
          System.out.println("sum1 = "+sum1);
          System.out.println("sum2 = "+sum2);
          
           sum=sum1-sum2;
           int s=Math.abs(sum);
       
      
        System.out.println("sum = "+s);
       
       }
         
}
