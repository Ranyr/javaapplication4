
package Matricies;
import java.util.*;

public class Upper_rgtmatrix_diagonal_traversal {
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter matrix size n = ");
     int n=sc.nextInt();
     System.out.println("enter  matrix elements");
     int arr[][]=new int[n][n]; 
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
           arr[i][j]=sc.nextInt();
   
        }
     
     }
    //logic///////////////////////////////////////////

    for(int gap=0;gap<arr.length;gap++)
    {
         for(int i=0,j=gap;j<arr.length;i++,j++)
         {
              System.out.println(arr[i][j]+" ");
         
         }
       System.out.println("");
    }
  }
}
