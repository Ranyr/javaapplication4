//print 1 method()avg of quizes wrt matched string courseadmin
//print array having handson values less than entered handson values
package tcsxplore;
import java.util.*;

public class courseprg {
    
    public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
     course arr[]=new course[2];
      System.out.println("enter input for  2 courses");
     //take inputs for 4 courses
     System.out.println("int course id");
     System.out.println(" string coursename");
     System.out.println(" string courseadmin");
     System.out.println("int quiz");
     System.out.println("int handson ");
    for(int i=0;i<arr.length;i++)
    {
         int a=sc.nextInt();
         sc.nextLine();
          String b=sc.nextLine();
          String c=sc.nextLine();
          int d=sc.nextInt();
          sc.nextLine();
          int e=sc.nextInt();
         sc.nextLine();
         arr[i]=new course(a,b,c,d,e);
    }
 System.out.println("enter required course admin") ;  
    String inp1=sc.nextLine();
    System.out.println("enter max handball");
   int inp2=sc.nextInt();
    sc.nextLine();
   /////////////////////////////////call goes to ist static method///////////////////////////
  int ans1= findavgofquizbyadmin(arr,inp1);
  System.out.println("print avg of quizes having required courseadmin provided");
  if(ans1>0)
  {
     System.out.println("avg = "+ans1);
  }
  else{
   System.out.print("no course found");
  }  
  
 ////////call goes to second  static method/////////////////////////////////////////////////// 
  course ans2[]= sortcoursebyhandson(arr,inp2);
  System.out.println("final step printing name in sorted manner accor to having handson value less than given value");
    if(ans2==null)
    {
    System.out.println("no course found");
    }
    else{
          for(int i=0;i<ans2.length;i++)
          {
            System.out.println(ans2[i].coursename);
           
          }
    }
    }
    
    public static int findavgofquizbyadmin(course arr[],String inp1)
    {    
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++)
           {
               if(arr[i].courseadmin.equalsIgnoreCase(inp1)) 
                { sum=sum+arr[i].quiz; 
                  count++; 
                }
       
            }
        if(sum>0)
        {
        return sum/count;
       
        }
        else
        {
        return 0;
        }
    }
    
    public static course[] sortcoursebyhandson(course arr[],int inp)
    {
       course help[]=new course[0];//store details of those courses having handson<inp
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].handson<inp)
           {
               help=Arrays.copyOf(help,help.length+1);
               help[help.length-1]=arr[i];
           
           }
       
       }
       // bubble sort
       for(int i=0;i<help.length-1;i++)
       {
          for(int j=0;j<help.length-i-1;j++)
          {
             if(arr[j].handson>arr[j+1].handson)  
             {
                  course temp=help[j];
                  help[j]=help[j+1];
                  help[j+1]=temp;
             }
          }
       
       }
       if(help.length>0){
       return help;
       }
       return null;
    
    } 
}



class course{

int courseid;
String coursename;
 String courseadmin;
 int quiz;
 int handson;


public void setcourseid(int courseid){
this.courseid=courseid;
}
public int getcourseid()
{
return courseid;
}



public void setcoursename(String coursename)
{
this.coursename=coursename;
}
public String getcoursename()
{
return coursename;
}



public void setcourseadmin(String courseadmin)
{
this.courseadmin=courseadmin;
}
public String getcourseadmin()
{
return courseadmin;
}


public void setquiz(int quiz)
{
this.quiz=quiz;
}
public int getquiz()
{
return quiz;
}


public void sethandson(int quiz)
{
this.handson=handson;
}
public int gethandson()
{
return handson;
}

course(int courseid,String coursename,String courseadmin,int quiz,int handson){
     
     this.courseid=courseid;
     this.coursename=coursename;
     this.courseadmin=courseadmin;
     this.quiz=quiz;
     this.handson=handson;
  }

}