import java.util.Scanner;
public class Student_Details
{
    public static void main(String args[])
   {
     int i,j,n;
     float total=0, avg;           
     Scanner s1 = new Scanner(System.in);	
     Scanner s2 = new Scanner(System.in);
     Scanner s3 = new Scanner(System.in);
     Scanner s4 = new Scanner(System.in);
     Scanner s = new Scanner(System.in);

     System.out.print("Enter the no. of students:");
     n = s.nextInt();
     int id[] = new int[n];
     String name[] = new String[n];
     String branch[] = new String[n];
     int year[] = new int[n];

     for(i = 0; i < n; i++)
     {
       System.out.println("ENTER DETAILS OF STUDENT "+(i+1));
       System.out.println("Enter the id of the student:");	
       id[i]=s1.nextInt(); 
       System.out.println("Enter the name of the student:");   
       name[i] = s2.nextLine();      
       System.out.println("Enter the branch of the student:");  
       branch[i]=s3.nextLine();
       System.out.println("Enter the year of study:");    
       year[i]=s4.nextInt();

       int marks[] = new int[6];  
       System.out.println("Enter the marks of 6 subjects : ");
       for(j=0; j<6; j++)
      {           
        marks[j] = s1.nextInt();  
        total = total + marks[j];   
      }
      avg = total/6;
      System.out.println("Total : "+total);
      System.out.println("Average : "+avg);

      System.out.println("The student Grade is: "); 
      if(avg>=80)     
     {        
        System.out.println("A"); 
      }    
     else if(avg>=60 && avg<80)  
      {        
         System.out.println("B"); 
       }      
     else if(avg>=40 && avg<60)   
     {         
        System.out.println("C");
      }    
      else  
     {
         System.out.println("D");
      }  
   }
   s.close();
   s1.close(); 
   s2.close();
   s3.close();
   s4.close();
  }
}
