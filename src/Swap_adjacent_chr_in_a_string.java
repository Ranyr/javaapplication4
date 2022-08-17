import java.util.*;

public class Swap_adjacent_chr_in_a_string {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter string");
    String str=sc.nextLine();
   
    int l=str.length();
    System.out.println("before swapping  = "+str);   
    if(l%2==0)
    { 
       System.out.print(swap(str,0,l));
       // print(ss);
    }
    else
    {
    
    System.out.print(swap(str,0,l/2));
    System.out.print(swap(str,l/2+1,l));
    
    }
    
    }
    
    public static String swap(String ab,int i,int j)
    { StringBuffer sb=new StringBuffer();//02   45
      char c;
      char ch[]=ab.toCharArray();
      for(int k=i;k<j-1;k++)
       {
          c =ab.charAt(k);
          ch[k]=ch[k+1];
          ch[k+1]=c;
          sb.append(ch[k]);
       }
      return sb.toString(); 
    }
    
    
   /* public static void print(char cc[])
    { 
     int l=cc.length;
     for(int i=0;i<l;i++)
     { System.out.print(+cc[i]);  }
    }*/
    
    /* for(int i=0;i<l;i++)   //radhu -------arhdu---here last word will be same as it is
    {
      if(i!=ch.length-1)
      {sb.append(ch[i+1]);}
      
    sb.append(ch[i]);
    i=i+1;
    
    }
      System.out.print("after = "+sb);*/
    
}
