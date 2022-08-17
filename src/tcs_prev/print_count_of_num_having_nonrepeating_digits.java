
package tcs_prev;
import java.util.*;

public class print_count_of_num_having_nonrepeating_digits {
    public static void main(String args[])
    {
        int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter range 1");
    int r1=sc.nextInt();
    System.out.print("enter range 2");
    int r2=sc.nextInt();
     
    for(int i=r1;i<=r2;i++)
    {
       int num=i;
       boolean visited[]=new boolean[128];//visited[false,false,false,false,false]
       while(num>0)
       {
         if(visited[num % 10]) // if(visited[true]) means digit of a num already present in array it means repeation is going to happen again
         break; //means leave current num beacause repeation of digits occur here considernow choose start next number in the range 
         //if (visited[false]) it means digit of a num is not present in the list sodo  visited[6]=true
         visited[num%10]=true; 
         num=num/10;
       
       }
       if(num==0)  //means we have traversed whole number 
           count++; //no repeation of digits found here then increment count by 1
    }
    System.out.print("count = "+count);
   
}
}
