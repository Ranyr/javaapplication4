
package patterns;


public class leftptr {
     public static void main(String args[])
   {
     for(int i=1;i<=4;i++)     //1st row i=1                        //i=2
     {
        for(int j=3;j>=i;j--)    //3 spaces print honi h            // 3>=2 here spaces will be  printed twice
        {
           System.out.print(" ");
        
        }
        for(int k=1;k<=i;k++){     // 1<=1   *        //now we just left with 2 spaces in row 2 ,those will be  filled with * *      
          System.out.print("*");
        }
     System.out.println("");
     }
   
   /* for(int i=1;i<=4;i++)
    {
        for(int j=2;j<=i;j++) // here j=2 because we don't want any space in row 1
        {                     //i=2 in row 2 we want one space 
        System.out.print(" ");
        }
        
      for(int k=4;k>=i;k--)  //i=1,k=4,3,2,1    //i=2,k=4,3,2    //i=3,k=4,3 as k>=3     //i=4 ,k=4   as k>=i
      {                      
          System.out.print("*");
      
      }
       System.out.println("");
    }
    */
    
    //for printing  combinning pattern
    
    
    for(int i=1;i<=4;i++){
    
    for(int j=1;j<=i;j++)  //i=1                                                    //i=2
    {
           System.out.print(" "); //we just want 1 space at starting in row one  // j=1,2 two spaces ll print

    }
    

    for(int k=3;k>=i;k--)    //we just want 3 * in row 1 
    {                       // in row 2 we want two stars  i=2     k=3,2 
         System.out.print("*");
    }
      System.out.println(" ");
    }
    
    
       
   
   }
}
