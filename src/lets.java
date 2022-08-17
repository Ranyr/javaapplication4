import java.util.*;
public class lets {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        solution sols[]=new solution[4];
        System.out.println("enter array elements");
      for(int i=0;i<4;i++)
      {
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        double c=sc.nextDouble();sc.nextLine();
        sols[i]=new solution(a,b,c);
      }
      System.out.println("enter names matched");
      String nm=sc.nextLine();
      System.out.println("enter mark");
      double mm=sc.nextDouble();
      solution[] result=getdetailofstudenthavingmaxmarks(sols,nm,mm);
      for(int i=0;i<result.length;i++)
      {System.out.println("result 1= "+result[i].getid());}
    }
   public static solution[] getdetailofstudenthavingmaxmarks(solution[] sols,String nm,double mm)
   {  solution help[]=new solution[0];   
     for(int i=0;i<sols.length;i++)
     {
        if(sols[i].getname().equalsIgnoreCase(nm)&&(sols[i].getmarks()<mm))
        {
         help= Arrays.copyOf(help,help.length+1);
         help[help.length-1]=sols[i];
        }
     }
     
     for(int i=0;i<help.length;i++)
     {
        for(int j=0;j<help.length-i-1;j++)
        {
              if(help[j].getmarks()>help[j+1].getmarks())
              {
               solution temp=help[j];
               help[j]= help[j+1];
               help[j+1]= temp;
              }
        }
     }
    return help; 
   }
}
class solution{
int id;
String name;
double marks;

public solution(int id,String name,double marks)
{
   this.id=id;
   this.name=name;
this.marks=marks;
}
public void setid(int id){this.id=id;}
public void setname(String name){this.name=name;}
public void setmarks(double marks){this.marks=marks;}
public int getid(){return id;}
public String getname(){return name;}
public double getmarks(){return marks;}

}