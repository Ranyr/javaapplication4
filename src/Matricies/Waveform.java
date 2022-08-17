
package Matricies;
import java.util.*;

public class Waveform {
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
       } // 1  2   3
        //  4  5   6
        //  7  8   9   
       
       System.out.println(" print matrix in WAVE FORM");
 
    for(int j=0;j<n;j++)
    {
        if(j%2==0)
        {
            for(int i=0;i<=n-1;i++)
            {  
               System.out.print(arr[i][j]+" ");
            }
          System.out.println("");
         }
        else
        {
          for(int i=n-1;i>=0;i--)
          {
             System.out.print(arr[i][j]+" ");
          }
           System.out.println("");
        }
    
    }
 
 
 }   
}
