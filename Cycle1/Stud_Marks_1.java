import java.util.Scanner;
public class Stud_Marks_1
{
    public static void main(String args[]) 
    {
        int n, total = 0, p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        p =  total / n ;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+p);
    }
}