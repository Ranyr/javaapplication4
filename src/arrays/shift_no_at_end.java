
package arrays;

import java.util.*;
public class shift_no_at_end {
   public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.print("array size");
   int n=sc.nextInt();
   System.out.print(" enter array elements");
   int a[]= new int[n];
   int temp[]=new int[n];
   int count=0;
   for(int i=0;i<n;i++)
   {a[i]=sc.nextInt();}// a[]={4,5,7,3,6,2,9}
   System.out.println("SHIFT multiples of 3 at the END");
   for(int i=0;i<n;i++) // once traverse the given array and then get elements that are not multiple of 3 ,put them into separate array
   { 
     if(a[i]%3 !=0)    
     { temp[count++]=a[i]; }// temp[]={4,5,7,2}
   }
   for(int i=0;i<n;i++){ //now again traverse the array and get mupltiples of 3 and put them in the temp array 
    if(a[i]%3==0)
    { temp[count++]=a[i]; }  //  temp[]={4,5,7,2,       3,6,9}
   }
   
   for(int j=0;j<temp.length;j++)
   {a[j]=temp[j];}  
   
   for(int i=0;i<n;i++){
       System.out.print(a[i]+" ");
   }
   } 
}
