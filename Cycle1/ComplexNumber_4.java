import java.util.Scanner;
public class ComplexNumber_4
{
 float r1 , r2 , i1 , i2;
 void getdata() 
   {
       Scanner s = new Scanner(System.in);
        System.out.print("Enter real part of first number:");
       r1 = s.nextFloat();
        System.out.print("Enter imaginary part of first number:");
        i1 = s.nextFloat();
        System.out.print("Enter real part of second number:");
        r2 = s.nextFloat();
        System.out.print("Enter imaginary part of second number:");
        i2 = s.nextFloat();
    }
  void display()
  {
      System.out.printf("Sum is: "+ (r1+r2)+" + "+ (i1+i2) +"i");
   }
   public static void main(String args[]) 
  {
   ComplexNumber c = new ComplexNumber();
   c.getdata();
   c.display();
  }
}