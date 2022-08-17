//circle enter circle 1,circle 2, replace c2 with circle attribute if c1 matched with circle attribute ,then print detail
package tcsxplore;
import java.util.*;

public class sim {
   private int id;
   private String name;
   private double rate;
   private String circle;
    
    public int getid()
    {return id;}
    public void setid(int setid)
    {
    this.id=id;
    }
    
    public String getname()
    {  return name;}
    public void setname(String name)
    {this.name=name;}
    
    public double getrate(){
    return rate;
    }
    public void setrate(double rate){this.rate=rate;}
    
    public String getcircle(){
      return circle;
    }
    public void setcircle(String circle){
    this.circle=circle;
    }
    
    
    sim(int id,String name,double rate,String circle){
      this.id=id;
      this.name=name;
      this.rate=rate;
      this.circle=circle;
    }
}

class solution{


public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
   sim customer[]=new sim[3];
   System.out.println("enter details of 3 circles");
  for(int i=0;i<customer.length;i++)
  {
  
  int id=sc.nextInt();sc.nextLine();
  String name=sc.nextLine();
  double rate=sc.nextDouble();sc.nextLine();
  String circle=sc.nextLine();
  customer[i]=new sim(id,name,rate,circle);
  
  }
  System.out.println("enter required circle 1");
  String circle1=sc.nextLine();
   System.out.println("enter required circle 2");
  String circle2=sc.nextLine();
  sim result[]=changecircle(customer,circle1,circle2);
  System.out.println("length= "+result.length);
  
  System.out.println("output ");
   for(int i=0;i<result.length;i++){  
   System.out.println(result[i].getid()+" "+result[i].getname()+" "+result[i].getrate()+" "+result[i].getcircle());
  } 
/* for(sim ans:result){
      if(ans!=null)
      {System.out.println(ans.getid()+" "+ans.getname()+" "+ans.getrate()+" "+ans.getcircle());}
 } */
 
}

public static sim[] changecircle(sim[] customer,String circle1,String circle2)
{ int count=0;

    
   sim cu2[]=new sim[count]; 
     sim help[]=new sim[0];
   for(sim cpp:customer)
   {
       
   
     if(cpp.getcircle().equals(circle1))
      {
         // System.out.println("i=   "+i);
          //cp[i].circle=circle2;
       cpp.setcircle(circle2);
       help=Arrays.copyOf(help,help.length+1);
       help[help.length-1]=cpp;
       count++;
        // cu2[count++]=cpp;
      }
   
   }
   ///sort details ----ascending order
   for(int i=0;i<help.length-1;i++)
   {
      for(int k=0;k<help.length-i-1;k++)
      {
          if(help[k].getrate()>help[k+1].getrate())
          {
               sim temp= help[k];
               help[k]=help[k+1];
               help[k+1]=temp;
          }
      }
   
   }
   return help;
}

}