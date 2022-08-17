
package Matricies;
import java.util.*;

public class dialgonally_traversal {
   public static void main(String args[]){
   
       Scanner sc=new Scanner(System.in);
       System.out.println("enetr rows size ");
       int m=sc.nextInt();
       System.out.println("enetr cols size ");
       int n=sc.nextInt();
         int arr[][]=new int[m][n];
           System.out.println("enter " +m*n+ " elements");  
    for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
       {
       arr[i][j]=sc.nextInt();
       
       }
    
    }
    //keeping kew starting pts while traversing matrix diagonally is that few are starting from 1st col and few are starting from last rows
    
    for(int k=0;k<=m-1;k++)
    {
    int i=k,j=0;
    while(i>=0)
    {
       System.out.print(arr[i][j]+" ");
        i=i-1;
        j=j+1;
    }
    System.out.println("");
    }
    
    for(int k=1;k<=n-1;k++)
    {
       int i=m-1,j=k;
       while(j<=n-1)
       {
           System.out.print(arr[i][j]+" ");
           i=i-1;
           j=j+1;
       
       }
       System.out.println("");
    }
    
   } 
}
