
package arrays;

import java.util.*;
public class reverse_array {
    
    
   public static void main(String args[]) {
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++) 
   {     
   arr[i]=sc.nextInt();
   }
   
   //left rotate an array**************************************
   System.out.println("enter key");
   int key=sc.nextInt();
   if(key>n){key=key%n;}
  
    for(int k=0;k<key;k++)
    {
        int temp=arr[0];
      for(int i=0;i<n-1;i++)
      {
         
         arr[i]= arr[i+1];
      }
     arr[n-1]=temp;
    
    }
    System.out.println("output after left rotate");
    for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    
    }  
   
   /* char arr[]=new char[n];
   for(int i=0;i<n;i++){
   arr[i]=sc.next().charAt(0); 
   }
   int start=0,end=n-1;
   while(start<end)
   {char temp=arr[start];
    arr[start]=arr[end]; 
    arr[end]=temp;
    start++;
    end--;
   } */
 /*  char arr[]=new char[n]; 
   for(int i=0;i<n;i++)
   {arr[i]=sc.next().charAt(0);}
 for(int i=arr.length-1;i>=0;i--) 
 {
 System.out.print(arr[i]+" "); 
 }
   */
   }
}
