
package Matricies;

import java.util.*;
public class Rotate_90_inplace {
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
       rotate(arr,n);
     System.out.println("matrix after 90 degree in place rotation");
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
             System.out.print(arr[i][j]+" ");
          }
        System.out.println("");
        }
       
}
     
     private static void rotate(int [][]arr,int n){
     
     transpose(arr);
    reverserow(arr,n);
     
     }
     private static void transpose(int [][]arr)
     { 
        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<i;j++)  ////////////////////////////////////////////////
           {
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
           }
        }
        
     }
     private static void reverserow(int [][]arr,int n){
     
     for(int i=0;i<arr.length;i++)
     {
        for(int j=0;j<n/2;j++)
        {
            int temp=arr[i][j];
            arr[i][j]=arr[i][n-j-1];
            arr[i][n-j-1]=temp;
        }
     
     }
     
     
     }
    /* private static void reverserow(int [][]arr)
     {
        for(int r=0;r<arr.length;r++)
        {
          int left=0;
          int right=arr.length-1;
          while(left<right)
          {
         int  temp=arr[r][left];
          arr[r][left]=arr[r][right];
          arr[r][right]=temp;
          
          left++;
          right--;
          }
        }*/
       
     
     }
     
     
