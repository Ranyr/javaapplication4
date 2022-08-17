import java.util.*;
import java.lang.Math;
public class Infytq_part5 {
 public static void main(String args[]){
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string");
 String input1=sc.nextLine();
 int j,k,res=0;
 String sum="";
 input1=input1.toUpperCase();
 String[]ch=input1.split(" ");
 for(int i=0;i<ch.length;i++)
 {
 res=0;
 j=0;
 k=ch[i].length()-1;
 while(j!=k && j<k)
 {
 res=res+Math.abs((ch[i].charAt(j)-'A'+1)-  (ch[i].charAt(k)-'A'+1)  );
 j++;
 k--;
 }
 if(ch[i].length()%2!=0)
 
     {res=res+ch[i].charAt(j)-'A'+1;}
 
       sum=sum+res;
 }
 
 System.out.println(sum);
 }   
}
