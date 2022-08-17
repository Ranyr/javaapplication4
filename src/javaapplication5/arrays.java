
package javaapplication5;
import java.util.*;
public class arrays {
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of values to be entered in an array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter array elements");
        
    for(int i=0;i<n;i++)
    {
       a[i]= sc.nextInt(); 
    }
    
    for(int i=0;i<n;i++)
    {
    Arrays.sort(a);
     // String s1=Arrays.toString(a);//if we want to covert int array into string array 
    }
     System.out.println("after sorting");   // it will sort the array in alphabetically order i.e ascending order
    for(int i=a.length-1;i>=0;i--){   // here we r printing array in descending order by changing the condition in loop
     System.out.println(a[i]);
    }
 /* int temp=0;
  for(int i=0;i<n;i++){
  for(int j=i+1;j<n;j++)
  {   if(a[i]>a[j])
   {
     temp=a[i];
    a[i]=a[j];
    a[j]=temp;
   }                         
 }
  }
    System.out.println("after sorting"); 
    for(int i=0;i<n;i++){
         System.out.println(a[i]);   
    }*/
    //------------------------duplicates removal only  from sorted array--------input:   2 5 6 4---------
    int p=0;                                                                  //index    0 1 2 3 
    for(int k=0;k<n-1;k++)
    {   
         {  if(a[k]!=a[k+1]) 
                  {   a[p++]= a[k] ;  } //step1----a[p]=a[k]    step2------p++; means new element must be placed at next place
             //at last here p=3
         }
    
    
    }
    a[p++]=a[n-1];      // a[3]=4  , p=4
  //  int n1=a.length;
     System.out.println(" print array after duplicates removal");
     for(int k=0;k<p;k++)
     {   System.out.println(a[k]);      }
    }
    }

