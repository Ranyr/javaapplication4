
package javaapplication5;
import java.util.*;

public class Make_whole_rowl_matrix_zero {
   
    public static int[][]setrowzero(int matrix[][],int n)
    {
    boolean zerrows[]=new boolean[n];
     boolean zercols[]=new boolean[n];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
              {
                if(matrix[i][j]==0)
                {
                    zerrows[i]=true;
                    zercols[j]=true;
                }
              
              
              }   
           
        }
    for(int i=0;i<n;i++)
    {
       if(zerrows[i])
       {
           for(int col=0;col<n;col++)
                   {  matrix[i][col]=0;      }
           
           
        }

   }
   return matrix;    
    }
    
    
    //main method-----------------------------------------------
    
 public static void main(String args[])
 {
 
 Scanner scan=new Scanner(System.in);
 System.out.print("enter size of matrix as n ");
 int n=scan.nextInt();
  System.out.print("enter matrix elements");
 int[][]arr=new int[n][n];
 for(int i=0;i<n;i++)
 {
      for(int j=0;j<n;j++)
            {     arr[i][j]=scan.nextInt();  }
 }
 int ans[][]=setrowzero(arr,n);
 System.out.println("after making only those rows zero which are having zeros matrix is as shown ");
 for(int i=0; i<n; i++)
 {
 for(int j=0;j<n;j++)
 { System.out.print(arr[i][j]+" ");        }
 System.out.println(" ");
 }
 }   
    
}
