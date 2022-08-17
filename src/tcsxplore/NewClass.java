
package tcsxplore;
import java.util.*;

public class NewClass 
{   
 public static void main(String args[])
 { 
    Scanner sc=new Scanner(System.in);
    watch arr[]=new watch[3];
   for(int i=0;i<3;i++)
   {
      int a=sc.nextInt();sc.nextLine();
      String b=sc.nextLine();
      double c=sc.nextDouble();sc.nextLine();
      String d=sc.nextLine();
      arr[i]=new watch(a,b,c,d);
   }
   String nm=sc.nextLine();
  watch result[]=assorderofid(arr,nm);
  System.out.println("output");
  for(int i=0;i<result.length;i++)
  {
    System.out.println(result[i].getwatchId());
  }
  
 }
 public static watch[] assorderofid(watch arr[],String nm)
 {     watch help[]=new watch[0];  //matched names
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].getwatchName().equalsIgnoreCase(nm))
           {
             help= Arrays.copyOf(help,help.length+1);
             help[help.length-1]=arr[i];
           }  
       }
       
       double max=help[0].getprice();
       watch hp[]=new watch[0]; //details of customer having max  price
       for(int i=0;i<help.length;i++)
       {
         if(help[i].getprice()>max)
         {
            max=help[i].getprice();
             hp=Arrays.copyOf(hp,hp.length+1);
            hp[hp.length-1]=hp[i];
         }            
       }
      
     return hp;
       
      /* for(int i=0;i<help.length-1;i++)
       {
         for(int j=0;j<help.length-i-1;j++)
         {
           if(help[j].getwatchId()<help[j+1].getwatchId())
           {
                 watch temp= help[j];
                 help[j]=help[j+1];
                 help[j+1]=temp;
           }
         }
       
       }  */
   
 
 }
 
}
class watch
{    
int watchId;
String watchName;
double price;
String brand;

watch(int watchId,String watchName,double price,String brand)
{
    this.watchId=watchId;
    this.watchName=watchName;
    this.price=price;
    this.brand=brand;
}

public void setwatchId(int watchId){this.watchId=watchId;}
public void setwatchName(String watchName){this.watchName=watchName;}
public void setprice(double price){this.price=price;}
public void setbrand(String brand){this.brand=brand;}

public int getwatchId(){return watchId;}
public String getwatchName(){return watchName;}
public double getprice(){return price;}
public String getbrand(){return brand;}

    
}