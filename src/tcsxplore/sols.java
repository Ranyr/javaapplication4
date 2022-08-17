
package tcsxplore;
import java.util.*;
//firstly save details of candidates matched with particular name then out of those matched names dispaly
//the details of highest price  
 //id=11 name =a yr =1909 price=300
// id=12 name=b   yr= 1906 price =200
//id=13 name=a yr =1976 price =300
//id=14 name=a  yr=2000 price 250
//as user enter name= a  ************************     so output id= 13,11 having max price =300
public class sols 
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     newspaper nw[]=new newspaper[3];
     for(int i=0;i<3;i++)
     {
     int a =sc.nextInt();sc.nextLine();
     String b=sc.nextLine();
     int c=sc.nextInt();sc.nextLine();
     int d=sc.nextInt();sc.nextLine();
     nw[i]=new newspaper(a,b,c,d);
     }
   /*  System.out.println("enter int year");
     int n=sc.nextInt();
    int p= findtotalpricebypublicationyear(nw,n);
    System.out.println("ist output");
    if(p>0){System.out.println("p="+p);}
    else{System.out.println(0);}*/
   
    //2nd static method
    System.out.println("enter name to be matched");
    
    String nk=sc.nextLine();
 
    newspaper ans[]=searchnewspaperbyname(nw,nk);

    //for(int i=0;i<ans.length;i++)
    //{   System.out.println("l= "+ans.length);
        
    /*System.out.println(ans[i].getregno());
       System.out.println(ans[i].getname());
       System.out.println(ans[i].getpublicationyear());*/
   // }
    
    }
  /* public static int findtotalpricebypublicationyear(newspaper []nw,int n)
   {
   int price=0;
   for(int i=0;i<nw.length;i++)
   {
       if(nw[i].getpublicationyear()==n)
       {price=price+nw[i].getprice();}
   }
   return price;
   }
   */
 public static newspaper[] searchnewspaperbyname(newspaper []nw,String nk){
 newspaper help[]=new newspaper[0]; 
 /* for(int i=0;i<nw.length;i++)
  {
     if(nw[i].getname().equals(nk))
     {
         help=Arrays.copyOf(help,help.length+1);
         help[help.length-1]=nw[i];
     
     }
  } */
  
  newspaper help11[]=new newspaper[0];
  newspaper hp[]=new newspaper[0];
 //*******************help11[]arrays contains only matched newspaper details************** 
  for(int i=0;i<nw.length;i++)
  { 
      if(nw[i].getname().equals(nk))
      {  
           help11= Arrays.copyOf(help11,help11.length+1);
           help11[help11.length-1]=nw[i];
          
      }   
         
   }
  //****************out of help11[]array find max price and print only that max price student detail in h[] because may 2 students have that same max value so use h[] array instead of simple var********
  int max=help11[0].getprice();
  for(int i=0;i<help11.length;i++)
  {
      if(help11[i].getprice()>=max)
         {
           max=help11[i].getprice();
           System.out.println(" heloo");
           hp=Arrays.copyOf(hp,hp.length+1);
           hp[hp.length-1]=help11[i];
         }  
 
  }
  return hp;
  }
 
 }  






 






class newspaper{
 
 int regno;
 String name;
 int publicationyear;
 int price;
 
 newspaper(int regno,String name,int publicationyear,int price){
 this.regno=regno;
 this.name=name;
 this.publicationyear=publicationyear;
 this.price=price;
 
 } 
 public void setregno(int regno){
 this.regno=regno;
 }
 
 public int getregno(){
 return regno;
 }
 
 public void setname(String name){this.name=name;}
 public String getname(){return name;}
 

public void setpublicationyear(int publicationyear){
   this.publicationyear=publicationyear;
}
public int getpublicationyear()
{return publicationyear;}


public void setprice(int price)
{this.price=price;}
public int getprice()
{ return price;
}



 }