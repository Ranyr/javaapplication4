package arrays;
import java.util.*;

public class split_an_array_shiting {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter n");
 int n=sc.nextInt();
 int arr[]=new int[n];
 int arr2[]=new int[n];
 
 System.out.print("enter arr_1 elements");
 for(int i=0;i<n;i++)
 {arr[i]=sc.nextInt();}
  
 System.out.print("enter arr_2 elements");
 for(int i=0;i<n;i++)
 {arr2[i]=sc.nextInt();}
 
 System.out.println("enter key from where you want to split the array");
 int key=sc.nextInt();
 
 leftrotate(arr,n,key);
 rgtrotate(arr2,n,key);
 }
 
 public static void leftrotate(int[]arr,int n,int key )
 { // suppose if we have 4 elements in the array ,we enter key=5, then newKey=5%4=1(we have to rotate array just once)
     
     if(key>n)         //         1 2 3 4    output:: 3 4 1 2
      {key= key % n;}  //index    0 1 2 3
 int temp=0;
 for(int i=0;i<key;i++)                                             // 2 3 4 1  
 {                        //key=0<2                                 //key=1<2
    temp=arr[0];         //temp=1                                    temp=2
    for(int j=0;j<n-1;j++ ) //j=0     j=1        j=2<3 (4-1)---------j=0          j=1           j=2 
    {  
      arr[j]=arr[j+1];  //arr[0]=2 , arr[1]=3 ,  arr[2]=4 -----------arr[0]=3   arr[1]=4       arr[2]=1  
    }
    arr[n-1]=temp;    //arr[3]=1(temp)          -------------------- arr[3]=2(temp) 
 }                   //  after 1 rot arr become 2 3 4 1------------- 3  4 1 2       
for(int i=0;i<n;i++)
 {System.out.println("shifting ist half at end "+arr[i]+" ");}
 }
 
 
 public static void rgtrotate(int []arr2,int n,int key)
 {     // 1 2 3 4    key =1             2 3 4 1
     //   1 2 3 4    key=2 means split the array from index= 1(as index start from 0)       3 4 1 2
     if(key>n)
     {
     key=key % n;  
     }
     int temp=0;
   for(int i=0;i<key;i++)
   {
     temp=arr2[n-1];
     for(int j=n-1;j>0;j--)
     {
      arr2[j]=arr2[j-1];
     }
     arr2[0]=temp;
  }
 for(int i=0;i<n;i++)
 {System.out.println("shifting 2nd  half in front  "+arr2[i]+" ");}
 
 }
         
         
}
