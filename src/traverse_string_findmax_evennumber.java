import java.util.*;
public class traverse_string_findmax_evennumber {
    
 public static void main(String args[]){
     traverse_string_findmax_evennumber tr=new traverse_string_findmax_evennumber();
}
 
 traverse_string_findmax_evennumber()
 {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter strng consists of nums, strngs,special chrs");
     String s= scan.nextLine();//heloo@141F2G3
     StringBuffer sb=new StringBuffer();
     int size,id=-1;
     for(int i=0;i<s.length();i++)
     {
     if(s.charAt(i)>='0' && s.charAt(i)<='9')
     {
     sb.append(s.charAt(i));  //423
     }
     }
      System.out.println("nums present in list are "+sb);
  String s1=  sb.toString();  //coverting buffer string into string
   char c[]=s1.toCharArray();   // coverting string into an chr array
   size=c.length;
     
 ///////////////////////////////////////sorting array///////////////////////////////////// 
 
 
 for(int i=0;i<size;i++){
 Arrays.sort(c);
 }
 
  /*for(int i=0;i<size;i++)
  {     // whole sorted list  in dec order +remove duplicates
      for(int k=i+1;k<size;k++)
      {    
          
              if((c[i]<c[k]))
                 {     
                    char temp=c[i];
                    c[i]=c[k];
                    c[k]=temp;
              
              
                  } 
      }
     
  }*/
    
   int j=0;  
System.out.println("sorted list is");
  for(int i=0;i<=size-1;i++)    //size=5(0,4)
  {System.out.println(c[i]);}
 ///////////////////////////removing duplicates from sorted array///////////////////////////////////////////     
  for(int l=0;l<size -1;l++)    //arr[5] move till arr[3] so that in a[3]=arr[4];
      {
          if(c[l]!=c[l+1])
          {c[j++]=c[l];}  //c[j]--is new array in elemnets are placed after removing duplicates
         
      }
  c[j++]=c[size-1];        //a[4]= arr[5]    
  
  System.out.println("after removal");
  for(int p=0;p<j;p++)
  {   System.out.println(c[p]);  }
  
//////////////print even numbers present in list  after removal of duplications are/////////////////////////////////////  
 System.out.println("even no. present in list is"); 
for(int p=0;p<j;p++)
{
if(c[p]%2==0)
  System.out.println(c[p]);

}
/////////////////////////////print max even number present in list is as//////////////////////////
 System.out.println(" greatest even no. is ");
for(int p=0;p<j;p++)
{      
    if (c[p]%2==0)
    { System.out.println(c[p]);break;}
    
}
 /* if(id==-1)
  { System.out.println(id);}
  else
  {  int num=0;
     for(int i=0;i<c.length;i++)
     {    if(i!=id){num=num*10+c[i];}    }
     num=num*10+temp[id];  
      System.out.println(num);    
         
  }*/
 
  
}
}