import java.util.*;
public class arrayaverage {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
   int n= sc.nextInt();
    System.out.println("enter array elements");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
    sum=sum+a[i];
    
    }
    int avg= sum/n;
    System.out.println("avg of array is "+"="+avg );
    }
}
